package com.example.demo.model;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String product;

    private int price;

    private boolean isStock;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "shop")
    private List<Buyers> client;

    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date receiptDate;
    public Shop() {
    }
    public Shop(int id) {
        this.id = id;
    }

    public Shop(String product) {
        this.product = product;
    }

    public Shop(int id, String product) {
        this.id = id;
        this.product = this.product;
    }
    public List<Buyers> getClient() {
        return client;
    }

    public void setClient(List<Buyers> client) {
        this.client = client;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isStock() {
        return isStock;
    }

    public void setStock(boolean stock) {
        isStock = stock;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;}

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }
}
