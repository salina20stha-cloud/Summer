package repository;

import java.util.List;

import interfaces.Searchable;
import model.Event;
import storage.Database;

/*
 * SRP:
 * Responsible only for storing and retrieving Event data.
 */

public class EventRepository implements Searchable<Event> {

    // Add Event
    public void addEvent(Event event) {
        Database.events.add(event);
    }

    // View All Events
    public List<Event> getAllEvents() {
        return Database.events;
    }

    // Search Event
    @Override
    public Event searchById(int id) {

        for (Event event : Database.events) {

            if (event.getEventId() == id) {
                return event;
            }

        }

        return null;
    }

    // Update Event
    public boolean updateEvent(Event updatedEvent) {

        Event event = searchById(updatedEvent.getEventId());

        if (event != null) {

            event.setEventName(updatedEvent.getEventName());
            event.setVenue(updatedEvent.getVenue());
            event.setDate(updatedEvent.getDate());
            event.setCapacity(updatedEvent.getCapacity());

            return true;
        }

        return false;
    }

    // Delete Event
    public boolean deleteEvent(int id) {

        Event event = searchById(id);

        if (event != null) {

            Database.events.remove(event);
            return true;

        }

        return false;
    }

}