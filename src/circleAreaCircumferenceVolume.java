import java.util.Scanner;

public class circleAreaCircumferenceVolume {
    public static void main(String[] args){

        /*
        * Determine the Area, Circumference, and the Volume of the circle
        * The radius of the circle is given
        *
        * - Take user input.
        *
        * Formula:
        *   - Area = Pi * (r^2)
        *   - Circumference = 2 * PI * radius
        *   - Volume = {(4/3) * Pi * (r^3)}
        * */

//        opening the Scanner object
        Scanner scan = new Scanner(System.in);

//        declaring the variables
        double radius;
        double area;
        double volume;
        double circumference;

//        taking user input
        System.out.println("Please enter the Radius [Unit cm]: ");
        radius = scan.nextDouble();

//        Determining the Area
        area = Math.round((Math.PI * Math.pow(radius, 2)));
        System.out.println("Area of the circle " +area + " cm²");

//        Determining the Circumference
        circumference = Math.round((2 * Math.PI * radius));
        System.out.println("Circumference of the circle " +circumference + " cm");

//        Determining the Volume
        volume = ((4.0 / 3.0) * Math.PI * Math.pow(radius, 3));
        System.out.printf("Volume of the circle is: %.2fcm³\n", volume );

//        close scan
        scan.close();



    }
}
