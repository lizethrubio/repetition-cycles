package com.company;

//1. Realice y represente mediante un diagrama de flujo el algoritmo para obtener la matriz
//        transpuesta de cualquier matriz de orden M x N.

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        int [][] matrixA;
        int [][] matrixB;
        int m;
        int n;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el número de filas de la matriz original");
        m = keyboard.nextInt();
        System.out.println("Ingrese el número de columnas de la matriz original");
        n = keyboard.nextInt();

        matrixA =   new int[m][n];
        matrixB = new int[n][m];

        for (int i =0; i< matrixA.length; i++){
            for (int j=0; j<matrixA[i].length; j++){
                System.out.println("Ingrese el numero de la posición "+ i+ ", " + j);
                matrixA[i][j]= keyboard.nextInt();
            }
        }

        for (int i = 0; i<matrixB.length; i++){
            for (int j = 0; j<matrixB[i].length; j++){
                matrixB [i][j] = matrixA[j][i];
            }
        }

        System.out.println("La matriz inicial A es: ");

        for (int i =0; i< matrixA.length; i++){
            for (int j=0; j<matrixA[i].length; j++){
                System.out.print(matrixA[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("\nLa matriz inicial transpuesta B es: ");
        for (int i =0; i< matrixB.length; i++){
            for (int j=0; j<matrixB[i].length; j++){
                System.out.print(matrixB[i][j] + " | ");
            }
            System.out.println();
        }

    }

}
