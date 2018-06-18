package com.exercices;

public class Representant extends InternalEmploye {


    public Representant(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        this.salary = (int) Math.round( 0.2 * revenue + 800);
    }


}
