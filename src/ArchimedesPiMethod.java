public class ArchimedesPiMethod {
    public static void main(String[] args) {

        //integer number of sides in a polygon
        int numberOfSides = 8;

        //calculate angle B
        double angleB = 360.0/numberOfSides;

        //calculate angle A
        double angleA = 1.0/2.0 * angleB;

        //convert angle A to radians
        //calculate the length on one triangle base
        double lengthTriangleBase = 2.0 * Math.sin(Math.toRadians(angleA));

        //get polygon perimeter
        double perimeterOfPolygon = numberOfSides * lengthTriangleBase;

        //estimate PI
        double estimatePI = perimeterOfPolygon/2.0;

        System.out.println("Estimate PI: ");
        System.out.print(estimatePI);

    }
}