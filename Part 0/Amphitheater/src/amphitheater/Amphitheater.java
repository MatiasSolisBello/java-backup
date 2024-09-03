package amphitheater;

import java.util.Scanner;

public class Amphitheater {

    public static void main(String[] args) throws InterruptedException {
        char matriz [][] = new char[10][10];
        for (int f = 0; f < 10; f++) {
            for (int c = 0; c < 10; c++) {
                matriz[f][c] = 'L';
            }
        }
        
        Scanner sn = new Scanner(System.in);
        int option = 0;
        int file = 0;
        int column = 0;
        
        do{
            System.out.println("Seleccione una opción:");
            System.out.println("1. Reserva de asientos");
            System.out.println("2. Visualizar asientos libres");
            System.out.println("3. Salir");
            System.out.println("---------------------");
            option = sn.nextInt();

            switch(option){
                case 1:
                    System.out.println("Ingrese el número de fila a reservar");
                    file = sn.nextInt();
                    
                    System.out.println("Ingrese el número de columna a reservar");
                    column = sn.nextInt();
                    
                    System.out.println(matriz[file][column]);
                    if (matriz[file][column] == 'X'){
                        System.out.println("Asiento reservado, escoge otro asiento");
                    }
                    matriz[file][column] = 'X';
                    Thread.sleep(2*1000);
                    break;
                case 2:
                    System.out.println("** MAPA DE ASIENTOS ** ");
                    for (int i = 0; i < matriz.length; i++) {
                        for (int j = 0; j < matriz[i].length; j++) {
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println(i);
                    }
                    System.out.println("---------------------");
                    Thread.sleep(2*1000);
                    break;
            }
        }while(option != 3);
    }
}
