package dao;

import Entities.Employee;
import db.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeDAO {
    private Connect connect = new Connect();
    
    public boolean createEmployee(Employee e) throws SQLException{
        boolean is_create = false;
        Connection conn = connect.openConnection();
        
        try {
            String sql = "INSERT INTO Employee values(?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, e.getRut());
            stmt.setString(2, e.getName());
            stmt.setString(3, e.getLast_name());
            stmt.setInt(4, e.getAge());
            stmt.setString(5, e.getPosition());
            stmt.setBoolean(6, e.isSex());
            stmt.setBoolean(7, e.isIs_foreign());
            
            //ejecutar sentencia
            int count = stmt.executeUpdate();
            is_create = (count > 0);
            
        } catch (Exception ex) {
            System.out.println("Error al agregar: "+ ex.getMessage());
        }finally{
            conn.close();
        }
        return is_create;
    }

    public ArrayList<Employee> listEmployee () throws SQLException{
        ArrayList<Employee> e = new ArrayList<>();
        Connection conn = connect.openConnection();
        
        try {
            String sql = "select * from employee";
            PreparedStatement stmt = conn.prepareCall(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Employee emp = new Employee();
                emp.setRut(rs.getString("rut"));
                emp.setName(rs.getString("name"));
                emp.setLast_name(rs.getString("last_name"));
                emp.setAge(rs.getInt("age"));
                emp.setPosition(rs.getString("position"));
                emp.setSex(rs.getBoolean("sex"));
                emp.setIs_foreign(rs.getBoolean("is_foreign"));
                e.add(emp);
            }
        } catch (Exception ex) {
            System.out.println("Error al listar: "+ ex.getMessage());
        }finally{
            conn.close();
        }
        
        return e;
    }

    public ArrayList<Employee> searchEmployeeByRut(String rut) throws SQLException{
        ArrayList<Employee> e = new ArrayList<>();
        Connection conn = connect.openConnection();
        
        try {
            String sql = "select * from employee where rut = ?";
            PreparedStatement stmt = conn.prepareCall(sql);
            stmt.setString(1, rut);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Employee emp = new Employee();
                emp.setRut(rs.getString("rut"));
                emp.setName(rs.getString("name"));
                emp.setLast_name(rs.getString("last_name"));
                emp.setAge(rs.getInt("age"));
                emp.setPosition(rs.getString("position"));
                emp.setSex(rs.getBoolean("sex"));
                emp.setIs_foreign(rs.getBoolean("is_foreign"));
                e.add(emp);
            }
        } catch (Exception ex) {
            System.out.println("Error al listar: "+ ex.getMessage());
        }finally{
            conn.close();
        }
        
        return e;
    }

    public boolean deleteEmployee(String rut) throws SQLException{
        boolean is_delete = false;
        
        Connection conn = connect.openConnection();
        
        try {
            String sql = "delete from employee where rut = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, rut);
            is_delete = (stmt.executeUpdate() > 0);
        } catch (Exception e) {
            System.out.println("Error al eliminar: "+ e.getMessage());
        } finally {
            conn.close();
        }
        return is_delete;
    }
}
