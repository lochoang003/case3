package com.example.case3.model;

public class Users {
    private int id;
    private String name;
    private String user;
    private String pass;
    private String date_created;
    private byte status;
    private String role;


    public Users(int id, String name, String user, String pass, String date_created, byte status, String role) {
        this.id = id;
        this.name = name;
        this.user = user;
        this.pass = pass;
        this.date_created = date_created;
        this.status = status;
        this.role = role;
    }

    public Users(String name, String user, String pass, String date_created) {
        this.name = name;
        this.user = user;
        this.pass = pass;
        this.date_created = date_created;
    }

    public int getId() {
        return id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc() {
        return user;
    }

    public void setAcc(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getDate_created() {
        return date_created;
    }

    public void setDate_created(String date_created) {
        this.date_created = date_created;
    }

    public byte getStatus() {
        return status;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
}
