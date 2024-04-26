public class Promotion {

    private String nom;
    private Etudiant[] etudiants;

    public Promotion(String nom) {
        this.nom = nom;
        this.etudiants = new Etudiant[30];
    }

    public void ajoutEtudiant(Etudiant nouvelEtudiant) {

        if (etudiants[etudiants.length - 1] == null) {


            int index = 0;
            while (etudiants[index] != null) {
                index++;
            }


            etudiants[index] = nouvelEtudiant;
        }
    }

    public float moyenne() {

        float cumulMoyenne = 0;
        int cumulNombre = 0;

        for (Etudiant etudiant : etudiants) {
            if (etudiant != null) {
                cumulMoyenne += etudiant.moyenne();
                cumulNombre++;
            }
        }

        if (cumulNombre == 0) {
            return 0; // Pour éviter la division par zéro si aucun étudiant n'est ajouté
        } else {
            return cumulMoyenne / cumulNombre;
        }
    }
}
