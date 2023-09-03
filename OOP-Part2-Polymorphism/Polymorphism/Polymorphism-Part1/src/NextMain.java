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

        //testing the runtime and three ways to do it
        //if an unknown(object) movie is truly an Adventure(object)
        Object unknownObject = Movie.getMovie("C", "Airplane");
        if(unknownObject.getClass().getSimpleName() == "Comedy"){//method1
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if(unknownObject instanceof Adventure){//method2
            ((Adventure) unknownObject).watchAdventure();//chaining a method directly if unknownObject is an instance of Adventure
        } else if(unknownObject instanceof ScienceFiction syfy){//method3
            syfy.watchSciFi();//another method to do this
        }

        //testing the runtime using method 2
        Object unknownObject1 = Movie.getMovie("A", "Jaws");
        if(unknownObject1 instanceof Comedy){
            ((Comedy)unknownObject1).watchComedy();
        } else if(unknownObject1 instanceof Adventure){
            ((Adventure) unknownObject1).watchAdventure();//chaining a method directly if unknownObject is an instance of Adventure
        } else if(unknownObject1 instanceof ScienceFiction syfy1){
            syfy1.watchSciFi();//another method to do this
        }

        //testing the runtime using method 3
        Object unknownObject2 = Movie.getMovie("S", "Star Wars");
        if(unknownObject2 instanceof Comedy com){
            com.watchComedy();
        } else if(unknownObject2 instanceof Adventure adv){
            adv.watchAdventure();//chaining a method directly if unknownObject is an instance of Adventure
        } else if(unknownObject2 instanceof ScienceFiction syfy2){
            syfy2.watchSciFi();//another method to do this
        }


    }
}
