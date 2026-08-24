package Exercicio01;

public class Aniversariante {
	private String nome;
	private DataAniversario dataAniversario;
	
		// Método equals
	@Override 
	public boolean equals(Object obj) { 
	   if (obj instanceof Aniversariante) { 
	       Aniversariante outro = (Aniversariante) obj; 
	       return this.nome.equals(outro.nome) && 
	              this.dataAniversario.equals(outro.dataAniversario); 
	   } 
	   return false; 
	} 
	 	
		// Construtor 1: nome, dia e mês 
	   public Aniversariante(String nome, int dia, int mes) { 
	       this.nome = nome; 
	       this.dataAniversario = new DataAniversario(dia,mes); 
	   }
	 
	   // Construtor 2: nome e objeto DataAniversario 
	   public Aniversariante(String nome, DataAniversario dataAniversario) { 
	       this.nome = nome; 
	       this.dataAniversario = dataAniversario; 
	   }

	   public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	   }

	   public Object getDataAniversario() {
	
		return null;
	   } 

	//gets e sets...

}
