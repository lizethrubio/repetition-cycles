package com.company;
import java.util.Random;
//15. Realice un algoritmo que calcule el producto de dos vectores. Uno de ellos es de una fila
//        con diez elementos y el otro con una columna de diez elementos. Represéntelo
//        mediante diagrama y pseudocódigo.
public class Exercise15 {
    public static void main(String[] args) {
        int [][] arrow = new int[10][1];
        int [][] columns = new int[1][10];
        int mult = 0;
        Random random = new Random();
        for (int i= 0; i < arrow.length; i++){
            arrow[i][0] = random.nextInt(10);
            columns[0][i] = random.nextInt(10);
            mult = mult + arrow[i][0]*columns[0][i];
        }
        System.out.println("Dado el vector de 10 filas y 1 columna: ");
        for (int i= 0; i < arrow.length; i++){
            System.out.print(arrow[i][0]+ ", ");
        }
        System.out.println("\nDado el vector 1 fila y 10 columnas: ");
        for (int i= 0; i < columns[0].length; i++){
            System.out.println(columns[0][i]);
        }
        System.out.println("\nLa multiplicaciòn de ambos vectores es: " + mult);
    }
}
