public class Carte {
    private String valeur;
    private String symbole ;

    public Carte(String valeur, String symbole) {
        this.valeur = valeur;
        this.symbole = symbole;
    }

    // Getters
    public String getValeur() {
        return valeur;
    }

    public String getSymbole() {
        return symbole;
    }

 // Setters 
 public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }



      // Méthode pour afficher une carte 
      public void afficherCarte() {
        System.out.println(valeur + " de " + symbole);
    }
}