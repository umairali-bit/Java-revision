import java.util.Scanner;
    public class challenge {

        // FlourPacker challenge

        public static void main(String[] args) {

            //canPack();
            System.out.println(canPack(-3,2,12));
        }

        public static void canPack() {

            boolean possible = true;

            Scanner sc = new Scanner(System.in); // create a Scanner object for big count
            System.out.println("Enter the big count");

            int bigCount = sc.nextInt();

            Scanner scanner = new Scanner(System.in); // create a Scanner object for small count
            System.out.println("Enter the small count");

            int smallCount = scanner.nextInt();

            if (bigCount == 5) {
                if(smallCount == 1){
                    //System.out.println("Valid Entry");
                }
                //System.out.println("Valid Entry");
            } else {
                System.out.println("Invalid Entry");
            }

            int kilos = (bigCount + smallCount);

            Scanner goal = new Scanner(System.in); // create a Scanner object for big count
            System.out.println("Enter the goal");
            int scc = goal.nextInt();

            if(kilos == scc) {
                System.out.println("We can work with this");
            }else if((bigCount>= scc&&bigCount%scc == 0)|| bigCount>= scc &&scc%5<=smallCount){

            } else if(smallCount >= scc) {
            } else if(kilos > scc && scc%bigCount<=smallCount) {
            }
            else{
                System.out.println("Not applicabale");
            }


        }


            public static boolean canPack(int bigCount, int smallCount, int goal) {
                if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
                    return false;
                }

                for (int i = 0; i <= bigCount; i++){
                    for (int j = 0; j <= smallCount; j++) {
                        if (i*5 + j == goal){
                            return true;
                        }
                    }
                }
                return false;

            }
        }

