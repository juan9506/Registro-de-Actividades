package co.udea.regactividades.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import co.udea.regactividades.api.model.Usuario;
import co.udea.regactividades.api.repository.RegActividadesRepository;
import co.udea.regactividades.api.service.RegActividadesService;
import co.udea.regactividades.api.util.Messages;

@Service
public class RegActividadesServiceImpl implements RegActividadesService {

	private final Logger log = LoggerFactory.getLogger(RegActividadesServiceImpl.class);
	private RegActividadesRepository RegActividadesrepository;
	
	public RegActividadesServiceImpl(RegActividadesRepository repositorio, Messages messages) {
		this.RegActividadesrepository = repositorio;
	}
	
	@Override
	public List<Usuario> getUsuarios() {
		List<Usuario> usuarios = RegActividadesrepository.findAll();
		return usuarios;
	}

}
