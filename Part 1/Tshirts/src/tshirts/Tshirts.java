package tshirts;

import java.util.Scanner;

public class Tshirts {
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
                    try {
                        int age = Integer.parseInt(sn.nextLine()); //int
                        if(age < 1){
                            System.out.println("La edad no es valida");
                        }
                        c.setAge(age);
                    } catch (NumberFormatException nfe) {
                        System.out.println("Edad debe ser numerico");
                    }
                    
                    
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
                    
                    saleAdd = true;
                    System.out.println("*** Venta registrada correctamente ***");
                    Thread.sleep(2*1000);
                    break;
                
                    
                // OPCION 3: Calcular total venta
                case 3:
                    if(saleAdd == false){
                        System.out.println("** Primero ingresa una venta **");
                        Thread.sleep(2*1000);
                        continue;
                    }
                    
                    System.out.println("Es total de la venta es: $"
                            + s.calculateTotal());
                    Thread.sleep(2*1000);
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
                    
                // OPCION 5: Ver datos venta
                case 5:
                    if(saleAdd == false){
                        System.out.println("** Primero ingresa una venta **");
                        Thread.sleep(2*1000);
                        continue;
                    }
                    Thread.sleep(1*1000);
                    s.showSaleData();
                    Thread.sleep(2*1000);
                    break;
            }
        }while(option != 6);
    }    
    
}
