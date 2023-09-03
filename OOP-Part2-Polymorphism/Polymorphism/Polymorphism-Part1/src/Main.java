import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //test watch movie method
        Movie movie = new Movie("Star Wars");
        movie.watchMovie();

        //testing Adventure class and watchmovie()
        Movie theMovie = new Adventure("Apocalypto"); //because Adventure is a type of Movie
        theMovie.watchMovie();

        //static calling method
        Movie staticMovie = Movie.getMovie("S", "Star Wars");
        staticMovie.watchMovie();

        System.out.println("---------------------------");


        //scanner
        Scanner s = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, " +
                                 "S for Science Fiction, or Q to quit): ");

            String type = s.nextLine();
            if("Qq".contains(type)){
                break;
            }
            //use factory method

            System.out.println("Enter Movie Title");
            String title = s.nextLine();
            /*
            Polymorphism in action. Its the ability to execute different behavior, for different types, which are
            determined at runtime. Polymorphism enables you to write generic code based on the base class (parent class)
            and this code in the main method is extendable, meaning it doesnt have to change as new subclass come available
            */
            Movie facMovie = Movie.getMovie(type, title);
            facMovie.watchMovie();
        }





    }
}
