import java.util.Scanner;

public class hypotenuseOfTriangle {
    public static void main(String [] args){

        /*
        * Find the hypotenuse of the triangle
        * Formula: c = suet(a^2 + b^2)
        * Or, c = Math.sqrt(a^2 + b^2)
        *
        * - Take input from user.
        * */

        Scanner scan = new Scanner(System.in);

//        Declaring the base, height and hypo of triangle.
        double a;
        double b;
        double c;

//        taking input from user
        System.out.println("Please enter value of height 'a' [unit cm]: ");
        a = scan.nextDouble();

        System.out.println("Please enter value of base 'b' [unit cm]: ");
        b = scan.nextDouble();

//        formula to find the hypotenuse of the triangle + I round the number
        c = Math.round(Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
        System.out.println("Hypotenuse of triangle 'c' is "+ c + "cm");

        scan.close();

    }
}
