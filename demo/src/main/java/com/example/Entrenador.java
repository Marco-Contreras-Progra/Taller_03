package com.example;

public class Entrenador {
	private String nombre; 
    private String experiencia; 
    private String deporteEspecializacion; 
    private Equipo equipo;
	public Equipo _entrenador;

	public Entrenador(String nombre, String experiencia, String deporteEspecializacion, Equipo equipo) {
        this.nombre = nombre;
        this.experiencia = experiencia;
        this.deporteEspecializacion = deporteEspecializacion;
		this.equipo = equipo;
    }

    
    public void asignarEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public String getDeporteEspecializacion() {
        return deporteEspecializacion;
    }


    public Equipo getEquipo() {
        return equipo;
    }

    public String mostrarInformacion() {
        return "Entrenador: " + nombre + "\n" +
               "Experiencia: " + experiencia + " años\n" +
               "Deporte de especialización: " + deporteEspecializacion + "\n" +
               "Equipo: " + (equipo != null ? equipo.getNombre() : "No asignado");
    }
}

