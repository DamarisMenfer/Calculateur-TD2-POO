package Abstract;

import java.util.Scanner;

public class CommandLineInterface {
    public static void main(String[] args) {

        while (true) {
            Scanner sc1 = new Scanner(System.in);
            System.out.print("Calcule frais:\n");
            System.out.print("1 - Hauteur du colis:\n");

            while (!sc1.hasNext()) {
                System.out.println("That's not a number!");
                sc1.next();
            }

            double hauteur = Double.parseDouble(sc1.next());

            System.out.print("1 - Largeur du colis:\n");

            while (!sc1.hasNext()) {
                System.out.println("That's not a number!");
                sc1.next();
            }

            double largeur = Double.parseDouble(sc1.next());

            System.out.print("2 - Longueur du colis:\n");

            while (!sc1.hasNext()) {
                System.out.println("That's not a number!");
                sc1.next();
            }

            double longueur = Double.parseDouble(sc1.next());

            System.out.print("3 - Poids du colis:\n");

            while (!sc1.hasNext()) {
                System.out.println("That's not a number!");
                sc1.next();
            }

            double poids = Double.parseDouble(sc1.next());

            System.out.print("4 - Destination du colis:\n");

            while (!sc1.hasNext()) {
                System.out.println("That's not a number!");
                sc1.next();
            }

            String dest = sc1.next();

            PackageFactory packFack = new PackageFactory();
            Package packageA = packFack.make_Package(hauteur,longueur,largeur,poids);
            ShippingCostCalculator calculator = new  ShippingCostCalculator();
            double frais = calculator.calculateShippingCost(packageA,dest);

            System.out.print(frais);

            System.out.print("\n");
        }
    }
}
