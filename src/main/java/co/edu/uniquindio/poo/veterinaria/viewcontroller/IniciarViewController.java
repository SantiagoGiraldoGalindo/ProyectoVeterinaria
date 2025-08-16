package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IniciarViewController {

   @FXML private Button BtbPropietario;
   @FXML private Button BtbVeterinario;
   @FXML private Button BtbAdministrador;

    /**
     * Boton para acceder a la vista de propietario
     * @param event
     */
   @FXML public void OnPropietario(ActionEvent event) {
      cambiarVista("/co/edu/uniquindio/poo/Veterinaria/IniciarSesionPropietario.fxml", event);
   }

    /**
     * Boton para acceder a la vista de veterinario
     * @param event
     */
   @FXML public void OnVeterinario(ActionEvent event) {
      cambiarVista("/co/edu/uniquindio/poo/Veterinaria/IniciarSesionVeterinario.fxml", event);
   }

    /**
     * Boton para acceder a la vista ed administrador
     * @param event
     */
   @FXML public void OnAdministrador(ActionEvent event) {
      cambiarVista("/co/edu/uniquindio/poo/Veterinaria/IniciarAdministrador.fxml", event);
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
