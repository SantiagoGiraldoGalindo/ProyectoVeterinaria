package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

import java.io.IOException;
import java.net.URL;

import co.edu.uniquindio.poo.veterinaria.model.ConsultaMedica;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import javafx.stage.Stage;

public class HistoriasClinicasViewController {

     @FXML
    private TableColumn<ConsultaMedica, String> TcFecha;

    @FXML
    private TableColumn<ConsultaMedica, String> TcHora;

    @FXML
    private TableColumn<ConsultaMedica, String> TcMascota;

     @FXML
    private TableColumn<ConsultaMedica, String> TcVeterinario;

     @FXML
    private TableColumn<ConsultaMedica, String> TcMotivo;

     @FXML
    private TableColumn<ConsultaMedica, String> TcDiagnostico;

    @FXML
    private TableColumn<ConsultaMedica, String> TcTratamiento;

    @FXML
    private TableView<ConsultaMedica> TvHistorias;

     @FXML
    void initialize() {
        //Configuracion tabla de veterinarios
        TcFecha.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getFecha()));
        TcHora.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getHora()));
        TcMascota.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMascota().getNombre()));
        TcVeterinario.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getVeterinario().getNombre()));
        TcMotivo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMotivoConsulta()));
        TcDiagnostico.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getDiagnostico()));
        TcTratamiento.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getTratamiento()));
       TvHistorias.setItems(ListaData.getInstancia().getListaHistoriaClinica());
    }



    @FXML public void OnVolver(ActionEvent event) {
        cambiarVista("/co/edu/uniquindio/poo/Veterinaria/Veterinario.fxml", event);
    }


    @FXML
    public void cambiarVista(String rutaFXML, ActionEvent event) {
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