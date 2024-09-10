package matriz;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        /*
        Realizar un programa que permita cargar 15 números en un vector. Una vez
        cargados, se necesita que el programa cuente e informe por pantalla 
        cuántas veces se cargó el número 3
        */
        int vector [] = new int [5];
        int value_vector = 0;
        int counter = 0;
        
        Scanner sn = new Scanner(System.in);
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese numero posición "+ i + ":");
            value_vector = sn.nextInt();
            vector[i] = value_vector;
            if (value_vector == 3){
                counter += 1;
            }
        }
        System.out.println("El numero 3 se cargo "+counter+" veces");
        
        
        
    }
}
