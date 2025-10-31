package com.pluralsight;

import java.io.*;

public class DealershipFileManager {

    public static Dealership getDealership() {

        Dealership dealership = null;

        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            //Skips header
            bufferedReader.readLine();

            while ((line = bufferedReader.readLine()) != null) {

                String[] inventoryParts = line.split("[|]");

                if (inventoryParts.length > 3) {

                    int vin = Integer.parseInt(inventoryParts[0]);
                    int year = Integer.parseInt(inventoryParts[1]);
                    String make = inventoryParts[2];
                    String model = inventoryParts[3];
                    String vehicleType = inventoryParts[4];
                    String color = inventoryParts[5];
                    int odometer = Integer.parseInt(inventoryParts[6]);
                    double price = Double.parseDouble(inventoryParts[7]);

                    dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));

                } else {
                    dealership = new Dealership(inventoryParts[0], inventoryParts[1], inventoryParts[2]);
                }
            }

            bufferedReader.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Couldn't read file, please try again!");
        }
        return dealership;
    }

    public static void saveDealership(Dealership dealership) {
        try {

            FileWriter fileWriter = new FileWriter("src/main/resources/inventory.csv", false);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(dealership.getName() + " | " + dealership.getAddress() + " | " + dealership.getPhone());

            for (Vehicle v: dealership.getAllVehicles()) {
                bufferedWriter.write(v.getVin() + " | " + v.getYear() + " | " + v.getMake() + " | " + v.getModel() + " | " + v.getVehicleType() + " | " + v.getColor() + " | " + v.getOdometer() + " | " + v.getPrice());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}
