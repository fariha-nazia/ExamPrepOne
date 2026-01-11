import java.util.Random;

public class randomClass {
    public static void main (String[] args){

        /* Goal 1
        Creating Random number
        * Using Random class
        * */

        Random rand = new Random();
//        int number;

        /* Goal 2
        * imagine you want to see 3 random numbers
        * what will you do?
        * */

//        step 2.1
        int number1;
        int number2;
        int number3;

        /*Goal 3:
        * generate random double*/
        double number4;
        double number5;
        double number6;

//        assign the number to Random object

//        number = rand.nextInt(1,7);

        number1 = rand.nextInt(1, 7);
        number2 = rand.nextInt(1, 7);
        number3 = rand.nextInt(1, 7);

        number4 = rand.nextDouble(1, 100);
        number5 = rand.nextDouble(1, 101);
        number6 = rand.nextDouble(1, 1001);

//        System.out.println(number);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);





    }
}
