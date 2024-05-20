package Ordem;
import java.util.Scanner;
import javax.swing.*;


public class FichaOP {

	public static void main(String[] args) {

		int[] atributos = new int[5];

		Scanner in = new Scanner(System.in);

		// Lê a entrada com a classe e NEX do agente separados por espaço
		//System.out.print("Digite a Classe e NEX separados por espaço: \n");
		String info = JOptionPane.showInputDialog("Digite a Classe e NEX separados por espaço:");

		// Separa a string de entrada e atribui as informações nas devidas variáveis
		String[] tokens = info.split(" ");

		String classe = tokens[0];
		int NEX = Integer.parseInt(tokens[1]);

		// Lê a entrada dos atributos na ordem desejada
		//System.out.print("Agora, insira os atributos do agente na seguinte ordem - Agilidade, Força, Intelecto, Presença e Vigor:\n");
		String tokens2 = JOptionPane.showInputDialog("Agora, insira os atributos do agente na seguinte ordem - Agilidade, Força, Intelecto, Presença e Vigor:");
		in.close();

		String[] values = tokens2.split(" ");

		// Converte os atributos em valores inteiros e os armazena em values.
        for (int i = 0; i < 5; i++) {
            atributos[i] = Integer.parseInt(values[i]);
        }


		switch (classe) {
			case "Ocultista":
				Ocultista ocultista = new Ocultista(classe, NEX, atributos);
				JOptionPane.showMessageDialog(null, ocultista.toString(), "Agente Ordo Realitas", JOptionPane.PLAIN_MESSAGE);				
				break;
			case "Especialista":
				Especialista especialista = new Especialista(classe, NEX, atributos);
				JOptionPane.showMessageDialog(null, especialista.toString(), "Agente Ordo Realitas", JOptionPane.PLAIN_MESSAGE);
				break;
			case "Combatente":
				Combatente combatente = new Combatente(classe, NEX, atributos);
				JOptionPane.showMessageDialog(null, combatente.toString(), "Agente Ordo Realitas", JOptionPane.PLAIN_MESSAGE);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Agentes do tipo " + classe +" não constam no sistema da Ordem!", "Agente Ordo Realitas", JOptionPane.PLAIN_MESSAGE);
				break;
		}

	}
}
