package com.company;

import java.util.Random;

//Wizard: ha una proprietà MaximumPower, che indica la massima potenza magica disponibile, ma la magia è un mistero,
// quindi i hp da rimuovere vengono calcolati ogni volta moltiplicando la potenza massima con un numero casuale compreso tra 0 e 1.
public class Wizard {
    private int MaximumPower;

    public Wizard( int MaximumPower){
        this.MaximumPower = MaximumPower;
    }

    public Wizard() {

    }

    public int getMaximumPower(){return MaximumPower}

    public static int Magia()
    {
        int a = 1;
        int b = 0;
        int c = ((b - a) + 1);
        int Magia = Random.nextInt(c) + a;

        return Magia;
        int e =
        int e = 100 - Magia;
    }
}
