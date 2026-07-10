package storage;

import java.util.ArrayList;

import model.Event;
import model.Participant;
import model.Ticket;

/*
 * Stores all application data in memory.
 * All repositories use these shared lists.
 *
 * SRP:
 * Responsible only for storing data.
 */

public class Database {

    public static ArrayList<Event> events = new ArrayList<>();

    public static ArrayList<Participant> participants = new ArrayList<>();

    public static ArrayList<Ticket> tickets = new ArrayList<>();

}