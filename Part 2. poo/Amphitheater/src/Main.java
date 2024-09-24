import classes.Ticket;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Ticket> listTickets = new ArrayList<Ticket>();

        Ticket t1 = new Ticket(3, 1, 3, new Date(),new Date(), 2000);
        Ticket t2 = new Ticket(11, 2, 2, new Date(),new Date(), 2000);
        Ticket t3 = new Ticket(12, 2, 3, new Date(),new Date(), 2000);

        listTickets.add(t1);
        listTickets.add(t2);
        listTickets.add(t3);

        int totalPrice = 0;
        for (Ticket ticket : listTickets) {
            totalPrice += ticket.getPrice();
        }
        System.out.println("Total de tickets vendidos es de: "+totalPrice);
        System.out.println("---------------------------------------------------");

        Scanner sn = new Scanner(System.in);
        int option = 0;
        boolean existTicket = false;

        System.out.println("Ingrese un número de fila");
        option = sn.nextInt();


        for (Ticket ticket : listTickets) {
            if (ticket.getRow() == option) {
                System.out.println(ticket);
                existTicket = true;
            }
        }
        if (existTicket == false){
            System.out.println("La fila esta vacia");
        }
        System.out.println("---------------------------------------------------");
    }
}