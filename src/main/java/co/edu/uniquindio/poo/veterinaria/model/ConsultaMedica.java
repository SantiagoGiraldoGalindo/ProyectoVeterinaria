package co.edu.uniquindio.poo.veterinaria.model;

public class ConsultaMedica {

    private String fecha;
    private String hora;
    private Mascota mascota;
    private Veterinario veterinario;
    private String motivoConsulta;
    private String diagnostico;
    /**
     * Constructor de la clase ConsultaMedica.
     *
     * @param fecha          Fecha de la consulta.
     * @param hora           Hora de la consulta.
     * @param mascota        Mascota atendida.
     * @param veterinario    Veterinario que atiende.
     * @param motivoConsulta Motivo por el cual se realiza la consulta.
     * @param diagnostico    Diagnóstico emitido.
     */
    public ConsultaMedica(String fecha, String hora, Mascota mascota, Veterinario veterinario, String motivoConsulta, String diagnostico) {

        this.fecha = fecha;
        this.hora = hora;
        this.mascota = mascota;
        this.veterinario = veterinario;
        this.motivoConsulta = motivoConsulta;
        this.diagnostico = diagnostico;

    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }
}
