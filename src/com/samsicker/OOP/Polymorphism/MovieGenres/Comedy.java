package com.samsicker.OOP.Polymorphism.MovieGenres;

public class Comedy extends Movie {
    public Comedy(String title) {
        super(title);
    }


    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf("..%s%n".repeat(3),
                "Something funny happens",
                "Something even funnier happens",
                "Happy Ending");
    }

    public void watchComedy(){
        System.out.println("Watching A comedy");
    }
}
