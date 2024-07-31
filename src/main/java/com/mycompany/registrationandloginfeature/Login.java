/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registrationandloginfeature;


import java.util.Map;
import javax.swing.JOptionPane;



/**
 *
 * @author RC_Student_lab
 */
//ST10446474
public class Login {
    private Map<String, String> userCredentials;

    public Login(Map<String, String> userCredentials) {
        this.userCredentials = userCredentials; // Store the userCredentials map
    }

    public boolean main() {
        String username = JOptionPane.showInputDialog("Enter your username:");
        String password = JOptionPane.showInputDialog("Enter your password:");

        if (userCredentials.containsKey(username) && userCredentials.get(username).equals(password)) {
            // Successful login logic (e.g., display welcome message)
            JOptionPane.showMessageDialog(null, "Welcome, " + username + "!");
            Task task = new Task();
            task.main();
            // Proceed to the main application screen or perform other actions
            return true;
        } else {
            // Failed login logic (e.g., display error message)
            JOptionPane.showMessageDialog(null, "Invalid username or password. Please try again.");
            // You can also handle additional cases (e.g., account lockout after multiple failed attempts)
            return false;
        }
    }
}
    
    

