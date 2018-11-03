package co.udea.regactividades.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.udea.regactividades.api.model.Actividad;
import co.udea.regactividades.api.model.Curso;
import co.udea.regactividades.api.model.Grupo;
import co.udea.regactividades.api.model.Proceso;
import co.udea.regactividades.api.model.Reporte;
import co.udea.regactividades.api.model.Semestre;
import co.udea.regactividades.api.model.Usuario;
import co.udea.regactividades.api.service.RegActividadesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/registroactividades")
public class RegActividadesController {

	private static Logger log = LoggerFactory.getLogger(RegActividadesController.class);
	private RegActividadesService servicio;
	
	public RegActividadesController(RegActividadesService servicio) {
		this.servicio = servicio;
	}

	@GetMapping("listarUsuarios")
	@ApiOperation(value = "Buscar todos los Usuarios", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los usuarios fueron buscados", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Usuario>> getUsuarios(){
		log.debug("REST request listar todos los usuarios");
		return ResponseEntity.ok(servicio.getUsuarios());		
	}
	
	@GetMapping("listarSemestres")
	@ApiOperation(value = "Buscar todos los Semestres", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los semestres fueron buscados", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Semestre>> getSemestres(){
		log.debug("REST request listar todos los semestres");
		return ResponseEntity.ok(servicio.getSemestres());		
	}

	@GetMapping("listarCursos")
	@ApiOperation(value = "Buscar todos los Cursos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los semestres fueron buscados", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Curso>> getCursos(){
		log.debug("REST request listar todos los cursos");
		return ResponseEntity.ok(servicio.getCursos());
	}

	@GetMapping("listarGrupos")
	@ApiOperation(value = "Buscar todos los Grupos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los grupos fueron buscados", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Grupo>> getGrupos(){
		log.debug("REST request listar todos los grupos");
		return ResponseEntity.ok(servicio.getGrupos());
	}

	@GetMapping("listarActividades")
	@ApiOperation(value = "Buscar todas las Actividades", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Las actividades fueron buscadas", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Actividad>> getActividades(){
		log.debug("REST request listar todas las actividades");
		return ResponseEntity.ok(servicio.getActividades());
	}

	@GetMapping("listarReportes")
	@ApiOperation(value = "Buscar todos los Reportes", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los reportes fueron buscadas", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Reporte>> getReportes(){
		log.debug("REST request listar todos los reportes");
		return ResponseEntity.ok(servicio.getReportes());
	}

	@GetMapping("listarProcesos")
	@ApiOperation(value = "Buscar todos los Procesos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los procesos fueron buscadas", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Proceso>> getProcesos(){
		log.debug("REST request listar todos los procesos");
		return ResponseEntity.ok(servicio.getProcesos());
	}


	@GetMapping("listarGrupos/{id}")
	@ApiOperation(value = "Buscar grupos por id especifica", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los grupos fueron buscadas", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Grupo>> getGruposByDocente(@PathVariable("id") String id){
		log.debug("REST request listar todos los procesos");
		return ResponseEntity.ok(servicio.getGruposByDocente(id));
	}
	
	@GetMapping("eliminarActividad/{id}")
	@ApiOperation(value = "Eliminar actividad por su Id", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los grupos fueron buscadas", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public void eliminarActividad(@PathVariable("id") String id){
		servicio.eliminarActividad(Integer.parseInt(id));
	}
}
