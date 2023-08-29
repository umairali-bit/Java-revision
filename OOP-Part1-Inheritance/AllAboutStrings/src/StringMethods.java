public class StringMethods {

    public static void main(String[] args) {
        String birthdate = "11/25/1982";
        int startingIndex = birthdate.indexOf("1982");
        System.out.println("startingIndex = " + startingIndex);//output 6
        System.out.println("Birth year = " + birthdate.substring(startingIndex));//output Birth year = 1982

        System.out.println("Date = " + birthdate.substring(3,5));//output 25 excluding character at 5 including character 3.

        String newDate = String.join("/", "11","25","1982");
        System.out.println("newDate = " + newDate);//output 11/25/1982

        newDate = "11";
        newDate = newDate.concat("/");
        newDate = newDate.concat("25");
        newDate = newDate.concat("/");
        newDate = newDate.concat("1982");

        System.out.println("newDate = " + newDate);//same result as join

        newDate = "11" + "/" + "25" + "/" + "1982";
        System.out.println("newDate = " + newDate);// output = 11/25/1982;

        newDate = "11".concat("/").concat("25").concat("/").concat("1982");
        System.out.println("newDate = " + newDate);


        System.out.println("newDate = " + newDate.replace('/','-'));//output 11-25-1982
        System.out.println("newDate = " + newDate.replace("2","00"));//output 11/005/19800
        System.out.println("newDate = " + newDate.replaceFirst("/","-"));//output 11-25/1982
        System.out.println("newDate = " + newDate.replaceAll("/","---"));//output 11---25---1982

        System.out.println("ABC\n".repeat(3));
        //ABC
        //ABC
        //ABC
        System.out.println("-".repeat(20));//---------------------------------
        System.out.println("ABC\n".repeat(3).indent(8));
        //         ABC
        //         ABC
        //         ABC
        System.out.println("-".repeat(20));

        System.out.println("    ABC\n".repeat(3).indent(-2));//indent two spaces from right
        System.out.println("-".repeat(20));

    }
}
