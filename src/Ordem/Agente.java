package Ordem;

public interface Agente {

    // Métodos para implentação de cálculos únicos de cada classe
    int CalcularPV(int NEX,int[] atb);

    int CalcularPE(int NEX,int[] atb);
    
    int CalcularSAN(int NEX);
}
