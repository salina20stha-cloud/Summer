package util;

/*
 * Utility class for validating input.
 */

public class InputValidator {

    // Validate Name
    public static boolean isValidName(String name) {

        return name != null && !name.trim().isEmpty();
    }

    // Validate Email
    public static boolean isValidEmail(String email) {

        return email.contains("@") && email.contains(".");
    }

    // Validate Phone Number
    public static boolean isValidPhone(String phone) {

        return phone.matches("\\d{10}");
    }

    // Validate Capacity
    public static boolean isValidCapacity(int capacity) {

        return capacity > 0;
    }

    // Validate Price
    public static boolean isValidPrice(double price) {

        return price > 0;
    }

}