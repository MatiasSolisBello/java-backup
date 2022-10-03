package vineyard;

import java.util.Scanner;

public class Vineyard {

    public static void main(String[] args) throws InterruptedException {
        Customer c = new Customer();
        Sale s = new Sale();
        Scanner sn = new Scanner(System.in);
        
        boolean customerAdd = false;
        boolean saleAdd = false;
        
        int option = 0;
        
        do {
            // Menu
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar cliente");
            System.out.println("2. Ingresar venta");
            System.out.println("3. Calcular total venta");
            System.out.println("4. Ver datos cliente");
            System.out.println("5. Salir");
            System.out.println("---------------------");
            option = Integer.parseInt(sn.nextLine());
            
            // Operaciones segun opcion ingresada
            switch(option){
                
                // OPCION 1: Registro de cliente
                case 1:
                    System.out.println("  --- REGISTRO DE CLIENTE --- ");
                    System.out.println("");
                    
                    System.out.println("Ingrese el rut: ");
                    String rut = sn.nextLine();
                    c.setRut(rut);
                    
                    System.out.println("Ingrese el nombre: ");
                    String name = sn.nextLine();
                    c.setName(name);
                            
                            
                    System.out.println("Ingrese la edad: ");
                    int age = Integer.parseInt(sn.nextLine()); //int
                    c.setAge(age);
                    
                    System.out.println("Ingrese el tipo de cliente(F, V o N):");
                    char customerType = sn.nextLine().toUpperCase().charAt(0);
                    if(customerType != 'F' && customerType != 'V' && 
                            customerType != 'N'){
                        System.out.println("Solo F, V o N son validas");
                        continue;
                    }
                    c.setCustomerType(customerType);
                    
                    customerAdd = true;
                    System.out.println("***Cliente registrado correctamente***");
                    Thread.sleep(2*1000);
                    break;
                    
                // OPCION 2: Registro de venta
                case 2:
                    if(customerAdd == false){
                        System.out.println("** Primero agrega un cliente **");
                        Thread.sleep(2*1000);
                        continue;
                    }
                    
                    System.out.println("  --- REGISTRO DE VENTA --- ");
                    System.out.println("");
                    
                    System.out.println("Ingrese la cantidad de botellas: ");
                    int number = Integer.parseInt(sn.nextLine()); //int
                    if(number < 2){
                        System.out.println("La cantidad minima es 2");
                        continue;
                    }
                    s.setNumber(number);
                    
                    System.out.println("Ingrese la cepa: ");
                    System.out.println("1)cabernet  2)merlot  3)chardonnay");
                    int strain = Integer.parseInt(sn.nextLine()); //int
                    if(strain < 1 || strain > 3){
                        System.out.println("La opcion debe ser 1 - 2 - 3");
                        continue;
                    }
                    s.setStrain(strain);
                    
                    System.out.println("Ingrese el tamaño de la botella: ");
                    System.out.println("1)chica  2)grande ");
                    int size = Integer.parseInt(sn.nextLine()); //int
                    if(size < 1 || size > 2){
                        System.out.println("La opcion debe ser 1 o 2");
                        continue;
                    }
                    s.setSize(size);
                    
                    saleAdd = true;
                    System.out.println("*** Venta registrada correctamente ***");
                    Thread.sleep(2*1000);
                    break;
                    
                case 3:
                    break;
                    
                    
                // OPCION 4: Ver datos cliente
                case 4:
                    if(customerAdd == false){
                        System.out.println("** Primero ingresa un cliente **");
                        Thread.sleep(2*1000);
                        continue;
                    }
                    Thread.sleep(1*1000);
                    c.showCustomerData();
                    Thread.sleep(2*1000);
                    break;
            }
        }while(option != 5);
    }
    
}
