
package com.ude.Logica;

import com.udec.Clases.Corredor;
import com.udec.Clases.Equipo;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * Clase Logica que contiene el inicio de los hilos.
 * @since CarreraRelevo 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Logica {
 
   //private List<String>llegada= new Vector<>();  
    /*
    public List<String> getLlegada() {
        return llegada;
    }

    public void setLlegada(List<String> llegada) {
        this.llegada = llegada;
    }
    */ 
   
   /**
    * Metodo Logica que crea e inicia los hilos de la carrera 
    */
    public Logica(){
        Equipo e = new Equipo("ANSI_RED");
        Equipo e2 = new Equipo("ANSI_BLUE");
        Equipo e3 = new Equipo("ANSI_GREEN");
        Corredor c1 = new Corredor(1,e);
        Corredor c2 = new Corredor(1,e2);
        Corredor c3 = new Corredor(1,e3);
        Corredor c4 = new Corredor(2,e);
        Corredor c5 = new Corredor(2,e2);
        Corredor c6 = new Corredor(2,e3);
        Corredor c7 = new Corredor(3,e);
        Corredor c8 = new Corredor(3,e2);
        Corredor c9 = new Corredor(3,e3);
        
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        c5.start();
        c6.start();
        c7.start();
        c8.start();
        c9.start(); 
    } 
}
