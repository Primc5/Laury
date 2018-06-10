package Vista;

import javafx.scene.control.TextField;
import Controlodor.Controlador;
import javafx.fxml.FXML;

import javafx.scene.control.Button;


public class boyfriendventana2 {
	
	private Controlador dallas;
	
	public void setControlador(Controlador dallas) {
		this.dallas = dallas;
		
	}
	
	@FXML
	private Button aceptv2;
	
	@FXML
	private Button cancelv2;
	
	@FXML
	private TextField nomtxt;
	
	@FXML
	private TextField apetxt;

	@FXML
	private TextField teltxt;
	
	@FXML
	private void initialize(){

	}
	
	@FXML
	public void anadir() {
		String t1 = nomtxt.getText();
		String t2 = apetxt.getText();
		String t3 = teltxt.getText();
		System.out.println(nomtxt);
		if(t1 != null && t2 != null && t3 != null) {
			boyfriendventana1.anadido(t1, t2, t3);
			dallas.off();
			
		}
	}
	
	private boyfriendventana1 boyfriendventana1;
	public void setBoyfriend1(boyfriendventana1 boyfriendventana1) {
		this.boyfriendventana1 = boyfriendventana1;	
	}
	
	@FXML
	public void salir() {
		boyfriendventana1.recolocar();
		dallas.off();
	}
/*
	public void cargarweas(String t1, String t2, String t3) {
		System.out.println(nomtxt);
		
		System.out.println(t1);
		nomtxt.setText(t1);
		apetxt.setText(t2);
		teltxt.setText(t3);
	}*/

}