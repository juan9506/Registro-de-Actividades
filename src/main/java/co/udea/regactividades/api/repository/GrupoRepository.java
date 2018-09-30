package co.udea.regactividades.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regactividades.api.model.Grupo;

public interface GrupoRepository extends JpaRepository<Grupo, String> {

}
