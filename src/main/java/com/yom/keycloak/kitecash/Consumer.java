package com.yom.keycloak.kitecash;

/**
 * Created by yogendra on 21/8/17.
 */
public class Consumer {


    private String userName;
    private String firstName;
    private String password;
    private String relam;
    private String note;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRelam() {
        return relam;
    }

    public void setRelam(String relam) {
        this.relam = relam;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
