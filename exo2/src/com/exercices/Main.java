package com.exercices;

import java.util.Date;


public class Main {

    public static void main(String[] args) {
        final Staff myEmployees = new Staff();
        myEmployees.add(new Salesman("Pierre", "Business", 45, "1995", 30000));
        myEmployees.add(new Representant("Léon", "Ventout", 25, "2001", 20000));
        myEmployees.add(new Producer("Yves", "Ahalouest", 28, "1998", 1000));
        myEmployees.add(new Wharehouseman("Jeanne", "Stoktout", 32, "1998", 45));
        myEmployees.add(new ProducerWithRisk("Jean", "Flippe", 28, "2000", 1000));
        myEmployees.add(new WharehousemanWithRisk("Al", "Abordage", 30, "2001", 45));


        final Independant independant = new Independant("John Doe");
        independant.addBill(new Bill(new Date() , 2000, "Travail" ));
        independant.addBill(new Bill (new Date(), 100, "Frais de déplacement - "));

        myEmployees.add(independant);

        myEmployees.displaySalaries();
        myEmployees.displayAverageSalaries();
    }
}
