package co.udea.regactividades.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import co.udea.regactividades.api.model.Semestre;

public interface SemestreRepository extends JpaRepository<Semestre, String> {
	public Optional<Semestre> findById(int id);
}
