package br.com.allan.datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClasseSimpleDateFormat {
	
	 public static void main(String[] args) {
		
		 Date agora = new Date();
		  SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyyy");
		   String Formatada = sdt.format(agora);
		   
		   System.out.println(Formatada);
		   
		   SimpleDateFormat dataComHora = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss:mmm");
		   String dataComHoraFormatada = dataComHora.format(agora);
		   System.out.println(dataComHoraFormatada);
	}
}
