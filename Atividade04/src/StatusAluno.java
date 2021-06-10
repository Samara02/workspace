import javax.swing.JOptionPane;

public class StatusAluno {

	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome completo do aluno");
		float nota = Float.parseFloat(JOptionPane.showInputDialog("Digite a nota final"));
		
		if (nota >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado!");
		} else if (nota < 7 && nota > 4) {
			JOptionPane.showMessageDialog(null, "Recuperação :/");
		} else if (nota < 4) {
			JOptionPane.showMessageDialog(null, "Reprovado :(");
		} 
}
}