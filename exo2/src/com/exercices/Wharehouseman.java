package com.exercices;

public class Wharehouseman extends InternalEmploye {


    public Wharehouseman(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        this.salary =  65 * revenue;
    }



}
