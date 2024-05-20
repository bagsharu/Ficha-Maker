package Ordem;

public class Especialista implements Agente {

    @Override
    public int CalcularPV(int NEX, int[] atb) {
        // Fórmula de cálculo para pontos de vida [ 16 + VIGOR + (3 + VIGOR) * NEX ]
		return 16 + atb[4] + (3 + atb[4]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularPE(int NEX, int[] atb) {
        // Fórmula de cálculo para pontos de esforço [ 3 + PRESENÇA + (3 + PRESENÇA) * NEX ]
		return 3 + atb[3] + (3 + atb[3]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularSAN(int NEX) {
        // Fórmula de cálculo para pontos de sanidade [ 16 + 4 * NEX ]
		return 16 + (4 * ((NEX-5)/5));
    }
    
}
