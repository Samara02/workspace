import javax.swing.JOptionPane;

public class MaiorN�mero {

	public static void main(String[] args) {
		float x = Float.parseFloat(JOptionPane.showInputDialog("Digite um n�mero"));
		float y = Float.parseFloat(JOptionPane.showInputDialog("Digite outro n�mero"));
		
		if (x > y) {
			JOptionPane.showConfirmDialog(null, "O maior n�mero � "+);
		} else if (x < y) {
			JOptionPane.showMessageDialog(null, "O maior n�mero � "+);
		}
	}

}
