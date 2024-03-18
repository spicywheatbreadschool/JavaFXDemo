package com.example.demo;

import javafx.scene.image.Image;

public class Student {
    private String name;
    private int ID;
    private Image img;
    public Student() {

    }
    public Student(String name, int ID, Image img) {
        this.name = name;
        this.ID = ID;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }
}
