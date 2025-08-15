package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import co.edu.uniquindio.poo.veterinaria.model.Especie;
import co.edu.uniquindio.poo.veterinaria.model.Mascota;
import co.edu.uniquindio.poo.veterinaria.model.Propietario;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RegistroMascotaViewController {

    @FXML private TextField TxfNombre;
    @FXML private TextField TxfRaza;
    @FXML private TextField TxfEdad;
    @FXML private ComboBox<Especie> CboxEspecie;
    @FXML private TextField TxfId;
    @FXML private TextArea TaMotivoC;
    public static String textoCompartido;

    @FXML
    public void OnVolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Iniciar.fxml", event);
    }

    @FXML
    public void OnSiguiente(ActionEvent event) {
        try {
            Mascota mascota = new Mascota(
                    TxfNombre.getText(),
                    CboxEspecie.getValue(),
                    TxfRaza.getText(),
                    Integer.parseInt(TxfEdad.getText()),
                    TxfId.getText()
            );


            ListaData.getInstancia().getListaMascotas().add(mascota);
            textoCompartido = TaMotivoC.getText();
            cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Finalregistro.fxml", event);

        } catch (NumberFormatException e) {
            System.err.println("Edad inválida: " + TxfEdad.getText());
        }
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
    public void initialize() {
        CboxEspecie.setItems(FXCollections.observableArrayList(Especie.values()));
    }

    @FXML
    private void OnEspecie() {
        Especie especieSeleccionada = CboxEspecie.getValue();
        System.out.println("Especie seleccionada: " + especieSeleccionada);
    }

    public static String getTextoCompartido() {
        return textoCompartido;
    }

    public static void setTextoCompartido(String textoCompartido) {
        RegistroMascotaViewController.textoCompartido = textoCompartido;
    }
}

