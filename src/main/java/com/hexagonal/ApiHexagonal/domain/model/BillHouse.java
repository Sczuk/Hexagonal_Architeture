package com.hexagonal.ApiHexagonal.domain.model;


import java.util.Date;

public class BillHouse {

    private int id;

    private Date date;

    private double lightBill;

    private double waterBill;

    private double groceries;

    private double internetBill;

    private double rent;

    private Home house;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getLightBill() {
        return lightBill;
    }

    public void setLightBill(double lightBill) {
        this.lightBill = lightBill;
    }

    public double getWaterBill() {
        return waterBill;
    }

    public void setWaterBill(double waterBill) {
        this.waterBill = waterBill;
    }

    public double getGroceries() {
        return groceries;
    }

    public void setGroceries(double groceries) {
        this.groceries = groceries;
    }

    public double getInternetBill() {
        return internetBill;
    }

    public void setInternetBill(double internetBill) {
        this.internetBill = internetBill;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public Home getHouse() {
        return house;
    }

    public void setHouse(Home house) {
        this.house = house;
    }
}
