/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

import java.sql.*;
/**
 *
 * @author SKYWALKER
 */
public class conectar {
    Connection conectar = null;
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "");
        } catch (Exception e){
            System.out.print(e.getMessage());
        }
        
        return conectar;
    }
}
