

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.example.Deportista;
import com.example.Entrenador;
import com.example.Equipo;

public class TestGestionClubDeportivo {
        private Deportista deportista;
        private Entrenador entrenador;
        private Equipo equipo;
    
        @BeforeEach
        public void setUp() {
            deportista = new Deportista("Marco", "Contreras", "123456789", "Fútbol", null);
            entrenador = new Entrenador("María", "5 años", "Fútbol", null);
            Equipo equipo = new Equipo("Los Gladiadores", "Fútbol", );
        }

      @Test
    public void testRegistrarDeportista() {
        assertNotNull(deportista);
        assertEquals("Marco", deportista.getNombre());
        assertEquals("Contreras", deportista.getApellido());
        assertEquals("123456789", deportista.getContacto());
        assertEquals("Fútbol", deportista.getDeporteQuePractica());
        assertNull(deportista.getEquipo());
    }
    @Test
    public void testRegistrarEntrenador(){
        assertNotNull(entrenador);
        assertEquals("María", entrenador.getNombre());
        assertEquals("5 años", entrenador.getExperiencia());
        assertEquals("Fútbol", entrenador.getDeporteEspecializacion());
        assertNull(entrenador.getEquipo());
    }

}
    

