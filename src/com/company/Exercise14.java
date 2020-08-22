package com.company;

//import java.util.Random;
import java.util.Scanner;

//14. Realice un algoritmo que lea una matriz de cinco filas y seis columnas y que cuente los
//        elementos negativos que contiene, así como también cuántos elementos de la diagonal
//        principal son igual a cero. Represéntelo mediante diagrama de flujo y pseudocódigo.
public class Exercise14 {

    public static void main(String[] args) {

        double [][] matriz = new double[5][6];
        Scanner keyboard = new Scanner(System.in);
        int negatives = 0;
        int diagonalCero = 0;

        for (int i = 0; i < matriz.length;i++){
            for (int j=0; j< matriz[i].length; j++){
                System.out.println("Introduzca el valor para la posiciòn fila: "+ i + " columna " + j + ": ");
                matriz[i][j] = keyboard.nextDouble();
                //Generación random de los numeros como prueba
                //Random random = new Random();
                //matriz[i][j] = (random.nextInt(20)-10);
            }
        }

        //Asignaciòn de dos numeros de la diagonal iguales a cero como prueba
        //matriz[0][0] =0;
        //matriz[4][4] = 0;

        System.out.println("La matriz dada es: ");
        for (int i = 0; i < matriz.length;i++){
            for (int j=0; j< matriz[i].length; j++){
                System.out.print(matriz[i][j] + " | ");
            }
            System.out.println();
        }


        for (int i = 0; i < matriz.length;i++){
            for (int j=0; j< matriz[i].length; j++){
               if (matriz[i][j] < 0){
                   negatives = negatives+1;
               }
               if ((i==j)&(matriz[i][j]==0)){
                   diagonalCero ++;
               }

            }
        }

        System.out.println("\nLa cantidad de numeros negativos en la matriz es:  " + negatives);
        System.out.println("Los numeros de la diagonal iguales a cero son:  " + diagonalCero);

    }

}
