package com.exercices;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        String path = "./Liste_ustensiles_grand_mere.csv";
        FileReader fr = new FileReader(path);
        List <Double> listValues = fr.readUstensil();
        System.out.println("Il y a " + listValues.get(0).intValue() + " cuillères.");
        System.out.println("Surface totale des assiettes : " + String.format("%.2f", listValues.get(1)) );
        System.out.println("Valeur totale de la collection : " + String.format("%.2f", listValues.get(2)) );

    }


}
