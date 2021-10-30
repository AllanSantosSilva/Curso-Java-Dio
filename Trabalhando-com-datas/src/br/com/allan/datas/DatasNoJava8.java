package br.com.allan.datas;

import java.time.LocalDate;

public class DatasNoJava8 {
	
	public static void main(String[] args) {
		
		LocalDate agora = LocalDate.now();
		System.out.println(agora);
		
		LocalDate ontem = agora.minusDays(1);
		System.out.println(ontem);
		
		
		
	}

}
