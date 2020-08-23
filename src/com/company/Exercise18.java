package com.company;

//18. Realice un algoritmo que lea una matriz de C columnas y R renglones. A partir de ella
//        genere dos vectores que contengan la suma de sus renglones y la suma de sus
//        columnas. Represéntelo mediante diagrama, y pseudocódigo

import java.util.Random;
import java.util.Scanner;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int c;
        int r;
        System.out.println("Introduzca el valor de columnas ");
        c = keyboard.nextInt();
        System.out.println("Introduzca el valor de filas ");
        r = keyboard.nextInt();

        int[] sumC = new int[c];
        int[] sumR = new int[r];
        int[][] matrix = new int[r][c];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                //Generación random de los numeros como prueba
                Random random = new Random();
                matrix[i][j] = random.nextInt(20);
            }
        }
        System.out.println("La matrix es: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println("");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sumR[i] = matrix[i][j] + sumR[i];
                sumC[j] = sumC[j] + matrix[i][j];
            }
        }
        System.out.println("\nLa suma de reglones es: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(sumR[i] + ", ");
        }

        System.out.println("\nLa suma de filas es: ");
        for (int j = 0; j < sumC.length; j++) {
            System.out.print(sumC[j] + ", ");
        }
    }
}
