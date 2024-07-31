/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registrationandloginfeature;

import javax.swing.JOptionPane;

/**
 *
 *@author RC_Student_lab
 */
//ST10443414
public class RegistrationAndLoginFeature {
    public static void main(String[] args) {
        boolean loggedIn = false;
        Registration registerUser = new Registration(); // Create an instance of RegisterUser
        Login login = new Login(registerUser.getUserCredentials()); // Pass the userCredentials map to Login

        while (!loggedIn) {
            String choice = JOptionPane.showInputDialog("Choose an option:\n1. Log in\n2. Sign up\n3. Exit");
            switch (choice) {
                case "1":
                    loggedIn = login.main();// Call login method from Login class
                    break;
                case "2":
                    registerUser.main(); // Call main method from RegisterUser class
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Goodbye!");
                    loggedIn = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice. Please try again.");
            }
        }
    }
}