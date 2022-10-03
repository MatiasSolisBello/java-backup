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
    
    public int calculateTotal(){
        int amount = 0;
        
        //Calculo por talla
        if(this.getSize().equals("S")==true){
            amount = 2990;
        }else if(this.getSize().equals("M")==true){
            amount = 3990;
        }else if(this.getSize().equals("L")==true){
            amount = 4990;
        }else if(this.getSize().equals("XL")==true){
            amount = 5490;
        }
        amount = amount * this.getNumber();
        
        //Descuentos por tipo de cliente y edad
        if(this.getCustomer().getCustomerType() == 'F'){
            amount = (int)(amount * 0.92);
        }else if(this.getCustomer().getCustomerType() == 'V'){
            amount = (int)(amount * 0.88);
        }else if(this.getCustomer().getAge() >= 65){
            amount = (int)(amount * 0.96);
        }
        
        //IVA
        amount = (int)(amount * 1.19);
        
        return amount;
    }
    
    
    public void showSaleData(){
        System.out.println(
                "Cant: "+this.getNumber() + 
                " - Talla: "+this.getSize()+""
                + " - Total: $"+this.calculateTotal());
    }
}
