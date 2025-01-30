import java.util.Arrays;
import java.util.Comparator;

public class CarteComparator implements Comparator<Carte> {

    // Définir les valeurs des cartes dans l'ordre croissant pour les comparaisons
    private static final String[] valeurs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Reine", "Roi", "As"};

    @Override
    public int compare(Carte carte1, Carte carte2) {

        int indexValeur1 = Arrays.asList(valeurs).indexOf(carte1.getValeur());
        int indexValeur2 = Arrays.asList(valeurs).indexOf(carte2.getValeur());
        int comparaisonValeur = Integer.compare(indexValeur1, indexValeur2);

        if (comparaisonValeur == 0) {
            return carte1.getSymbole().compareTo(carte2.getSymbole());
        } else {
            return comparaisonValeur;
        }
    }
}