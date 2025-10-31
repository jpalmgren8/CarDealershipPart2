package com.pluralsight;

public abstract class Contract {

    protected String dateOfContract;
    protected String customerName;
    protected String customerEmail;
    protected String vehicleSold;
    protected double totalPrice;
    protected double monthlyPayment;

    public Contract(String dateOfContract, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment) {
        this.dateOfContract = dateOfContract;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    // GETTERS

    public String getDateOfContract() {
        return dateOfContract;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getVehicleSold() {
        return vehicleSold;
    }

    // SETTERS

    public void setDateOfContract(String dateOfContract) {
        this.dateOfContract = dateOfContract;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setVehicleSold(String vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public abstract double getTotalPrice();

    public abstract double getMonthlyPayment();
}
