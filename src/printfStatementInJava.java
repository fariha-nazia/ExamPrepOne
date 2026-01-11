public class printfStatementInJava {
    public static void main(String[] args){
        /*
        * Discussion about Printf statement
        * -- It is a method used to format output
        *
        *
        * -- % [sign] . [precision] [specifier]
        * -- % [sign] [specifier]
        * -- % [flags] [width] [.precision] [specifier-character]
        * */

//        Declaring some data types
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

//        Let's print this data types
        System.out.printf("Hello! I am %s\n", name);

        System.out.printf("My name starts with %c\n", firstLetter);

        System.out.printf("I am %d years old\n", age);

        System.out.printf("I am %f cm tall\n", height);
        System.out.printf("I am %.2f cm tall\n", height);

        System.out.printf("I am employed and that's %b\n", isEmployed);



        /*
        * Some uses of Flags
        * + = output a plus
        * , = grouping separator
        * ( = display a minus if negative, space if positive
        * space*/

        double num1 = 9.99;
        double num2 = 100.876;
        double num3 = -762.898987;
        double num4 = 76534568754.998754345676;

//        + Flag - will add + in front of the number
        System.out.printf("%+f\n", num1); // + added, not limit after point
        System.out.printf("%+.2f\n", num1); // + added, limit after poin
        System.out.printf("%+.3f\n", num3); // there was a -ve, nothing changed when we add the +

//        , Flag - will add a comma after every thousand place
        System.out.printf("%,f\n", num4);
        System.out.printf("%,.2f\n", num4);

//        ( Flag - any -ve number will be kept inside a ()
        System.out.printf("%(f\n", num2);
        System.out.printf("%(.2f\n", num3);

//        space Flag = if we use a space, then in front of every +ve number there will be a space,
//                     but no space in front of -ve numbers
        System.out.printf("% f\n", num2);
        System.out.printf("% f\n", num3);
        System.out.printf("% .2f\n", num3);




        /*
        * Width of printf Statement
        *    By using the width we can align the numbers
        * Here:
        * == 0 = padding
        * == number = right justified padding
        * == -ve number = left justified padding
        * */

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.println("Printing the numbers using Width of  and 4");
        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.println("Printing the numbers using Width but no 0 just 4");
        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.println("Printing the numbers using Width of -ve numbers");
        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);


    }
}
