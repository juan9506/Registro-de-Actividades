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
@Table(name = "reportes")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Reporte {

	@Id
	private int id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grupo", referencedColumnName = "id")
	private Grupo grupo;
	private Date fecha;
	
	public Reporte() {
		super();
	}
	
	public Reporte(int id, Grupo grupo, Date fecha) {
		super();
		this.id = id;
		this.grupo = grupo;
		this.fecha = fecha;
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
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
}
