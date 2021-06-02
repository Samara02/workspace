import javax.swing.JOptionPane;

public class Questão02 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um número"));
		JOptionPane.showMessageDialog(null, "A soma dos números é: "+ x + y);
	}

}
