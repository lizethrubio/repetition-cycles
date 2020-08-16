package com.company;
//6. Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea
//        los nombres y las edades de diez alumnos, y que los datos se almacenen en dos
//        vectores, y con base en esto se determine el nombre del alumno con la edad mayor del
//        arreglo.

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        String [] students = new String[3];
        int [] years = new int[3];
        int youngestPosition=0;
        //int youngestAge=150;

        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i< students.length; i++){
            System.out.println("Ingrese el nombre del estudiante "+ (i+1)+ "º ");
            students[i] = keyboard.next();
            System.out.println("Ingrese la edad del estudiante "+ students[i]);
            years[i] = keyboard.nextInt();
        }

        for (int i =0; i<students.length; i++){
            if (years[i]<= years[youngestPosition]){
                youngestPosition = i;
            }
        }

        System.out.println("\nEl estudiante con menor edad es " + students[youngestPosition] + ", su edad es " + years[youngestPosition]+ " años");
    }
}
