package com.example.uiu_campusconnect;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Label;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;

    @FXML
    private void handleLogin() {


        String username = usernameField.getText();
        String password = passwordField.getText();

        try {
            if (UserDAO.authenticateUser(username, password)) {
                errorLabel.setText("Login successful!");
                // Redirect to hello-view.fxml
                FXMLLoader loader = new FXMLLoader(getClass().getResource("Update.fxml"));
                Parent root = loader.load();
                Stage stage = (Stage) usernameField.getScene().getWindow(); // Get current stage
                stage.setScene(new Scene(root));
                stage.setTitle("Hello View");
                stage.show();
            } else {
                errorLabel.setText("Invalid username or password!");
            }
        } catch (IOException e) {
            errorLabel.setText("Error loading the next scene: " + e.getMessage());
        } catch (Exception e) {
            errorLabel.setText("Error: " + e.getMessage());
        }
    }

    public void switchForgotPass(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("forgot-password.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow(); // Get current stage
            stage.setScene(new Scene(root));
            stage.setTitle("Forgot Password");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // Log any errors for debugging
        }

    }
}
