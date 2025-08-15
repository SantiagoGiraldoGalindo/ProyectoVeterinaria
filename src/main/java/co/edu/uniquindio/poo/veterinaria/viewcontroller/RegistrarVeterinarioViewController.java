package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.veterinaria.model.Especialidad;

import co.edu.uniquindio.poo.veterinaria.model.Especie;
import co.edu.uniquindio.poo.veterinaria.model.Veterinario;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RegistrarVeterinarioViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnVolver;

    @FXML
    private ComboBox<Especialidad> comboEspecialidad ;

    @FXML
    private TextField txtId;

    @FXML
    private TextField txtNombre;

    @FXML
    void onGuardar(ActionEvent event) {
        try {
             Veterinario veterinario= new Veterinario(
                    txtNombre.getText(),
                    comboEspecialidad.getValue(),
                    txtId.getText()

            );


            ListaData.getInstancia().getListaVeterinarios().add(veterinario);

            cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Administrador.fxml", event);

        } catch (NumberFormatException e) {
            System.err.println("id inválida: " + txtId.getText());
        }
    }

    @FXML
    void onVolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Administrador.fxml", event);
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
    @FXML
    void initialize() {
        comboEspecialidad.getItems().setAll(Especialidad.values());

    }

    public void OnEspecialidad(ActionEvent actionEvent) {
        Especialidad EspecialidadSeleccionada = comboEspecialidad.getValue();
        System.out.println("Especialidad seleccionada: " + EspecialidadSeleccionada);
    }
}
