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
			mensagem = "Não encontrado";
		}
		JOptionPane.showMessageDialog(null, mensagem);
		
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade"));
		if(idade >= 18)   
			JOptionPane.showMessageDialog(null, "OK! Você já pode tirar uma CNH");
		else {
			JOptionPane.showMessageDialog(null, "Desculpe! Você não pode tirar uma CNH");
		}		
}
}
