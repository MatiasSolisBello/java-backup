package tshirts;

public class Sale {
    private int number;
    private String size;
    private Customer customer;

    public Sale() {
    }

    public Sale(int number, String size, Customer customer) {
        this.number = number;
        this.size = size;
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Sale{" + "number=" + number + ", size=" + size + ", customer=" + customer + '}';
    }
    
    
}
