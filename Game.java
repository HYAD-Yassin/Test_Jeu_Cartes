import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        DeckOfCartes deck = new DeckOfCartes();

    //  Tri du Deck
    // deck.afficherDeckTrie();    //  Affichage du Deck Trié


    // Partie Joueurs & Jeu : 
    List<Joueur> joueurs = Arrays.asList(new Joueur("Alice"), new Joueur("Bob"), new Joueur("Charlie"), new Joueur("David"));


    deck.distribuer(joueurs);

    System.out.println("----- Distribution initiale -----");

    for (int i = 0; i < joueurs.size(); i++) {
    System.out.println("Main du Joueur " + (i + 1) + " :");
    joueurs.get(i).afficherHand();
    }


    System.out.println("\n----- Début du jeu -----");

            // Boucle jusqu'à ce qu'un joueur n'ait plus de cartes
            // Ca va Prendre du temps 
            while (joueurs.stream().allMatch(Joueur::aDesCartes)) {
                Pli pli = new Pli(joueurs);
                pli.jouer();
            }
           
    System.out.println("\n----- Fin du jeu -----");


    // Déterminer le vainqueur final (celui qui a le plus de cartes)
    Joueur gagnant = joueurs.stream().max(Comparator.comparingInt(Joueur::getNombreDeCartes)).orElse(null);

    System.out.println(">> Le joueur gagnant est celui avec " + gagnant.getNombreDeCartes() + " cartes !");
    

    }


}
