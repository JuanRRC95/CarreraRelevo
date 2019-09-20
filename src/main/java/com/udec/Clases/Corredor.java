package com.udec.Clases;

import com.ude.Logica.Logica;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JuanPC
 */
public class Corredor extends Thread{
    
    private int posicion;
    private Equipo equipo;


    public Corredor(int posicion,Equipo equipo){
        this.posicion=posicion;
        this.equipo=equipo;
    }
    
    public void tramo1(){
        int cont=0;
        for(int i=0;i<34;i++){
            cont=cont+random();
               equipo.imprimir(cont,1);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
               }
        }
    }
    
    public void tramo2(){
        int cont=10;
        for(int i=10;i<67;i++){
            cont=cont+random();
               equipo.imprimir(cont,2);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
    }
    
    public void tramo3(){
        int cont=20;
        for(int i=20;i<100;i++){
            cont=cont+random();
               equipo.imprimir(cont,3);
               try {
                   Thread.sleep(500);
               } catch (InterruptedException ex) {
                   Logger.getLogger(Corredor.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
    }
    
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
    
    public void imprimir(int posicion,int tramo){
        char[] pista = equipo.getPista().toCharArray();
        for(int i=0;i<pista.length;i++){
            if(tramo==1){
                if(posicion==i){
                    pista[i]='x';
                    System.out.println(String.valueOf(pista));
                }
            }
            if(tramo==2){
                if(posicion==i){
                    System.out.println("");
                    pista[0]='_';pista[33]='x';
                    System.out.println(String.valueOf(pista));
                }
            }
            if(tramo==3){
                if(posicion==i){
                    System.out.println("");
                    pista[0]='_';pista[33]='x';pista[66]='o';
                    System.out.println(String.valueOf(pista));
                }
            }
        }
    }
    
    public static int random(){
        int numero = (int) (Math.random() * 3) + 1;
        //System.out.println(numero);        
        return numero;
    }
    
    
}