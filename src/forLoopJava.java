public class forLoopJava {
    public static void main(String[] args){
        /*
         * For Loop:
         * It is similar to while loop.
         * But it executes some code a certain amount of time.
         * */

        /*
         * Within the for loop condition there are 3 condition
         * Each condition seperated bz a
         *   1st condition - Initialization, basically declaring a variable
         *                 - We can create counter - which will do iteration.
         *                       Keep count of how many times we have iterated this loop
         *                 - Also known as loop controlling variable.
         *   2nd condition - till what do we want our loop to continue
         *                 - set a condition / limit
         *   3rd condition - This is the update
         *                 - will increment / decrement the variable
         *
         *
         * */

        for( int i = 0; i < 10 ; i+=2){
            System.out.println("Number of time the loop is running is: "+ i);

        }

        for(int i = 10; i > 0; i -=3){
            System.out.println("Number of time the loop is running is: "+ i);
        }

    }
}
