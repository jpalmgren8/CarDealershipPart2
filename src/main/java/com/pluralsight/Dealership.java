package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    private String name;
    private String address;
    private String phone;

    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        vehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void addVehicle(Vehicle v) {
        this.vehicles.add(v);
    }

    public void removeVehicle(Vehicle v) {
        this.vehicles.remove(v);
    }

    public List<Vehicle> getAllVehicles() {
        List<Vehicle> searchResult = new ArrayList<>();

        for (Vehicle v : vehicles) {
            searchResult.add(v);
        }
        return searchResult;
    }

    public Vehicle getVehicleByVin(int vin) {
        Vehicle searchResult = null;

        for (Vehicle v : vehicles) {
            if (v.getVin() == vin) {
                searchResult = v;
            }
        }
        return searchResult;
    }

    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        List<Vehicle> searchResult = new ArrayList<>();

        for (Vehicle v : vehicles) {
            if (v.getPrice() >= min && v.getPrice() <= max) {
                searchResult.add(v);
            }
        }
        return searchResult;
    }

    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        List<Vehicle> searchResult = new ArrayList<>();

        for (Vehicle v : vehicles) {
            if (v.getMake().contains(make) && v.getModel().contains(model)) {
                searchResult.add(v);
            }
        }
        return searchResult;
    }

    public List<Vehicle> getVehiclesByYear(double min, double max) {
        List<Vehicle> searchResult = new ArrayList<>();

        for (Vehicle v : vehicles) {
            if (v.getYear() >= min && v.getYear() <= max) {
                searchResult.add(v);
            }
        }
        return searchResult;
    }

    public List<Vehicle> getVehiclesByColor(String color) {
        List<Vehicle> searchResult = new ArrayList<>();

        for (Vehicle v : vehicles) {
            if (v.getColor().contains(color)) {
                searchResult.add(v);
            }
        }
        return searchResult;
    }

    public List<Vehicle> getVehiclesByMileage(double min, double max) {
        List<Vehicle> searchResult = new ArrayList<>();

        for (Vehicle v : vehicles) {
            if (v.getOdometer() >= min && v.getOdometer() <= max) {
                searchResult.add(v);
            }
        }
        return searchResult;
    }

    public List<Vehicle> getVehiclesByType(String type) {
        List<Vehicle> searchResult = new ArrayList<>();

        for (Vehicle v : vehicles) {
            if (v.getVehicleType().contains(type)) {
                searchResult.add(v);
            }
        }
        return searchResult;
    }




}
