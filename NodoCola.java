/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra2;

/**
 *
 * @author Jose Daniel
 */
public class NodoCola {
        public Object elemento; //informacion del nodo
    public NodoCola ant, sgte; //apuntador

    //Constructor No. 1
    public NodoCola(Object elemento) {
        this.elemento = elemento;
        this.ant = this.sgte = null;
    }//Constructor

    // para la cola enlazada header
    public NodoCola() {
        this.sgte = null;
    }
}
