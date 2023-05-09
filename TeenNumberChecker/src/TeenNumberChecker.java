public class TeenNumberChecker {

    public static boolean hasTeen(int a, int b, int c) {

       if(((a >= 13 && a <=19 ) || (b >= 13 && b <= 19) || (c>=13 && c<=19))) {
           return true;


       } /* else {return false;} */
        return false;


    }
    public static boolean isTeen (int number){
        if(number >= 13 && number <=19){
            return true;
        } else {
            return false;
        }
    }



    public static void main(String[] args) {
        System.out.println(hasTeen(13,99,20));
        System.out.println(isTeen(9));
    }

}
