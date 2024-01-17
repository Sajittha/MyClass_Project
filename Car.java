package MyClass_Project;

import java.util.Scanner;

public class Car {
    // Fields
    private String brand;
    private String model;
    private int year;
    private String color;

    // Constructors
    public Car() {
        // Default constructor
    }

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public Car(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public Car(int year) {
        this.year = year;
    }

    // Methods
    public void displayDetails() {
        System.out.println("Car Details: " + year + " " + brand + " " + model);
    }

    // Method overloading
    public void displayDetails(String additionalInfo) {
        System.out.println("Car Details: " + year + " " + brand + " " + model + " - " + additionalInfo);
    }

    public void honkHorn() {
        System.out.println("Honk Honk!");
    }

    public void startEngine() {
        System.out.println("Engine started!");
    }

    public void drive(int speed) {
        System.out.println("Driving at speed: " + speed + " mph");
    }

    // Getter and Setter methods
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        // Create objects of Car
        Car car1 = new Car("Toyota", "Camry", 2022);
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car(2023);

        // Display car details
        car1.displayDetails();
        car2.displayDetails("Special Edition");
        car3.displayDetails();

        // Honk the horn
        car1.honkHorn();

        // Start the engine
        car2.startEngine();

        // Drive the car
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the speed for car: ");
        int speed = scanner.nextInt();

        car3.drive(speed);

        scanner.close();

        // Demonstrate getter and setter
        car1.setBrand("Nissan");
        car1.setModel("Altima");
        car1.setYear(2021);

        System.out.println("\nUpdated Car Details:");
        car1.displayDetails();
    }
}
