/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._question2_exam;

/**
 *
 * @author lab_services_student
 */
public class MovieTickets implements IMovieTickets{
    
    // Constant VAT rate 
    private static final double VAT_RATE = 0.14;

     // Method to calculate total price including VAT
    @Override
    public double CalculateTotalTicketPrice(int numberOfTickets, double ticketPrice) {
        double subTotal = numberOfTickets * ticketPrice;
        return subTotal + (subTotal * VAT_RATE);
    }

    @Override
    public boolean ValidateData(MovieTicketData movieTicketData) {
        
        // Movie name cant be left empty 
        if (movieTicketData.getMovieName() == null || movieTicketData.getMovieName().trim().isEmpty()) {
            return false;
        }
        // Number of tickets must be greater than zero
        if (movieTicketData.getNumberOfTickets() < 0) {
            return false;
        }
        // Ticket price must be greater than zero
        if (movieTicketData.getTicketPrice() < 0) {
            return false;
        }
        return true; // All validations passed 
    }
    
}
