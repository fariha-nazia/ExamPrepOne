public class ternaryOperator {
    public static void main(String [] args){
        /*
        * Ternary operator = ?
        *   Return 1 of 2 values if a condition is true
        *   Exp:
        *       variable = (condition) ? ifTrue : ifFalse
        * This is the simplified version of if/else statement.
        * */

        int score = 70;

//      Easy way
/*        if (score >= 60){
            System.out.println("Pass");
        }else{
            System.out.println("Fails");
        }*/
//        Using Ternary operator
        String passOrFail = (score >= 60) ? "You Pass" : "You Fail";
        System.out.println(passOrFail);


    }
}
