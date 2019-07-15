package com.company;
//Warrior: ha una proprietà DamagePercentageche indica quale percentuale di punti vita viene rimossa dall'avversario:
// se l'avversario ha 80 hp e la percentuale è 10%, l'attacco sottrarrà 8 hp. Il hp da rimuovere è inferiore a 5,
// l'attacco rimuove esattamente 5 hp.

public class Warrior {
    private int DamagePercentage;
    private int Warrirolife;

    public Warrior( int DamagePercentage, int Warrirolife){
        this.DamagePercentage = DamagePercentage;
        this.Warrirolife = Warrirolife;
    }
    public int getDamagePercentage(){return DamagePercentage}
    public int getWarrirolife(){return Warrirolife }

    public boolean puntiTolti(int percentuale){
        Warrirolife = 100;
        if (Warrirolife  ){

        }
    }
}
