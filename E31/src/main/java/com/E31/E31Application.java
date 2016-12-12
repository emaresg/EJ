package com.E31;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class E31Application {

	public static String metodoE31(){
		String c="Es el informe";
		for(int i=1; i <= 20; i++ ) {
			System.out.println(c+" "+i);
		}
		return null;  // metodo no devuelve nada
		//si fuera public static void metodoE31() se puede poner return;
		}
	
	
	public static void main(String[] args) {
		SpringApplication.run(E31Application.class, args);
		System.out.println("hola");
		metodoE31();
	}
}
