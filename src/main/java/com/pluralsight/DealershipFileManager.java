package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class DealershipFileManager {

    public void getDealership(String name, String address, String phone) {

        Dealership dealership = new Dealership(name, address, phone);

        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            //Skips header
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {

                String[] inventoryParts = line.split("[|]");

                int vin = Integer.parseInt(inventoryParts[0]);
                int year = Integer.parseInt(inventoryParts[1]);
                String make = inventoryParts[2];
                String model = inventoryParts[3];
                String vehicleType = inventoryParts[4];
                String color = inventoryParts[5];
                int odometer = Integer.parseInt(inventoryParts[6]);
                double price = Double.parseDouble(inventoryParts[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, vehicleType, color, odometer, price);

                dealership.addVehicle(vehicle);
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't read file, please try again!");
        }
    }

    public void saveDealership() {

    }

}
