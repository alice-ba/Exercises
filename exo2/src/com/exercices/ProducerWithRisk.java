package com.exercices;

public class ProducerWithRisk extends Producer {

    public ProducerWithRisk(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        this.salary = salary + 200;
    }
}
