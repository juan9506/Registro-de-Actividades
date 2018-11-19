package co.udea.regactividades.api.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "grupo", referencedColumnName = "id")
	private Grupo grupo;
	private String nombre;
	private Date fechaCreacion;
	private String fechaFin;
	private String descripcion;
	private String estado;
	private int horas_empleadas;
	private String tipo;
	
	public Actividad() {
		super();
	}
	
	public Actividad(int id, Grupo grupo, String nombre, Date fecha_creacion, String fecha_culminacion, String descripcion, String estado, int horas_empleadas, String tipo) {
		super();
		this.id = id;
		this.grupo = grupo;
		this.nombre = nombre;
		this.fechaCreacion = fecha_creacion;
		this.fechaFin = fecha_culminacion;
		this.descripcion = descripcion;
		this.estado = estado;
		this.horas_empleadas = horas_empleadas;
		this.tipo = tipo;
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
	public Date getFecha_creacion() {
		return fechaCreacion;
	}
	public void setFecha_creacion(Date fecha_creacion) {
		this.fechaCreacion = fecha_creacion;
	}
	public String getFecha_culminacion() {
		return fechaFin;
	}
	public void setFecha_culminacion(String fecha_culminacion) {
		this.fechaFin = fecha_culminacion;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getEstado() {
		return this.estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getHoras_empleadas() {
		return horas_empleadas;
	}
	public void setHoras_empleadas(int horas_empleadas) {
		this.horas_empleadas = horas_empleadas;
	}
	public String getTipo(){
		return this.tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
}
