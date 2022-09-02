import java.util.Scanner;

public class ArchimedesPiMethod {
    public static void main(String[] args) {
        while(true) {
            System.out.println("Please type the number of sides. ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            if(n < 1) {
                break;
            }
            double b = 360.0 / n;
            double a = b / 2;
            double s = 2 * Math.sin(Math.toRadians(a));
            double p = n * s;
            double pi = p / 2;
            System.out.printf("out PI estimate is: %.10f%n", pi);
            System.out.println(pi);
        }
    }
}

//this is what I did before watching your announcement video for assignment 2:

                //integer number of sides in a polygon
                //int numberOfSides = 100;

                //calculate angle B
                //double angleB = 360.0 / numberOfSides;

                //calculate angle A
                //double angleA = 1.0 / 2.0 * angleB;

                //convert angle A to radians
                //calculate the length on one triangle base
                //double lengthTriangleBase = 2.0 * Math.sin(Math.toRadians(angleA));

                //get polygon perimeter
                //double perimeterOfPolygon = numberOfSides * lengthTriangleBase;

                //estimate PI
                //double estimatePI = perimeterOfPolygon / 2.0;

                //System.out.println("Estimate PI: ");
                //System.out.print(estimatePI);
