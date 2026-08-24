package Exercicio01;

import java.util.ArrayList;

//Classe concreta MinhaAgendaDeAniversarios 
 
public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios { 
 
   private ArrayList<Aniversariante> listaAniversariantes; 
 
   public MinhaAgendaDeAniversarios() { 
       this.listaAniversariantes = new ArrayList<>(); 
   } 
 
   @Override 
   public void adicionarAniversariante(String nome, int dia, int mes) { 
       listaAniversariantes.add(new Aniversariante(nome, dia, mes)); 
   } 
 
   @Override 
   public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) { 
       ArrayList<String> aniversariantesDoDia = new ArrayList<>(); 
       DataAniversario data = new DataAniversario(dia, mes); 
 
       for (Aniversariante a : listaAniversariantes) { 
           if (a.getDataAniversario().equals(data)) { 
               aniversariantesDoDia.add((String)a.getNome()); 
           } 
       } 
       return aniversariantesDoDia; 
   } 
 
   @Override 
   public void removerAniversariante(String nomeAniversariante) { 
       listaAniversariantes.removeIf(a -> a.getNome().equals(nomeAniversariante)); 
   } 
} 
 

public interface AgendaDeAniversarios {

	//adiciona um novo aniversariante
		public void adicionarAniversariante(String nome, int dia, int mes);

		// retorna uma lista contendo os nomes dos aniversariantes do dia e mês passados como parâmetros
		public ArrayList <String> obterAniversariantesDoDia(int dia, int mes);

		// remove o(s) aniversariante(s) que tenham como nome o valor passado como parâmetro para o método
		public void removerAniversariante(String nomeAniversariante);
}

