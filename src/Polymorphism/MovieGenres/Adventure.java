package Polymorphism.MovieGenres;

public class Adventure extends Movie {


    public Adventure(String title) {
        super(title);
    }


    //Run time polymorphism(Method over ride)
    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something bad happens");
    }
}
