public class Main {

    public static void main(String[] args) {

        //partie 2

        Etudiant franck = new Etudiant("Franck","BANSEPT");
        Etudiant tom = new Etudiant("Tom","SAWYER");

        franck.ajouterDevoir(new Devoir(15,2));
        franck.ajouterDevoir(new Devoir(10,5));

        tom.ajouterDevoir(new Devoir(16,2));
        tom.ajouterDevoir(new Devoir(8,5));

        System.out.println(franck.moyenne());

        Promotion cda = new Promotion("CDA");
        cda.ajoutEtudiant(franck);
        cda.ajoutEtudiant(tom);


        System.out.println(cda.moyenne());

    }
}