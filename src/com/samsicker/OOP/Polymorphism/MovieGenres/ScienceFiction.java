package com.samsicker.OOP.Polymorphism.MovieGenres;

public class ScienceFiction extends Movie{
    public ScienceFiction(String title) {
        super(title);
    }

    @Override
    public void watchMovie() {
        super.watchMovie();

        System.out.printf("..%s%n".repeat(3),
                "Bad aliens do bad staff",
                "Space guys chase space aliens",
                "Planet explodes");
    }

    public void watchScienceFiction(){
        System.out.println("Watching a Science Fiction Thriller!!");
    }
}
