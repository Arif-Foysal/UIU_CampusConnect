package com.example.uiu_campusconnect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;

public class SignupController {
    @FXML
    private TextField usernameField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    @FXML
    private void handleSignup() {
        String username = usernameField.getText();
        String email = emailField.getText();
        String password = passwordField.getText();

        User newUser = new User(username, email, password);
        try {
            if (UserDAO.registerUser(newUser)) {
                errorLabel.setText("Signup successful!");
                // Redirect to login page
            } else {
                errorLabel.setText("Signup failed!");
            }
        } catch (Exception e) {
            errorLabel.setText("Error: " + e.getMessage());
        }
    }
    public void switchToLogin(ActionEvent event) {
    }
}
