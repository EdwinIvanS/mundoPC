package com.gm.mundopc;

public class Raton extends DispositivoEntrada {

    private final int idRaton;
    private static int generadorId;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = ++Raton.generadorId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton{");
        sb.append("idRaton=").append(idRaton);
        sb.append(", Descripcion¨{ ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
}
