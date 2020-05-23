package pe.home.hosp.dao;

import java.util.ArrayList;
import java.util.List;
import pe.home.hosp.entidad.Paciente;

public class PacienteDAO {


	public List<Paciente> listarPacientes(){
		Paciente paciente1=new Paciente();
		paciente1.setNombre("Luis");
		paciente1.setApePaterno("Herrera");
		paciente1.setApePaterno("Perez");
		paciente1.setEdad(34);
		paciente1.setAsegurado(true);
		
		Paciente paciente2=new Paciente();
		paciente2.setNombre("Diego");
		paciente2.setApePaterno("Quiroz");
		paciente2.setApePaterno("Ulloa");
		paciente2.setEdad(12);
		paciente2.setAsegurado(false);
		
		Paciente paciente3=new Paciente();
		paciente3.setNombre("Luisx");
		paciente3.setApePaterno("Herrerax");
		paciente3.setApePaterno("Perezx");
		paciente3.setEdad(8);
		paciente3.setAsegurado(true);
		
		Paciente paciente4=new Paciente();
		paciente4.setNombre("Diegoy");
		paciente4.setApePaterno("Quirozy");
		paciente4.setApePaterno("Ulloay");
		paciente4.setEdad(67);
		paciente4.setAsegurado(false);
		
		List<Paciente> pacienteList=new ArrayList<Paciente>();
		pacienteList.add(paciente1);
		pacienteList.add(paciente2);
		pacienteList.add(paciente3);
		pacienteList.add(paciente4);
		
		return pacienteList;
	}
	
	public void insertarPaciente(Paciente paciente) {
		
		
	}
	
	public void actualizarPaciente(Paciente paciente) {
		
		
	}
	
	public void eliminarPaciente(int idPaciente) {
		
		
	}
	
	
	
}
