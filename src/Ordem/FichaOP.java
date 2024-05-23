package Ordem;
import javax.swing.*;


public class FichaOP {

	public static void main(String[] args) {

		int[] atributos = new int[5];
		String[] options = {"Combatente","Especialista","Ocultista"};

		// Dispõe ao usuário as três classes disponíveis em Ordem Paranormal.
		int classe = JOptionPane.showOptionDialog(null, 
											"Selecione uma das Classes:",
												"Agente Ordo Realitas",  
													JOptionPane.DEFAULT_OPTION, 
													JOptionPane.INFORMATION_MESSAGE,
													null, options, options[0]);
		
		// Recebe o NEX pela interface de usuário e converte para int.
		String nivel = JOptionPane.showInputDialog("Digite o NEX do agente:");
		int NEX = Integer.parseInt(nivel);
		
		// Recebe os atributos de ficha e converte para valores inteiros em values.
		String tokens2 = JOptionPane.showInputDialog("Agora, insira os atributos do agente na seguinte ordem\n" + 
													 "- Agilidade, Força, Intelecto, Presença e Vigor:");
		String[] values = tokens2.split(" ");
        for (int i = 0; i < 5; i++) {
            	atributos[i] = Integer.parseInt(values[i]);
        
  		}
		LeituraDados.LerDados(classe, NEX, atributos);
		
	}
}