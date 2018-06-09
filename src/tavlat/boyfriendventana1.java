package tavlat;


import java.io.IOException;


import heteropatriarcado.Dallas;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import spaguetti.Persiona;

public class boyfriendventana1 {
	
	private Dallas dallas;
	
	public void setControlador(Dallas dallas) {
		this.dallas = dallas;
	}
	
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
	
	private final static ObservableList<Persiona> dato = FXCollections.observableArrayList(
			new Persiona("Lucas", "Pajares", "94342"),
			new Persiona("Sebas", "Tangarife", "255434"));
	
	@FXML
	private void initialize(){
		tablak.setItems(this.dato);
		nomcol.setCellValueFactory(new PropertyValueFactory<Persiona,String>("nombre"));
		apecol.setCellValueFactory(new PropertyValueFactory<Persiona,String>("apellido"));
		telcol.setCellValueFactory(new PropertyValueFactory<Persiona,String>("telefono"));
	}
	

	
	@FXML
	public void open(ActionEvent event) {
		dallas.encender();
	}
	public static void anadido(String t1, String t2, String t3) {
		dato.add(new Persiona(t1, t2, t3));		
	}
	
	@FXML
	public void hakai() {

		if(tablak.getSelectionModel().getFocusedIndex() > 0) {
			dato.remove(tablak.getSelectionModel().getFocusedIndex());
		}
		else {
        	Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("DEUS VUTL");
        	alert.setHeaderText("Error");
        	alert.setContentText("Ninguna columna seleccionada");
 	   
        	alert.showAndWait();
		}
	}
	
	
	@FXML
	public void editar() {
		if(tablak.getSelectionModel().getFocusedIndex() != 0) {
			dallas.encender();
			Persiona aol = tablak.getSelectionModel().getSelectedItem();
			dato.remove(tablak.getSelectionModel().getFocusedIndex());
			dallas.editar(aol);
		}
		else {
	       	Alert alert = new Alert(AlertType.ERROR);
	       	alert.setTitle("DEUS VUTL");
	       	alert.setHeaderText("Error");
	       	alert.setContentText("Ninguna columna seleccionada");
	 	  
	       	alert.showAndWait();
		}
	}
}
