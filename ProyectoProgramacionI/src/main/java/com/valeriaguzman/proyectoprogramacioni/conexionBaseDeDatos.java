/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.valeriaguzman.proyectoprogramacioni;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author valer
 */
public class conexionBaseDeDatos {
   static String url="jdbc:postgresql://localhost:5432/BaseDeDatosBiblioteca";
   static String user="postgres";
   static String password="V2005";
    
    public static Connection BaseDeDatos(){
       try {
           //creando conexion a la base de datos
           Connection conexion=DriverManager.getConnection(url, user, password);
           System.out.println("Conectada");
           return conexion;
       } catch (SQLException ex) {
           //excepcion por conexion nula
           Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
            Connection fail=null;
            return fail;
       }
     
    }
    
  
   
    //método que ayudará a hacer las consultas
    public static ResultSet ConsultasBD(String QueryUrl){
         ResultSet consulta;
       try {
           Connection conexion=BaseDeDatos();
           //representa la estructura de la consulta
           Statement estado=conexion.createStatement();
           //realizando la consulta y guarda la misma
           consulta=estado.executeQuery(QueryUrl);
          
       } catch (SQLException ex) {
           //Logger.getLogger(conexionBaseDeDatos.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("un error");
           throw new RuntimeException(ex);
           
           
       }
  
     return consulta;
    }
  
}
