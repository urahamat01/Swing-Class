package pojo;

import java.sql.Date;

public class purchase {

    int id;
    String productName;
    String productCode;
    Date date;
    int quality;
    double unitPrice;
    double totalAount;

    public purchase() {
    }

    public purchase(int id, String productName, String productCode, Date date, int quality, double unitPrice, double totalAount) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.date = date;
        this.quality = quality;
        this.unitPrice = unitPrice;
        this.totalAount = totalAount;
    }

    public purchase(String productName, String productCode, Date date, int quality, double unitPrice, double totalAount) {
        this.productName = productName;
        this.productCode = productCode;
        this.date = date;
        this.quality = quality;
        this.unitPrice = unitPrice;
        this.totalAount = totalAount;
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

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalAount() {
        return totalAount;
    }

    public void setTotalAount(double totalAount) {
        this.totalAount = totalAount;
    }

}
