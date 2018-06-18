package com.exercices;

public class Salesman extends InternalEmploye {


    public Salesman(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        salary = (int) Math.round( 0.2 * revenue + 400);
    }



}

