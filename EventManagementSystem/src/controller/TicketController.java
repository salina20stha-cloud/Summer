package controller;

import java.util.Scanner;

import service.TicketService;

public class TicketController {

    private Scanner scanner = new Scanner(System.in);
    private TicketService ticketService = new TicketService();

    // Book Ticket
    public void bookTicket() {

        System.out.println("\n===== Book Ticket =====");

        System.out.print("Participant ID : ");
        int participantId = scanner.nextInt();

        System.out.print("Event ID       : ");
        int eventId = scanner.nextInt();

        System.out.print("Ticket Price   : ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        ticketService.bookTicket(participantId, eventId, price);
    }

    // View Tickets
    public void viewTickets() {
        ticketService.viewTickets();
    }
}