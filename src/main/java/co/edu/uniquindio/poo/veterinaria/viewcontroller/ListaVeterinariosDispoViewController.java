package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.veterinaria.model.Especialidad;
import co.edu.uniquindio.poo.veterinaria.model.Veterinario;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class ListaVeterinariosDispoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableColumn<Veterinario, String> TcEspecialidadV;

    @FXML
    private TableColumn<Veterinario, String> TcIdV;

    @FXML
    private TableColumn<Veterinario, String> TcNombreV;

    @FXML
    private TableView<Veterinario> TvVeterinariosDisopo;


    @FXML
    private Button btnVolverV;

    @FXML
    void initialize() {
        //Configuracion tabla de veterinarios
        TcNombreV.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        TcEspecialidadV.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEspecialidad().toString()));
        TcIdV.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
       TvVeterinariosDisopo.setItems(ListaData.getInstancia().getListaVeterinarios());
    }

    public void OnVolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Administrador.fxml", event);
    }
    private void cambiarVista(String rutaFXML, ActionEvent event) {
        try {
            URL fxmlLocation = getClass().getResource(rutaFXML);
            FXMLLoader loader = new FXMLLoader(fxmlLocation);
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
