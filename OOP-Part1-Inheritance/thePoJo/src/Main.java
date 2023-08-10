public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            Student s = new Student("S9000" + i,
                    switch(i) {
                        case 1 -> "Marry";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Lisa";
                        case 5 -> "Harry";
                        default -> "Anonymus";
                    },
                    "10/25/1988",
                    "Java MasterClass");

            System.out.println(s);
            System.out.println(s.getId()); //displays ID one by one

        }

    }
}
