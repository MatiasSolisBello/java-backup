package tshirts;

public class Customer {
    private String rut;
    private String name;
    private int age;
    private String address;
    private char customerType;

    public Customer() {
    }

    public Customer(String rut, String name, int age, String address, char customerType) {
        this.rut = rut;
        this.name = name;
        this.age = age;
        this.address = address;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getCustomerType() {
        return customerType;
    }

    public void setCustomerType(char customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" + "rut=" + rut + ", name=" + name + ", age=" + age + ", address=" + address + ", customerType=" + customerType + '}';
    }

}
