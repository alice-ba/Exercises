package com.exercices;

import java.io.*;
import java.time.Year;
import java.util.ArrayList;


public class FileReader {
    private String path;

    public FileReader(String path) {
        this.path = path;
    }

    public  ArrayList<Double>  readUstensil() {

        ArrayList<Double> listValues = new ArrayList<>() ;

        File file = new File(path);
        FileInputStream fis = null;



        double  comptSpoon = 0;
        double area = 0;

        double dimension;
        Year yearProduction;
        double totalValue = 0;
            try {

                fis = new FileInputStream(file);

               BufferedReader br = new BufferedReader(new InputStreamReader( fis));
                    String line;
                    


                br.readLine();

                    while (( line = br.readLine()) != null) {

                        String[] parts = line.split(",");

                        Ustensil ustensil = null;

                        dimension = Double.parseDouble(parts[2]);
                        yearProduction = Year.parse(parts[1]);

                        switch (parts[0]){
                            case "Assiette ronde" : {
                                RoundedPlate roundedPlate = new RoundedPlate(yearProduction, dimension);
                                area = area + roundedPlate.getArea();
                                ustensil = roundedPlate;
                            }
                                break;

                            case "cuillière" : {
                                ustensil = new Spoon(yearProduction, dimension);
                                comptSpoon += 1;
                            }
                                break;
                            case "Assiette carré" : {
                                SquaredPlate squaredPlate = new SquaredPlate(yearProduction, dimension);
                                area = area + squaredPlate.getArea();
                                ustensil = squaredPlate;
                            }
                                break;
                            default : {
                                ustensil = new Ustensil(yearProduction, dimension);
                            }

                        }
                        ustensil.setPrice();
                        totalValue = totalValue + ustensil.getPrice();


                    }
                br.close();
                fis.close();
                } catch (IOException e1) {
                e1.printStackTrace();

            }

            listValues.add(comptSpoon);
            listValues.add(area);
            listValues.add(totalValue);

            return listValues;

        }

}
