package co.edu.uniquindio.poo.veterinaria.model;

public class Propietario {
    private String nombre;
    private String cedula;
    private String telefono;
    private String direccion;
    private Mascota mascota;
    /**
     * Constructor de la clase Propietario.
     *
     * @param nombre    Nombre completo del propietario.
     * @param cedula    Número de cédula.
     * @param direccion Dirección de residencia.
     * @param telefono  Número de contacto.
     */
    public Propietario(String nombre, String cedula, String direccion, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public Mascota getMascota() { return mascota; }
    public void setMascota(Mascota mascota) { this.mascota = mascota; }
}
