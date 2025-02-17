package service;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BookMyMovieApp {

    public static void main(String[] args) {
        BookMyMovieSys mbs=new BookMyMovieSys();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter city:");
        String city=sc.next();
        mbs.displayTheaters(city);

        System.out.println("Enter Theater Id and Movie Id:");
        int theaterId = sc.nextInt();
        int movieId=sc.nextInt();
        mbs.displayShows(movieId,theaterId);

        System.out.println("Enter show Id and Number of seats");
        int showId=sc.nextInt();
        List<String> ss= Arrays.asList("A3","A4");
        mbs.bookTicket(1,showId,ss);
    }

}
