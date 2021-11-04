package br.com.allan.projeto.hashMap;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<Carro> stackCarros = new Stack<>();
		
		stackCarros.push(new Carro("ford"));
		stackCarros.push(new Carro("gm"));
		stackCarros.push(new Carro("vw"));
		
		System.out.println(stackCarros);
		System.out.println(stackCarros.pop());
		System.out.println(stackCarros);
		System.out.println(stackCarros.peek());
		System.out.println(stackCarros);
		System.out.println(stackCarros.empty());

		
	}

}
