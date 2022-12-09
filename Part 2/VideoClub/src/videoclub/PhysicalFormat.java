package videoclub;

// --------------------------------------------
// Clase Fisica que extiende de Pelicula
// --------------------------------------------
public class PhysicalFormat extends Movie{
    private String format;
    
    // Llamar al contructor del padre
    public PhysicalFormat() {
        super();
    }

    public PhysicalFormat(String code, String title, int amount, String genre, String format) {
        super(code, title, amount, genre);
        this.format = format;
    }
     
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public String toString() {
        return super.toString() + "PhysicalFormat{" + "format=" + format + '}';
    }
    
    // Metodo para obtener total de la compra
    @Override
    public int getTotalPurchase() {
        int amount = this.getAmount();
        
        if(this.getFormat().toLowerCase().equals("dvd")){
            amount+=1000;
        }else if(this.getFormat().toLowerCase().equals("vhs")){
            amount+=290;
        }else if(this.getFormat().toLowerCase().equals("blueray")){
            amount+=4990;
        }
        
        return amount;
    }
    
    
    // Metodo para obtener descuentos
    @Override
    public int discount() {
        int discount = (this.getTotalPurchase() * this.physicalDiscount)/100;
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
        System.out.println("Película en formato físico: "+this.getCode()+", "
                + "$"+this.getTotal()+
                " - Formato: "+format);
    }
    
    
}
