/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question2_exam;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketData {
    
    // Decleartions to stor the movie ticket information
    String movieName;
    int numberOfTickets;
    double ticketPrice;
    
    
    // Constructor
    public MovieTicketData(String movieName, int numberOfTickets, double ticketPrice) {
        this.movieName = movieName;
        this.numberOfTickets = numberOfTickets;
        this.ticketPrice = ticketPrice;
    }
    
    // Getters
    public String getMovieName() {
        return movieName;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    
    public double getTicketPrice() {
        return ticketPrice;
    }
}
