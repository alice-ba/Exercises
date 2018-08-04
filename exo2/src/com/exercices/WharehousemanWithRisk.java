package com.exercices;

public class WharehousemanWithRisk extends Wharehouseman implements Risk{

    public WharehousemanWithRisk(String name, String surname, int age, String entryDate, int revenue) {
        super(name, surname, age, entryDate, revenue);
        this.salary = modifySalary(salary);
    }

    @Override
    public int modifySalary(int salary) {
        return salary + 200;
    }
}
