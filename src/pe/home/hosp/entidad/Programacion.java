package pe.home.hosp.entidad;

public class Programacion {

	private int idProgramacion;
	private Medico medico;
	private String fecha;
	private String horaInicio;
	private String horaFin;
	
	public int getIdProgramacion() {
		return idProgramacion;
	}
	public void setIdProgramacion(int idProgramacion) {
		this.idProgramacion = idProgramacion;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}
	public String getHoraFin() {
		return horaFin;
	}
	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}
	
	
}
