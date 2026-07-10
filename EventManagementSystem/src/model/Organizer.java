package model;

public class Organizer extends Person {

    private String department;

    public Organizer() {
    }

    public Organizer(int id, String name, String email, String phone, String department) {
        super(id, name, email, phone);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayInfo() {
        System.out.println("Organizer ID : " + getId());
        System.out.println("Name         : " + getName());
        System.out.println("Email        : " + getEmail());
        System.out.println("Phone        : " + getPhone());
        System.out.println("Department   : " + department);
    }
}