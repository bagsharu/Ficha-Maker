package Ordem;

public class Ocultista implements Agente {

    @Override
    public int CalcularPV(int NEX, int[] atb) {
        
        return 12 + atb[4] + (2 + atb[4]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularPE(int NEX, int[] atb) {
        
        return 4 + atb[3] + (4 + atb[3]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularSAN(int NEX) {
        
        return 20 + (5 * ((NEX-5)/5));
    }

}
