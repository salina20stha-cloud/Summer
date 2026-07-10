package controller;

import java.util.Scanner;

import service.EventService;

public class EventController {

    private Scanner scanner = new Scanner(System.in);
    private EventService eventService = new EventService();

    // Add Event
    public void addEvent() {

        System.out.println("\n===== Add Event =====");

        System.out.print("Event Name : ");
        String name = scanner.nextLine();

        System.out.print("Venue      : ");
        String venue = scanner.nextLine();

        System.out.print("Date       : ");
        String date = scanner.nextLine();

        System.out.print("Capacity   : ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        eventService.addEvent(name, venue, date, capacity);
    }

    // View Events
    public void viewEvents() {
        eventService.viewEvents();
    }

    // Search Event
    public void searchEvent() {

        System.out.print("Enter Event ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        eventService.searchEvent(id);
    }

    // Update Event
    public void updateEvent() {

        System.out.print("Enter Event ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("New Event Name : ");
        String name = scanner.nextLine();

        System.out.print("New Venue      : ");
        String venue = scanner.nextLine();

        System.out.print("New Date       : ");
        String date = scanner.nextLine();

        System.out.print("New Capacity   : ");
        int capacity = scanner.nextInt();
        scanner.nextLine();

        eventService.updateEvent(id, name, venue, date, capacity);
    }

    // Delete Event
    public void deleteEvent() {

        System.out.print("Enter Event ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        eventService.deleteEvent(id);
    }
}