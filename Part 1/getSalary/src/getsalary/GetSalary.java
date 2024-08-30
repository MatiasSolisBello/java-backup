package getsalary;

import java.util.Scanner;

public class GetSalary {
    public static void main(String[] args) {
        /*
        Una pequeña despensa desea calcular los sueldos de sus empleados. Los
        puestos tienen 3 categorias: 1. reponedor, 2. cajero, 3. supervisor.
        
        Los reponedores cobran $15890 + bono de 10%
        Cajeros cobran $25.630 fijos
        Supervisores cobran $35.560 brutos, se les descuenta 11% de jubilacion
        
        Se necesita un programa que dependiendo del empleado, calcule y muestre
        en pantalla  el sueldo correspondiente.
        */
        Scanner sn = new Scanner(System.in);
        int option = 0;
        double salary = 0;
        
        System.out.println("Ingrese el empleado:");
        System.out.println("(1. reponedor, 2. cajero, 3. supervisor)");
        System.out.println("----------------------------------------");
        option = sn.nextInt();
        
        switch(option){
            case 1:
                salary = 15890 * 1.10;
                System.out.println("El salario es de:"+salary);
                break;
            case 2:
                salary = 25630;
                System.out.println("El salario es de:"+salary);
                break;
            case 3:
                salary = 35560 * 0.89;
                System.out.println("El salario es de:"+salary);
                break;
        }
    }
    
}
