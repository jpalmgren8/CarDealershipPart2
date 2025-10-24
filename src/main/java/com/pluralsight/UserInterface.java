package com.pluralsight;

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

    private void displayVehicles() {

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
