package co.edu.uniquindio.poo.veterinaria.viewcontroller;

import co.edu.uniquindio.poo.veterinaria.model.Mascota;
import co.edu.uniquindio.poo.veterinaria.model.Propietario;
import co.edu.uniquindio.poo.veterinaria.model.Veterinario;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class ListaData {


    private static ListaData instancia;


    private final ObservableList<Propietario> listaPropietarios;



    private ListaData() {
        listaPropietarios = FXCollections.observableArrayList();
    }


    public static ListaData getInstancia() {
        if (instancia == null) {
            instancia = new ListaData();
        }
        return instancia;
    }



    public void agregarPropietario(Propietario propietario) {
        listaPropietarios.add(propietario);
    }


    public ObservableList<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }
    private ObservableList<Mascota> listaMascotas = FXCollections.observableArrayList();


    public ObservableList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void agregarMascota(Mascota mascota) {
        listaMascotas.add(mascota);
    }

    public ObservableList<Veterinario> listaVeterinarios = FXCollections.observableArrayList();

    public ObservableList<Veterinario> getListaVeterinarios() {
        return listaVeterinarios;
    }

    public void agregarVeterinario(Veterinario veterinario) {
        listaVeterinarios.add(veterinario);
    }
}
