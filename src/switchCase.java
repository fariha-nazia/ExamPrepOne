import java.util.Scanner;

public class switchCase {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

//        Declare the variable
        String day;
        System.out.println("Enter a Day of the Week: ");
        day = scan.nextLine().toLowerCase();
        System.out.println(day);

/*        switch(day){
            case "sunday" -> System.out.println("Its the last day of weekend");
            case "monday" -> System.out.println("Its a weekday");
            case "tuesday" -> System.out.println("Its a weekday");
            case "wednesday" -> System.out.println("Its a weekday");
            case "thursday" -> System.out.println("Its a weekday");
            case "friday" -> System.out.println("Its a weekday");
            case "saturday" -> System.out.println("Its the weekend");
            default -> System.out.println(day + " Is not a day :/");
        }*/

//        we can also do a shortcut
        switch(day){
            case "monday", "tuesday", "wednesday", "thursday", "friday"
                    -> System.out.println("Its a weekday");
            case "sunday" -> System.out.println("Its the last day of weekend");
            case "saturday" -> System.out.println("Its the weekend");
            default -> System.out.println(day + " Is not a day :/");

        }

        scan.close();
    }
}
