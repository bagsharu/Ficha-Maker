package Ordem;

public class Combatente implements Agente {

    @Override
    public int CalcularPV(int NEX, int[] atb) {
        // Fórmula de cálculo para pontos de vida [ 12 + VIGOR + (3 + VIGOR) * NEX ]
        return 20 + atb[4] + (4 + atb[4]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularPE(int NEX, int[] atb) {
        // Fórmula de cálculo para pontos de esforço [ 2 + PRESENÇA + (2 + PRESENÇA) * NEX ]
		return 2 + atb[3] + (2 + atb[3]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularSAN(int NEX) {
        // Fórmula de cálculo para pontos de sanidade [ 12 + 3 * NEX ]
		return 12 + (3 * ((NEX-5)/5));
    }
    
}
