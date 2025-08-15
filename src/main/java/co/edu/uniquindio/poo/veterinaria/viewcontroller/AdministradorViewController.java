package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class AdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnRVeterinarios;

    @FXML
    private Button btnVeDisponibles;

    @FXML
    void OnRegistrarVeterinarios(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/RegistrarVeterinario.fxml", event);
    }

    @FXML
    void OnVeDisponibles(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/ListaVeterinariosDispo.fxml", event);
    }

    @FXML
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

    @FXML
    void initialize() {
        assert btnRVeterinarios != null : "fx:id=\"btnRVeterinarios\" was not injected: check your FXML file 'Administrador.fxml'.";
        assert btnVeDisponibles != null : "fx:id=\"btnVeDisponibles\" was not injected: check your FXML file 'Administrador.fxml'.";

    }

    public void OnVolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Iniciar.fxml", event);
    }
}
