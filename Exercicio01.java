package MetodosDeString;

import javax.swing.JOptionPane;

public class Exercicio01 {

	public static void main(String[] args) {

		/*
		 * Substituir Espaços por Traços:
		 * 
		 * Crie um programa que solicite ao usuário que insira uma frase e, em seguida,
		 * substitua todos os espaços em branco por traços (-) na frase. Exiba a frase
		 * resultante.
		 */

		String insiraFrase;

		do {

			insiraFrase = JOptionPane.showInputDialog(null,
					"Insira uma frase, o programa irá remover os espaços e adicionar alguns caracteres ");

			if (insiraFrase == null) {
				JOptionPane.showMessageDialog(null, "ERRO! \nCampo Vazio!");

				break;
			}

			else {

				JOptionPane.showMessageDialog(null, "Frase antes da Modificação = " + " " + insiraFrase);

				insiraFrase = insiraFrase.replace(" ", "-").replace("", "");

				JOptionPane.showMessageDialog(null, "Frase depois da Modificação =  " + " " + insiraFrase);
			}

		} while (insiraFrase != null);

	}

}
