package tshirts;

import java.util.Scanner;

public class Tshirts {
    public static void main(String[] args) {
        Customer c = new Customer();
        Sale s = new Sale();
        Scanner sn = new Scanner(System.in);
        
        int option = 0;
        
        do {
            // Menu
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar cliente");
            System.out.println("2. Ingresar venta");
            System.out.println("3. Calcular total venta");
            System.out.println("4. Ver datos cliente");
            System.out.println("5. Ver datos de la venta");
            System.out.println("6. Salir");
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
                    if(name.length() < 3 || name.length() > 25){
                        System.out.println("Largo de nombre debe ser entre 3 y "
                                + "25 caracteres");
                        continue;
                    }
                    c.setName(name);
                    
                    System.out.println("Ingrese el edad: ");
                    int age = Integer.parseInt(sn.nextLine()); //int
                    c.setAge(age);
                    
                    System.out.println("Ingrese el direccion: ");
                    String address = sn.nextLine();
                    if(address.length() < 5 || address.length() > 200){
                        System.out.println("Direccion debe tener entre 5 y 200 "
                                + "caracteres");
                        continue;
                    }
                    c.setAddress(address);
                    
                    System.out.println("Ingrese el tipo de cliente(F, V o N):");
                    char customerType = sn.nextLine().toUpperCase().charAt(0);
                    if(customerType != 'F' && customerType != 'V' && 
                            customerType != 'N'){
                        System.out.println("Solo F, V o N son validas");
                        continue;
                    }
                    c.setCustomerType(customerType);
                    
                    System.out.println("***Cliente registrado correctamente***");
                    break;
                
                    
                // OPCION 2: Registro de venta
                case 2:
                    System.out.println("  --- REGISTRO DE VENTA --- ");
                    System.out.println("");
                    
                    System.out.println("Ingrese la cantidad de camisetas: ");
                    int number = Integer.parseInt(sn.nextLine()); //int
                    if(number < 1){
                        System.out.println("La cantidad minima es 1");
                        continue;
                    }
                    s.setNumber(number);
                    
                    System.out.println("Ingrese la talla(S, M, L, XL): ");
                    String size = sn.nextLine().toUpperCase();
                    if(size.equals("S") == false && 
                            size.equals("M") == false &&
                            size.equals("L") == false && 
                            size.equals("XL") == false){
                        System.out.println("Talla debe ser S, M, L, XL");
                        continue;
                    }
                    s.setSize(size);
                    
                    s.setCustomer(c); //cliente a la venta
                    
                    System.out.println("*** Venta registrada correctamente ***");
                    break;
                
                    
                // OPCION 3: Calcular total venta
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        }while(option != 6);
    }    
    
}
