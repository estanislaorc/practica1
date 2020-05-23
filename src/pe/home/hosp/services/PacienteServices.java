package pe.home.hosp.services;

import java.util.ArrayList;
import java.util.List;

import pe.home.hosp.dao.PacienteDAO;
import pe.home.hosp.entidad.Paciente;

public class PacienteServices {
	
	public List<Paciente> listarTodosPacientes(){
		
		PacienteDAO pacienteDAO=new PacienteDAO();
		List<Paciente> pacienteList= pacienteDAO.listarPacientes();
		return pacienteList;
	}
	
	public List<Paciente> listarPacienteMayores(){
		PacienteDAO pacienteDAO=new PacienteDAO();
		List<Paciente> pacienteList= pacienteDAO.listarPacientes();
		
		List<Paciente> pacienteMayoresList=new ArrayList<Paciente>();
		
		for(Paciente pac:pacienteList) {
			if(pac.getEdad()>=18) {
				pacienteMayoresList.add(pac);
			}
		}
		return pacienteMayoresList;
	}
	
	public List<Paciente> listarPacienteMayoresAUnaEdad(int edad){
		PacienteDAO pacienteDAO=new PacienteDAO();
		List<Paciente> pacienteList= pacienteDAO.listarPacientes();
		
		List<Paciente> pacienteMayoresList=new ArrayList<Paciente>();
		
		for(Paciente pac:pacienteList) {
			if(pac.getEdad()>edad) {
				pacienteMayoresList.add(pac);
			}
		}
		return pacienteMayoresList;
	}

}
