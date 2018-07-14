package com.exercices;

import java.time.Year;

public class SquaredPlate extends Ustensil {


    public SquaredPlate(Year yearProduction, double dimension) {
        super(yearProduction, dimension);

    }

    @Override
    public void setPrice() {
        super.setPrice();
        this.price *= 5;
    }
}
