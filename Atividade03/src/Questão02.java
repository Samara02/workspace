import javax.swing.JOptionPane;

public class Quest�o02 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite mais um n�mero"));
		JOptionPane.showMessageDialog(null, "A soma dos n�meros �: "+ x + y);
	}

}
