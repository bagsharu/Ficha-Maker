package Ordem;

public class Ocultista implements Agente {

    @Override
    public int CalcularPV(int NEX, int[] atb) {
        // Fórmula de cálculo para pontos de vida [ 12 + VIGOR + (3 + VIGOR) * NEX ]
        return 12 + atb[4] + (2 + atb[4]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularPE(int NEX, int[] atb) {
        // Fórmula de cálculo para pontos de esforço [ 4 + PRESENÇA + (4 + PRESENÇA) * NEX ]
        return 4 + atb[3] + (4 + atb[3]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularSAN(int NEX) {
        // Fórmula de cálculo para pontos de sanidade [ 20 + 5 * NEX ]
        return 20 + (5 * ((NEX-5)/5));
    }

}