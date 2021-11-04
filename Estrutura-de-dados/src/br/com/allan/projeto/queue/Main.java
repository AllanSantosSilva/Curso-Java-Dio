package br.com.allan.projeto.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {

		Queue<Carro> listaCarros = new LinkedList<>();
		listaCarros.add(new Carro("ford"));
		listaCarros.add(new Carro("gm"));
		listaCarros.add(new Carro("vw"));
		
		System.out.println(listaCarros.add(new Carro("bmw")));
		System.out.println(listaCarros);
		System.out.println(listaCarros.offer(new Carro("renault")));
		System.out.println(listaCarros);
		System.out.println(listaCarros.peek());
		System.out.println(listaCarros);
		System.out.println(listaCarros.poll());
		System.out.println(listaCarros);
		System.out.println(listaCarros.isEmpty());



	}

}
