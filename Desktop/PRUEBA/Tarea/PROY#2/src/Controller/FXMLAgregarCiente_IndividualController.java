
package Controller;

import Modelo.Individual;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FXMLAgregarCiente_IndividualController implements Initializable {

    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtNombre;
    @FXML
    private TextField txtApellido;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtDireccion;
    @FXML
    private TextField txtDpi;
    
    @FXML
    private Button btnGuardar;
    @FXML
    private Button btnSalir;
    
    private Individual individual;
    private ObservableList<Individual> individuales;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void initAttributtes(ObservableList<Individual> individuales){
        this.individuales = individuales;
    }
    
    public void initAttributtes(ObservableList<Individual> individuales, Individual i){
        this.individuales = individuales;
        this.individual = i;
        this.txtNombre.setText(i.getNombre());
        this.txtApellido.setText(i.getApellido());
        this.txtTelefono.setText(i.getTelefono());
        this.txtDireccion.setText(i.getDireccion());
        this.txtDpi.setText(i.getDpi());
    }
    
    @FXML
    private void Guardar(ActionEvent event) {
        
        //int idCliente = Integer.parseInt(this.txtCodigo.getText());
        String nombre = this.txtNombre.getText();
        String apellido = this.txtApellido.getText();
        String telefono = this.txtTelefono.getText();
        String direccion = this.txtDireccion.getText();
        String dpi = this.txtDpi.getText();
        
        Individual i = new Individual(nombre, apellido, telefono, direccion, dpi);
        
        if(!individuales.contains(i)){
            
           if(this.individual != null){
               this.individual.setNombre(nombre);
               this.individual.setApellido(apellido);
               this.individual.setTelefono(telefono);
               this.individual.setDireccion(direccion);
               this.individual.setDpi(dpi);
           }else{
               this.individual = i;
               Alert alert = new Alert(Alert.AlertType.INFORMATION);
               alert.setHeaderText(null);
               alert.setTitle("Informacion");
               alert.setContentText("Se añadio Correctamente");
               alert.showAndWait();
           }
            
            Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
            stage.close();
        }else{
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Ya existe el Cliente");
            alert.showAndWait();
        }
    }

    @FXML
    private void Salir(ActionEvent event) {
        
        this.individual = null;
        Stage stage = (Stage) this.btnGuardar.getScene().getWindow();
        stage.close();
    }
    
    public Individual getIndividual(){
        return individual;
    }
    
}
