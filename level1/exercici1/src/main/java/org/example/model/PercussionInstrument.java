package org.example.model;

public class PercussionInstrument extends Instrument{

    static{
        System.out.println("El bloque static pertenece a la subclase `PercussionInstrument`");
    }

    {
        System.out.println("El bloque de inicializacion pertenece a cada instancia de la subclase `PercussionInstrument`");
    }

    public PercussionInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de percussió:  " + getName() + ", " + getPrice());
    }
}

