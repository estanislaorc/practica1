package pe.home.hosp.entidad;

public class Paciente {
	
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private int edad;
	private boolean asegurado;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApePaterno() {
		return apePaterno;
	}
	public void setApePaterno(String apePaterno) {
		this.apePaterno = apePaterno;
	}
	public String getApeMaterno() {
		return apeMaterno;
	}
	public void setApeMaterno(String apeMaterno) {
		this.apeMaterno = apeMaterno;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isAsegurado() {
		return asegurado;
	}
	public void setAsegurado(boolean asegurado) {
		this.asegurado = asegurado;
	}
	
	
}
