

public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    // public method that's going to be called from calling code. This method is going to demonstarte
    // Polymorphism
    public void watchMovie(){

        //getClass() is on Java linked object. This method returns class type information about the runtime
        // instance on which the method is executing. We can get the name of the class
        // by using .getSimpleName();
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film ");
    }

    //another calling method. Factory method.
    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            //return different sub classes
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }



}

class Adventure extends Movie{


    public Adventure(String title) {
        super(title);
    }

    //overriding method watchMovie()
    //%s is used to replace any string. %n put a new line. This count 3 times based on three Strings
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("....%s%n".repeat(3),
                            "Pleasant Scene",
                            "Scary Music",
                            "Something Bad Happens");
    }
}

class Comedy extends Movie{


    public Comedy(String title) {
        super(title);
    }

    //overriding method watchMovie()
    //%s is used to replace any string. %n put a new line. This count 3 times based on three Strings
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("....%s%n".repeat(3),
                            "Something funny happens",
                            "Something even funnier happens",
                            "Happy Ending");
    }
}

class ScienceFiction extends Movie{


    public ScienceFiction(String title) {
        super(title);
    }

    //overriding method watchMovie()
    //%s is used to replace any string. %n put a new line. This count 3 times based on three Strings
    @Override
    public void watchMovie() {
        super.watchMovie();
        System.out.printf("....%s%n".repeat(3),
                        "Bad Aliens do Bad Stuff",
                        "Space Guys Chase Aliens",
                        "Planet Blows Up");
    }
}


