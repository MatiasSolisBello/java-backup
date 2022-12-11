package dao;

import Entities.Employee;
import db.Connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
}
