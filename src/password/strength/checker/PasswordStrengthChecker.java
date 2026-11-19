/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package password.strength.checker;

/**
 *
 * @author Noor
 */
public class PasswordStrengthChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PasswordChecker.checkPassword("hello");

        PasswordChecker.checkPassword("Hello123!");

        PasswordChecker.checkPassword("HelloWorld123!@");
    }
    
}
