package br.com.allan.projeto.equalsHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		List<Carro> listaCarros = new ArrayList<>();
		listaCarros.add(new Carro("ford"));
		listaCarros.add(new Carro("gm"));
		listaCarros.add(new Carro("vw"));
		
		System.out.println(listaCarros.contains(new Carro("ford")));
		System.out.println(new Carro("ford").hashCode());
		
		Carro carro = new Carro("ford");
		Carro carro1 = new Carro("GM");
		
		System.out.println(carro.equals(carro1));
	}

}
