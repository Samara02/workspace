import javax.swing.JOptionPane;

public class GerarContraChequeJava {

	public static void main(String[] args) {
		
		float valorHora =  10f;
		
		String matr�cula = JOptionPane.showInputDialog("Digite a matr�cula:");
		String nome = JOptionPane.showInputDialog("Digite seu nome:");
		int horas = Integer.parseInt( JOptionPane.showInputDialog("Digite o total de horas trabalhadas:"));
		float minutos = Float.parseFloat(JOptionPane.showInputDialog("Digite o restante dos minutos:"));
		float complementoHoras = minutos / 60;
		
		float sal�rio = (horas * valorHora) + (complementoHoras * valorHora) ;
		
		int dias�teis = 19;
		int domingosEferiados = 6;
		
		float dsr = (((horas + complementoHoras) / dias�teis) * domingosEferiados) * valorHora;
		
		float sal�rioBruto = sal�rio + dsr; 
		
			  sal�rioBruto = 4000f; 
		
		float valorINSS = 0;
		
		if(sal�rioBruto <= 1100) {
			valorINSS = sal�rioBruto * 0.075f;
		} else if (sal�rioBruto > 1100 && sal�rioBruto <= 2203.48) { 
			System.out.println(valorINSS);
			valorINSS = ((sal�rioBruto - 1100) * 0.09f) + 82.5f;
		} else if (sal�rioBruto >= 2203.49 && sal�rioBruto <= 3305.22) {
			valorINSS = ((sal�rioBruto = 2203.48f) * 0.12f) + 181.81f;
		} else if (sal�rioBruto >= 3305.23 && sal�rioBruto <= 6433.57) { 
			valorINSS = ((sal�rioBruto - 3305.22f) * 0.14f) + 314.01f; 
		} else {
			valorINSS = 751.99f - 38.89f;
		}
		
		
		float valorIR = 0;
		
		if (sal�rioBruto >= 1903.99f && sal�rioBruto <= 2826.65f) {
			valorIR = (sal�rioBruto * (7.5f / 100)) - 142.80f;
		} else if (sal�rioBruto >= 2826.66 && sal�rioBruto <= 3751.05f) {
			valorIR = (sal�rioBruto * 0.15f) - 354.80f;
		} else if (sal�rioBruto >= 3751.06f && sal�rioBruto <= 4664.68f) {
			valorIR = (sal�rioBruto * 0.2225f) - 636.13f;
		} else if (sal�rioBruto > 4664.68f) {
			valorIR = (sal�rioBruto * 0.275f) - 869.36f;
		}	
		
		float sal�riol�quido = sal�rioBruto - valorINSS - valorIR;
		
		JOptionPane.showMessageDialog(null, 
				      "Contra Cheque" 
				+ "\nMatr�cula/Nome: "+matr�cula+"/"+nome
				+ "\nSal�rio Base: "+sal�rio
				+ "\nValor DSR: "+dsr
				+ "\nValor do INSS: "+valorINSS
				+ "\nValor do IR: "+valorIR
		 		+ "\nTotal Bruto: "+sal�rioBruto 
		 		+ "\nTotal L�quido: "+sal�riol�quido);
	}
	
}