package personalfinancemanagementapp.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.Categorias;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias, UUID> {

}
