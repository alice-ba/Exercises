package com.exercices;

public class ProducerWithRisk extends Producer implements Risk {

    public ProducerWithRisk(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        this.salary = modifySalary(salary);
    }

    @Override
    public int modifySalary(int salary) {
        return salary + 200;
    }
}
