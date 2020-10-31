/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pro3;

import java.util.Date;

/**
 *
 * @author padil
 */
public class Orden {

    int id;
    Cliente cliente;
    ItemOrden item1;
    ItemOrden item2;
    Date fechaOrden;
    double precioEnvio;
    double total;
    String tipoEnvio;
    String estado;

    public Orden() {
        id = id;
        fechaOrden = new Date();
        total = 0.0;
    }

    public Orden(Date pFecha){
        Orden orden = new Orden();

    }


}

