import javax.swing.JOptionPane;

public class MaiorNúmero {

	public static void main(String[] args) {
		float x = Float.parseFloat(JOptionPane.showInputDialog("Digite um número"));
		float y = Float.parseFloat(JOptionPane.showInputDialog("Digite outro número"));
		
		if (x > y) {
			JOptionPane.showConfirmDialog(null, "O maior número é "+);
		} else if (x < y) {
			JOptionPane.showMessageDialog(null, "O maior número é "+);
		}
	}

}
