import javax.swing.JOptionPane;

public class Exemplo02 {

	public static void main(String[] args) {
		
		String sexo = JOptionPane.showInputDialog(null, "Digite F ou M para o sexo");
		String mensagem = "";
		
		if (sexo.length() != 1) {
		    mensagem = "Digite apenas um caracter!";
		} else if(sexo.toUpperCase().equals("M")) {
			mensagem = "Masculino";
		} else if(sexo.toUpperCase().equals("F")) {
			mensagem = "Feminino" ;
		} else {
			mensagem = "N�o encontrado";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		if(idade >= 18)   
			JOptionPane.showMessageDialog(null, "OK! Voc� j� pode tirar uma CNH");
		else {
			JOptionPane.showMessageDialog(null, "Desculpe! Voc� n�o pode tirar uma CNH");
		}		
}
}
