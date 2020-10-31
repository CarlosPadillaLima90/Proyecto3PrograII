/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro3;

/**
 *
 * @author padil
 */
public class Pro3 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente cliente = new Cliente();

        System.out.println("Ingrese su Usuario");
        cliente.setNombre("Heidy");
        System.out.println("Ingrese su Contraseña");
        cliente.setPasword("123");

        System.out.println();
    }
    
}
