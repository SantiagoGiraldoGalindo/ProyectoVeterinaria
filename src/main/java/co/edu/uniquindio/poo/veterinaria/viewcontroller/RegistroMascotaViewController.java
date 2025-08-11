package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import co.edu.uniquindio.poo.veterinaria.model.Especie;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RegistroMascotaViewController {

    @FXML private TextField TxfNombre ;
    @FXML private TextField TxfRaza ;
    @FXML private TextField TxfEdad ;
    @FXML private ComboBox <Especie> CboxEspecie ;

    @FXML
    public void OnVolver(ActionEvent event) {
    cambiarVista("/co/edu/uniquindio/poo/Veterinaria/IniciarSesionPropietario.fxml", event);}

    @FXML public void OnSiguiente(ActionEvent event) {}

    @FXML
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
    public void initialize() {
        CboxEspecie.setItems(FXCollections.observableArrayList(Especie.values()));
    }
    @FXML
    private void OnEspecie() {

        Especie especieSeleccionado = CboxEspecie.getValue();

        System.out.println("Género seleccionado: " + especieSeleccionado);


    }

}
