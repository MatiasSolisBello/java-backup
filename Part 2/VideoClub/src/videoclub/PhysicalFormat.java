package videoclub;

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

    @Override
    public int discount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
