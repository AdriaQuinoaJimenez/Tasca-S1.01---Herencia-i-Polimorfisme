package org.example.exercici1.model;

public class Phone{

    private final String model;
    private final String brand;

    /*Constructor*/
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    /*Getters and Setters*/
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    /*Methods*/
    public void doCalls(int number){
        System.out.println("S'està trucant al número: " + number);
    }
}
