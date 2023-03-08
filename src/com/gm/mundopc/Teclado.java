
package com.gm.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private final int idTeclado;
    private static int generadorId;
    
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.generadorId;
        
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", Descripcion¨{ ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
