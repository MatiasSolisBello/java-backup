package humanresources;

import Entities.Employee;
import dao.EmployeeDAO;
import java.util.ArrayList;
public class HumanResources {

    public static void main(String[] args) {
        
//        Employee e = new Employee("222222-2", "Frederick", "Engels", 30, "asistente", true, false);
//        EmployeeDAO dao = new EmployeeDAO();
//        
//        try {
//            if(dao.createEmployee(e)){
//                System.out.println("Agregado");
//            }else{
//                System.out.println("Fallo!");
//            }
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        }
        EmployeeDAO dao = new EmployeeDAO();
        try {
            ArrayList<Employee> e = dao.listEmployee();
            for (Employee e1 : e) {
                System.out.println(e1);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
