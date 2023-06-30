package com.example.case3.model;

public class Director {
    private  int id_director;
    private String name_director;
    private  String image_director;

    public Director(int id_director, String name_director, String image_director) {
        this.id_director = id_director;
        this.name_director = name_director;
        this.image_director = image_director;
    }

    public Director(String name_director, String image_director) {
        this.name_director = name_director;
        this.image_director = image_director;
    }

    public Director() {
    }

    public int getId_director() {
        return id_director;
    }

    public void setId_director(int id_director) {
        this.id_director = id_director;
    }

    public String getName_director() {
        return name_director;
    }

    public void setName_director(String name_director) {
        this.name_director = name_director;
    }

    public String getImage_director() {
        return image_director;
    }

    public void setImage_director(String image_director) {
        this.image_director = image_director;
    }
}
