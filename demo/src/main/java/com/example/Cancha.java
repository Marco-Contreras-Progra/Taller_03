package com.example;

public class Cancha {
	private String nombre; 
    private String ubicacion; 
    private int capacidad; 
    private String superficie;
    private String deporte; 
    private boolean disponible; 
	public Partido _unnamed_Partido_;

	public Cancha(String nombre, String ubicacion, int capacidad, String superficie, String deporte) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidad = capacidad;
        this.superficie = superficie;
        this.deporte = deporte;
        this.disponible = true;
	}

	public void crearCancha() {
		throw new UnsupportedOperationException();
	}

	public boolean verDisponibilidad() {
        return disponible; 
    }

    public void reservar() {
        if (disponible) {
            disponible = false;
        } else {
            throw new IllegalStateException("La cancha ya está reservada.");
        }
    }
	public String getNombre() {
        return nombre;
    }
	public String getUbicacion() {
        return ubicacion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getSuperficie() {
        return superficie;
    }

    public String getDeporte() {
        return deporte;
    }

	public String mostrarInformacion() {
        return "Cancha: " + nombre + "\n" +
               "Ubicación: " + ubicacion + "\n" +
               "Capacidad: " + capacidad + "\n" +
               "Superficie: " + superficie + "\n" +
               "Deporte: " + deporte + "\n" +
               "Disponibilidad: " + (disponible ? "Disponible" : "No disponible");
    }
}
