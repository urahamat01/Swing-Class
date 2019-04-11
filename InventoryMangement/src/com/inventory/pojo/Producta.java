package com.inventory.pojo;

import java.sql.Date;

public class Producta {

    int id;
    String name;
    String code;
    Date date;
    int qulty;
    double uPrice;
    String total;

    public Producta() {
    }

    public Producta(int id, String name, String code, Date date, int qulty, double uPrice, String total) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.date = date;
        this.qulty = qulty;
        this.uPrice = uPrice;
        this.total = total;
    }

    public Producta(String name, String code, Date date, int qulty, double uPrice, String total) {
        this.name = name;
        this.code = code;
        this.date = date;
        this.qulty = qulty;
        this.uPrice = uPrice;
        this.total = total;
    }

    public Producta(String productName, String productCode, Date date, int quentity, double unitPrice, double totalAmount) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getQulty() {
        return qulty;
    }

    public void setQulty(int qulty) {
        this.qulty = qulty;
    }

    public double getuPrice() {
        return uPrice;
    }

    public void setuPrice(double uPrice) {
        this.uPrice = uPrice;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getProductName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
