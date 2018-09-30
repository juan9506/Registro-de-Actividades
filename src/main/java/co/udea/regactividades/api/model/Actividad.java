package co.udea.regactividades.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "actividades")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Actividad {

	@Id
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grupo", referencedColumnName = "id")
	private Grupo grupo;
	private String nombre;
	private Date fecha;
	private String descripcion;
	private boolean completada;
	private int horas_empleadas;
	
	public Actividad() {
		super();
	}
	
	public Actividad(int id, Grupo grupo, String nombre, Date fecha, String descripcion, boolean completada, int horas_empleadas) {
		super();
		this.id = id;
		this.grupo = grupo;
		this.nombre = nombre;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.completada = completada;
		this.horas_empleadas = horas_empleadas;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isCompletada() {
		return completada;
	}
	public void setCompletada(boolean completada) {
		this.completada = completada;
	}
	public int getHoras_empleadas() {
		return horas_empleadas;
	}
	public void setHoras_empleadas(int horas_empleadas) {
		this.horas_empleadas = horas_empleadas;
	}
}
