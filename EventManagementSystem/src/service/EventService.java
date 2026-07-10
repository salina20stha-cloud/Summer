package service;

import model.Event;
import repository.EventRepository;
import util.IdGenerator;
import util.InputValidator;

/*
 * SRP:
 * Handles only Event business logic.
 *
 * DIP:
 * Depends on EventRepository instead of accessing Database directly.
 */

public class EventService {

    private EventRepository eventRepository = new EventRepository();

    // Add Event
    public void addEvent(String name, String venue, String date, int capacity) {

        if (!InputValidator.isValidName(name)) {
            System.out.println("Invalid event name.");
            return;
        }

        if (!InputValidator.isValidCapacity(capacity)) {
            System.out.println("Invalid capacity.");
            return;
        }

        Event event = new Event(
                IdGenerator.generateEventId(),
                name,
                venue,
                date,
                capacity
        );

        eventRepository.addEvent(event);

        System.out.println("Event added successfully.");
    }

    // View Events
    public void viewEvents() {

        if (eventRepository.getAllEvents().isEmpty()) {
            System.out.println("No events available.");
            return;
        }

        for (Event event : eventRepository.getAllEvents()) {
            event.displayInfo();
        }
    }

    // Search Event
    public void searchEvent(int id) {

        Event event = eventRepository.searchById(id);

        if (event != null) {
            event.displayInfo();
        } else {
            System.out.println("Event not found.");
        }
    }

    // Update Event
    public void updateEvent(int id,
                            String name,
                            String venue,
                            String date,
                            int capacity) {

        Event updatedEvent = new Event(id, name, venue, date, capacity);

        if (eventRepository.updateEvent(updatedEvent)) {
            System.out.println("Event updated successfully.");
        } else {
            System.out.println("Event not found.");
        }
    }

    // Delete Event
    public void deleteEvent(int id) {

        if (eventRepository.deleteEvent(id)) {
            System.out.println("Event deleted successfully.");
        } else {
            System.out.println("Event not found.");
        }
    }

}