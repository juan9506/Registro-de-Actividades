package co.udea.regactividades.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regactividades.api.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, String> {

}
