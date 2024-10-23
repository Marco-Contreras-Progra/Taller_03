package com.example;

import java.sql.Date;
import java.util.Vector;

public class Partido {
	private Date fecha; 
    private String hora;
    private Cancha cancha;
    private Equipo equipoLocal; 
    private Equipo equipoVisita; 
    private String resultado; 
	public Equipo _listaPartidos;
	public Vector<Cancha> _unnamed_Cancha_ = new Vector<Cancha>();
	public Equipo _listaPatidos;

	public Partido(Date fecha, String hora, Cancha cancha, Equipo equipoLocal, Equipo equipoVisita) {
        this.fecha = fecha;
        this.hora = hora;
        this.cancha = cancha;
        this.equipoLocal = equipoLocal;
        this.equipoVisita = equipoVisita;
    }

    public void registrarResultado(String resultado) {
        this.resultado = resultado;
    }

	public void historialPorCancha() {
		throw new UnsupportedOperationException();
	}

	public String mostrarInformacion() {
        return "Partido:\n" +
               "Fecha: " + fecha + "\n" +
               "Hora: " + hora + "\n" +
               "Cancha: " + cancha.getNombre() + "\n" +
               "Equipo Local: " + equipoLocal.getNombre() + "\n" +
               "Equipo Visitante: " + equipoVisita.getNombre() + "\n" +
               "Resultado: " + (resultado != null ? resultado : "No registrado");
    }
}