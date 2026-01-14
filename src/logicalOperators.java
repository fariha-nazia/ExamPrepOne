import java.util.Scanner;

public class logicalOperators {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        /*Logical Operators
        *   Exp of logical operators are:
        *       && = AND
        *       || = OR
        *       ! = NOT
        * */

        /*
        * Let's check if a temperature falls within a certain range
        * Using && (AND) operator
        * */

        double temp;
        boolean isSunny;

        System.out.println("Please enter a temperature: ");
        temp = scan.nextDouble();
        System.out.println(temp);

        System.out.println("Please enter is it sunny or not (true / false): ");
        isSunny = scan.nextBoolean();
        System.out.println(isSunny);

//        The && condition to check the temp
        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.println("Suitable Temp and is sunny");
        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.println("Suitable Temp and but cloudy");
        }
        else if(temp > 30 || temp < 0){
            System.out.println("Bad temp");
        }






        scan.close();

    }
}
