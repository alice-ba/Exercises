package com.exercices;

public class InternalEmploye extends Employe {

    protected String firstname;
    protected int age;
    protected String entryDate;
    protected int revenue;
    protected int salary;

    public InternalEmploye(String name, String firstname, int age, String entryDate, int revenue) {
        super(name);
        this.name = name;
        this.firstname = firstname;
        this.age = age;
        this.entryDate = entryDate;
        this.revenue = revenue;
        this.salary = 0;

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public int getRevenue() {
        return revenue;
    }

    public void setRevenue(int revenue) {
        this.revenue = revenue;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String displayOwnSalary() {
        return "L'employe "+this.firstname +" "+ this.name +" a un salaire de "+ this.salary + ".";
    }
}
