package co.edu.uniquindio.poo.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String ubicacion;
    private List<Propietario> listPropetiarios;
    private List<Veterinario> listVeterinario;
    private List<ConsultaMedica> listConsultaM;

    public Veterinaria(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listPropetiarios = new ArrayList<>();
        this.listVeterinario = new ArrayList<>();
        this.listConsultaM = new ArrayList<>();
    }

    public void agregarPropietario(Propietario propietario) {
        this.listPropetiarios.add(propietario);
    }
    public void agregarVeterinario(Veterinario veterinario) {
        this.listVeterinario.add(veterinario);
    }
    public void agregarConsultaM(ConsultaMedica consulta) {
        this.listConsultaM.add(consulta);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Propietario> getListPropetiarios() {
        return listPropetiarios;
    }

    public void setListPropetiarios(List<Propietario> listPropetiarios) {
        this.listPropetiarios = listPropetiarios;
    }

    public List<Veterinario> getListVeterinario() {
        return listVeterinario;
    }

    public void setListVeterinario(List<Veterinario> listVeterinario) {
        this.listVeterinario = listVeterinario;
    }

    public List<ConsultaMedica> getListConsultaM() {
        return listConsultaM;
    }

    public void setListConsultaM(List<ConsultaMedica> listConsultaM) {
        this.listConsultaM = listConsultaM;
    }
}
