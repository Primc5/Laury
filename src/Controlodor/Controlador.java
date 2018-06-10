package Controlodor;

import java.io.IOException;

import Modelo.Modelo;
import Modelo.Persiona;
import Vista.boyfriendventana1;
import Vista.boyfriendventana2;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;


public class Controlador extends Application {

	private Stage primaryStage;
	private AnchorPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		try {
			
			this.primaryStage = primaryStage;
			this.primaryStage.setTitle("Agender");

			 // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Controlador.class.getResource("/Vista/ventana1.fxml"));
            rootLayout = (AnchorPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            
            primaryStage.show();
            

           } catch(Exception e) {
			e.printStackTrace();
		}
	}

	private static Stage ventana = new Stage();
	public static void encender() {
		 try {
			FXMLLoader loader = new FXMLLoader(Controlador.class.getResource("/Vista/ventana2.fxml"));
		    AnchorPane ventanaDos = (AnchorPane) loader.load();
		    
		    ventana.setTitle("Venta Dos");
		    Scene scene = new Scene(ventanaDos);
	        ventana.setScene(scene);
	        ventana.show();
        
		 }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private boyfriendventana1 boyfriendventana1;
	private static boyfriendventana2 boyfriendventana2;

	public void setVista(boyfriendventana1 boyfriendventana1, boyfriendventana2 boyfriendventana2) {
		this.boyfriendventana1 = boyfriendventana1;
		this.boyfriendventana2 = boyfriendventana2;
		
	}

	private Modelo modelo;
	public void setModelo(Modelo modelo) {
		
		this.modelo = modelo;
		
	}
	public static void main(String[] args) {
		set();
		launch(args);
	}
	
	public static void set() {
		Controlador dallas = new Controlador();
		Modelo modelo = new Modelo();
		boyfriendventana1 boyfriendventana1 = new boyfriendventana1();
		boyfriendventana2 boyfriendventana2 = new boyfriendventana2();
		
		dallas.setVista(boyfriendventana1, boyfriendventana2);
		dallas.setModelo(modelo);
		boyfriendventana1.setControlador(dallas);
		boyfriendventana2.setControlador(dallas);
		modelo.setVista(boyfriendventana1, boyfriendventana2);
		boyfriendventana2.setBoyfriend1(boyfriendventana1);
		boyfriendventana1.setBoyfriend2(boyfriendventana2);
				
	}
	
	public static void off() {
		ventana.hide();
	}
	

	/*public static void editar(Persiona aol) {
		
		boyfriendventana2.cargarweas(aol.getNombre(), aol.getApellido(), aol.getTelefono());
		
	}*/
}
