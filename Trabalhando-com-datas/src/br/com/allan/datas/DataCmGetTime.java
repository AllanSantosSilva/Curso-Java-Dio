package br.com.allan.datas;

import java.util.Calendar;

public class DataCmGetTime {
	
	public static void main(String[] args) {
		
		Calendar agora = Calendar.getInstance();
		
		agora.add(Calendar.DATE, -15);
		System.out.println(agora.getTime());
		
		agora.add(Calendar.MONTH, 4);
		System.out.println(agora.getTime());
		
		agora.add(Calendar.YEAR, 2);
		System.out.println(agora.getTime());
		
	}

}
