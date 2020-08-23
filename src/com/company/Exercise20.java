package com.company;
//20. Realice un algoritmo que a partir de la matriz del problema anterior encuentre cuántos
//        elementos tienen valor par y cuántos valores impares. Represéntelo mediante diagrama
//        y pseudocódigo.

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

//19. Realice un algoritmo que calcule el valor que se obtiene al multiplicar entre sí los
//        elementos de la diagonal principal de una matriz de 5 por 5 elementos, represéntelo
//        mediante diagrama y pseudocódigo.
public class Exercise20 {
    public static void main(String[] args) {
        int pair = 0;
        int odd =0;
        int[][] matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                Random random = new Random();
                matrix[i][j] = random.nextInt(100);
            }
        }
        System.out.println("Dada la matriz : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j]%2 == 0){
                    pair ++;
                }else{
                    odd ++;
                }
                System.out.print(matrix[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("La cantidad de número pares es "+ pair);
        System.out.println("La cantidad de número impares es " + odd);
    }
}
