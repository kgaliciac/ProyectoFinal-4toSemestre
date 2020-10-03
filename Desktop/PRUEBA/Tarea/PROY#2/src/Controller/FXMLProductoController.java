
package Controller;

import Modelo.Producto;
import Modelo.SeccionProducto;
import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class FXMLProductoController implements Initializable {

    @FXML
    private TextField txtCodigo;
    @FXML
    private TextField txtSeccion;
    @FXML
    private TextField txtProducto;
    @FXML
    private TextField txtPrecio;
    @FXML
    private TableView<Producto> tblProducto;
    @FXML
    private TableColumn colCodigo;
    @FXML
    private TableColumn colSeccion;
    @FXML
    private TableColumn colProducto;
    @FXML
    private TableColumn colPrecio;
    @FXML
    private Button btnAgregar;
    @FXML
    private Button btnEliminar;

    private ObservableList<Producto> productos;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        productos = FXCollections.observableArrayList();
        
        this.colCodigo.setCellValueFactory(new PropertyValueFactory("Codigo"));
        this.colSeccion.setCellValueFactory(new PropertyValueFactory("Seccion"));
        this.colProducto.setCellValueFactory(new PropertyValueFactory("Producto"));
        this.colPrecio.setCellValueFactory(new PropertyValueFactory("Precio"));
    }    
    
   /* private void AgregarProducto(ActionEvent event){
        
        try{
            int codigo = Integer.parseInt(this.txtCodigo.getText());
            String seccion = this.txtSeccion.getText();
            String producto = this.txtProducto.getText();
            double precio = Integer.parseInt(this.txtPrecio.getText());
            
            Producto p = new Producto(SeccionProducto.Tapones_Auto, producto, precio);
            
            if(!this.productos.contains(p)){
                this.productos.add(p);
                this.tblProducto.setItems(productos);
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Invalido");
                alert.showAndWait();
            }
    }catch (NumberFormatException e){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("F");
        alert.showAndWait();
    }
    }*/

    @FXML
    private void AgregarProducto(javafx.event.ActionEvent event) {
         try{
            int codigo = Integer.parseInt(this.txtCodigo.getText());
            String seccion = this.txtSeccion.getText();
            String producto = this.txtProducto.getText();
            double precio = Integer.parseInt(this.txtPrecio.getText());
            
            Producto p = new Producto(SeccionProducto.Tapones_Auto, producto, precio);
            
            if(!this.productos.contains(p)){
                this.productos.add(p);
                this.tblProducto.setItems(productos);
            }else{
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("Error");
                alert.setContentText("Invalido");
                alert.showAndWait();
            }
    }catch (NumberFormatException e){
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("F");
        alert.showAndWait();
    }
    }
}
