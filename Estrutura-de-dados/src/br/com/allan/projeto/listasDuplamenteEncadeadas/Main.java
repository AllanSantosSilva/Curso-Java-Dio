package br.com.allan.projeto.listasDuplamenteEncadeadas;

public class Main {

	public static void main(String[] args) {
		
		ListaDuplamenteEncadeada<String> minhaLista = new ListaDuplamenteEncadeada<>();
		
		minhaLista.add("teste1");
		minhaLista.add("teste2");
		minhaLista.add("teste3");
		minhaLista.add("teste4");
		minhaLista.add("teste5");
		minhaLista.add("teste6");
		minhaLista.add("teste7");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(3);
		minhaLista.add(3, "99");
		System.out.println(minhaLista);
		System.out.println(minhaLista.get(3));
	}
}
