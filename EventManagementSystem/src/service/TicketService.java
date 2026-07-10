package service;

import model.Event;
import model.Participant;
import model.Ticket;
import repository.EventRepository;
import repository.ParticipantRepository;
import repository.TicketRepository;
import util.IdGenerator;
import util.InputValidator;

public class TicketService {

    private TicketRepository ticketRepository =
            new TicketRepository();

    private EventRepository eventRepository =
            new EventRepository();

    private ParticipantRepository participantRepository =
            new ParticipantRepository();

    // Book Ticket
    public void bookTicket(int participantId,
                           int eventId,
                           double price) {

        if (!InputValidator.isValidPrice(price)) {
            System.out.println("Invalid ticket price.");
            return;
        }

        Participant participant =
                participantRepository.searchById(participantId);

        if (participant == null) {
            System.out.println("Participant not found.");
            return;
        }

        Event event =
                eventRepository.searchById(eventId);

        if (event == null) {
            System.out.println("Event not found.");
            return;
        }

        Ticket ticket = new Ticket(
                IdGenerator.generateTicketId(),
                participant,
                event,
                price
        );

        ticketRepository.addTicket(ticket);

        System.out.println("Ticket booked successfully.");
    }

    // View Tickets
    public void viewTickets() {

        if (ticketRepository.getAllTickets().isEmpty()) {
            System.out.println("No tickets booked.");
            return;
        }

        for (Ticket ticket : ticketRepository.getAllTickets()) {
            ticket.displayInfo();
        }
    }

}