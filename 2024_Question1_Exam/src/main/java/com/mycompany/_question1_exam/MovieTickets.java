/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question1_exam;

/**
 *
 * @author lab_services_student
 */
public class MovieTickets implements IMovieTickets{

    // Method to calculate total movie sales
    @Override
    public int TotalMovieSales(int[] movieTicketSales) {
        int total = 0;
        for (int sales: movieTicketSales) {
            total += sales;
        }
        return total;
    }

    // Method to determine top performing movie
    @Override
    public String TopMovie(String[] movies, int[] totalSales) {
        int max = totalSales[0];
        int index = 0;

        for (int i = 1; i < totalSales.length; i++) {
            if (totalSales[i] > max) {
                max = totalSales[i];
                index = i;
            }
    }
    return movies[index];
  }
}
