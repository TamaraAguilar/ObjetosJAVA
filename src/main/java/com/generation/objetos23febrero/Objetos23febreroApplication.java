package com.generation.objetos23febrero;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.objetos23febrero.models.Celular;
import com.generation.objetos23febrero.models.Computador;
import com.generation.objetos23febrero.models.Conejo;
import com.generation.objetos23febrero.models.Gato;
import com.generation.objetos23febrero.models.Perro;
import com.generation.objetos23febrero.models.Radio;

@SpringBootApplication
public class Objetos23febreroApplication {
	
	public static String machoHembra (char mh){
		if(mh == 'H'){
			return "hembra";
		}else{
			return "macho";
		}
	}
		

	

	public static void main(String[] args) {
		


	
	
	/*--------------Aquí comenzamos a hacer pruebas con herencia ------------------*/

	// Gato michiVacio = new Gato();
	// Gato michiGordito = new Gato("MichiWatón", "naranjo", "corto", true, 12);

	// System.out.println(michiVacio);
	// System.out.println(michiGordito);

	// Conejo seniorBigotes = new Conejo();
	// Conejo badBunny = new Conejo("Bad Bunny", "Cabeza de león", "suave", true, 10.5);

	// System.out.println("Desde aquí parten los conejos :D");
	// System.out.println(seniorBigotes);
	// System.out.println(badBunny);

	// michiVacio.setNombre("Pelusa");
	// seniorBigotes.setNombre("Señor Bigotes");


	// System.out.println("**************************");
	// System.out.println(michiVacio);
	// System.out.println(seniorBigotes);

	// michiGordito.caminar();

	/*---------------------ACTIVIDAD-------------------------- */


//Clase padre: Registro Equipos
//Clase hijo: celular, computador, radio 
//camara, ram, dimensiones de la pantalla, flash, graba,

	
	Computador computadorVacio = new Computador();
	Celular celularVacio = new Celular();
	Radio radioVacia = new Radio();

	Computador computadorCompleto = new Computador("HP", "E812", "N742842", "tiene teclado", true, true);
	Celular celularCompleto = new Celular("Motorola", "E8493", "N9394", true);
	Radio radioCompleta = new Radio("Genérica", "F8403", "784930", 5.0);

	
	System.out.println("*****************POR DEFAULT*******************");
	System.out.println(computadorVacio);
	System.out.println(celularVacio);
	System.out.println(radioVacia);

	System.out.println("*****************COMPLETOS*********************");
	System.out.println(computadorCompleto);
	System.out.println(celularCompleto);
	System.out.println(radioCompleta);






	}

}


