import javax.swing.JOptionPane;

public class Quest�o01 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero"));
		++n;
		--n;
		JOptionPane.showMessageDialog(null, "Os n�meros vizinhos s�o: "+ --n + " e "+ ++n);
	}

}
