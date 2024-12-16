import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        Sale sale = new Sale();

        int option;
        Scanner sn = new Scanner(System.in);
        boolean customerAdd = false;
        boolean saleAdd = false;

        do {
            System.out.println("Ingrese una opcion:");
            System.out.println("1. Ingresar cliente");
            System.out.println("2. Ingresar venta");
            System.out.println("3. Calcular total venta");
            System.out.println("4. Ver datos cliente");
            System.out.println("5. Ver datos de la venta");
            System.out.println("6. Salir");
            System.out.println("---------------------");
            option = Integer.parseInt(sn.nextLine());

            switch(option){
                case 1:
                    System.out.println("--- Ingresar cliente ---");
                    System.out.println("");

                    System.out.println("Ingrese el rut: ");
                    String rut = sn.nextLine();
                    customer.setRut(rut);

                    System.out.println("Ingrese el nombre: ");
                    String name = sn.nextLine();
                    if(name.length() < 3 || name.length() > 25){
                        System.out.println("Largo de nombre debe ser entre 3 y "
                                + "25 caracteres");
                        continue;
                    }
                    customer.setName(name);

                    System.out.println("Ingrese el edad: ");
                    int age = Integer.parseInt(sn.nextLine());
                    customer.setAge(age);

                    System.out.println("Ingrese el sexo (F / M): ");
                    char gender = sn.nextLine().toUpperCase().charAt(0);
                    if(gender != 'F' && gender != 'M') {
                        System.out.println("Solo F, M son validas");
                        continue;
                    }
                    customer.setGender(gender);


                    System.out.println("Ingrese el tipo de cliente (F / V / N): ");
                    char customerType = sn.nextLine().toUpperCase().charAt(0);
                    if(customerType != 'F' && customerType != 'V' &&
                            customerType != 'N'){
                        System.out.println("Solo F, V o N son validas");
                        continue;
                    }
                    customer.setCustomer_type(customerType);
                    customerAdd = true;
                    System.out.println("***Cliente registrado correctamente***");
                    break;
                case 2:
                    if(customerAdd == false){
                        System.out.println("** Primero agrega un cliente **");
                        continue;
                    }

                    System.out.println("Ingresar venta");
                    System.out.println("");

                    System.out.println("Ingrese la cantidad de productos: ");
                    int quantity = Integer.parseInt(sn.nextLine());
                    sale.setQuantity(quantity);

                    System.out.println("Ingrese el producto (Empanada, Terremoto o Anticucho): ");
                    char type = sn.nextLine().toUpperCase().charAt(0);
                    if(type != 'E' && type != 'T' && type != 'A'){
                        System.out.println("Solo E, T o A son validas");
                        continue;
                    }
                    sale.setType(type);

                    System.out.println("Ingrese propina");
                    int tip = Integer.parseInt(sn.nextLine());
                    sale.setTip(tip);

                    //cliente a la venta
                    sale.setCustomer(customer);

                    saleAdd = true;
                    System.out.println("*** Venta registrada correctamente ***");
                    break;
                case 3:
                    if(saleAdd == false){
                        System.out.println("** Primero ingresa una venta **");
                        continue;
                    }

                    System.out.println("Es total de la venta es: $" + sale.calculateTotal() );
                    break;
                case 4:
                    System.out.println("Ver datos cliente");
                    if(customerAdd == false){
                        System.out.println("** Primero ingresa un cliente **");
                        continue;
                    }
                    customer.showCustomerData();
                    break;
                case 5:
                    if(saleAdd == false){
                        System.out.println("** Primero ingresa una venta **");
                        continue;
                    }

                    System.out.println("Ver datos de la venta");
                    sale.showSaleData();
                    break;
            }
        }while(option != 6);
    }
}