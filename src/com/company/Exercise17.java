package com.company;
import java.util.Random;
//17. Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene un elemento
//        negativo. Realice un algoritmo que indique la posición que ese elemento ocupa en el
//        arreglo (en la fila y la columna en la que se encuentra ese elemento). Represéntelo
//        mediante diagrama y pseudocódigo.
public class Exercise17 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][8];
        Random random = new Random();
        int arrow= 0;
        int column= 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100);
            }
        }
        //Se crea un numero negativo al azar
        matrix[random.nextInt(6)][random.nextInt(8)] = (random.nextInt(100)*-1);
        System.out.println("La matrix dada: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    arrow = i;
                    column = j;
                }
            }
        }
        System.out.print("\nEl numero negativo esta en la fila " + arrow + " y en la columna " + column);
        System.out.print(", el número es " + matrix[arrow][column]);
    }
}
