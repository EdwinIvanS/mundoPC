
package com.gm.mundopc;

public class Orden {
    public int idOrden;
    public Computadora computadoras[];
    public static int contadorOrdenes;
    private int contadorComputadoras;
    private final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden= ++Orden.contadorOrdenes;
        computadoras = new Computadora[Orden.contadorOrdenes];
    }
    
    public void agregarComputadora(Computadora computadora){
       if(this.contadorComputadoras < this.MAX_COMPUTADORAS){
           computadoras[contadorComputadoras++] = computadora;
       }
       else{
           System.out.println("No se pueden agregar mas computadoras");
       }
    }
    
    public void mostarOrden(){
        System.out.println("IdOrden :" + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println(computadoras[i]);
        }
    }
  
    
}
