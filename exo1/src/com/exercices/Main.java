package com.exercices;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        String s;
        do {

            System.out.println("Entrer un nombre ou 'exit': ");
            s = reader.nextLine();

            try {
                int n = Integer.parseInt(s);
                String r1;
                String r2;

                if (n == 0) {
                    r1 = "zéro";
                } else if (n > 0) {

                    r1 = "positif";
                } else {
                    r1 = "négatif";
                }


                if (n % 2 == 0) {
                    r2 = "pair";
                } else {
                    r2 = "impair";
                }
            System.out.println(r1 + " " + r2);


        }
                catch(NumberFormatException e ){
            if (!s.equals("exit")) {
                System.out.println("Valeur inconnue");
            }
        }


    }while(!s.equals("exit"));

        reader.close();

}
}
