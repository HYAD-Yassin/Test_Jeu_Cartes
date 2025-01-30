import java.util.*;

public class DeckOfCartes {
    private TreeSet<Carte> cartes;

    public DeckOfCartes() {
        cartes = new TreeSet<>(new CarteComparator()); // Set pour que chaque carte est unique
                                                     // Tree pour trier les cartes par valeur et symbole
    

        // Initialisation du deck avec toutes les cartes
        String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};
        String[] symboles = {"Trèfle", "Pique", "Coeur", "Carreau"};

        for (String valeur : valeurs) {
            for (String symbole : symboles) {
                cartes.add(new Carte(valeur, symbole));
            }
        }
    }
  
// Afficher le deck trié comme Indique dans le test
    public void afficherDeckTrie() {
        String ligne = "";
        int compteur = 0;
    
        for (Carte carte : cartes) {
            ligne += carte.getValeur() + " de " + carte.getSymbole() + "  ||  ";
            compteur++;
    
            if (compteur % 4 == 0) {
                System.out.println(ligne.substring(0, ligne.length() - 4)); 
                ligne = "";
            }
        }

    }




       // 🔄 Mélanger les cartes dans une liste temporaire
       public List<Carte> melanger() {
        List<Carte> listeCartes = new ArrayList<>(cartes); 
        Collections.shuffle(listeCartes); // Mélange
        return listeCartes;
    }

    // 🃏 Distribuer les cartes aux joueurs
    public void distribuer(List<Joueur> joueurs) {
        if (joueurs.size() != 4) {
            throw new IllegalArgumentException("Il faut exactement 4 joueurs pour la distribution.");
        }

        List<Carte> cartesMelangees = melanger(); // Mélange les cartes

        int joueurIndex = 0;
        for (Carte carte : cartesMelangees) {
            joueurs.get(joueurIndex).ajouterCarte(carte);
            joueurIndex = (joueurIndex + 1) % 4; // Passe au joueur suivant
        }
    }

    
}