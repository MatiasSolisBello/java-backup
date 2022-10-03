package vineyard;

public class Sale {
    private int number;
    private int strain; //1.cabernet  2.merlot  3.chardonnay
    private int size;  //1. chica  2. grande
    private Customer customer;

    public Sale() {
    }

    public Sale(int number, int strain, int size, Customer customer) {
        this.number = number;
        this.strain = strain;
        this.size = size;
        this.customer = customer;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getStrain() {
        return strain;
    }

    public void setStrain(int strain) {
        this.strain = strain;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
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
        return "Sale{" + "number=" + number + ", strain=" + strain + ", size=" + size + ", customer=" + customer + '}';
    }

    
    
    
}
