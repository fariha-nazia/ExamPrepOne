import java.util.Scanner;
public class statementIf {
    public static void main(String[] args){

       Scanner scan = new Scanner(System.in);

       String nameOfPerson;
       int age;
       boolean isStudent;

       System.out.print("Enter you name: ");
       nameOfPerson = scan.nextLine();

       System.out.print("Enter you age: ");
       age = scan.nextInt();

       System.out.println("Are you a Student (Ture/False): ");
       isStudent = scan.nextBoolean();

       /*
       * Validating the name
       * 1. if the name string is empty
       * */
       if (nameOfPerson.isEmpty()){
           System.out.println("You did not enter your name. :/");
       }
       else {
           System.out.println("Hello! "+ nameOfPerson);
       }




       /*
       * For validating the age
       * */
       if( age > 65){
           System.out.println("You are too old!");
       }
       else if(age >= 18 ){
           System.out.println("You are Adult");

       } else if (age >= 13) {
           System.out.println("You are too Young");

       } else if (age <= 12 && age >= 1) {
           System.out.println("You are child");

       } else if(age == 0){
           System.out.println("You are a baby");
       }
       else {
           System.out.println("Invalid age!");
       }



       /*validating if you are a student
       * */

       if(isStudent){
           System.out.println("You are a student");
       }
       else {
           System.out.println("You are not a student");
       }
        scan.close();

    }
}
