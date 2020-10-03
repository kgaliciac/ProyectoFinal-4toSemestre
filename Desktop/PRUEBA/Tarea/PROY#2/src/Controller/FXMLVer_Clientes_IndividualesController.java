
package Controller;

import Modelo.Individual;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLVer_Clientes_IndividualesController implements Initializable {

    @FXML
    private TableColumn colCodigo;
    @FXML
    private TableColumn colNombre;
    @FXML
    private TableColumn colApellido;
    @FXML
    private TableColumn colTelefono;
    @FXML
    private TableColumn colDireccion;
    @FXML
    private TableColumn colDpi;
    @FXML
    private Button btnRegresar;
    @FXML
    private TableView<Individual> tblIndividual;
    
    private ObservableList<Individual> individual = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        individual = FXCollections.observableArrayList();
        this.colCodigo.setCellFactory(new PropertyValueFactory("Codigo"));
        this.colNombre.setCellFactory(new PropertyValueFactory("Nombre"));
        this.colApellido.setCellFactory(new PropertyValueFactory("Apellido"));
        this.colTelefono.setCellFactory(new PropertyValueFactory("Telefono"));
        this.colDireccion.setCellFactory(new PropertyValueFactory("Direccion"));
        this.colDpi.setCellFactory(new PropertyValueFactory("Dpi"));
        
    }    

    @FXML
    private void Regresar(ActionEvent event) {
        
        /*try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
			Parent layout = (Pane) FXMLLoader.load(getClass().getResource("/view/Menu.fxml"));

			ControladorMenu controlador = fxmlLoader.getController();

			Scene scene = new Scene(layout, 800, 600);

			Stage stage = new Stage();
			stage.setScene(scene);
			stage.show();

		} catch (Exception e) {
			// TODO: handle exception
		}*/
    }
    
}
