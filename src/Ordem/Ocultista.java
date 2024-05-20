package Ordem;


public class Ocultista implements Agente {

    private String classe;
    private int NEX;
    private int[] atb;

    public Ocultista(String classe, int nEX, int[] atb) {
        this.classe = classe;
        NEX = nEX;
        this.atb = atb;
    }

    @Override
    public int CalcularPV() {
        // Fórmula de cálculo para pontos de vida [ 12 + VIGOR + (3 + VIGOR) * NEX ]
        return 12 + atb[4] + (2 + atb[4]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularPE() {
        // Fórmula de cálculo para pontos de esforço [ 4 + PRESENÇA + (4 + PRESENÇA) * NEX ]
        return 4 + atb[3] + (4 + atb[3]) * ((NEX-5)/5);
    }

    @Override
    public int CalcularSAN() {
        // Fórmula de cálculo para pontos de sanidade [ 20 + 5 * NEX ]
        return 20 + (5 * ((NEX-5)/5));
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
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
        return "O Agente " + classe + " de NEX: " + NEX + "%, possui: " + CalcularPV() + " de PV, " + CalcularPE() + " de PE e " + CalcularSAN() + " de SAN." ;
    }

}
