package com.company;

//8. Se tiene un arreglo de 15 filas y 12 columnas. Realice un algoritmo que permita leer el
//        arreglo y que calcule y presente los resultados siguientes:
//        El menor elemento del arreglo; la suma de los elementos de las cinco primeras filas del
//        arreglo; y el total de elementos negativos en las columnas de la quinta a la nueve.


import java.util.Random;

public class Exercise8 {
    public static void main(String[] args) {

        double[][] array = new double[15][12];
        double smaller;
        double sumFirst5Rows=0;
        int countNegativeNum5to9Row =0;

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){
                //array[i][j] = Math.floor((int)(Math.random()*100));
                Random random = new Random();
                array[i][j] = (random.nextInt(2000)-999);
            }
        }

        smaller= array[0][0];

        for (int i=0; i<array.length; i++){
            for (int j=0; j<array[i].length; j++){

                if (array[i][j]<smaller){
                    smaller = array[i][j];
                }

                if (i<5){
                    sumFirst5Rows = sumFirst5Rows+ array[i][j];
                }

                if ((j>3) && (j<9)){
                    if (array[i][j]<0){
                        countNegativeNum5to9Row = countNegativeNum5to9Row +1;
                    }
                }

            }
        }

        System.out.println("La matriz es: ");

        for (int i= 0; i<array.length;i++){
            for (int j=0; j<array[i].length; j++){

                System.out.print(array[i][j]+ " | ");
            }
            System.out.println();
        }

        System.out.println("El menor elemento del arreglo es " + smaller);
        System.out.println("La suma de las primeras 5 filas es " + sumFirst5Rows);
        System.out.println("La cuenta de los numeros negativos entre las columnas 5 y 9 da un total de : " + countNegativeNum5to9Row);

    }

}
