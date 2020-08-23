package com.company;
import java.util.Random;
//11. Se tiene una matriz de 12 filas por 19 columnas y se desea un algoritmo para encontrar
//        todos sus elementos negativos y para que les cambie ese valor negativo por un cero.
//        Realice un algoritmo para tal fin y represéntelo mediante diagrama de flujo y
//        pseudocódigo.
public class Exercise11 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][19];
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                matrix[i][j] = random.nextInt(21) - 10;
            }
        }
        System.out.println("Dada la matrix inicial: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                if (matrix[i][j] < 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        System.out.println("\nSe cambia sus negativos por ceros así: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[1].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
    }
}
