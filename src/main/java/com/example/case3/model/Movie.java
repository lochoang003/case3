package com.example.case3.model;

import java.sql.Time;

public class Movie {
    private long id;
    private String name;
    private int time;
    private String broadCast;
    private  String manufacture;
    private  String summary;
    private String img;
    private String video;
    private String director;
    private String nation;
    private long view;

    public Movie(String name, int time, String broadCast, String manufacture, String summary, String img, String video, String director, String nation) {
        this.name = name;
        this.time = time;
        this.broadCast = broadCast;
        this.manufacture = manufacture;
        this.summary = summary;
        this.img = img;
        this.video = video;
        this.director = director;
        this.nation = nation;
    }

    public Movie(long id, String name, int time, String broadCast, String manufacture, String summary, String img, String video, String director, String nation,long view) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.broadCast = broadCast;
        this.manufacture = manufacture;
        this.summary = summary;
        this.img = img;
        this.video = video;
        this.director = director;
        this.nation = nation;
        this.view = view;
    }

    public Movie() {
    }

    public long getView() {
        return view;
    }

    public void setView(long view) {
        this.view = view;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getBroadCast() {
        return broadCast;
    }

    public void setBroadCast(String broadCast) {
        this.broadCast = broadCast;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
