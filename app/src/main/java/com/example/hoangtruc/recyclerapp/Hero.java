package com.example.hoangtruc.recyclerapp;

public class Hero {
    private int image;
    private String name;

    public Hero(int image, String name) {
        this.image = image;
        this.name = name;
    }

    public Hero() {
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
