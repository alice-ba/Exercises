package com.exercices;

public class WharehousemanWithRisk extends Wharehouseman {

    public WharehousemanWithRisk(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        this.salary = salary + 200;
    }
}
