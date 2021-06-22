import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {

	private String nome;
	private LocalDate nasc;
	private float altura;
	
	// calcular a idade da pessoa
	public int idade() {
		LocalDate hoje = LocalDate.now();
		int idade = hoje.getYear() - nasc.getYear();
		if(nasc.getMonthValue() > hoje.getMonthValue() || 
				(nasc.getMonthValue() == hoje.getMonthValue() && nasc.getDayOfMonth() > hoje.getDayOfMonth())) {
			idade--;
		}
		return idade;
	}
	
	// imprimir todos os dados da pessoa
	public String dados() {
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		return "Nome: "+nome + "\nData de Nascimento: "+nasc + "\nAltura: "+altura + "\nIdade: "+idade();
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getNasc() {
		return nasc;
	}
	
	public void setNasc(LocalDate nasc) {
		this.nasc = nasc;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
}
