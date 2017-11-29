package Abstract;



import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAbstract {

    private double hauteur;
    private double longueur;
    private double largeur;
    private double poids;
    private String dest;
    private String expected;

    @Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{

                {191, 123, 18, 2.354, "FR", "12.00"},

                {253, 215, 164, 1.565, "FR", "30.39"},

                {653, 133, 271, 2.132, "FR", "46.09"},

                {653, 331, 271, 3.650, "FR", "83.76"},

                {123, 160, 18, 2.354, "MC", "13.04"},

                {253, 215, 164, 1.565, "MC", "33.03"},

                {653, 133, 271, 2.132, "MC", "50.10"},

                {653, 331, 271, 3.650, "MC", "91.05"}
        });
    }



    public TestAbstract(double longueur, double largeur, double hauteur, double poids, String dest, String expected){

        this.hauteur = hauteur;
        this.longueur = longueur;
        this.largeur = largeur;
        this.poids = poids;
        this.dest = dest;
        this.expected = expected;
    }

    @org.junit.Test
    public void testShippingCostCalculateur() throws Exception {

        ShippingCostCalculator calculateur = new ShippingCostCalculator();
        PackageFactory facPack = new PackageFactory();
        Package packageA = facPack.make_Package(hauteur,largeur,longueur,poids);

        Double aDouble = Double.valueOf(expected);
        assertEquals(aDouble.doubleValue(),calculateur.calculateShippingCost(packageA,dest),0.001);
    }
}
