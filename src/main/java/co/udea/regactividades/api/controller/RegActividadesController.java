package co.udea.regactividades.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

	@GetMapping("listar")
	@ApiOperation(value = "Buscar todos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los usuarios fueron buscados", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Usuario>> getUsuarios(){
		log.debug("REST request listar todos los usuarios");
		return ResponseEntity.ok(servicio.getUsuarios());		
	}
}
