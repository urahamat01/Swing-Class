/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inventory.pojo;

import java.sql.Date;

/**
 *
 * @author Md Yasin Arif
 */
public class Product {
    private int id;
    private String productName;
    private String productCode;
    private Date date;
    private int qty;
    private double uPrice;
    private double totalAmount;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String productName, String productCode, Date date, int qty, double uPrice, double totalAmount) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.date = date;
        this.qty = qty;
        this.uPrice = uPrice;
        this.totalAmount = totalAmount;
    }

    public Product(String productName, String productCode, Date date, int qty, double uPrice, double totalAmount) {
        this.productName = productName;
        this.productCode = productCode;
        this.date = date;
        this.qty = qty;
        this.uPrice = uPrice;
        this.totalAmount = totalAmount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getuPrice() {
        return uPrice;
    }

    public void setuPrice(double uPrice) {
        this.uPrice = uPrice;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    

    

    

    
    
    
}
