package com.company;

//3. Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea
//        un arreglo de M filas y N columnas y que calcule la suma de los elementos de la
//        diagonal principal.


import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Exercise2 {
    public static void main(String[] args) {

        double [][] matrix;
        double sum =0;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Introduzca la cantidad de filas de la matriz: ");
        int m = keyboard.nextInt();
        System.out.println("Introduzca la cantidad de columnas de la matriz: ");
        int n = keyboard.nextInt();
        //Defino la matriz original
        matrix = new double[m][n];

        //Se llena la matriz original
        for (int i=0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Math.floor((int)(Math.random()*9));
            }
        }

        for (int i=0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i==j){
                    sum = sum+ matrix[i][j];
                }
            }
        }

        System.out.println("La matriz inicial A es: ");

        for (int i =0; i< matrix.length; i++){
            for (int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }

        System.out.println("\nLa suma de sus diagonales es: "+ sum);

    }

}
