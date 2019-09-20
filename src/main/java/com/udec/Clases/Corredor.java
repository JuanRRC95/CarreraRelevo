package com.udec.Clases;

import com.ude.Logica.Logica;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Corredor.
 * @since CarreraRelevo 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Corredor extends Thread{
    
    /**
     * Atributos
     */
    private int posicion;
    private Equipo equipo;
    
    /**
     * Constructor de la clase
     * @param posicion
     * @param equipo 
     */
    public Corredor(int posicion,Equipo equipo){
        this.posicion=posicion;
        this.equipo=equipo;
    }
    
    /**
     * Metodo que imprime el primer recorrido del participante 
     */
    public void tramo1(){
        int cont=0;
        while(cont<34){
            cont=cont+random();
               equipo.imprimir(cont,1);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
    }
    
    /**
     *  Metodo que imprime el segundo recorrido del participante
     */
    public void tramo2(){
        int cont=33;
        while(cont<67){
            cont=cont+random();
               equipo.imprimir(cont,2);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
    }
    
    /**
     *  Metodo que imprime el tercer recorrido del participante
     */
    public void tramo3(){
        int cont=66;
        while(cont<100){
            cont=cont+random();
               equipo.imprimir(cont,3);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
        //Logica logica = new Logica();
        //List<String> lista = new Vector<>();
        //lista=logica.getLlegada();
       // lista.add(equipo.getNombre());
    }
    
    /**
     * Metodo run que ejecuta los hilos y deja en espera a los siguientes 
     */
    @Override
    public void run(){
        if(posicion==1){
           tramo1();
        }else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(posicion==2){
            tramo2();
        }else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if(posicion==3){
            tramo3();
        }else {
            synchronized (equipo) {
                try {
                    equipo.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }   
    }
    
    /**
     * Metodo que genera el numero random entre 1 y 3
     * @return 
     */ 
    public static int random(){
        int numero = (int) (Math.random() * 3) + 1;
        //System.out.println(numero);        
        return numero;
    }
    
    
}