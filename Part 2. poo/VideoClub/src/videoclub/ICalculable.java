package videoclub;

public interface ICalculable {
    int iva = 19;
    int physicalDiscount = 14;
    int digitalDiscount = 20;
    
    int getTotalPurchase();
    
    int discount();
    
    int getTotal();
}
