package com.exercices;

public abstract class Employe {
    protected String name;

    public Employe(String name) {
        this.name = name;
        }

    public abstract int getSalary();


    public abstract String displayOwnSalary();



}
