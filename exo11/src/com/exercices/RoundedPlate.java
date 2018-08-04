package com.exercices;

import java.time.Year;

public class RoundedPlate extends Ustensil implements AreaCalculation{

    private double area;

    public RoundedPlate(Year yearProduction, double dimension) {
        super(yearProduction, dimension);
        this.area = setArea(this.dimension);

    }

    public double setArea(double dimension){
        return Math.PI * dimension * dimension;
    }

    public double getArea() {
    	return area;
    }
}
