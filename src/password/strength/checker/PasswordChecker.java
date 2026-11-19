/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package password.strength.checker;

/**
 *
 * @author Noor
 */

import java.util.ArrayList;

public class PasswordChecker {

    public static void checkPassword(String password) {

        int score = 0;

        ArrayList<String> suggestions = new ArrayList<>();

        // Check password length
        if (password.length() >= 8) {
            score++;
        } else {
            suggestions.add("Use at least 8 characters.");
        }

        if (password.length() >= 12) {
            score++;
        } else {
            suggestions.add("Try using at least 12 characters.");
        }

        if (password.length() >= 16) {
            score++;
        }

        // Check uppercase letters
        if (password.matches(".*[A-Z].*")) {
            score++;
        } else {
            suggestions.add("Add an uppercase letter.");
        }

        // Check lowercase letters
        if (password.matches(".*[a-z].*")) {
            score++;
        } else {
            suggestions.add("Add a lowercase letter.");
        }

        // Check numbers
        if (password.matches(".*[0-9].*")) {
            score++;
        } else {
            suggestions.add("Add a number.");
        }

        // Check symbols
        if (password.matches(".*[^a-zA-Z0-9].*")) {
            score++;
        } else {
            suggestions.add("Add a symbol.");
        }

        // Display results
        System.out.println("\nPassword Score: " + score + "/7");

        if (score <= 3) {
            System.out.println("Strength: WEAK");
        } 
        else if (score <= 5) {
            System.out.println("Strength: MEDIUM");
        } 
        else {
            System.out.println("Strength: STRONG");
        }

        // Display suggestions
        if (suggestions.isEmpty()) {
            System.out.println("Excellent! Your password meets all our rules.");
        } else {
            System.out.println("\nSuggestions for improvement:");

            for (String suggestion : suggestions) {
                System.out.println("- " + suggestion);
            }
        }
    }
}
