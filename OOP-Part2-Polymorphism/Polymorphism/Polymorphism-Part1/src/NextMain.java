public class NextMain {

    public static void main(String[] args) {

        //hard coded the arguments and assigned the result of this static method,Movie.getMovie to that variable
        Movie facMovie = Movie.getMovie("A", "Jaws");
        facMovie.watchMovie();

        //Adventure jaws = Movie.getMovie("A", "Jaws");
        Adventure jaws = (Adventure)Movie.getMovie("A", "Jaws");
        jaws.watchMovie();


        //can assign any Object to a reference that is of type Object. for example
        Object comedy = Movie.getMovie("C", "Airplane");
        Movie comedyMovie =(Movie) comedy;
        comedyMovie.watchMovie();
        //comedyMovie.watchComedy();watchComedy() is not in the Movie class thats why line 18 will not compile
        Comedy comedyMovie2 = (Comedy) comedy;


        //type inference
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();


        //example of creating an inference
        var plane = new Comedy("Airplane");
        plane.watchComedy();


    }
}
