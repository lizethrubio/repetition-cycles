package com.company;

import java.util.Random;

//19. Realice un algoritmo que calcule el valor que se obtiene al multiplicar entre sí los
//        elementos de la diagonal principal de una matriz de 5 por 5 elementos, represéntelo
//        mediante diagrama y pseudocódigo.
public class Exercise19 {
    public static void main(String[] args) {
        int[][] matrix = new int[5][5];
        int diagonalMult=1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(100);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            diagonalMult = matrix[i][i]*diagonalMult;
        }
        System.out.println("Dada la matrix: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("\nLa multiplicación de la diagnoal es : "+ diagonalMult);
    }
}
