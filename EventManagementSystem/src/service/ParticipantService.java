package service;

import model.Participant;
import repository.ParticipantRepository;
import util.IdGenerator;
import util.InputValidator;

public class ParticipantService {

    private ParticipantRepository participantRepository =
            new ParticipantRepository();

    // Register Participant
    public void registerParticipant(String name,
                                    String email,
                                    String phone,
                                    String college) {

        if (!InputValidator.isValidName(name)) {
            System.out.println("Invalid name.");
            return;
        }

        if (!InputValidator.isValidEmail(email)) {
            System.out.println("Invalid email.");
            return;
        }

        if (!InputValidator.isValidPhone(phone)) {
            System.out.println("Phone must contain exactly 10 digits.");
            return;
        }

        Participant participant = new Participant(
                IdGenerator.generateParticipantId(),
                name,
                email,
                phone,
                college
        );

        participantRepository.addParticipant(participant);

        System.out.println("Participant registered successfully.");
    }

    // View Participants
    public void viewParticipants() {

        if (participantRepository.getAllParticipants().isEmpty()) {
            System.out.println("No participants found.");
            return;
        }

        for (Participant participant : participantRepository.getAllParticipants()) {
            participant.displayInfo();
        }
    }

    // Search Participant
    public void searchParticipant(int id) {

        Participant participant = participantRepository.searchById(id);

        if (participant != null) {
            participant.displayInfo();
        } else {
            System.out.println("Participant not found.");
        }
    }

}