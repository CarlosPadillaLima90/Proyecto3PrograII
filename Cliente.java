/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro3;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author padil
 */
public class Cliente {

    private String nombreUsuario;
    private String pasword;
    private String id;
    private String tipoPersona;

    public Cliente() {
        nombreUsuario = "CarlosP";
        pasword = "1234";
        id = "0001";
        tipoPersona = "individual";

    }
    
    public int ingreso(String nombreUsuario, String pasword){
        Connection conn;
        PreparedStatement pst;
        ResultSet rs;
        int cont = 0;
        String sql = "'se logeara cuando usuario='"+nombreUsuario+ "'y contraseña ='"+pasword;
        
    
        
        
        
        return 1;
    }

    public Cliente(String nombre, String pasword, String id, String tipoPersona) {
        this.nombreUsuario = nombre;
        this.pasword = pasword;
        this.id = id;
        this.tipoPersona = tipoPersona;

    }



    public String getNombre() {

        return nombreUsuario;
    }

    public void setNombre(String nombre) {

        if(nombre=="Carlos"){
            System.out.println("Usuario Correcto");
        }else {
            System.out.println("Usuario Incorrecto");
        }

        this.nombreUsuario = nombre;
    }

    public String getPasword() {
        return pasword;
    }

    public void setPasword(String pasword) {
        if (pasword == "123"){
            System.out.println("contraseña correcta");
        } else {
            System.out.println("ingresa es incorrecta");
        }

        this.pasword = pasword;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoPersona() {
        return tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }
}

