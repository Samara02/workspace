import javax.swing.JOptionPane;

public class Quest�o03 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite sua primeira nota"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Digite sua segunda nota"));
		JOptionPane.showMessageDialog(null, "A soma das notas �: " + x + y);
	}

}
