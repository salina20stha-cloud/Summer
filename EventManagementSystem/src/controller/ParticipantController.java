package controller;

import java.util.Scanner;

import service.ParticipantService;

public class ParticipantController {

    private Scanner scanner = new Scanner(System.in);
    private ParticipantService participantService = new ParticipantService();

    // Register Participant
    public void registerParticipant() {

        System.out.println("\n===== Register Participant =====");

        System.out.print("Name    : ");
        String name = scanner.nextLine();

        System.out.print("Email   : ");
        String email = scanner.nextLine();

        System.out.print("Phone   : ");
        String phone = scanner.nextLine();

        System.out.print("College : ");
        String college = scanner.nextLine();

        participantService.registerParticipant(name, email, phone, college);
    }

    // View Participants
    public void viewParticipants() {
        participantService.viewParticipants();
    }

    // Search Participant
    public void searchParticipant() {

        System.out.print("Enter Participant ID : ");
        int id = scanner.nextInt();
        scanner.nextLine();

        participantService.searchParticipant(id);
    }
}