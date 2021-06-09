
public class AlgoritmoCPF {

	public static void main(String[] args) {
		int [] cpf = new int[11];
		cpf [0] = 1;
		cpf [1] = 1;
		cpf [2] = 1;	
		cpf [3] = 4;			
		cpf [4] = 4;	
		cpf [5] = 4;
		cpf [6] = 7;
		cpf [7] = 7;
		cpf [8] = 7;
//		cpf [9] = x;
//      cpf [10] = ;
	 // cpf = 111444777XX

		int p = 0;
		int soma = 0;
		
		for (int i = 10; i >= 2; i--) {
			
			int mult = i * cpf[p];
			soma = soma + mult;		
			System.out.println("i: "+i+" ,p: "+p+" ,cpf: "+cpf[p]+" ,X: "+mult);	
			p++;
			// p = p + 1;
		} 
		
		System.out.println(soma);
		
		int resto = soma%11;
		System.out.println(resto);
		
		if (resto < 2) {
			cpf[9]= 0;
		} else {
			cpf[9] = 11 - resto;
		}	
		
		System.out.println("primeiro digito: "+cpf[9]);
		
		p = 0;
		soma = 0;
		
		for (int i = 11; i >= 2; i--) {
			int mult = i * cpf[p];
			soma = soma + mult;		
			System.out.println("i: "+i+" ,p: "+p+" ,cpf: "+cpf[p]+" ,X: "+mult);	
			p++;			
		
			System.out.println(soma);
			
			if (resto < 2) {
				cpf[10]= 0;
			} else {
				cpf[10] = 11 - resto;
			}
			
        }
    }
}
