import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int number;

        System.out.println("Enter a number: ");
        number = scan.nextInt();

        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        scan.close();

    }
}
