public class Sale {
    private int quantity;
    private char type;
    private int tip;
    private Customer customer;

    public Sale() {}

    public Sale(int quantity, char type, int tip, Customer customer) {
        this.quantity = quantity;
        this.type = type;
        this.tip = tip;
        this.customer = customer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "quantity=" + quantity +
                ", type=" + type +
                ", tip=" + tip +
                ", customer=" + customer +
                '}';
    }

    public int calculateTotal(){
        int amount = 0;

        // Calculo por tipo de producto
        if(this.getType() == 'E'){
            amount += 3000;
        }else if(this.getType() == 'T'){
            amount += 2000;
        } else if (this.getType() == 'A') {
            amount += 5000;
        }

        // Si es frecuente, 5.5% de descuento
        // Si es nornal, 3.6% de descuento, si es normal +$500
        if(this.getCustomer().getCustomer_type() == 'F'){
            amount = (int)(amount * (1 - 5.5 /100));
        } else if (this.getCustomer().getCustomer_type() == 'V') {
            amount = (int)(amount * (1 - 3.6 / 100));
        }else if (this.getCustomer().getCustomer_type() == 'N') {
            amount += 500;
        }

        // Si tiene entre 65 y 99 años, 4% de descuento
        if(this.getCustomer().getAge() >= 65 && this.getCustomer().getAge() < 99){
            amount = (int)(amount * 0.66);
        }

        // Si tiene >100 años $1.000 menos
        if(this.getCustomer().getAge() >= 100){
            amount = (int)(amount - 1000);
        }

        //IVA
        amount = (int)(amount * 1.19);
        return amount;
    }

    public void showSaleData(){
        System.out.println("              Datos de Venta:");
        String type = getStringType(this.getType());
        System.out.println("Cant: "+ this.getQuantity() +", Producto: "+ type +", Total: $"+ this.calculateTotal() );
    }

    public String getStringType(char type) {
        switch (type) {
            case 'A': return "Anticucho";
            case 'E': return "Empanada";
            case 'T': return "Terremoto";
            default: return "Tipo desconocido";
        }
    }
}
