package com.example.brief3;

import java.util.Date;

public class Users {
    private String fname;
    private String lname;
    private String mail;
    private String adress;
    private Date date;
    private String phone;
    private String cin;
    private String company;

    public Users(String fname, String lname, String mail, String adress, Date date, String phone, String cin, String company) {
        this.fname = fname;
        this.lname = lname;
        this.mail = mail;
        this.adress = adress;
        this.date = date;
        this.phone = phone;
        this.cin = cin;
        this.company = company;
    }

    public Users() {
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return mail;
    }

    public void setEmail(String email) {
        this.mail = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
}
