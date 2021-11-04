package br.com.allan.projeto.Set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		Set<Carro> ListaCarros = new HashSet<>();
		
		ListaCarros.add(new Carro("ford"));
		ListaCarros.add(new Carro("gm"));
		ListaCarros.add(new Carro("vw"));
		
		
		System.out.println(ListaCarros);
		
		System.out.println("----------------------");
		
		Set<Carro> treeCarros = new TreeSet<>();
		treeCarros.add(new Carro("ford"));
		treeCarros.add(new Carro("gm"));
		treeCarros.add(new Carro("vw"));
		
		System.out.println(treeCarros);
		//System.out.println(ListaCarros);
		

		
	}

}
