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

import co.edu.uniquindio.poo.veterinaria.model.ConsultaMedica;
import co.edu.uniquindio.poo.veterinaria.model.Mascota;

import co.edu.uniquindio.poo.veterinaria.model.Veterinario;

public class ConsultaMedicaViewController {
@FXML private TextField TxfFecha;
@FXML private TextField TxfHora;
@FXML private TextArea TaMotivoC;
@FXML private TextArea TaDiagnostico;
@FXML private TextArea TaTratamiento;
@FXML private Mascota TaMascota;
@FXML private  Veterinario TaVeterinario;



@FXML private void OnFinalizar(ActionEvent event) {
     ConsultaMedica consultaMedica = new ConsultaMedica(
                TxfFecha.getText(),
                TxfHora.getText(),
                TaMascota= ListaData.getInstancia().getListaMascotas().get(0),
                TaVeterinario= ListaData.getInstancia().getListaVeterinarios().get(0),
                TaMotivoC.getText(),
                TaDiagnostico.getText(),
                TaTratamiento.getText()
        );
        ListaData.getInstancia().agregarHistoriaClinica(consultaMedica);
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/HistoriasClinicas.fxml", event);
}


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
