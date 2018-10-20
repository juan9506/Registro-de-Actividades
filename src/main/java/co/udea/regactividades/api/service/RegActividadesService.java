package co.udea.regactividades.api.service;

import java.util.List;

import co.udea.regactividades.api.model.Actividad;
import co.udea.regactividades.api.model.Curso;
import co.udea.regactividades.api.model.Grupo;
import co.udea.regactividades.api.model.Proceso;
import co.udea.regactividades.api.model.Reporte;
import co.udea.regactividades.api.model.Semestre;
import co.udea.regactividades.api.model.Usuario;

public interface RegActividadesService {
	public List<Usuario> getUsuarios();
	public List<Semestre> getSemestres();
	public List<Curso> getCursos();
	public List<Grupo> getGrupos();
	public List<Actividad> getActividades();
	public List<Reporte> getReportes();
	public List<Proceso> getProcesos();
	public List<Grupo> getGruposByDocente(String idProfesor);
}
