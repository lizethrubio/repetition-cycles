package com.company;

//12. Se tiene en un arreglo cien elementos representando calificaciones de los estudiantes
//        de una escuela. Realice un algoritmo que lea el arreglo y calcule la calificación promedio
//        del grupo, además, que cuente los estudiantes que obtuvieron calificaciones arriba del
//        promedio del grupo. Represéntelo mediante diagrama de flujo y pseudocódigo.
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Random;

public class Exercise12 {
    public static void main(String[] args) {
        double[] grades = new double[100];
        int higherGrades = 0;
        double average = 0;
        double sum = 0;

        for (int i = 0; i < grades.length; i++) {
            Random random = new Random();
            grades[i] = (random.nextInt(11)); //assign a number between 0 and 10.
            sum = sum + grades[i];
        }
        System.out.println("Las notas de los estudiantes fueron: \n");
        for (int i = 0; i < grades.length; i++) {
            System.out.print(grades[i] + ", ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        average = sum / 100;
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > average) {
                higherGrades = higherGrades + 1;
            }
        }


        System.out.println("\nEl promedio de notas es de " + average);
        System.out.println("La cantidad de estudiantes que tuvieron notas arriba del promedio fueron " + higherGrades);
    }


}
