package repository;

import java.util.List;

import interfaces.Searchable;
import model.Participant;
import storage.Database;

/*
 * SRP:
 * Responsible only for storing Participant data.
 */

public class ParticipantRepository implements Searchable<Participant> {

    // Register Participant
    public void addParticipant(Participant participant) {

        Database.participants.add(participant);

    }

    // View Participants
    public List<Participant> getAllParticipants() {

        return Database.participants;

    }

    // Search Participant
    @Override
    public Participant searchById(int id) {

        for (Participant participant : Database.participants) {

            if (participant.getId() == id) {
                return participant;
            }

        }

        return null;
    }

}