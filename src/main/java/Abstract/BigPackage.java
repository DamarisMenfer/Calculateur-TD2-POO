package Abstract;

public class BigPackage implements Package {

    private Dimension dim;
    private double poids;

    public BigPackage(Dimension dim, double poids) {
        this.dim = dim;
        this.poids = poids;
    }

    @Override
    public double calculateLocalShippingCost() {
        double volume = calculateVolume(dim);
        return Math.max(21.62*poids, 1.43*volume);
    }

    public double calculateVolume(Dimension dim) {
        double volume = (dim.getHauteurDecimeter()*dim.getLargeurDecimeter()*dim.getLongueurDecimeter());
        return volume;
    }


}
