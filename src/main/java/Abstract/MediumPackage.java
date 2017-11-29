package Abstract;

public class MediumPackage implements Package{

    private Dimension dim;
    private double poids;

    public MediumPackage(Dimension dim, double poids) {
        this.dim = dim;
        this.poids = poids;
    }

    @Override
    public double calculateLocalShippingCost() {
        return poids*17.59+2.86;
    }
}
