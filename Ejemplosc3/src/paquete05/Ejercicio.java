/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] empleados = new String[5];
        String[] estacion = new String[5];
        double[][] produccion = new double[5][12];
        double[] totales = new double[5];
        String lista = "Analisis de produccion\nEstacion\n";

        for (int i = 0; i < produccion.length; i++) {

            System.out.println("Ingrese el nombre del empleado:");
            empleados[i] = entrada.nextLine();
            System.out.println("Ingrese el nombre de la estacion:");
            estacion[i] = entrada.nextLine();
            for (int j = 0; j < produccion[i].length; j++) {
                System.out.printf("Ingrese la produccion del mes %s:\n", j + 1);
                produccion[i][j] = entrada.nextDouble();
                totales[i] = totales[i] + produccion[i][j];
            }
            entrada.nextLine();
            lista = String.format("%s%s Estacion %s - Total produccion: $ %s\n",
                    lista, estacion[i], i + 1, totales[i]);
        }
        double mejorProduccion = totales[0];
        int mejor = 0;
        for (int i = 0; i < totales.length; i++) {
            if (totales[i] > mejorProduccion) {
                mejorProduccion = totales[i];
                mejor = i;
            }
        }
        lista = String.format("%s\nEstacion mas productiva: %s\n"
                + "Encargado de la estacion: %s\nCantidad de la estacion mas "
                + "productiva: $ %s\n", lista,
                estacion[mejor],
                empleados[mejor],
                totales[mejor]);

        System.out.printf("%s\n", lista);
    }
}
