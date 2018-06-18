package com.exercices;

public class Producer extends InternalEmploye {


    public Producer(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        this.salary = 5 * revenue;
    }



}
