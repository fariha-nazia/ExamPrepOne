public class breakAndContinue {
    public static void main(String[] args){
        /*
        * Break and Continue
        *  break = break out of a loop
        *        = STOP
        *  continue = skip current iteration of a loop
        *           = SKIP
        * */

//        Let see how break works
        for(int i = 0 ; i < 10 ; i++){
            if(i == 5){
                break;
            }
            System.out.println(i + " ");
        }



//        Let see how continue works
        for(int i = 0 ; i < 10 ; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i + " ");
        }





    }
}
