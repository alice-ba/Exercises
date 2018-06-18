package com.exercices;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double width = readInput("Largeur ?", reader);
        double length = readInput("Hauteur ?",reader);
        reader.close();

        boolean inputsOk = testInputs(width, length);
        if (inputsOk) {
            calculate(width, length);
        } else {
            displayError();
        }
    }

    private static void displayError() {
        System.out.println("Wrong input");
    }

    private static boolean testInputs(double width, double length) {
        return width != -1 && length != -1;

    }

    public static double readInput(String text,Scanner reader) {
        System.out.println(text);
        double value = -1;
        try {
            String str = reader.nextLine();
            value = Double.parseDouble(str);
            } catch (Exception e) { }
        return value;

    }

    public static void calculate (double width, double length){
        System.out.println("Le périmètre est : " + 2*(width + length));
        System.out.println("L'aire est : " + width * length);
    }
}


