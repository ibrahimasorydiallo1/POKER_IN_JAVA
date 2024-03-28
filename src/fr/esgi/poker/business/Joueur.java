package fr.esgi.poker.business;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Joueur {
    // Qu'est-ce qui définit un joueur ?
    private Long id;
    private String nom;
    private float solde;
    private LocalDate dateDeNaissance;
    private LocalDateTime dateHeureInscription;
    private Carte carte;
    private ArrayList<Carte> main = new ArrayList<>();

    //Surcharge de constructor
    public Joueur(String nom, Carte carte) {
        this.nom = nom;
        this.carte = carte;
    }

    public Joueur(String nom) {
        this.nom = nom;
    }

    public Joueur(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Joueur(ArrayList<Carte> main) {
        this.main = main;
    }

    public ArrayList<Carte> getMain() {
        return main;
    }

    public void setMain(ArrayList<Carte> main) {
        this.main = main;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    
}
