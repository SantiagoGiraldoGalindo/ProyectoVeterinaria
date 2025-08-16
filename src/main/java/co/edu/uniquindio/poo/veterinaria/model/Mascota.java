package co.edu.uniquindio.poo.veterinaria.model;

public class Mascota {
    private String nombre;
    private Especie especie;
    private String raza;
    private int edad;
    private String id;
    /**
     * Constructor de la clase Mascota.
     *
     * @param nombre  Nombre de la mascota.
     * @param especie Especie de la mascota.
     * @param raza    Raza de la mascota.
     * @param edad    Edad de la mascota.
     * @param id      Identificador único de la mascota.
     */
    public Mascota(String nombre, Especie especie, String raza, int edad, String id) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.id = id;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
