package com.samsicker.OOP.Polymorphism.MovieGenres;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = new Adventure("Star Wars");
//        Movie theMovie = Movie.getMovie("Science Fiction", "Star Wars");
//        theMovie.watchMovie();


        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("Enter Type(A for Adventure, " +
                    "C for Comedy and S for Science Fiction" +
                    "or Q to Quit: ");
            String type = scanner.nextLine();
            if ("Qq".contains(type)){
                System.out.println("Thank you for participation!!");
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
