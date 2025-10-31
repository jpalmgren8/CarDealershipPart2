package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class UserInterface {

    private Dealership dealership;
    private Scanner scanner = new Scanner(System.in);

    public UserInterface() {

    }


    public void display() {
        init();

        do {

            homeMenuScreen();

            System.out.print("Type in an option number: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1 -> processGetByPriceRequest();
                case 2 -> processGetByMakeModelRequest();
                case 3 -> processGetByYearRequest();
                case 4 -> processGetByColorRequest();
                case 5 -> processGetByMileageRequest();
                case 6 -> processGetByVehicleTypeRequest();
                case 7 -> processGetAllVehiclesRequest();
                case 8 -> processAddVehicleRequest();
                case 9 -> processRemoveVehicle();
                case 99 -> System.exit(0);
                default -> {
                    System.out.println("Invalid option, please try again!");
                }
            }

        } while (true);

    }

    private void init() {

        dealership = DealershipFileManager.getDealership();

    }

    private void homeMenuScreen() {
        System.out.println("=====[Dealership Home Menu]=====");
        System.out.println("(1) - Find vehicles within a price range");
        System.out.println("(2) - Find vehicles by make & model");
        System.out.println("(3) - Find vehicles by year range");
        System.out.println("(4) - Find vehicles by color");
        System.out.println("(5) - Find vehicles by mileage range");
        System.out.println("(6) - Find vehicles by type");
        System.out.println("(7) - List all vehicles");
        System.out.println("(8) - Add a vehicle");
        System.out.println("(9) - Remove a vehicle");
        System.out.println("(99) - Quit");
        System.out.println("================================");
    }


//    System.out.println("=====[Dealership Vehicle List]=====");
//        System.out.println("Type: " + vehicles.getVehicleType());
//        System.out.println("Year: " + vehicles.getYear());
//        System.out.println("Make: " + vehicles.getMake());
//        System.out.println("Model: " + vehicles.getModel());
//        System.out.println("Color: " + vehicles.getColor());
//        System.out.println("Price $: " + vehicles.getPrice());
//        System.out.println("Vin: " + vehicles.getVin());
//        System.out.println("===============================");

    private void displayVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println(v);
        }
        System.out.println();
    }

    public void processGetByPriceRequest() {
        System.out.println("Please enter the max price: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the min price: ");
        int min = scanner.nextInt();
        scanner.nextLine();

        displayVehicles(dealership.getVehiclesByPrice(min, max));
    }

    public void processGetByMakeModelRequest() {
        System.out.println("Please enter the make: ");
        String make = scanner.nextLine();

        System.out.println("Please enter the make: ");
        String model = scanner.nextLine();

        displayVehicles(dealership.getVehiclesByMakeModel(make, model));
    }

    public void processGetByYearRequest() {
        System.out.println("Please enter the max year: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the min year: ");
        int min = scanner.nextInt();
        scanner.nextLine();

        displayVehicles(dealership.getVehiclesByYear(min, max));
    }

    public void processGetByColorRequest() {
        System.out.println("Please enter the color: ");
        String color = scanner.nextLine();

        displayVehicles(dealership.getVehiclesByColor(color));
    }

    public void processGetByMileageRequest() {
        System.out.println("Please enter the max mileage: ");
        int max = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the min mileage: ");
        int min = scanner.nextInt();
        scanner.nextLine();

        displayVehicles(dealership.getVehiclesByMileage(min, max));
    }

    public void processGetByVehicleTypeRequest() {
        System.out.println("Please enter the type of vehicle: ");
        String vehicleType = scanner.nextLine();

        displayVehicles(dealership.getVehiclesByType(vehicleType));
    }

    public void processGetAllVehiclesRequest() {
        displayVehicles(dealership.getAllVehicles());
    }

    public void processAddVehicleRequest() {

        System.out.println("Please enter the vin: ");
        int vin = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the odometer mileage: ");
        int odometer = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the make: ");
        String make = scanner.nextLine();

        System.out.println("Please enter the model: ");
        String model = scanner.nextLine();

        System.out.println("Please enter the vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.println("Please enter the color: ");
        String color = scanner.nextLine();

        System.out.println("Please enter the price: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        dealership.addVehicle(new Vehicle(vin, year, make, model, vehicleType, color, odometer, price));
        DealershipFileManager.saveDealership(dealership);
    }

    public void processRemoveVehicle() {
        System.out.println("Please enter the vin of the vehicle you want to remove: ");
        int vin = scanner.nextInt();
        scanner.nextLine();

        dealership.removeVehicle(dealership.getVehicleByVin(vin));
        DealershipFileManager.saveDealership(dealership);
    }

}
