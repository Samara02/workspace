import javax.swing.JOptionPane;

public class Questão01 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
		++n;
		--n;
		JOptionPane.showMessageDialog(null, "Os números vizinhos são: "+ --n + " e "+ ++n);
	}

}
