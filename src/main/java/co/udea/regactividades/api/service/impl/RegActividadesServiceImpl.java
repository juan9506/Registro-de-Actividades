package co.udea.regactividades.api.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import co.udea.regactividades.api.model.Actividad;
import co.udea.regactividades.api.model.Curso;
import co.udea.regactividades.api.model.Grupo;
import co.udea.regactividades.api.model.Proceso;
import co.udea.regactividades.api.model.Reporte;
import co.udea.regactividades.api.model.Semestre;
import co.udea.regactividades.api.model.Usuario;
import co.udea.regactividades.api.repository.ActividadRepository;
import co.udea.regactividades.api.repository.CursoRepository;
import co.udea.regactividades.api.repository.GrupoRepository;
import co.udea.regactividades.api.repository.ProcesoRepository;
import co.udea.regactividades.api.repository.RegActividadesRepository;
import co.udea.regactividades.api.repository.ReporteRepository;
import co.udea.regactividades.api.repository.SemestreRepository;
import co.udea.regactividades.api.service.RegActividadesService;
import co.udea.regactividades.api.util.Messages;

@Service
public class RegActividadesServiceImpl implements RegActividadesService {

	private final Logger log = LoggerFactory.getLogger(RegActividadesServiceImpl.class);
	private RegActividadesRepository RegActividadesrepository;
	private SemestreRepository semestreRepository;
	private CursoRepository cursoRepository;
	private GrupoRepository grupoRepository;
	private ActividadRepository actividadRepository;
	private ReporteRepository reporteRepository;
	private ProcesoRepository procesoRepository;
	
	public RegActividadesServiceImpl(RegActividadesRepository repositorio, SemestreRepository semestreRepository, CursoRepository cursoRepository, GrupoRepository grupoRepository, Messages messages,
			ActividadRepository actividadRepository, ReporteRepository reporteRepository, ProcesoRepository procesoRepository) {
		this.RegActividadesrepository = repositorio;
		this.semestreRepository = semestreRepository;
		this.cursoRepository = cursoRepository;
		this.grupoRepository = grupoRepository;
		this.actividadRepository = actividadRepository;
		this.reporteRepository = reporteRepository;
		this.procesoRepository = procesoRepository;
	}
	
	@Override
	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = RegActividadesrepository.findAll();
		return usuarios;
	}

	@Override
	public List<Semestre> getSemestres() {
		List<Semestre> semestres = semestreRepository.findAll();
		return semestres;
	}

	@Override
	public List<Curso> getCursos() {
		List<Curso> cursos = cursoRepository.findAll();
		return cursos;
	}

	@Override
	public List<Grupo> getGrupos() {
		List<Grupo> grupos = grupoRepository.findAll();
		return grupos;
	}

	@Override
	public List<Actividad> getActividades() {
		List<Actividad> actividades = actividadRepository.findAll();
		return actividades;
	}

	@Override
	public List<Reporte> getReportes() {
		List<Reporte> reportes = reporteRepository.findAll();
		return reportes;
	}

	@Override
	public List<Proceso> getProcesos() {
		List<Proceso> procesos = procesoRepository.findAll();
		return procesos;
	}

}
