/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._question1_exam;

/**
 *
 * @author lab_services_student
 */
public class Movie {

    public static void main(String[] args) {
        
        // Single array movie names 
        final String[] movies = {"Napoleon", "Oppenheimer"};
        
        // 2D array for ticket sales of the months 
        final int[] [] ticketSales = {
            {3000, 1500, 1700},
            {3500, 1200, 1600}
        };
        
        // Creating an instance of the class 
        MovieTickets movieTickets = new MovieTickets();
        int[] totalSales = new int[movies.length];

        
        // Printing the header 
        System.out.println("Movie Ticket Sales Report - 2024");
        System.out.println("\t\t\tJan\tFeb\tMar");
        System.out.println("-".repeat(60));
        
        for (int i = 0; i < movies.length; i++) {
            System.out.println(movies[i] + "\t\t"
                    + ticketSales[i][0] + "\t"
                    + ticketSales[i][1] + "\t"
                    + ticketSales[i][2]
            );
            
             // Calculating the total for each movie and storing it 
             totalSales[i] = movieTickets.TotalMovieSales(ticketSales[i]);
        }
        
        System.out.println();
        for (int i = 0; i < movies.length; i++) {
            System.out.println("Total movie tickets sale for " + movies[i] + " " + totalSales[i]);
        }
        
        // Displaying the top performing movie 
        String topMovie = movieTickets.TopMovie(movies, totalSales);
        System.out.println();
        System.out.println("Top performing movie: " + topMovie);
    }
}
