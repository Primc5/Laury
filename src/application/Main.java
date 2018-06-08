package application;

import com.sun.glass.ui.Application;

import heteropatriarcado.Dallas;
import spaguetti.Modelo;
import tavlat.boyfriendventana1;
import tavlat.boyfriendventana2;

public abstract class Main extends Application{

	public static void main(String[] args) {
		Dallas dallas = new Dallas();
		Modelo modelo = new Modelo();
		boyfriendventana1 boyfriendventana1 = new boyfriendventana1();
		boyfriendventana2 boyfriendventana2 = new boyfriendventana2();
		
		dallas.setVista(boyfriendventana1, boyfriendventana2);
		dallas.setModelo(modelo);
		boyfriendventana1.setControlador(dallas);
		boyfriendventana2.setControlador(dallas);
		modelo.setVista(boyfriendventana1, boyfriendventana2);
		
		dallas.on(args);
	}
}
