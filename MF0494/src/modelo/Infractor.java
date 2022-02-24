package modelo;

import java.util.Objects;

public class Infractor {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private int antiguedad;
	private float sancion;
	private int puntos;
	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Infractor other = (Infractor) obj;
		return Objects.equals(dni, other.dni);
	}
	@Override
	public String toString() {
		return "Infractor [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", antiguedad="
				+ antiguedad + ", sancion=" + sancion + ", puntos=" + puntos + "]";
	}
	public Infractor(String dni, String nombre, String apellidos, int antiguedad, float sancion, int puntos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.antiguedad = antiguedad;
		this.sancion = sancion;
		this.puntos = puntos;
	}
	
	
	
	

}
