package Ordem;

import javax.swing.JOptionPane;

public class LeituraDados {
    public static void LerDados(int classe, int NEX, int[] atributos){
        switch (classe) {
			case 0:
				Combatente combatente = new Combatente(NEX, atributos);
				JOptionPane.showMessageDialog(null,combatente.toString(), 
								   "Agente Ordo Realitas", 
								    JOptionPane.PLAIN_MESSAGE);
				break;
			case 1:
				Especialista especialista = new Especialista(NEX, atributos);
				JOptionPane.showMessageDialog(null,especialista.toString(), 
								   "Agente Ordo Realitas", 
								    JOptionPane.PLAIN_MESSAGE);
				break;
			case 2:
				Ocultista ocultista = new Ocultista(NEX, atributos);
				JOptionPane.showMessageDialog(null,ocultista.toString(), 
                                                                   "Agente Ordo Realitas", 
								    JOptionPane.PLAIN_MESSAGE);				
				break;
		}
    }
}
