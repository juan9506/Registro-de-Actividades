package co.udea.regactividades.api.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "procesos")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Proceso {

	@Id
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "usuario", referencedColumnName = "id")
	private Usuario usuario;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reporte", referencedColumnName = "id")
	private Reporte reporte;
	private int tiempo_empleado;
	@ManyToOne(fetch = FetchType.LAZY,cascade=CascadeType.REMOVE)
	@JoinColumn(name = "actividad", referencedColumnName = "id")
	private Actividad actividad;
	private boolean completado;
	
	
	public Proceso() {
		super();
	}

	public Proceso(int id, Usuario usuario, Reporte reporte, int tiempo_empleado, Actividad actividad,
			boolean completado) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.reporte = reporte;
		this.tiempo_empleado = tiempo_empleado;
		this.actividad = actividad;
		this.completado = completado;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Reporte getReporte() {
		return reporte;
	}
	public void setReporte(Reporte reporte) {
		this.reporte = reporte;
	}
	public int getTiempo_empleado() {
		return tiempo_empleado;
	}
	public void setTiempo_empleado(int tiempo_empleado) {
		this.tiempo_empleado = tiempo_empleado;
	}
	public Actividad getActividad() {
		return actividad;
	}
	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	public boolean isCompletado() {
		return completado;
	}
	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
}
