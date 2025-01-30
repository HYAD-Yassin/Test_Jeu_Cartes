import java.util.ArrayList;
import java.util.List;

public class Joueur {
    

     private List<Carte> hand; // Liste des cartes du joueur
     private String nom; // Nom du joueur

    public Joueur(String nom) {
        this.nom = nom;
        this.hand = new ArrayList<>();
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    // Pour ajouter une carte à la main du joueur dans le depart du jeu
    public void ajouterCarte(Carte carte) {
        hand.add(carte);
    }

    // Pour ajouter une liste de cartes à la main du joueur quand il gagne des cartes
    public void ajouterCartes(List<Carte> cartesGagnees) {
        hand.addAll(cartesGagnees);
    }


    public void afficherHand() {
        for (Carte carte : hand) {
            carte.afficherCarte();
        }
        System.out.println();
    }


    public Carte jouerCarte() {
        if (!hand.isEmpty()) {
            return hand.remove(0); // Joue la première carte
        }
        return null; // Si le joueur n'a plus de cartes
    }

    // Si true le joueur est éliminé 
    public boolean aDesCartes() {
        return !hand.isEmpty();
    } 

    // Pour savoir le vainceur à la fin du jeu
    public int getNombreDeCartes() {
        return hand.size();
    }
}
