package ar.edu.unju.edm.service.imp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.repository.HabitacionRepository;
import ar.edu.unju.edm.service.HabitacionService;

@Service
public class ImpHabitacionService implements HabitacionService {

	//traemos una Habitacion
	@Autowired
	Habitacion unaHabitacionService; 
	@Autowired
	HabitacionRepository habitacionRepository; 
	

	@Override
	public void cargarHabitacion(Habitacion unaHabitacion) {
		// TODO Auto-generated method stub
		unaHabitacion.setEstado(true);
		habitacionRepository.save(unaHabitacion); 
	}

	@Override
	public void eliminarHabitacion(Integer codigo) {
		// TODO Auto-generated method stub
		Optional<Habitacion> aux = Optional.of(new Habitacion()); 
		aux= habitacionRepository.findById(codigo);
		aux.get().setEstado(false );
		habitacionRepository.save(aux.get()); 
		
	}

	@Override
	public List<Habitacion> listarTodasHabitaciones() {
		// TODO Auto-generated method stub
		return (List<Habitacion>)habitacionRepository.findAll();
	}

	@Override
	public Habitacion listarUnaHabitacion(Integer codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modificarHabitacion(Habitacion habitacionModificar) {
		// TODO Auto-generated method stub
		
	}

}
