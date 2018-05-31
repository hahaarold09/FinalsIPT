package com.example.demo.entity;

import javax.persistence.*;

/**
 * Created by Harold on 5/30/2018.
 */

@Entity
@Table(name="item")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="itemID")
    private String itemID;

    @Column(name="itemName")
    private String itemName;

    @Column(name="itemPrice")
    private float itemPrice;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private int quantity;

    public Item(int id,String itemID, String itemName, float itemPrice) {
        this.id = id;
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    public Item() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemID() {
        return itemID;
    }

    public void setItemID(String itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public float getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }
}
