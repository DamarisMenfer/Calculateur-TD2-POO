package com.calculator;

public class Package {

    private Dimension dim;
    private double poids;

    public Package(double height, double width, double depth, double weight) {
        dim = new Dimension(depth,width,height);

        poids = weight;
    }

    public double calculateLocalShippingCost(){
        double frais = 0;

        if (dim.getLongueur() <= 229 && dim.getLargeur() <= 162 && dim.getHauteur() <= 25){
            frais = 12.00;

        }
        else if (poids <= 1.8){

            frais = poids*17.59+2.86;
        }
        else {

            double volume = calculateVolume(dim);
            frais = Math.max(21.62*poids, 1.43*volume);
        }
        return frais;
    }

    public double calculateVolume(Dimension dim) {
        double volume = (dim.getHauteurDecimeter()*dim.getLargeurDecimeter()*dim.getLongueurDecimeter());
        return volume;
    }
}
