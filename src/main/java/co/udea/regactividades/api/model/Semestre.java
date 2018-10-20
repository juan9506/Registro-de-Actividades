package co.udea.regactividades.api.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "semestres")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Semestre implements Serializable{
	
	@Id
	private int id;
	private int periodo;
	private String estado;
	
	public Semestre() {
		super();
	}
	
	public Semestre(int id, int periodo, String estado) {
		super();
		this.id = id;
		this.periodo = periodo;
		this.estado = estado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPeriodo() {
		return periodo;
	}
	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
}
