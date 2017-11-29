package Abstract;

public class ShippingCostCalculator {

    public double calculateShippingCost(Package packageA, String dest){
        double frais = packageA.calculateLocalShippingCost();

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
}
