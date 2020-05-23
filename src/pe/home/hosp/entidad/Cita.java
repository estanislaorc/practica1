package pe.home.hosp.entidad;

public class Cita {

	private int idCita;
	private Paciente paciente;
	private Programacion programacion;
	private String horaAtencion;
	
	public int getIdCita() {
		return idCita;
	}
	public void setIdCita(int idCita) {
		this.idCita = idCita;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public Programacion getProgramacion() {
		return programacion;
	}
	public void setProgramacion(Programacion programacion) {
		this.programacion = programacion;
	}
	public String getHoraAtencion() {
		return horaAtencion;
	}
	public void setHoraAtencion(String horaAtencion) {
		this.horaAtencion = horaAtencion;
	}
	
	
}
