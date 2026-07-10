package model;

public class Participant extends Person {

    private String college;

    public Participant() {
    }

    public Participant(int id, String name, String email, String phone, String college) {
        super(id, name, email, phone);
        this.college = college;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public void displayInfo() {
        System.out.println("Participant ID : " + getId());
        System.out.println("Name           : " + getName());
        System.out.println("Email          : " + getEmail());
        System.out.println("Phone          : " + getPhone());
        System.out.println("College        : " + college);
    }
}