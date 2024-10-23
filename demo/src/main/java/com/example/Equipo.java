package com.example;

import java.util.Vector;

public class Equipo {
	private Object _nombre;
	private Object _deporte;
	private Object _entrenador;
	private Object _deportistas;
	public Vector<Partido> _equipoLocal = new Vector<Partido>();
	public Vector<Deportista> _equipo = new Vector<Deportista>();
	public Vector<Partido> _equipoVisita = new Vector<Partido>();

	public void crearEquipo() {
		throw new UnsupportedOperationException();
	}

	public void asignarDeportista() {
		throw new UnsupportedOperationException();
	}

	public void asignarEntrenador() {
		throw new UnsupportedOperationException();
	}
}