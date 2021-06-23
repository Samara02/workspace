package senai.org.br;

import javax.swing.JOptionPane;

public class Desafio02 {

	public static int aleatorio() {
			return (int) Math.random() * 3;
		}
	
	public static void main(String[] args) {
		
			Object[] opcoesjogo = {"Pedra","Papel","Tesoura"};
			Object[] opcaoContinuar = {"Sim","Não"};
			int continuar = 0;
			int v = 0;		
			int e = 0;
			int d = 0;
			
		do {
			int cpu = aleatorio();
			System.out.println(cpu);
			int escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção!", "Jogo", 0,
					JOptionPane.QUESTION_MESSAGE, null, opcoesjogo, opcoesjogo[1]);
			
			String resultado = "";
			
			if ((escolha == 0 && cpu == 2) || (escolha == 1 && cpu == 0) || (escolha == 2 && cpu == 1)) {
				resultado = "Você ganhou!";
				v++;
			} else if (escolha == cpu) {
				resultado = "Empate";
				e++;
			} else {
				resultado = "Você perdeu :(";
				d++;
			}
			
			continuar = JOptionPane.showOptionDialog(null, "Eu(" +opcoesjogo[escolha] + ") X Cpu(" + opcoesjogo[cpu] + ")"
					+ "\nResultado: " + resultado + "\nJogar Novamente?", "Jogo", 0, JOptionPane.QUESTION_MESSAGE, 
					null, opcaoContinuar, opcaoContinuar[0]);
		} while (continuar == 0);
			JOptionPane.showMessageDialog(null, "Placar Final" + "\nVitórias: "+ v + "\nDerrotas: "+ d + "\nEmpates: "+ e);
	}
	
}
