package com.company;

import java.util.Random;

//7. Realice un algoritmo que lea un vector y a partir de él forme un segundo vector, de tal
//        forma que el primer elemento pase a ser el segundo, el segundo pase a ser el tercero, el
//        último pase a ser el primero, y así sucesivamente. Represéntelo mediante un diagrama
//        de flujo.
public class Exercise7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arrOriginal = new int[5];
        int[] arrayModified = new int[5];
        for (int i = 0; i < arrOriginal.length; i++) {
            arrOriginal[i] = random.nextInt(10);
        }
        arrayModified[0] = arrOriginal[4];
        for (int i = 0; i < ((arrOriginal.length) - 1); i++) {
            arrayModified[i + 1] = arrOriginal[i];
        }
        System.out.println("\nDado el arreglo original: ");
        for (int i = 0; i < (arrOriginal.length); i++) {
            System.out.print(arrOriginal[i] + ", ");
        }
        System.out.println("\nSe modificó a: ");
        for (int i = 0; i < (arrOriginal.length); i++) {
            System.out.print(arrayModified[i] + ", ");
        }

    }
}
