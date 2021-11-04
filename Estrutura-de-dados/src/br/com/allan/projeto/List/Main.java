package br.com.allan.projeto.List;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, String> aluno = new HashMap<>();
		aluno.put("Nome", "joao");
		aluno.put("idade", "17");
		aluno.put("media", "8.5");
		aluno.put("turma", "3a");
		
		Map<String, String> aluno2 = new HashMap<>();
		aluno2.put("Nome", "maria");
		aluno2.put("idade", "16");
		aluno2.put("media", "8.5");
		aluno2.put("turma", "3a");

		System.out.println(aluno);
		System.out.println(aluno.keySet());	
		System.out.println(aluno.values());
		
		List<Map<String, String>> listaAlunos = new ArrayList<>();
		listaAlunos.add(aluno);
		listaAlunos.add(aluno2);
		
		System.out.println(listaAlunos);



	}

}
