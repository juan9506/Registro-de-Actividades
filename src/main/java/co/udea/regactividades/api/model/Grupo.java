package co.udea.regactividades.api.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "grupos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Grupo {
	
	@Id
	private int id;
	private int num_alumnos;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "docente", referencedColumnName = "id")
	private Usuario docente;
	private String modalidad;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso", referencedColumnName = "id")
	private Curso curso;

	public Grupo() {
		super();
	}
	
	public Grupo(int id, int num_alumnos, Usuario docente, String modalidad, Curso curso) {
		super();
		this.id = id;
		this.num_alumnos = num_alumnos;
		this.docente = docente;
		this.modalidad = modalidad;
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNum_alumnos() {
		return num_alumnos;
	}

	public void setNum_alumnos(int num_alumnos) {
		this.num_alumnos = num_alumnos;
	}

	public Usuario getDocente() {
		return docente;
	}

	public void setDocente(Usuario docente) {
		this.docente = docente;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
