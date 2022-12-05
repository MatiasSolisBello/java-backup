package videoclub;

public interface ICalculable {
    int iva = 19;
    int physicalDiscount = 14;
    int electronicDiscount = 20;
    
    int getTotalPurchase();
    
    int discount();
    
    int getTotal();
}
