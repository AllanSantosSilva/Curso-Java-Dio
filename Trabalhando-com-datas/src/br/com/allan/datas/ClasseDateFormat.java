package br.com.allan.datas;

import java.text.DateFormat;
import java.util.Date;

public class ClasseDateFormat {
	
	public static void main(String[] args) {
		
		Date agora = new Date();
		
		String dateToStr = DateFormat.getInstance().format(agora);
		
		System.out.println(dateToStr);
		
		dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(agora);
		
		System.out.println(dateToStr);
	}

}
