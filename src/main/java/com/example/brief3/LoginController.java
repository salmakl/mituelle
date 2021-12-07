package com.example.brief3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;


public class LoginController {

    public LoginController() {
    }
    @FXML
    private Button button;
    @FXML
    private TextField email;
    @FXML
    private PasswordField password;
    @FXML
    private Label wrong;


    public void checkLogin() throws IOException {

       // LoginApplication main = new LoginApplication();

        if (this.email.getText().toString().equals("admin") && this.password.getText().toString().equals("admin")) {
            //System.out.println("Login Successful");
            wrong.setText("Login Successful");
        }
        else if (this.email.getText().isEmpty() || this.password.getText().isEmpty()) {
            //System.out.println("Please enter your email and password");
            wrong.setText("Please enter your email and password");
        }
        else {
            //Alert alert = new Alert(Alert.AlertType.ERROR);
            wrong.setText("Wrong password or email");
        }


    }


}