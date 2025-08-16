package co.edu.uniquindio.poo.veterinaria.model;

import java.util.ArrayList;
import java.util.List;

public class Veterinaria {
    private String nombre;
    private String ubicacion;
    private List<Propietario> listPropetiarios;
    private List<Veterinario> listVeterinario;
    private List<ConsultaMedica> listConsultaM;
    /**
     * Constructor de la clase Veterinaria.
     *
     * @param nombre    Nombre de la veterinaria.
     * @param ubicacion Dirección o ubicación física.
     */
    public Veterinaria(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.listPropetiarios = new ArrayList<>();
        this.listVeterinario = new ArrayList<>();
        this.listConsultaM = new ArrayList<>();
    }

    /**
     * Metodo para agragar propietario
     * @param propietario
     */
    public void agregarPropietario(Propietario propietario) {
        this.listPropetiarios.add(propietario);
    }

    /**
     * metodo para agregar veterinario
     * @param veterinario
     */
    public void agregarVeterinario(Veterinario veterinario) {
        this.listVeterinario.add(veterinario);
    }

    /**
     * metodo para agregar consulta medica
     * @param consulta
     */
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

    /**
     * Metodo para obtener un veterinario segun la id
     * @param id
     * @return
     */
    public Veterinario getVeterinarioById(String id){
        for(Veterinario veterinario: this.getListVeterinario()){
            if(id.equals(veterinario.getId())){
                return veterinario;
            }
        }
        return null;
    }

    /**
     * Metodo para obtener una mascota segun la id
     * @param id
     * @return
     */
    public Mascota getMascotaById(String id){
        for(Propietario propietario: this.getListPropetiarios()){
            if(id.equals(propietario.getMascota().getId())){
                return propietario.getMascota();
            }
        }
        return null;
    }
}
