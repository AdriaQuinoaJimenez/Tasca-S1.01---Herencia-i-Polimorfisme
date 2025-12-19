package org.example.model;

public class WindInstrument extends Instrument{

    static{
        System.out.println("El bloque static pertenece a la subclase WindInstrument");
    }

    {
        System.out.println("El bloque de inicializacion pertenece a cada instancia de la subclase WindInstrument");
    }

    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent: " + getName() +  ", " + getPrice());
    }
}
