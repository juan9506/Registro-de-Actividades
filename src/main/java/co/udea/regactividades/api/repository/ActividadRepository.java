package co.udea.regactividades.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regactividades.api.model.Actividad;

public interface ActividadRepository extends JpaRepository<Actividad, String> {

	List<Actividad> findAllByOrderByFechaCreacionDesc();
	void deleteById(int id);
}
