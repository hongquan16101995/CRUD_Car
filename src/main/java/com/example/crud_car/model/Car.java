package com.example.crud_car.model;

import org.springframework.web.multipart.MultipartFile;

import java.beans.Transient;

public class Car {
    private int id;
    private String name;
    private String color;
    private double price;
    private String imageUrl;
    private MultipartFile image;

    public Car() {
    }

    public Car(int id, String name, String color, double price) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Car(int id, String name, String color, double price, MultipartFile image) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
