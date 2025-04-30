package com.studentpgfinder.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @FXML
    private void handleLogin() throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals("student") && password.equals("student123")) {
            loadDashboard();
        } else if (username.equals("admin") && password.equals("admin123")) {
            loadDashboard();
        } else {
            showErrorMessage("Invalid login credentials!");
        }
    }

    private void loadDashboard() throws IOException {
        Stage stage = (Stage) loginButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/studentpgfinder/views/student_dashboard.fxml"));
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);
    }

    private void showErrorMessage(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Login Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
