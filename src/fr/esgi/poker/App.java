package fr.esgi.poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

import fr.esgi.poker.business.Carte;
import fr.esgi.poker.business.Combinaison;
import fr.esgi.poker.business.Couleur;
import fr.esgi.poker.business.Joueur;

// import fr.esgi.poker.business.Carte;

public class App {
    //Ajout des listes d’objets
    private static ArrayList<Couleur> couleurs = new ArrayList<>();
    private static ArrayList<Carte> cartes = new ArrayList<>();
    private static ArrayList<Joueur> joueurs = new ArrayList<>() ;

    public static void main(String[] args) throws Exception {
        ajouteurCouleurs();
        System.out.println(couleurs);

        ajouteurCartes();
        System.out.println(cartes);

        ajouteurJoueurV1();
        // System.out.println(joueurs);
        
        ajouterJoueursV1();

        melangerCartes();

        distribuerCartes();

        // analyserMain("Amy");
    }

    /**
     * 
     */
    private static void ajouteurCouleurs() {
        couleurs.add(new Couleur("Coeur"));
        Couleur couleur2 = new Couleur("Pique");

        // Ajout à la collection de l'objet couleur2
        couleurs.add(couleur2);

        // Ajout des autres couleurs
        couleurs.add(new Couleur("Carreau"));
        couleurs.add(new Couleur("Trèfle"));
    }

    /**
     * 
     */
    private static void ajouteurCartes() {
    // On ajoute 13 cartes pour chaque couleur
    for (Couleur couleur : couleurs) {
        for (int j = 2; j <= 14; j++) {
            cartes.add(new Carte(j, couleur));
        }
    }
}

private static void ajouteurJoueurV1() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Nom du joueur: ");
    String nomJoueur = scan.nextLine();
    scan.close();
    System.out.println("Nom du joueur: " + nomJoueur);
}

/**
 * @param
 */
private static void ajouterJoueursV1() {
    joueurs.add(new Joueur("Amy"));
    joueurs.add(new Joueur("Jake"));
    joueurs.add(new Joueur("Rosa"));
    joueurs.add(new Joueur("Terry"));
    joueurs.add(new Joueur("Ray"));
}

private static void melangerCartes() {
    Collections.shuffle(cartes);
}

private static void distribuerCartes() {
    // On ajoute 5 cartes pour chaque joueur
    for (Joueur joueur : joueurs) {
        joueur.getMain().add(cartes.remove(0));
}
}

private static Combinaison analyserMain(Joueur joueur) {
    Random random = new Random();
    return Combinaison.values()[random.nextInt(Combinaison.values().length)];
}

}


