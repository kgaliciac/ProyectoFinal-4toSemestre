
package Controller;

import Modelo.Individual;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLClientesIndividualController implements Initializable {

    @FXML
    private TableView<Individual> tblClientesIndividuales;
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
    private Button btnAgregar;
    private TextField txtCodigo;
    private TextField txtNombre;
    private TextField txtApellido;
    private TextField txtTelefono;
    private TextField txtDireccion;
    private TextField txtDpi;
    @FXML
    private Button btnModificar;
    @FXML
    private Button btnEliminar;
    
     private ObservableList<Individual> individuales;
     
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        individuales = FXCollections.observableArrayList();
        this.tblClientesIndividuales.setItems(individuales);
        
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("codigo"));
        this.colNombre.setCellValueFactory(new PropertyValueFactory("nombre"));
        this.colApellido.setCellValueFactory(new PropertyValueFactory("apellido"));
        this.colTelefono.setCellValueFactory(new PropertyValueFactory("telefono"));
        this.colDireccion.setCellValueFactory(new PropertyValueFactory("direccion"));
        this.colDpi.setCellValueFactory(new PropertyValueFactory("dpi"));
    }    
   
    @FXML
    private void AgregarIndividual(javafx.event.ActionEvent event) {
        
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/FXMLAgregarCiente_Individual.fxml"));
            
            Parent root = loader.load();
            
            FXMLAgregarCiente_IndividualController controlador = loader.getController();
            controlador.initAttributtes(individuales);
            
            Scene scene = new Scene(root);
            Stage stage = new Stage();
            stage.initModality(Modality.APPLICATION_MODAL);
            stage.setScene(scene);
            stage.showAndWait();
            
            Individual i = controlador.getIndividual();
            if(i != null){
                this.individuales.add(i);
                this.tblClientesIndividuales.refresh();
            }
        } catch (IOException ex) {
            
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText(ex.getMessage());
            alert.showAndWait();
        
        }
    }

    
    @FXML
    private void ModificarIndividual(ActionEvent event) {
        
        Individual i = this.tblClientesIndividuales.getSelectionModel().getSelectedItem();
        
        if(i == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un cliente");
            alert.showAndWait();
        }else{
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vista/FXMLAgregarCiente_Individual.fxml"));
                
                Parent root = loader.load();
                
                FXMLAgregarCiente_IndividualController controlador = loader.getController();
                controlador.initAttributtes(individuales, i);
                
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.initModality(Modality.APPLICATION_MODAL);
                stage.setScene(scene);
                stage.showAndWait();
                
                Individual aux = controlador.getIndividual();
                if(aux != null){
                    this.tblClientesIndividuales.refresh();
                }
            } catch (IOException ex) {
                
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText(ex.getMessage());
                alert.showAndWait();
            }
        }
    }

    
    @FXML
    private void EliminarIndividual(ActionEvent event) {
        
        Individual i = this.tblClientesIndividuales.getSelectionModel().getSelectedItem();
        
        if(i == null){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Error");
            alert.setContentText("Debe seleccionar un cliente");
            alert.showAndWait();
        }else{
            
            this.individuales.remove(i);
            this.tblClientesIndividuales.refresh();
            
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setTitle("Informacion");
            alert.setContentText("Se ha borrado correctamente");
            alert.showAndWait();
        }
    }
}
