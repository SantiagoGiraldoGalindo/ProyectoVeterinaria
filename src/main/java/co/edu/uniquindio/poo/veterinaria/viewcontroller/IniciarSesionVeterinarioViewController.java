package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IniciarSesionVeterinarioViewController {

    @FXML
    private TextField TxFnombre;
    @FXML
    private PasswordField PfContrasena;
    @FXML
    private Button BtbIniciar;
    @FXML
    private Button BtnVolver;

    @FXML void OnIniciar(ActionEvent event) {

        String passwordIngresada = PfContrasena.getText();

            if ("Veterinaria123".equals(passwordIngresada)) {
                try {
                    FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/Veterinaria/Veterinario.fxml"));
                    Scene nuevaEscena = new Scene(loader.load());


                    Stage stageActual = (Stage) PfContrasena.getScene().getWindow();
                    stageActual.setScene(nuevaEscena);

                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Contraseña incorrecta");
            }
        }



    public void Onvolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Iniciar.fxml", event);
    }

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
}