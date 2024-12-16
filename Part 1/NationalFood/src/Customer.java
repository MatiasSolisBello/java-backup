public class Customer {
    private String rut;
    private String name;
    private int age;
    private char gender;
    private char customer_type;

    public Customer() {
    }

    public Customer(String name, int age, char customer_type, char gender, String rut) {
        this.name = name;
        this.age = age;
        this.customer_type = customer_type;
        this.gender = gender;
        this.rut = rut;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(char customer_type) {
        this.customer_type = customer_type;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "rut='" + rut + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", customer_type=" + customer_type +
                '}';
    }

    public void showCustomerData(){
        System.out.println("CLIENTE:");
        String customer_type = getStringCustomerType(this.getCustomer_type());
        System.out.println("   "+ this.getRut() +" - "+ this.getName() +" - cliente "+ customer_type );
    }

    public String getStringCustomerType(char type) {
        switch (type) {
            case 'F': return "Frecuente";
            case 'V': return "VIP";
            case 'N': return "Normal";
            default: return "Tipo desconocido";
        }
    }
}
