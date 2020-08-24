package com.company;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//5. Realice un diagrama de flujo que represente el algoritmo para determinar si una matriz
//        es de tipo diagonal: es una matriz cuadrada en la cual todos sus elementos son cero,
//        excepto los electos de la diagonal principal.
public class Exercise5 {
    public static void main(String[] args) {
        Random random = new Random();
        int row;
        int column;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        row = keyboard.nextInt();
        System.out.println("Ingrese el numero de columnas");
        column = keyboard.nextInt();
        int counter = 0;
        //Verificacion si es una matriz cuadrada
        if (row == column) {
            int[][] matrix = new int[row][column];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.println("Ingrese el numero de la posiciòn " + i + ", " + j);
                    matrix[i][j] = keyboard.nextInt();
                    //Verificación si en las casillas diferentes a la diagonal sus numeros son iguales a cero.
                    if ((i != j) & (matrix[i][j] != 0)) {
                        counter = counter + 1;
                    }
                }
            }
            System.out.println("Dada la matriz: ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix.length; j++) {
                    System.out.print(matrix[i][j] + " | ");
                }
                System.out.println();
            }
            //Si counter =0 es porque no hubo un numero fuera de la diagonal diferente de cero
            if (counter == 0) {
                System.out.println("\nSe concluye que si es una matriz diagonal");
            } else {
                System.out.println("\nSe concluye que no es una matriz diagonal");
            }
        } else {
            System.out.println("La matriz no es de tipo diagnonal, ya que no es cuadrada");
        }
    }
}
