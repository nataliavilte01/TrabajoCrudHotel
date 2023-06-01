package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Component
@Entity
public class Habitacion {
	@Id
	@GeneratedValue (strategy =GenerationType.AUTO)
	private Integer codigo; 
	private String caracteristicas; 
	private String tipo;
	private String camas; 
	private Boolean estado; 
	
	public Habitacion() {
		// TODO Auto-generated constructor stub
	}

	public Habitacion(Integer codigo, String caracteristicas, String tipo, String camas, Boolean estado) {
		super();
		this.codigo = codigo;
		this.caracteristicas = caracteristicas;
		this.tipo = tipo;
		this.camas = camas;
		this.estado = estado;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCamas() {
		return camas;
	}

	public void setCamas(String camas) {
		this.camas = camas;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
}
