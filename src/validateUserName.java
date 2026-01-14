import java.util.Scanner;

public class validateUserName {
    public static void main(String[] args){
        /*
        * This prog will use logical operator (&&, ||, !) to validate
        * Username
        *       - Take user input
        *       - Username will be between 4-12 characters.
        *       - Username must not contain space or underscores.
        *
         */

//        Taking the user input
        Scanner scan = new Scanner(System.in);

//        Declare variable
        String userName;

        System.out.println("Enter your user name: ");
        userName = scan.nextLine();

//        condition for length of name
        if(userName.length() < 4 || userName.length() > 12){
            System.out.println("Username must be between 4-12 character.");
        }
        else if(userName.contains(" ") || userName.contains("_") || userName.contains(",")){
            System.out.println("Username must not contain space( ), underscore(_), comma(,)");
        }
        else{
            System.out.println("Welcome "+ userName);
        }


        scan.close();
    }
}
