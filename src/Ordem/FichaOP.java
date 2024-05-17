package Ordem;
import java.util.Scanner;


public class FichaOP {

	public static void main(String[] args) {

		int[] atributos = new int[5];

		Scanner in = new Scanner(System.in);

		// Lê a entrada com a classe e NEX do agente separados por espaço
		System.out.print("Digite a Classe e NEX separados por espaço: \n");
		String info = in.nextLine();

		// Separa a string de entrada e atribui as informações nas devidas variáveis
		String[] tokens = info.split(" ");

		String classe = tokens[0];
		int NEX = Integer.parseInt(tokens[1]);

		// Lê a entrada dos atributos na ordem desejada
		System.out.print("Agora, insira os atributos do agente na seguinte ordem - Agilidade, Força, Intelecto, Presença e Vigor:\n");
		String tokens2 = in.nextLine();
		in.close();

		String[] values = tokens2.split(" ");

		// Converte os atributos em valores inteiros e os armazena em values.
        for (int i = 0; i < 5; i++) {
            atributos[i] = Integer.parseInt(values[i]);
        }

        
        // Chamada para classe que realiza os cálculos de atributos da ficha.
        FichaCalculo.CalcularFicha(NEX, classe, atributos);

	}
}
