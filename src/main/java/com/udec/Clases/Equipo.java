
package com.udec.Clases;

/**
 *
 * @author JuanPC
 */
public class Equipo {
    
    private String nombre;
    private String pista="x________________________________o________________________________u________________________________";
    private String señal="";

    public Equipo(String nombre) {
        this.nombre = nombre;
    }

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
  
    
    synchronized void imprimir(int posicion,int tramo){
        char[] pista2 = pista.toCharArray();
        System.out.println("-------------------------------------");
        for(int i=0;i<pista2.length;i++){
            if(tramo==1){
                if(posicion==i){
                    pista2[i]='x';                   
                    System.out.println(String.valueOf(pista2));
                }
                if(posicion>=33){
                   notify();
                }
            }
            if(tramo==2){
                if(posicion==i){
                    pista2[0]='_';pista2[33]='x';pista2[i]='o';
                    System.out.println(String.valueOf(pista2));
                }
                if(posicion>=66){
                   notify();
                }
            }
            if(tramo==3){
                if(posicion==i){
                    pista2[0]='_';pista2[33]='x';pista2[66]='o';pista2[i]='u';
                    System.out.println(String.valueOf(pista2));
                }
            }
        }
        System.out.println("-------------------------------------");
    }
    
}
