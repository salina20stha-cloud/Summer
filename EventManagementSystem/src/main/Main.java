package main;

import java.util.Scanner;

import controller.EventController;
import controller.ParticipantController;
import controller.TicketController;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        EventController eventController = new EventController();
        ParticipantController participantController = new ParticipantController();
        TicketController ticketController = new TicketController();

        int choice;

        do {

            System.out.println("\n==========================================");
            System.out.println("      EVENT MANAGEMENT SYSTEM");
            System.out.println("==========================================");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Search Event");
            System.out.println("4. Update Event");
            System.out.println("5. Delete Event");
            System.out.println("6. Register Participant");
            System.out.println("7. View Participants");
            System.out.println("8. Search Participant");
            System.out.println("9. Book Ticket");
            System.out.println("10. View Tickets");
            System.out.println("0. Exit");
            System.out.println("==========================================");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    eventController.addEvent();
                    break;

                case 2:
                    eventController.viewEvents();
                    break;

                case 3:
                    eventController.searchEvent();
                    break;

                case 4:
                    eventController.updateEvent();
                    break;

                case 5:
                    eventController.deleteEvent();
                    break;

                case 6:
                    participantController.registerParticipant();
                    break;

                case 7:
                    participantController.viewParticipants();
                    break;

                case 8:
                    participantController.searchParticipant();
                    break;

                case 9:
                    ticketController.bookTicket();
                    break;

                case 10:
                    ticketController.viewTickets();
                    break;

                case 0:
                    System.out.println("\nThank you for using Event Management System!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 0);

        scanner.close();
    }
}