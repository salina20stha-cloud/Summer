package model;

import interfaces.Displayable;

public class Event implements Displayable {

    private int eventId;
    private String eventName;
    private String venue;
    private String date;
    private int capacity;

    public Event() {
    }

    public Event(int eventId, String eventName, String venue, String date, int capacity) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.venue = venue;
        this.date = date;
        this.capacity = capacity;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("----------------------------");
        System.out.println("Event ID : " + eventId);
        System.out.println("Name     : " + eventName);
        System.out.println("Venue    : " + venue);
        System.out.println("Date     : " + date);
        System.out.println("Capacity : " + capacity);
    }
}