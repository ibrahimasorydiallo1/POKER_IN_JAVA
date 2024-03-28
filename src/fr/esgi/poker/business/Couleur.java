package fr.esgi.poker.business;

public class Couleur {
    // Qu'est-ce qui définit une couleur ?

    private String nom;

    //Constructors
    //Méthodes pour construire un objet

    public Couleur(String nom) {
        this.nom = nom;
    }

    // Methode d'accès et de modification
    public String getnom() {
        return nom;
    }

    public void setnom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Couleur [nom=" + nom + "]";
    }
      
}
