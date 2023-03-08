
package mundopc;

import com.gm.mundopc.Computadora;
import com.gm.mundopc.Monitor;
import com.gm.mundopc.Orden;
import com.gm.mundopc.Raton;
import com.gm.mundopc.Teclado;

public class MundoPC {
    public static void main(String[] args) {
        
        Raton raton1 = new Raton("analogo", "hp");
        Raton raton2 = new Raton("generico", "sony");
        
        Teclado teclado1 = new Teclado("analogo", "hp");
        Teclado teclado2 = new Teclado("gerico", "sony");
        
        Monitor monitor1 = new Monitor("hp", 17);
        Monitor monitor2 = new Monitor("sony", 15);
        
        Computadora computadora1 = new Computadora("compu1", monitor1, teclado1, raton1);
        Computadora computadora2 = new Computadora("compu2", monitor2, teclado2, raton2);
        
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden2.agregarComputadora(computadora2);
        orden1.mostarOrden();
        orden2.mostarOrden();
        
    }
}
