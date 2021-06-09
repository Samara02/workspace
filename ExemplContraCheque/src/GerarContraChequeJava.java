import javax.swing.JOptionPane;

public class GerarContraChequeJava {

	public static void main(String[] args) {
		
		float valorHora =  10f;
		
		String matrícula = JOptionPane.showInputDialog("Digite a matrícula:");
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		int horas = Integer.parseInt( JOptionPane.showInputDialog("Digite o total de horas trabalhadas:"));
		float minutos = Float.parseFloat(JOptionPane.showInputDialog("Digite o restante dos minutos:"));
		float complementoHoras = minutos / 60;
		
		float salário = (horas * valorHora) + (complementoHoras * valorHora) ;
		
		int diasÚteis = 19;
		int domingosEferiados = 6;
		
		float dsr = (((horas + complementoHoras) / diasÚteis) * domingosEferiados) * valorHora;
		
		float salárioBruto = salário + dsr; 
		
			  salárioBruto = 4000f; 
		
		float valorINSS = 0;
		
		if(salárioBruto <= 1100) {
			valorINSS = salárioBruto * 0.075f;
		} else if (salárioBruto > 1100 && salárioBruto <= 2203.48) { 
			System.out.println(valorINSS);
			valorINSS = ((salárioBruto - 1100) * 0.09f) + 82.5f;
		} else if (salárioBruto >= 2203.49 && salárioBruto <= 3305.22) {
			valorINSS = ((salárioBruto = 2203.48f) * 0.12f) + 181.81f;
		} else if (salárioBruto >= 3305.23 && salárioBruto <= 6433.57) { 
			valorINSS = ((salárioBruto - 3305.22f) * 0.14f) + 314.01f; 
		} else {
			valorINSS = 751.99f - 38.89f;
		}
		
		
		float valorIR = 0;
		
		if (salárioBruto >= 1903.99f && salárioBruto <= 2826.65f) {
			valorIR = (salárioBruto * (7.5f / 100)) - 142.80f;
		} else if (salárioBruto >= 2826.66 && salárioBruto <= 3751.05f) {
			valorIR = (salárioBruto * 0.15f) - 354.80f;
		} else if (salárioBruto >= 3751.06f && salárioBruto <= 4664.68f) {
			valorIR = (salárioBruto * 0.2225f) - 636.13f;
		} else if (salárioBruto > 4664.68f) {
			valorIR = (salárioBruto * 0.275f) - 869.36f;
		}	
		
		float saláriolíquido = salárioBruto - valorINSS - valorIR;
		
		JOptionPane.showMessageDialog(null, 
				      "Contra Cheque" 
				+ "\nMatrícula/Nome: "+matrícula+"/"+nome
				+ "\nSalário Base: "+salário
				+ "\nValor DSR: "+dsr
				+ "\nValor do INSS: "+valorINSS
				+ "\nValor do IR: "+valorIR
		 		+ "\nTotal Bruto: "+salárioBruto 
		 		+ "\nTotal Líquido: "+saláriolíquido);
	}
	
}