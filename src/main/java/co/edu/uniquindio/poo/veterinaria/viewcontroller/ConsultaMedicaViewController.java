package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ConsultaMedicaViewController {
@FXML private TextField TxfFecha;
@FXML private TextField TxfHora;
@FXML private TextArea TaMotivoC;
@FXML private TextArea TaDiagnostico;
@FXML private TextArea TaTratamiento;

@FXML private void OnFinalizar(ActionEvent event) {}
    @FXML private void OnVolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Veterinario.fxml", event);
    }

    @FXML
    public void initialize() {
        TaMotivoC.setText(RegistroMascotaViewController.textoCompartido);
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
}
