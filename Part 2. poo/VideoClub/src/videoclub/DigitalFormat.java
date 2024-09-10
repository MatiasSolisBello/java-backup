package videoclub;

// --------------------------------------------
// Clase Digital que extiende de Pelicula
// --------------------------------------------
public class DigitalFormat extends Movie {
    private int mb;

    public DigitalFormat(String code, String title, int amount, String genre, int mb) {
        super(code, title, amount, genre);
        this.mb = mb;
    }
    
    // Llamar al contructor del padre
    public DigitalFormat() {
        super();
    }

    public int getMb() {
        return mb;
    }

    public void setMb(int mb) {
        this.mb = mb;
    }

    @Override
    public String toString() {
        return super.toString()+"ElectronicFormat{" + "mb=" + mb + '}';
    }    
    
    // Metodo para obtener total de la compra
    @Override
    public int getTotalPurchase() {
        int amount = this.getAmount();
        int mb = this.getMb();
        
        int getValueMB = mb * 19;
        
        amount = amount + getValueMB;
        return amount;
        
    }
    
    
    // Metodo para obtener descuentos
    @Override
    public int discount() {
        int discount = (this.getTotalPurchase() * this.digitalDiscount)/100;
        return discount;
    }

    
    // Metodo para obtener total FINAL
    @Override
    public int getTotal() {
        int amountWithDiscount = this.getTotalPurchase() - this.discount();
        int ivaSale = (amountWithDiscount * iva) / 100;
        int amountWithIVA = amountWithDiscount + ivaSale;
        
        System.out.println("El monto final es: "+amountWithIVA);
        return amountWithIVA;
    }
    
    
    // Metodo para obtener clasificacion
    @Override
    public void getClassification() {
        System.out.println("Película en formato digital: "+this.getCode()+", "
                + "$"+this.getTotal()+", "
                + "pesa un total de: "+mb);
    }
}
