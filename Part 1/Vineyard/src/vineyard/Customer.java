package vineyard;

public class Customer {
    private String rut;
    private String name;
    private int age;
    private char customerType;

    public Customer() {
    }

    public Customer(String rut, String name, int age, char customerType) {
        this.rut = rut;
        this.name = name;
        this.age = age;
        this.customerType = customerType;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getCustomerType() {
        return customerType;
    }

    public void setCustomerType(char customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" + "rut=" + rut + ", name=" + name + ", age=" + age + ", customerType=" + customerType + '}';
    }
    
    public void showCustomerData(){
        String nameCustomerType = "";
        
        if(this.getCustomerType() == 'F'){
            nameCustomerType = " Frecuente";
        }else if(this.getCustomerType() == 'V'){
            nameCustomerType = " VIP";
        }else if(this.getCustomerType() == 'N'){
            nameCustomerType = " Normal";
        }
        
        System.out.println("Rut: "+this.getRut()+" - "+this.getName()+
                " - Cliente"+nameCustomerType);
    }
}
