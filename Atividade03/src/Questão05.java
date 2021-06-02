import javax.swing.JOptionPane;

public class Questão05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = Integer.parseInt(JOptionPane.showInputDialog("Qtd de horas trabalhadas"));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Valor da hora"));
		JOptionPane.showMessageDialog(null, "O salário é: " + x * y);
	}

}
