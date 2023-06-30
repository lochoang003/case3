package com.example.case3.model;

public class Actor {
    private  int id_Actor;
    private String name_Actor;
    private byte age;
    private String image_Actor;

    public Actor() {
    }

    public Actor(int id_Actor, String name_Actor, byte age, String image_Actor) {
        this.id_Actor = id_Actor;
        this.name_Actor = name_Actor;
        this.age = age;
        this.image_Actor = image_Actor;
    }

    public Actor(String name_Actor, byte age, String image_Actor) {
        this.name_Actor = name_Actor;
        this.age = age;
        this.image_Actor = image_Actor;
    }

    public int getId_Actor() {
        return id_Actor;
    }

    public void setId_Actor(int id_Actor) {
        this.id_Actor = id_Actor;
    }

    public String getName_Actor() {
        return name_Actor;
    }

    public void setName_Actor(String name_Actor) {
        this.name_Actor = name_Actor;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getImage_Actor() {
        return image_Actor;
    }

    public void setImage_Actor(String image_Actor) {
        this.image_Actor = image_Actor;
    }
}
