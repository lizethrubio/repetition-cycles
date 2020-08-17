package com.company;

//10. Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una). Realice un
//        algoritmo que lea los arreglos y que determine si la diagonal principal de la primera es
//        igual a la diagonal principal de la segunda. (Diagonal principal es donde los subíndices I,
//        J son iguales). Represente la solución mediante el diagrama de flujo y el pseudocódigo.


import java.util.Random;

public class Exercise10 {
    public static void main(String[] args) {

        double[][] matrizA = new double[12][12];
        double[][] matrizB = new double[12][12];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                //array[i][j] = Math.floor((int)(Math.random()*100));
                Random random = new Random();
                matrizA[i][j] = (random.nextInt(20) - 10);
                matrizB[i][j] = (random.nextInt(20) - 10);
            }
        }
        //Trampa para hacer iguales las diagonales
//        for (int i = 0; i < matrizA.length; i++) {
//            matrizB[i][i] = matrizA[i][i];
//        }

        //contador de diagonales
        int n = 0;
        outer:
        for (int i = 0; i < matrizA.length; i++) {
            if (matrizA[i][i] == matrizB[i][i]) {
                n = n + 1;
            } else {
                break outer;
            }
        }

        System.out.println("\nLa matriz A es : ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizA[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("La matriz B es : ");
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                System.out.print(matrizB[i][j] + " | ");
            }
            System.out.println();
        }

        if (n >= 12) {
            System.out.println("\nLa diagonal de las dos matrices son iguales");
        } else {
            System.out.println("\nLa diagonal de las dos matrices son diferenes");
        }


    }

}
