package Entities;

public class Employee {
    private String rut;
    private String name;
    private String last_name;
    private int age;
    private String position;
    private boolean sex;
    private boolean is_foreign;

    public Employee() {
    }

    public Employee(String rut, String name, String last_name, int age, String position, boolean sex, boolean is_foreign) {
        this.setRut(rut);
        this.setName(name);
        this.setLast_name(last_name);
        this.setAge(age);
        this.setPosition(position);
        this.setSex(sex);
        this.setIs_foreign(is_foreign);
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

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 18){
            throw new IllegalArgumentException("La persona debe ser mayor "
                    + "de edad");
        }
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public boolean isIs_foreign() {
        return is_foreign;
    }

    public void setIs_foreign(boolean is_foreign) {
        this.is_foreign = is_foreign;
    }

    @Override
    public String toString() {
        return "Employee{" + "rut=" + rut + ", name=" + name + ", last_name=" + last_name + ", age=" + age + ", position=" + position + ", sex=" + sex + ", is_foreign=" + is_foreign + '}';
    }
}
