public class megaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes){

        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else {
            int YY = (int)(kiloBytes /1024);
            int ZZ = (int) (kiloBytes% 1024);
            int XX = kiloBytes;


            String printMBAKB = XX + " KB = "+ YY + " MB and " + ZZ + " KB";
            System.out.println(printMBAKB);
        }


        }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(500);
    }
    }

