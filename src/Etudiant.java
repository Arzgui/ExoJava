public class Etudiant {

    private String nom;
    private String prenom;
    private Devoir[] devoirs = new Devoir[4];

    public Etudiant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void ajouterDevoir(Devoir nouveauDevoir) {

        //Si le tableau de devoir n'est pas plein
        if(devoirs[devoirs.length - 1] == null){

            //on parcours le tableau jusqu'à trouver un index libre
            int index = 0;
            while (devoirs[index] != null) {
                index++;
            }

            //on affecte le nouveau devoir à l'index libre
            devoirs[index] = nouveauDevoir;
        }
    }


    public float moyenne() {
        float cumulNote = 0;
        float cumulCoef = 0;
        for(Devoir devoir : devoirs) {
            if(devoir != null) {
                cumulNote += devoir.getNote() * devoir.getCoef();
                cumulCoef += devoir.getCoef();
            }
        }

        return cumulNote / cumulCoef;
    }
}