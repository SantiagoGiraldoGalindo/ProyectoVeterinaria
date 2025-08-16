package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import co.edu.uniquindio.poo.veterinaria.model.Mascota;
import co.edu.uniquindio.poo.veterinaria.model.Propietario;
import co.edu.uniquindio.poo.veterinaria.model.Veterinario;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class VeterinarioViewController implements Initializable {

    @FXML
    private TableView<Propietario> TvListaPaciente;
    @FXML
    private TableColumn<Propietario, String> TcNombre;
    @FXML
    private TableColumn<Propietario, String> TcCedula;
    @FXML
    private TableColumn<Propietario, String> TcDireccion;
    @FXML
    private TableColumn<Propietario, String> TcTelefono;

    @FXML
    private TableView<Mascota> TvListaMascota;
    @FXML
    private TableColumn<Mascota, String> TcNombreM;
    @FXML
    private TableColumn<Mascota, String> TcRaza;
    @FXML
    private TableColumn<Mascota, String> TcEdad;
    @FXML
    private TableColumn<Mascota, String> TcEspecie;
    @FXML private TableColumn<Mascota, String> TcId;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Configuración tabla de propietarios
        TcNombre.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        TcCedula.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCedula()));
        TcDireccion.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDireccion()));
        TcTelefono.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));

        // Configuración tabla de mascotas
        TcNombreM.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
        TcRaza.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getRaza()));
        TcEdad.setCellValueFactory(cellData -> new SimpleStringProperty(String.valueOf(cellData.getValue().getEdad())));
        TcEspecie.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getEspecie().toString()));
        TcId.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getId()));
        // Cargar listas desde el Singleton
        TvListaPaciente.setItems(ListaData.getInstancia().getListaPropietarios());
        TvListaMascota.setItems(ListaData.getInstancia().getListaMascotas());
    }

    public TableColumn<Propietario, String> getTcNombre() {
    return TcNombre;
}

    @FXML
    private void OnVolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Iniciar.fxml", event);
    }

    private void cambiarVista(String rutaFXML, ActionEvent event) {
        try {
            URL fxmlLocation = getClass().getResource(rutaFXML);
            if (fxmlLocation == null) {
                System.err.println("No se encontró el archivo FXML en la ruta: " + rutaFXML);
                return;
            }
            FXMLLoader loader = new FXMLLoader(fxmlLocation);
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void OnLimpiar(ActionEvent event) {
        TvListaPaciente.getItems().clear();
        TvListaMascota.getItems().clear();
    }



    @FXML
    private void OnSeleccionar(ActionEvent event) {
        Propietario seleccionado = TvListaPaciente.getSelectionModel().getSelectedItem();
        if (seleccionado != null) {
            System.out.println("Propietario seleccionado: " + seleccionado.getNombre());
        }
        Mascota seleccionada = TvListaMascota.getSelectionModel().getSelectedItem();
        if (seleccionada != null) {
            System.out.println("Mascota seleccionada: " + seleccionada.getNombre());
        }
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/ConsultaMedica.fxml" , event);
    }


}
