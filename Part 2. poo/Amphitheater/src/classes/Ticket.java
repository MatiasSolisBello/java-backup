package classes;

import java.util.Date;

public class Ticket {
    public int number;
    public int row;
    public int seat;
    public Date purchase_date;
    public Date validity_date;
    public int price;
    public Customer customer;

    public Ticket() {}

    public Ticket(int number, int row, int seat, Date purchase_date, Date validity_date, int price) {
        this.number = number;
        this.row = row;
        this.seat = seat;
        this.purchase_date = purchase_date;
        this.validity_date = validity_date;
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public Date getPurchase_date() {
        return purchase_date;
    }

    public void setPurchase_date(Date purchase_date) {
        this.purchase_date = purchase_date;
    }

    public Date getValidity_date() {
        return validity_date;
    }

    public void setValidity_date(Date validity_date) {
        this.validity_date = validity_date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "number=" + number +
                ", row=" + row +
                ", seat=" + seat +
                ", purchase_date=" + purchase_date +
                ", validity_date=" + validity_date +
                ", price=" + price +
                '}';
    }

}
