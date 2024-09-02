package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        /*
        En una tabla de 4 filas y 4 columnas se guardan las notas de 4 alumnos 
        de secundaria. Cada fila corresponde a las notas y al promedio de cada 
        alumno. Se necesita un programa que permita a un profesor cargar, en las
        3 posiciones (columnas) de cada fila, las notas del alumno y que en la 
        última columna se calculen los promedios. 
        
        Una vez realizados los cálculos, se desea mostrar las 3 notas de cada 
        alumno y el promedio correspondiente recorriendo la matriz.
        */
        Double matriz [][] = new Double[4][4];
        
        double average = 0;
        double sum_grades = 0;
        double grade = 0;
        
        Scanner sn = new Scanner(System.in);
        
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese nota "+c+" de alumno "+ f +" :");
                grade = sn.nextDouble();
                sum_grades += grade;
                matriz[f][c] = grade; 
                
                if (c==2){
                    matriz[f][3] = sum_grades / 3;
                    sum_grades = 0; 
                }                
            }
        }
        
        System.out.println("\nNotas y promedios de los alumnos:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Alumno " + (i + 1) + " - Notas: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.printf("| Promedio: %.2f%n", matriz[i][3]);
        }
    }
}
