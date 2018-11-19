package co.udea.regactividades.api.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import co.udea.regactividades.api.model.Actividad;
import co.udea.regactividades.api.model.Grupo;

public interface ActividadRepository extends JpaRepository<Actividad, String> {

	List<Actividad> findAllByOrderByFechaCreacionDesc();
	
	@Modifying
	@Query("DELETE FROM Actividad a WHERE a.id = :id")
	void eliminarActividad(@Param("id") int id);
	
	@Modifying
	@Query("UPDATE Actividad a SET a.nombre = :nuevoNombre, a.descripcion = :descripcion, a.estado = :estado, a.horas_empleadas = :horas, a.tipo = :tipo"
			+ ", a.fechaFin = :culminacion WHERE a.id = :id")
	void actualizarActividad(@Param("nuevoNombre") String nuevoNombre, @Param("id") Integer id, @Param("descripcion") String descripcion,
			@Param("estado") String estado, @Param("horas") int horas, @Param("culminacion") String culminacion, @Param("tipo") String tipo);

	@Modifying
	@Query(value = "INSERT INTO actividades (id, grupo,nombre,fecha_creacion,fecha_fin,descripcion,estado,horas_empleadas,tipo) VALUES (:id, :grupo,:nombre,:creacion,:culminacion,:descripcion,:estado,:horas,:tipo)", nativeQuery = true)
	void agregarActividad(@Param("id") int id, @Param("grupo") Grupo grupo, @Param("nombre") String nombre, @Param("creacion") Date creacion, @Param("culminacion") String culminacion,
			@Param("descripcion") String descripcion, @Param("estado") String estado, @Param("horas") int horas, @Param("tipo") String tipo);
}
