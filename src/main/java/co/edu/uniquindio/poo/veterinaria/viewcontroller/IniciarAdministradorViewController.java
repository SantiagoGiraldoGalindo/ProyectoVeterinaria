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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


import javafx.scene.control.PasswordField;

public class IniciarAdministradorViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField PscontrasenaAdmin;

    @FXML
    private TextField TxF_UsuarioAdmin;

    @FXML
    private Button btn_VolverAdmin;

    @FXML
    private Button btn_iniciaraAdmin;

    @FXML
    void OnIniciarSeAdmin(ActionEvent event) {
        String passwordIngresada =PscontrasenaAdmin.getText();

        if ("Admin1234".equals(passwordIngresada)) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/Veterinaria/Administrador.fxml"));
                Scene nuevaEscena = new Scene(loader.load());


                Stage stageActual = (Stage) PscontrasenaAdmin.getScene().getWindow();
                stageActual.setScene(nuevaEscena);

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Contraseña incorrecta");
        }
    }




    public void OnVolverAdmin(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Iniciar.fxml", event);
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