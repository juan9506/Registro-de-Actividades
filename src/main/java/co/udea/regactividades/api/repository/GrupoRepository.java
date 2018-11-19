package co.udea.regactividades.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regactividades.api.model.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, String> {

	List<Grupo> findAllByDocenteId(int id);
	Grupo findGrupoById(int id);
}
