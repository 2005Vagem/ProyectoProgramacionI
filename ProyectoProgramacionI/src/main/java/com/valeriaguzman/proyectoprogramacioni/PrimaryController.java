package com.valeriaguzman.proyectoprogramacioni;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    //public String si quiero obtener el nombre
    private void switchToSecondary(){
        
       // App.setRoot("secondary");
       try{
           String consulta="SELECT * FROM autor";
           ResultSet rs=conexionBaseDeDatos.ConsultasBD(consulta);
           if(rs.next()){
               System.out.println(rs.getString("NombreAutor"));
           }
       }catch(SQLException e){
           e.printStackTrace();
            System.out.println("un error 2");
           
       }
    }
}
