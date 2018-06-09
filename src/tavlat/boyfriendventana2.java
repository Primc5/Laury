package tavlat;


import java.io.IOException;


import heteropatriarcado.Dallas;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class boyfriendventana2 {
	
	private Dallas dallas;
	
	public void setControlador(Dallas dallas) {
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
		System.out.println("on");
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
		dallas.off();
	}

	
	
	

}
