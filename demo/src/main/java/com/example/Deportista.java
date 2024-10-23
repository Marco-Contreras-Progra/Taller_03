package com.example;
public class Deportista {
	private String nombre;
    private String apellido;
    private String contacto; 
    private String deporteQuePractica;
    private Equipo equipo;
	public Equipo _listaDeportista;

	public Deportista(String nombre, String apellido, String contacto, String deporteQuePractica, Equipo equipo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.contacto = contacto;
		this.deporteQuePractica = deporteQuePractica;
		this.equipo = equipo;
	}

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getContacto() {
        return contacto;
    }

    public String getDeporteQuePractica() {
        return deporteQuePractica;
    }

    public Equipo getEquipo() {
        return equipo;
    }
}



