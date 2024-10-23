package com.example;

import java.util.Vector;

public class Equipo {
	private String nombre;
    private String deporte; 
    private Entrenador entrenador; 
    private Vector<Deportista> deportistas;
	public Vector<Partido> _equipoLocal = new Vector<Partido>();
	public Vector<Deportista> _equipo = new Vector<Deportista>();
	public Vector<Partido> _equipoVisita = new Vector<Partido>();

	public Equipo(String nombre, String deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.deportistas = new Vector<Deportista>();
    }
	public void crearEquipo(String nombre, String deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
    }

    public boolean asignarDeportista(Deportista deportista) {
        if (!deportistas.contains(deportista)) {
            deportistas.add(deportista);
            return true; 
        }
        return false; 
    }

	public void asignarEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

	public String getNombre() {
        return nombre;
    }

    public String getDeporte() {
        return deporte;
    }


    public Entrenador getEntrenador() {
        return entrenador;
    }


    public Vector<Deportista> getDeportistas() {
        return deportistas;
    }

    public String mostrarInformacion() {
        StringBuilder info = new StringBuilder("Equipo: " + nombre + "\n" +
                                                "Deporte: " + deporte + "\n" +
                                                "Entrenador: " + (entrenador != null ? entrenador.getNombre() : "No asignado") + "\n" +
                                                "Deportistas:\n");
        for (Deportista d : deportistas) {
            info.append("- ").append(d.getNombreCompleto()).append("\n");
        }
        return info.toString();
    }
}
