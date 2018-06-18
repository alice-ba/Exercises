package com.exercices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double x = readInput("Entrez x", reader);
        double y = readInput("Entrez y", reader);
        reader.close();

        double c;

        if (x != -1 && y != -1) {
            System.out.println("Avant permutation : \nx : " + x + "\ny :" + y);
            c = y;
            y = x;
            x = c;
            System.out.println("Après permutation : \nx : " + x + "\ny :" + y);

        }


        // write your code here
    }

    public static double readInput(String text, Scanner reader) {
        System.out.println(text);
        double value = -1;
        try {
            String str = reader.nextLine();
            value = Double.parseDouble(str);
        } catch (Exception e) {
        }
        return value;
    }


}
