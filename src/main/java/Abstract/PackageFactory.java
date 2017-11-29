package Abstract;

public class PackageFactory {

    public Package make_Package(double height, double width, double depth, double weight){
        Dimension dim = new Dimension(depth,width,height);

        if (depth <= 229 && width <= 162 && height <= 25){
            return new SmallPackage(dim,weight);

        }
        else if (weight <= 1.8){
            return new MediumPackage(dim,weight);
        }
        else {
            return new BigPackage(dim,weight);
        }
    }

}
