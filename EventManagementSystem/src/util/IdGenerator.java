package util;

/*
 * Generates unique IDs.
 *
 * SRP:
 * Responsible only for generating IDs.
 */

public class IdGenerator {

    private static int eventId = 1001;
    private static int participantId = 2001;
    private static int ticketId = 3001;

    public static int generateEventId() {
        return eventId++;
    }

    public static int generateParticipantId() {
        return participantId++;
    }

    public static int generateTicketId() {
        return ticketId++;
    }

}