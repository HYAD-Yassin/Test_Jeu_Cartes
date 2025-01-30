import java.util.*;

public class Pli {
    private List<Joueur> joueurs;
    private Map<Joueur, Carte> cartesJouees;
    private List<Carte> cartesSurTable;

    public Pli(List<Joueur> joueurs) {
        this.joueurs = joueurs;
        this.cartesJouees = new HashMap<>();
        this.cartesSurTable = new ArrayList<>();
    }

    public void jouer() {
        System.out.println("\n>> Pli en cours :");
    
        for (Joueur joueur : joueurs) {
            Carte carteJouee = joueur.jouerCarte();
            if (carteJouee != null) {
                cartesJouees.put(joueur, carteJouee);
                cartesSurTable.add(carteJouee);
                System.out.println(joueur.getNom() + " joue : " + carteJouee.getValeur() + " de " + carteJouee.getSymbole());
            }
        }
    
        // Trouver la carte la plus forte avec notre comparateur
        Carte carteMax = Collections.max(cartesSurTable, new CarteComparator());
    
        // Trouver les joueurs ayant cette carte
        List<Joueur> gagnants = new ArrayList<>();
        for (Map.Entry<Joueur, Carte> entry : cartesJouees.entrySet()) {
            if (entry.getValue().equals(carteMax)) {
                gagnants.add(entry.getKey());
            }
        }
    
        // on choisi un des joueurs en cas d'égalité
        Joueur vainqueur = gagnants.get(new Random().nextInt(gagnants.size()));
    
        System.out.println(">> Le joueur gagnant du pli est " + vainqueur.getNom() + " avec la carte " + carteMax.getValeur() + " de " + carteMax.getSymbole());
    
        // Le vainqueur récupère toutes les cartes du pli
        vainqueur.ajouterCartes(cartesSurTable);
    }
    
}

