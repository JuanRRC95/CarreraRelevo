/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.carrerarelevos;

import com.ude.Logica.Logica;
import com.udec.Clases.Corredor;
import com.udec.Clases.Equipo;

/**
 *
 * @author JuanPC
 */
public class Inicio {
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Logica logica = new Logica();
        Equipo e = new Equipo("rojo");
        Corredor c1 = new Corredor(1,e);
        Corredor c2 = new Corredor(1,e);
        Corredor c3 = new Corredor(1,e);
        Corredor c4 = new Corredor(2,e);
        Corredor c5 = new Corredor(2,e);
        Corredor c6 = new Corredor(2,e);
        Corredor c7 = new Corredor(3,e);
        Corredor c8 = new Corredor(3,e);
        Corredor c9 = new Corredor(3,e);
        
        c1.start();

        c2.start();
        
        c3.start();
        
        c4.start();
        c5.start();
        c6.start();
 
    }
}
