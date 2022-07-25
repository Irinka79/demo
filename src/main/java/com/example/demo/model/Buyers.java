package com.example.demo.model;

import javax.persistence.*;

@Entity
public class Buyers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String client;
    private int phoneNumber;
    @ManyToOne
    private Shop shop;

    public Buyers(String s) {
    }

    public Buyers(String client, int phoneNumber, Shop shop) {
        this.client = client;
        this.phoneNumber = phoneNumber;
        this.shop = shop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    @Override
    public String toString() {
        return "Buyers{" +
                "id=" + id +
                ", client='" + client + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", shop=" + shop +
                '}';
    }

}
