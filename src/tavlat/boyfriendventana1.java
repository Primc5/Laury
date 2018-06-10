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
		punterico = 0;
	}
	public static void anadido(String t1, String t2, String t3) {
		dato.add(new Persiona(t1, t2, t3));		

	}
	private int punterico;
	
	@FXML
	public void clikeao() {
		punterico = 1;
	}
	
	@FXML
	public void hakai() {
		if(punterico == 1) {
			System.out.println("lo intenta");
			dato.remove(tablak.getSelectionModel().getFocusedIndex());
			punterico = 0;
		}
		else {
        	Alert alert = new Alert(AlertType.ERROR);
        	alert.setTitle("DEUS VUTL");
        	alert.setHeaderText("Error");
        	alert.setContentText("Ninguna columna seleccionada");
 	   
        	alert.showAndWait();
		}
	}
	
	private static Persiona almacen;
	@FXML
	public void editar() {
		if(punterico == 1) {
			dallas.encender();
			Persiona aol = tablak.getSelectionModel().getSelectedItem();
			almacen = tablak.getSelectionModel().getSelectedItem();
			dato.remove(tablak.getSelectionModel().getFocusedIndex());
			//dallas.editar(aol);
			punterico = 0;

		}
		else {
	       	Alert alert = new Alert(AlertType.ERROR);
	       	alert.setTitle("DEUS VUTL");
	       	alert.setHeaderText("Error");
	       	alert.setContentText("Ninguna columna seleccionada");
	 	  
	       	alert.showAndWait();
		}
	}

	public static void recolocar() {
		dato.add(almacen);
		almacen = null;
	}

	private boyfriendventana2 boyfriendventana2;
	public void setBoyfriend2(boyfriendventana2 boyfriendventana2) {
		this.boyfriendventana2 = boyfriendventana2;
		
	}
}
