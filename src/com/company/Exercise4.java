package com.company;

//4. Realice un algoritmo para obtener una matriz como el resultado de la resta de dos
//        matrices de orden M x N. Represéntelo mediante diagrama de flujo y pseudocódigo

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        double [][] matrixA;
        double [][] matrixB;
        double [][] matrixSubtraction;
        double sum =0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de filas de las matrices: ");
        int m = keyboard.nextInt();
        System.out.println("Introduzca la cantidad de columnas de las matrices: ");
        int n = keyboard.nextInt();
        //Defino la matriz original
        matrixA = new double[m][n];
        matrixB = new double[m][n];
        matrixSubtraction = new double [m][n];

        //Se llena la matriz original x 2
        for (int i=0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] = Math.floor((int)(Math.random()*100));
                matrixB[i][j] = Math.floor((int)(Math.random()*100));
            }
        }

        System.out.println("La matriz A es: ");

        for (int i =0; i< matrixA.length; i++){
            for (int j=0; j<matrixA[i].length; j++){
                System.out.print(matrixA[i][j] + " | ");
                matrixSubtraction[i][j]= matrixA[i][j]-matrixB[i][j];

            }
            System.out.println();
        }

        System.out.println("\nLa matriz B es: ");
        for (int i = 0; i<matrixB.length; i++){
            for (int j=0; j<matrixB[i].length; j++){
                System.out.print(matrixB[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("\nLa resta de las dos matrices es: ");
        for (int i =0; i<matrixSubtraction.length; i++){
            for (int j=0; j<matrixSubtraction[i].length;j++){
                System.out.print(matrixSubtraction[i][j] + " | ");
            }
            System.out.println();
        }

    }

}
