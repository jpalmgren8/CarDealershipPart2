package com.pluralsight;

import java.util.List;

public class UserInterface {

    Dealership dealership;

    public UserInterface(Dealership dealership) {
        this.dealership = dealership;
    }

    // Need to finish this method, so far I just have the init method being called.
    public void display(DealershipFileManager dealershipFileManager, String name, String address, String phone) {

        init(dealershipFileManager, name, address, phone);

    }

    private void init(DealershipFileManager dealershipFileManager, String name, String address, String phone) {

        dealershipFileManager.getDealership(name, address, phone);

        this.dealership = new Dealership(name, address, phone);

    }

    private void displayVehicles(Vehicle vehicles) {
        System.out.println("=====[Dealership Vehicle List]=====");
        System.out.println("Type: " + vehicles.getVehicleType());
        System.out.println("Year: " + vehicles.getYear());
        System.out.println("Make: " + vehicles.getMake());
        System.out.println("Model: " + vehicles.getModel());
        System.out.println("Color: " + vehicles.getColor());
        System.out.println("Price $: " + vehicles.getPrice());
        System.out.println("Vin: " + vehicles.getVin());
        System.out.println("===============================");
    }

    public void processGetByPriceRequest() {

    }

    public void processGetByMakeModelRequest() {

    }

    public void processGetByYearRequest() {

    }

    public void processGetByColorRequest() {

    }

    public void processGetByMileageRequest() {

    }

    public void processGetByVehicleTypeRequest() {

    }

    public void processGetAllVehiclesRequest() {

    }

    public void processAddVehicleRequest() {

    }

    public void processRemoveVehicle() {

    }

}
