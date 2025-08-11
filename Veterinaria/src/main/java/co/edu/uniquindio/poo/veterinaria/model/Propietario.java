package co.edu.uniquindio.poo.veterinaria.model;

public class Propietario {
    private String nombre;
    private String cedula;
    private String telefono;
    private String dirreccion;
    private Mascota mascota;

    public Propietario (String nombre, String cedula, String telefono, String dirreccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
        this.dirreccion = dirreccion;
        this.mascota = mascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
}
