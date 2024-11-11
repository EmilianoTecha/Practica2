package Classes;

import java.util.ArrayList;
import java.util.List;

public class Telefono {
    private List<Persona> personas;

    public Telefono() {
        this.personas = new ArrayList<>();
    }

    public void registrarPersona(Persona persona) {
        personas.add(persona);
    }

    public Persona buscarPersona(String nombre) {
        for (Persona persona : personas) {
            if (persona.getNombre().equalsIgnoreCase(nombre)) {
                return persona;
            }
        }
        return null;
    }

    public boolean actualizarPersona(String nombre, long nuevoNumero) {
        Persona persona = buscarPersona(nombre);
        if (persona != null) {
            persona.setNumero(nuevoNumero);
            return true;
        }
        return false;
    }

    public boolean eliminarPersona(String nombre) {
        Persona persona = buscarPersona(nombre);
        if (persona != null) {
            personas.remove(persona);
            return true;
        }
        return false;
    }

    public List<Persona> mostrarPersonas() {
        return personas;
    }
}
