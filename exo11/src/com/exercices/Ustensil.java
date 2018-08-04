package com.exercices;

import java.time.*;

public class Ustensil {

    protected Year yearProduction;
    protected int price;


    protected double dimension;


    public Ustensil(Year yearProduction, double dimension) {
        this.yearProduction = yearProduction;
        this.dimension = dimension;
        this.price = 0;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice() {
        if (Year.now().getValue() - this.yearProduction.getValue() < 50 ){
            this.price = 0;
        } else {
            this.price = Year.now().getValue() - this.yearProduction.getValue() - 50;
        }
    }
    
   public double getDimension() {
	   return dimension;
   }   
    



}
