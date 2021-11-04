package br.com.allan.projeto.listasCirculares;

public class Main {
	
	public static void main(String[] args) {
		
		ListaCircular<String> minhaLista = new ListaCircular<>();
		minhaLista.add("teste1");
		minhaLista.add("teste2");
		minhaLista.add("teste3");
		minhaLista.add("teste4");
		minhaLista.add("teste5");
		
		System.out.println(minhaLista);
		
		minhaLista.remove(0);
		System.out.println(minhaLista);
		
		System.out.println(minhaLista.get(2));
		System.out.println(minhaLista.get(3));
		System.out.println(minhaLista.get(4));
	}

}
