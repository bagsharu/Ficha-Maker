package Ordem;

public class Combatente implements Agente {

    private String classe = "Combatente";
    private int NEX;
    private int[] atb;

    public Combatente(int nEX, int[] atb) {
        NEX = nEX;
        this.atb = atb;
    }

    @Override
    public int CalcularPV() {
        // Fórmula de cálculo para pontos de vida [ 12 + VIGOR + (3 + VIGOR) * NEX ]
        return 20 + atb[4] + (4 + atb[4]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularPE() {
        // Fórmula de cálculo para pontos de esforço [ 2 + PRESENÇA + (2 + PRESENÇA) * NEX ]
		return 2 + atb[3] + (2 + atb[3]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularSAN() {
        // Fórmula de cálculo para pontos de sanidade [ 12 + 3 * NEX ]
		return 12 + (3 * ((NEX-5)/5));
    }

    public String getClasse() {
        return classe;
    }

    public int getNEX() {
        return NEX;
    }

    public void setNEX(int nEX) {
        NEX = nEX;
    }

    public int[] getAtb() {
        return atb;
    }

    public void setAtb(int[] atb) {
        this.atb = atb;
    }
    
    @Override
    public String toString() {
        return "O Combatente de NEX: " + NEX + "% possui: " + CalcularPV() + " de PV, " + CalcularPE() + " de PE e " + CalcularSAN() + " de SAN." ;
    }
}
