package org.example.model;

public class StringInstrument extends Instrument{

    static{
        System.out.println("El bloque static pertenece a la subclase StringInstrument");
    }

    {
        System.out.println("El bloque de inicializacion pertenece a cada instancia de la subclase StringInstrument");
    }

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda: " + getName() +  ", " + getPrice());
    }
}
