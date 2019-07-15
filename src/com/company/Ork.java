package com.company;
// ha una proprietà Strength, che indica quanti hp fissi vengono rimossi dall'avversario.
public class Ork {
    private int Strenght;

    public Ork(int Strenght){
        this.Strenght = Strenght;
    }
    public int getStrenght(){return Strenght}

    public static int Life(int sx){
        sx = 100;

        System.out.println(sx);

    }
}
