package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import ar.edu.unju.edm.model.Habitacion;
import ar.edu.unju.edm.service.HabitacionService;

@Controller

public class HabitacionController {
	
	@Autowired
	HabitacionService habitacionService; 
	
	@Autowired 
	Habitacion unaHabitacion; 
	@GetMapping("/habitacion")
		
	public ModelAndView cargarHabitacion() {
		ModelAndView nuevo= new ModelAndView ("formulario"); 
		nuevo.addObject("habitacion", unaHabitacion); 
		
		return nuevo; 
	}
	
	@PostMapping ("/cargarHabitacion")
	
	public ModelAndView guardarHabitacion(@ModelAttribute ("habitacion") Habitacion habitacionConDatos) {
		ModelAndView modelAndView= new ModelAndView ("listado"); 
		habitacionService.cargarHabitacion(habitacionConDatos); 
		modelAndView.addObject("listado", habitacionService.listarTodasHabitaciones());
		return modelAndView; 
		
	
		
		
	}
	

}
