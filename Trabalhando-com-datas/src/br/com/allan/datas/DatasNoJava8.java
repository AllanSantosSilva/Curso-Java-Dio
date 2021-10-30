package br.com.allan.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DatasNoJava8 {

	public static void main(String[] args) {

		LocalDate agora = LocalDate.now();
		System.out.println(agora);

		LocalDate ontem = agora.minusDays(1);
		System.out.println(ontem);

		LocalTime hoje = LocalTime.now();

		System.out.println(hoje);

		LocalTime maisUmaHora = hoje.plusHours(1);

		System.out.println(maisUmaHora);

		LocalDateTime agoraHoje = LocalDateTime.now();
		LocalDateTime futuro = agoraHoje.plusDays(1).plusHours(2);
		System.out.println(futuro);

	}

}
