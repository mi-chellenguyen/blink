package com.example.myapplication;

public class UserInformation {

    public String userName;
    public String userID;
    public String phone;
    public String email;

    public UserInformation() {}

    public UserInformation(String userName, String id, String phone, String email) {
        this.userName = userName;
<<<<<<< HEAD
        this.userID = id;
=======
>>>>>>> a2321180e0ee00ffb50254da1cc4a603056cce13
        this.phone = phone;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserID() {
        return userID.toString();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
