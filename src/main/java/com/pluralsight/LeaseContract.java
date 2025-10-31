package com.pluralsight;

public class LeaseContract extends Contract {

    protected double endingValue;
    protected double leaseFee;

    public LeaseContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, double endingValue, double leaseFee) {
        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.endingValue = endingValue;
        this.leaseFee = leaseFee;
    }

    // GETTERS

    public double getEndingValue() {
        return endingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    // SETTERS

    public void setEndingValue(double endingValue) {
        this.endingValue = endingValue;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    // OVERRIDE METHODS FROM CONTRACT

    @Override
    public double getTotalPrice() {
        return 0;
    }

    @Override
    public double getMonthlyPayment() {
        return 0;
    }
}
