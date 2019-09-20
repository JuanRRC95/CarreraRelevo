package com.udec.Clases;
import java.util.List;
import java.util.Vector;

/**
 * Clase Equipo que continene los atributos y metodos relacionados a la impresion
 * de la competencia.
 * @since CarreraRelevo 1.0
 * @version 1.0
 * @author Juan Ricardo Rodriguez Campos
 */
public class Equipo {
    /**
     * atributos de color para la clase
     */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    /**
     * atributos de la clase
     */
    private String nombre;
    private String pista="x________________________________o________________________________u________________________________";
    private String señal="";
    
    /**
     * contructor de la clase Equipo
     * @param nombre 
     */
    public Equipo(String nombre) {
        if(nombre=="ANSI_GREEN"){
            this.nombre = ANSI_GREEN;
        }
        if(nombre=="ANSI_RED"){
            this.nombre = ANSI_RED;
        }
        if(nombre=="ANSI_BLUE"){
            this.nombre = ANSI_BLUE;
        }
        
    }

    /**
     * Metodos GET y SET 
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPista() {
        return pista;
    }

    public void setPista(String pista) {
        this.pista = pista;
    }
  
   /**
   * Metodo sincronizado que imprime el trayecto del competidor 
   * @param posicion
   * @param tramo 
   */  
    synchronized void imprimir(int posicion,int tramo){
        char[] pista2 = pista.toCharArray();
        for(int i=0; i<5; i++)System.out.println("\n");        
        for(int i=0;i<pista2.length;i++){
            if(tramo==1){
                if(posicion==i){
                    pista2[i]='x';                   
                    System.out.println(nombre+String.valueOf(pista2)+nombre);
                }
                if(posicion>=33)
                   notify();
            }
            if(tramo==2){
                if(posicion==i){
                    pista2[0]='_';pista2[33]='x';pista2[i]='o';
                    System.out.println(nombre+String.valueOf(pista2)+nombre);
                }
                if(posicion>=66)
                    notify();
            }
            if(tramo==3){
                if(posicion==i){
                    pista2[0]='_';pista2[33]='x';pista2[66]='o';pista2[i]='u';
                    System.out.println(nombre+String.valueOf(pista2)+nombre);
                }
            }
        }
        
    }
    
}
