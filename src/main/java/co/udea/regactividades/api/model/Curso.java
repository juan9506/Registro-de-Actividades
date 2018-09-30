package co.udea.regactividades.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "cursos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Curso implements Serializable{
	
	@Id
	private int id;
	private String nombre;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "semestre", referencedColumnName = "id")
	private Semestre semestre;
	private int creditos;
	private int intensidad_horaria;
	
	public Curso() {
		super();
	}
	
	public Curso(int id, String nombre, Semestre semestre, int creditos, int intensidad_horaria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.semestre = semestre;
		this.creditos = creditos;
		this.intensidad_horaria = intensidad_horaria;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Semestre getSemestre() {
		return semestre;
	}
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public int getIntensidad_horaria() {
		return intensidad_horaria;
	}
	public void setIntensidad_horaria(int intensidad_horaria) {
		this.intensidad_horaria = intensidad_horaria;
	}
	
	
}
