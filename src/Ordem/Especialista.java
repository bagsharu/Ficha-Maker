package Ordem;

public class Especialista implements Agente {

    private String classe = "Especialista";
    private int NEX;
    private int[] atb;

    public Especialista(int nEX, int[] atb) {
        NEX = nEX;
        this.atb = atb;
    }

    @Override
    public int CalcularPV() {
        // Fórmula de cálculo para pontos de vida [ 16 + VIGOR + (3 + VIGOR) * NEX ]
		return 16 + atb[4] + (3 + atb[4]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularPE() {
        // Fórmula de cálculo para pontos de esforço [ 3 + PRESENÇA + (3 + PRESENÇA) * NEX ]
		return 3 + atb[3] + (3 + atb[3]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularSAN() {
        // Fórmula de cálculo para pontos de sanidade [ 16 + 4 * NEX ]
		return 16 + (4 * ((NEX-5)/5));
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
        return "O Especialista de NEX: " + NEX + "% possui: " + CalcularPV() + " de PV, " + CalcularPE() + " de PE e " + CalcularSAN() + " de SAN." ;
    }
    
}
