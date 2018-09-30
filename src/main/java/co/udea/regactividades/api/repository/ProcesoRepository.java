package co.udea.regactividades.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regactividades.api.model.Proceso;

public interface ProcesoRepository extends JpaRepository<Proceso, String> {

}
