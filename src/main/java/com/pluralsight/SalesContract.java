package com.pluralsight;

public class SalesContract extends Contract {

    protected double taxAmount;
    protected double recordingFee;
    protected double processingFee;
    protected boolean finance;

    public SalesContract(String dateOfContract, String customerName, String customerEmail, String vehicleSold, double totalPrice, double monthlyPayment, double taxAmount, double recordingFee, double processingFee, boolean finance) {
        super(dateOfContract, customerName, customerEmail, vehicleSold, totalPrice, monthlyPayment);
        this.taxAmount = 0.05;
        this.recordingFee = 100;
        this.processingFee = processingFee;
        this.finance = finance;
    }

    // GETTERS

    public double getTaxAmount() {
        return taxAmount;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public double getProcessingFee() {

        if (getTotalPrice() < 10000) {
            processingFee = 295;
        } else {
            processingFee = 495;
        }

        return processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    // SETTERS

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    // OVERRIDE METHODS FROM CONTRACT

    @Override
    public double getTotalPrice() {

        this.totalPrice = totalPrice + getProcessingFee() + getRecordingFee();

        return totalPrice;
    }

    @Override
    public double getMonthlyPayment() {

        if (getTotalPrice() >= 10000) {
            this.monthlyPayment = ((getTotalPrice() * 0.0425) + getTotalPrice()) / 48;
        } else {
            this.monthlyPayment = ((getTotalPrice() * 0.0525) + getTotalPrice()) / 24;
        }

        if (!isFinance()) {
            this.monthlyPayment = 0;
        }

        return monthlyPayment;
    }
}
