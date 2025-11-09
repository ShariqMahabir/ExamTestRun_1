/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany._question2_exam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class MovieTicketsTest {
    
    public MovieTicketsTest() {
    }

    @Test
    public void CalculateTotalTicketPrice_CalculatedSuccessfully() {
        MovieTickets tickets = new MovieTickets();
        double result = tickets.CalculateTotalTicketPrice(2, 100.0);
        assertEquals(228.0, result, 0.01);
    }

    @Test
    public void ValidationTests() {
        MovieTickets tickets = new MovieTickets();
        MovieTicketData invalid = new MovieTicketData("Napoleon", 2, 0);
        assertTrue(tickets.ValidateData(invalid));
        
    }
    
}
