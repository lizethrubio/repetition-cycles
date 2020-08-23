package com.company;

import java.util.Random;

//9. Realice un algoritmo que lea dos vectores de cien elementos y que calcule la suma de
//        éstos guardando su resultado en otro vector, el cual se debe presentar en forma
//        impresa.
public class Exercise9 {
    public static void main(String[] args) {
        int[] arrayA = new int[100];
        int[] arrayB = new int[100];
        int[] arraySum = new int[100];
        Random random = new Random();
        for (int i = 0; i < arrayA.length; i++) {
            arrayA[i] = random.nextInt(10);
            arrayB[i] = random.nextInt(10);
            arraySum[i] = arrayA[i] + arrayB[i];
        }
        System.out.println("Dado el primer vector ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arrayA[i] + " | ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println("\nDado el segundo vector ");
        for (int i = 0; i < arrayB.length; i++) {
            System.out.print(arrayB[i] + " | ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        System.out.println("\nEl vector de suma es: ");
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print(arraySum[i] + " | ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
    }
}
