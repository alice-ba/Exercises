package com.exercices;

import java.time.Year;

public class SquaredPlate extends Ustensil implements AreaCalculation{

    private double area;


    public SquaredPlate(Year yearProduction, double dimension) {
        super(yearProduction, dimension);
        this.area = setArea(this.dimension);

    }

    @Override
    public void setPrice() {
        super.setPrice();
        this.price *= 5;
    }

    public double setArea(double dimension){
        return dimension * dimension;
        
    }
    
    public double getArea() {
    	return area;
    }



}
