package com.exercices;

import java.util.ArrayList;

public class Staff {

    private ArrayList<Employe> employeList = new ArrayList<>();
    private int sumSalary;
    private int itemCount;
    private int meanSalary;

    public boolean add(Employe employe) {
        return employeList.add(employe);

    }


    public void displaySalaries() {
        System.out.println("Liste des salaires des employés :");

        this.employeList.forEach((employe)->System.out.println(employe.displayOwnSalary()));

    }

    public void displayAverageSalaries() {

        this.employeList.forEach((employe)->sumSalary = sumSalary + employe.getSalary());
        itemCount = this.employeList.size();
        meanSalary = sumSalary / itemCount;
        System.out.println("Valeur du salaire moyen "+ this.meanSalary );

        

    }



}
