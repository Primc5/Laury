package tavlat;


import java.io.IOException;

import heteropatriarcado.Dallas;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import spaguetti.Persiona;

public class boyfriendventana1 {

	
	@FXML
	private TableView<Persiona> tablak;

	@FXML
	private TableColumn<Persiona,String> nomcol;
	
	@FXML
	private TableColumn<Persiona,String> apecol;
	
	@FXML
	private TableColumn<Persiona,String> telcol;
	
	@FXML
	private Button nuebot;
	
	@FXML
	private Button edibot;
	
	@FXML
	private Button borbot;
	
	@FXML
	private void initialize(){
		
		System.out.println(dallas + " ini");
	}
	
	@FXML
	public void open(ActionEvent event) {
		if(dallas == null) {
			System.out.println("bad idea");
		}
		else {
			dallas.encender();
		}
	}

	private Dallas dallas;
	
	public void setControlador(Dallas dallas) {
		this.dallas = dallas;
		System.out.println(this.dallas + " set");
	}
}
