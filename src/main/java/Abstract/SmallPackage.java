package Abstract;

public class SmallPackage implements Package {

    private Dimension dim;
    private double poids;

    public SmallPackage(Dimension dim, double poids) {
        this.dim = dim;
        this.poids = poids;
    }

    @Override
    public double calculateLocalShippingCost() {
        return (12.00);
    }
}
