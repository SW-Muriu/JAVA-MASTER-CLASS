package OOP.Polymorphism.MovieGenres;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        //Casting
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");

        //Casting a movie
        ((Movie) comedy).watchMovie();


        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S", "Airplane");

        //Checks the object class at run time
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        }
        //Another way to Check the object class at run time
        else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }
        //Another version using pattern matching support.
        else if (unknownObject instanceof ScienceFiction syfy) {
            syfy.watchScienceFiction();
        }


    }
}
