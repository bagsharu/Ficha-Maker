package Ordem;

public class FichaCalculo{
	
	
	// Método calculador de atributos
	public static void CalcularFicha(int nivel, String classe, int[] atb) {
		
	// Bloco switch compara a classe fornecida e realiza as operações específicas de cada
	switch(classe) {
	
	case "Ocultista":{
		// Fórmula de cálculo para pontos de vida [ 12 + VIGOR + (3 + VIGOR) * NEX ]
		int PV = 12 + atb[4] + (2 + atb[4]) * ((nivel-5)/5);
		// Fórmula de cálculo para pontos de esforço [ 4 + PRESENÇA + (4 + PRESENÇA) * NEX ]
		int PE = 4 + atb[3] + (4 + atb[3]) * ((nivel-5)/5);
		// Fórmula de cálculo para pontos de sanidade [ 20 + 5 * NEX ]
		int SAN = 20 + (5 * ((nivel-5)/5));
		
		// Impressão da "ficha" com atributos calculados!
		System.out.println("Seu " + classe + " de NEX: " + nivel +"% tem " + PV + " de PV, " + PE + " de PE e " + SAN + " de sanidade.");
		
		break;
	}
	case "Combatente":{
		// Fórmula de cálculo para pontos de vida [ 12 + VIGOR + (3 + VIGOR) * NEX ]
		int PV = 20 + atb[4] + (4 + atb[4]) * ((nivel-5)/5);
		// Fórmula de cálculo para pontos de esforço [ 2 + PRESENÇA + (2 + PRESENÇA) * NEX ]
		int PE = 2 + atb[3] + (2 + atb[3]) * ((nivel-5)/5);
		// Fórmula de cálculo para pontos de sanidade [ 12 + 3 * NEX ]
		int SAN = 12 + (3 * ((nivel-5)/5));
		
		System.out.println("Seu " + classe + " de NEX: " + nivel +"% tem " + PV + " de PV, " + PE + " de PE e " + SAN + " de sanidade.");

		break;
	}
	case "Especialista":{
		// Fórmula de cálculo para pontos de vida [ 16 + VIGOR + (3 + VIGOR) * NEX ]
		int PV = 16 + atb[4] + (3 + atb[4]) * ((nivel-5)/5);
		// Fórmula de cálculo para pontos de esforço [ 3 + PRESENÇA + (3 + PRESENÇA) * NEX ]
		int PE = 3 + atb[3] + (3 + atb[3]) * ((nivel-5)/5);
		// Fórmula de cálculo para pontos de sanidade [ 16 + 4 * NEX ]
		int SAN = 16 + (4 * ((nivel-5)/5));
		
		System.out.println("Seu " + classe + " de NEX: " + nivel +"% tem " + PV + " de PV, " + PE + " de PE e " + SAN + " de sanidade.");

		break;
	}
	// Saída caso a classe inserida não conste no sistema
	default:
		System.out.println("A classe " + classe +" não consta no sistema da Ordem!");
}
}
}
