/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.loja.dal;

import java.sql.*;

/**
 *
 * @author PCDONIZETE
 */
public class moduloConexao {
    
    public static Connection conector(){
        java.sql.Connection conexao = null;
     
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/crud";
        String user = "root";
        String password = "";
        try{
           Class.forName(driver);
           conexao = DriverManager.getConnection(url,user,password);
           return conexao;
        }catch(Exception e){
           
            return null;
        }
    }
    
}
