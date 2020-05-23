package pe.home.curso;


import java.util.ArrayList;
import java.util.List;

import pe.home.hosp.dao.PacienteDAO;
import pe.home.hosp.entidad.Cita;
import pe.home.hosp.entidad.Medico;
import pe.home.hosp.entidad.Paciente;
import pe.home.hosp.entidad.Programacion;
import pe.home.hosp.services.PacienteServices;

public class Principal {

	public static void main(String[] args) {
		
//		
//		
//		Medico medico1=new Medico();
//		medico1.setNombre("Julio");
//		medico1.setApePaterno("Quispe");
//		medico1.setApePaterno("Prado");
//		medico1.setEspecialidad("Cardiologia");
//		
//		Medico medico2=new Medico();
//		medico2.setNombre("Victor");
//		medico2.setApePaterno("Rivera");
//		medico2.setApePaterno("Pereda");
//		medico2.setEspecialidad("Pediatra");
//		
//		Programacion prg1=new Programacion();
//		prg1.setIdProgramacion(1);
//		prg1.setMedico(medico1);
//		prg1.setFecha("20/05/2020");
//		prg1.setHoraInicio("16:00");
//		prg1.setHoraFin("20:00");
//		
//		Programacion prg2=new Programacion();
//		prg2.setIdProgramacion(2);
//		prg2.setMedico(medico1);
//		prg2.setFecha("21/05/2020");
//		prg2.setHoraInicio("16:00");
//		prg2.setHoraFin("20:00");
//		
//		Programacion prg3=new Programacion();
//		prg3.setIdProgramacion(3);
//		prg3.setMedico(medico2);
//		prg3.setFecha("20/05/2020");
//		prg3.setHoraInicio("16:00");
//		prg3.setHoraFin("20:00");
//		
//		Cita cita1=new Cita();
//		cita1.setIdCita(1);
//		cita1.setPaciente(paciente1);
//		cita1.setProgramacion(prg1);
//		cita1.setHoraAtencion("17:00");
//		
//		Cita cita2=new Cita();
//		cita2.setIdCita(2);
//		cita2.setPaciente(paciente2);
//		cita2.setProgramacion(prg1);
//		cita2.setHoraAtencion("17:30");
//		
//		
//		
//		System.out.println("Paciente: "+ paciente1.getNombre()+ " "+paciente1.getApePaterno());
//		System.out.println("Medico: "+ medico1.getNombre()+ " "+medico1.getApePaterno()+ " esp: "+medico1.getEspecialidad());
//		System.out.println("Programacion: "+prg1.getIdProgramacion()+ " "+ prg1.getMedico().getNombre()+ " "+ prg1.getMedico().getApePaterno()
//				+ " esp: "+ prg1.getMedico().getEspecialidad()+ " "+ prg1.getFecha() + " "+ prg1.getHoraInicio() +" - "+prg1.getHoraFin()
//				 );
//		System.out.println("Paciente :" + cita1.getPaciente().getNombre()+" "+cita1.getPaciente().getApePaterno()+"  médico: "+cita1.getProgramacion().getMedico().getNombre()+" "+cita1.getProgramacion().getMedico().getApePaterno()+" hora de atención: "+cita1.getHoraAtencion() );
//		
//		System.out.println("----------------------------------------------");
//		
		int edad=22;
		
		if(args.length>0) {
			edad=Integer.parseInt(args[0]);
		}
		
		
		
		PacienteServices pacienteServices=new PacienteServices();
		List<Paciente> pacienteList= pacienteServices.listarTodosPacientes();
		List<Paciente> pacienteMayoresList= pacienteServices.listarPacienteMayores();
		List<Paciente> pacienteMayoresAEdadList= pacienteServices.listarPacienteMayoresAUnaEdad(edad);
		
		int i=1;
		for(Paciente pac:pacienteList) {
			System.out.println("Paciente "+i+": "+ pac.getNombre()+ " "+pac.getApePaterno());
			i++;
		}
		
		System.out.println("\n ---------Mayores------------- \n");
		
		i=1;
		for(int j=0;j<pacienteMayoresList.size();j++) {
			System.out.println("Paciente "+i+": "+ pacienteMayoresList.get(j).getNombre()+ " "+pacienteMayoresList.get(j).getApePaterno());
			i++;
		}
		
		System.out.println("\n ---------Mayores de la edad de "+edad +"------------- \n");
		
		i=1;
		for(Paciente pac:pacienteMayoresAEdadList) {
			System.out.println("Paciente "+i+": "+ pac.getNombre()+ " "+pac.getApePaterno());
			i++;
		}
	}

}
