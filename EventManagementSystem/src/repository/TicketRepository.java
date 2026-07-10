package repository;

import java.util.List;

import model.Ticket;
import storage.Database;

/*
 * SRP:
 * Responsible only for storing Ticket data.
 */

public class TicketRepository {

    // Book Ticket
    public void addTicket(Ticket ticket) {

        Database.tickets.add(ticket);

    }

    // View Tickets
    public List<Ticket> getAllTickets() {

        return Database.tickets;

    }

}