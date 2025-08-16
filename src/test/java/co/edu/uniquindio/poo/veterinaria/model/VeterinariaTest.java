package co.edu.uniquindio.poo.veterinaria.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class VeterinariaTest {

    @Test
    public void testAgregarPropietario() {
        Veterinaria veterinaria = new Veterinaria("Veterinaria Animalitos", "Armenia");
        Propietario propietario = new Propietario("Juan Pérez", "123456789", "Calle 10", "3115558888");

        veterinaria.agregarPropietario(propietario);

        assertEquals(1, veterinaria.getListPropetiarios().size());
        assertTrue(veterinaria.getListPropetiarios().contains(propietario));
    }

    @Test
    public void testAgregarVeterinario() {
        Veterinaria veterinaria = new Veterinaria("Veterinaria Animalitos", "Armenia");
        Veterinario veterinario = new Veterinario("Laura Gómez", Especialidad.EspecialidadMamifero, "VET001");

        veterinaria.agregarVeterinario(veterinario);

        assertEquals(1, veterinaria.getListVeterinario().size());
        assertTrue(veterinaria.getListVeterinario().contains(veterinario));
    }

    @Test
    public void testAgregarConsultaM() {
        Veterinaria veterinaria = new Veterinaria("Veterinaria Animalitos", "Armenia");

        Mascota mascota = new Mascota("Firulais", Especie.MAMIFEROS, "Pastor Alemán", 5, "MASC001");
        Veterinario veterinario = new Veterinario("Laura Gómez", Especialidad.EspecialidadMamifero, "VET001");
        ConsultaMedica consulta = new ConsultaMedica(
                "2025-08-15",
                "10:00 AM",
                mascota,
                veterinario,
                "Revisión general",
                "Mascota saludable"
        );

        veterinaria.agregarConsultaM(consulta);

        assertEquals(1, veterinaria.getListConsultaM().size());
        assertTrue(veterinaria.getListConsultaM().contains(consulta));
    }
}