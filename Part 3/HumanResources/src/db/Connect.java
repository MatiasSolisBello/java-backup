package db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
    private Connection connect;
    
    private String user = "root";
    private String password = "";
    private String db_name = "human_resources";

    private String url = "jdbc:mysql://localhost:3306/"+db_name;

    public Connection openConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            this.connect = DriverManager.getConnection(this.url, this.user, this.password);
            System.out.println("CONNECTION TO: "+this.url);
        } catch (Exception e) {
            System.out.println("Error de conexion: " + e.getMessage());
        }

        return connect;
    }
}
