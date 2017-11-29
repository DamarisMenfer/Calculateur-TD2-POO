package com.calculator;

import static java.lang.Math.*;

public class Calculateur {

    public double calculerFrais(Dimension dim, double poids, String dest) {

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

        if(dest.matches("MC")){
            frais += frais*0.087;
        }

        return round(frais,2);
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public double calculateVolume(Dimension dim) {
        double volume = (dim.getHauteurDecimeter()*dim.getLargeurDecimeter()*dim.getLongueurDecimeter());
        return volume;
    }


}
