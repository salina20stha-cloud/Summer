package model;

import interfaces.Displayable;

public class Ticket implements Displayable {

    private int ticketId;
    private Participant participant;
    private Event event;
    private double price;

    public Ticket() {
    }

    public Ticket(int ticketId, Participant participant, Event event, double price) {
        this.ticketId = ticketId;
        this.participant = participant;
        this.event = event;
        this.price = price;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Participant getParticipant() {
        return participant;
    }

    public void setParticipant(Participant participant) {
        this.participant = participant;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayInfo() {
        System.out.println("----------------------------");
        System.out.println("Ticket ID   : " + ticketId);
        System.out.println("Participant : " + participant.getName());
        System.out.println("Event       : " + event.getEventName());
        System.out.println("Price       : Rs. " + price);
    }
}