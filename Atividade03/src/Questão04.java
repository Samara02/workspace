import javax.swing.JOptionPane;

public class Questão04 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da conta"));
		int y = 10; 
		JOptionPane.showMessageDialog(null, "10% do garcom: "+ x % y);
	}
	
}
