package com.exercices;

import java.util.ArrayList;

public class Independant extends Employe{

   private ArrayList<Bill> billList = new ArrayList<>();
   private String siren;
   private int sumBills = 0;
   private int salary;


    public Independant(String name) {
        super(name);
        this.salary = 0;
    }

    public boolean addBill(Bill bill) {
        this.salary = sumAllBills(this.billList);
        return billList.add(bill);

    }


    public int sumAllBills(ArrayList<Bill> billList) {
        int i = 0;
        while (i < billList.size()) {
           Bill b = billList.get(i);
           System.out.println(b);
           String libel = b.getDescription();
           if (libel.length() < 22 || !libel.startsWith("Frais de déplacement -")){
               sumBills = sumBills + b.getAmount();
           }

            i++;
        }
        return sumBills;

    }

    public String displayOwnSalary() {
        return "L'indépendant " + this.name +" a un salaire de "+ this.salary + ".";
    }


    @Override
    public int getSalary() {
        return salary;
    }
}
