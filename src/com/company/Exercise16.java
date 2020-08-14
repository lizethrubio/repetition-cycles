package com.company;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

//16. Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce:
//        nombre, horas trabajadas cada día de la semana (seis días) y sueldo por hora. Realice
//        un algoritmo que:
//        a. Calcule el total de horas trabajadas a la semana para cada trabajador.
//        b. Calcule el sueldo semanal para cada uno de ellos.
//                c. Calcule el total que pagará la empresa.
//        d. Indique el nombre del trabajador que labora más horas el día lunes.
//        e. Imprima un reporte con todos los datos anteriores.
public class Exercise16 {

    public static void main(String[] args) {

    String [] names = new String[5]; //Nombre de trabajadores
    int [][] hours = new int[5][6];  //horas trabajadas de cada uno los 6 dìas
    int [] hourlyWage = new int [5]; //salario por hora de cada trabajador

    int [] weekHoursWorked= new int [5]; //horas semanales trabajadas por trabajador
    int [] weekWage = new int [5]; //salario de la semana de cada trabajador
    int companyPayment = 0; //pago total de la compañia
    int hoursWorkoholic = 0; //horas del mas trabajador del lunes
    String nameWorkaholic=""; //nombre del mas trabajador del lunes


        Scanner keyboard = new Scanner(System.in);

    for (int i = 0; i< names.length; i++){
        System.out.println("Ingrese el nombre del trabajador No. " + i + ": " );
        names[i]= keyboard.next();

        System.out.println("Ingrese el salario por hora del trabajador " + names[i]+ ": ");
        hourlyWage [i]= keyboard.nextInt();

        for (int j = 0; j < hours[i].length; j++){
            System.out.println("Ingrese las horas laboradas por el trabajador " + names [i] + " en el dìa de la semana No. "+ j);
            hours [i][j] = keyboard.nextInt();
        }

    }

    for (int i=0; i < hours.length; i++){
        weekHoursWorked [i]=0;
        for (int j=0; j < hours[i].length; j++){
            // a. Calcule el total de horas trabajadas a la semana para cada trabajador.
            weekHoursWorked [i]+= hours[i][j];

            //Indique el nombre del trabajador que labora más horas el día lunes.
            if (j<1){
                if ((weekHoursWorked[i]>hoursWorkoholic)) {
                    hoursWorkoholic = weekHoursWorked[i];
                    nameWorkaholic = names[i];
                }
            }

        }

        //b. Calcule el sueldo semanal para cada uno de ellos.
        ////                c. Calcule el total que pagará la empresa.
        weekWage[i] = weekHoursWorked[i]* hourlyWage[i];
        companyPayment += weekWage[i];
    }



    //impresion
        //a. Calcule el total de horas trabajadas a la semana para cada trabajador.
        ////        b. Calcule el sueldo semanal para cada uno de ellos.
        ////                c. Calcule el total que pagará la empresa.
        ////        d. Indique el nombre del trabajador que labora más horas el día lunes.

        System.out.println("Reporte de trabajadores: ");
        for (int i=0; i<names.length; i++){

            System.out.println("\n Trabajador  "+ names[i] + "\n a. horas trabajadas: "+ weekHoursWorked[i]);
            System.out.println("b. Sueldo semanal  $" + weekWage[i]);

        }

        System.out.println("\n La empresa pagará un total de $ " + companyPayment+ " en salarios");
        System.out.println("El trabajador que mas horas trabajó el día lunes fue " + nameWorkaholic);

    }


}
