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
                "Mascota saludable",
                "Patillas"
        );

        veterinaria.agregarConsultaM(consulta);

        assertEquals(1, veterinaria.getListConsultaM().size());
        assertTrue(veterinaria.getListConsultaM().contains(consulta));
    }

    @Test
    void getVeterinarioById() {
        Veterinaria veterinaria = new Veterinaria("Animalitos", "Armenia");
        Veterinario vet1 = new Veterinario("Laura", Especialidad.EspecialidadMamifero, "VET123");
        Veterinario vet2 = new Veterinario("Ana", Especialidad.EspecialidadAves, "VET456");
        veterinaria.agregarVeterinario(vet1);
        veterinaria.agregarVeterinario(vet2);

        Veterinario resultado = veterinaria.getVeterinarioById("VET456");
        assertNotNull(resultado);
        assertEquals("Ana", resultado.getNombre());
        assertEquals(Especialidad.EspecialidadAves, resultado.getEspecialidad());
    }


    @Test
    public void testGetVeterinarioById_NoExiste() {
        Veterinaria veterinaria = new Veterinaria("Animalitos", "Armenia");
        // No hay veterinarios agregados
        assertNull(veterinaria.getVeterinarioById("NOEXISTE"));
    }

    @Test
    public void testGetMascotaById_Existe() {
        Veterinaria veterinaria = new Veterinaria("Animalitos", "Armenia");
        Mascota mascota1 = new Mascota("Firulais", Especie.MAMIFEROS, "Labrador", 5, "M1");
        Mascota mascota2 = new Mascota("Pecas", Especie.AVES, "Periquito", 1, "M2");
        Propietario propietario1 = new Propietario("Pedro", "1111", "Armenia", "3001122");
        propietario1.setMascota(mascota1);
        Propietario propietario2 = new Propietario("Maria", "2222", "Calarcá", "3002233");
        propietario2.setMascota(mascota2);

        veterinaria.agregarPropietario(propietario1);
        veterinaria.agregarPropietario(propietario2);

        Mascota resultado = veterinaria.getMascotaById("M2");
        assertNotNull(resultado);
        assertEquals("Pecas", resultado.getNombre());
        assertEquals(Especie.AVES, resultado.getEspecie());
    }

    @Test
    public void testGetMascotaById_NoExiste() {
        Veterinaria veterinaria = new Veterinaria("Animalitos", "Armenia");
        // Sin propietarios ni mascotas
        assertNull(veterinaria.getMascotaById("M100"));
    }
}