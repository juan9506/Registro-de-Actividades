package co.udea.regactividades.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import co.udea.regactividades.api.model.Usuario;

public interface RegActividadesRepository extends JpaRepository<Usuario, String>{

	public Optional<Usuario> findById(int id);
}
