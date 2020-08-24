package com.company;

import java.util.Scanner;

//3. Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea
//        un arreglo de M filas y N columnas y que calcule la suma de los elementos de la
//        diagonal principal.
public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int mFiles;
        int nColumns;
        System.out.println("Ingrese el numero de filas del arreglo");
        mFiles = keyboard.nextInt();
        System.out.println("Ingrese el numero de las columnas del arreglo");
        nColumns = keyboard.nextInt();
        int sumDiagonal = 0;
        int[][] matrix = new int[mFiles][nColumns];
        //Lleno de la matriz
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Ingrese el numero de la posiciòn " + i + ", " + j);
                matrix[i][j] = keyboard.nextInt();
                if (i == j) {
                    sumDiagonal = sumDiagonal + matrix[i][j];
                }
            }
        }
        //Impresiòn de la matriz y resultado
        System.out.println("Dada la matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("\nLa suma de su diagonal principal es: " + sumDiagonal);
    }
}
