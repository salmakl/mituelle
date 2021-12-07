package com.example.brief3;

import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class UserContoreller {

    List <Users> users=new ArrayList<>();


 @FXML
    private TextField fname;
 @FXML
    private TextField lname;
 @FXML
    private TextField mail;
 @FXML
    private TextField phone;
 @FXML
    private TextArea adress;
 @FXML
    private TextField company;
 @FXML
    private DatePicker date;
 @FXML
    private TextField id;

 public void save(){

     Users user = new Users();
     user.setFname(this.fname.getText());
     user.setLname(this.lname.getText());
     user.setCin(this.id.getText());
     user.setMail(this.mail.getText());
     user.setPhone(this.phone.getText());
     user.setAdress(this.adress.getText());
     user.setCompany(this.company.getText());

     users.add(user);
     show();

 }

 public void show(){
     for (Users user : users) {
         System.out.println(user.getFname());
     }

 }
}
