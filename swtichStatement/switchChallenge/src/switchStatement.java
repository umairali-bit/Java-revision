public class switchStatement {


    public static void main(String[] args) {
        char alphabet = 'a';
        System.out.println(alphabet + " means " + getAlphabet(alphabet));

    }

    public static String getAlphabet(char alphabet) {
/*
        switch(alphabet){
            case 'a':
                return "ABLE";
            case 'b':
                return "BAKER";
            case 'c':
                return "CHARLIE";
            case 'd':
                return "DOG";
            case 'e':
                return "EASY";


        }

        return "NOT FOUND";
    }*/

        return switch (alphabet) {
            case 'a' -> {yield "ABLE";}
            case 'b' -> {yield "BAKER";}
            case 'c' -> {yield "CHARLIE";}
            case 'd' -> {yield "DOG";}
            case 'e' -> {yield "EASY";}
            default -> {

                String badEntry = alphabet + " isnt valid ";
                yield badEntry;

            }
        };

    }

}
