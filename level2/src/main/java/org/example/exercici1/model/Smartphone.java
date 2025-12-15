package org.example.exercici1.model;

import org.example.exercici1.interfaces.Camera;
import org.example.exercici1.interfaces.Clock;

public class Smartphone extends Phone implements Camera, Clock {
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void takePicture() {
        System.out.println("Realitzant foto des del Smartphone");
    }

    @Override
    public void alarm(){
        System.out.println("Sonant l'alarma des del Smartphone");
    }
}
