package com.example.case3.model;

public class Nation {
    private int id_nation;
    private String name_nation;

    public Nation() {
    }

    public Nation(String name_nation) {
        this.name_nation = name_nation;
    }

    public Nation(int id_nation, String name_nation) {
        this.id_nation = id_nation;
        this.name_nation = name_nation;
    }

    public int getId_nation() {
        return id_nation;
    }

    public void setId_nation(int id_nation) {
        this.id_nation = id_nation;
    }

    public String getName_nation() {
        return name_nation;
    }

    public void setName_nation(String name_nation) {
        this.name_nation = name_nation;
    }
}
