package ar.edu.unju.edm.service;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Habitacion;

@Service
public interface HabitacionService {
	public void cargarHabitacion (Habitacion unaHabitacion); 
	public void eliminarHabitacion (Integer codigo); 
	public List<Habitacion> listarTodasHabitaciones(); 
	public Habitacion listarUnaHabitacion (Integer codigo); 
	public void modificarHabitacion (Habitacion habitacionModificar); 

}
