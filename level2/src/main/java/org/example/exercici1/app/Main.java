package org.example.exercici1.app;

import org.example.exercici1.model.Smartphone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Smartphone smartphone = new Smartphone("Iphone", "17");

        System.out.println("Introduzca su número de teléfono:");
        smartphone.doCalls(sc.nextInt());
        smartphone.takePicture();
        smartphone.alarm();
    }
}