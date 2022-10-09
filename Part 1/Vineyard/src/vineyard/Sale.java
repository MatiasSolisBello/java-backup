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

    public int calculateTotal(){
        int amount = 0;
        
        // Calculo por cepa
        if(this.getStrain()== 1){
            amount = 3990;
        }else if(this.getStrain() == 2){
            amount = 3980;
        }else if(this.getStrain() == 3){
            amount = 8990;
        }
        
        //Calculo por cantidad de botellas
        amount = amount * this.getNumber();
        
        //Calculo por tamaño de botella
        if(this.getSize() == 1){
            amount = amount + 1990;
        }else if(this.getSize() == 2){
            amount = amount + 2590;
        }
        
        //Descuentos por tipo de cliente
        
        //Descuento por edad
        //if(this.getCustomer().getAge() >= 65){
        //    amount = (int)(amount * 0.96);
        //}
        
        //IVA
        amount = (int)(amount * 1.19);
        return amount;
        
    }
}
