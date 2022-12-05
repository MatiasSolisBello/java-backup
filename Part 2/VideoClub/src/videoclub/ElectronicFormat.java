package videoclub;

public class ElectronicFormat extends Movie {
    private int mb;

    public ElectronicFormat(String code, String title, int amount, String genre, int mb) {
        super(code, title, amount, genre);
        this.mb = mb;
    }

    public ElectronicFormat() {
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

    @Override
    public int getTotalPurchase() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
