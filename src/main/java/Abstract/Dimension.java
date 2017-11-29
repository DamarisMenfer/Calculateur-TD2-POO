package Abstract;

public class Dimension {

    double longueur;
    double largeur;
    double hauteur;

    public Dimension(double longueur, double largeur, double hauteur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLongueur() {
        return longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }

    public double getLongueurDecimeter() {
        return longueur/100;
    }

    public double getLargeurDecimeter() {
        return largeur/100;
    }

    public double getHauteurDecimeter() {
        return hauteur/100;
    }
}
