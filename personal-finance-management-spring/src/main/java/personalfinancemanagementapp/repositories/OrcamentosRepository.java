package personalfinancemanagementapp.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.Orcamentos;

@Repository
public interface OrcamentosRepository extends JpaRepository<Orcamentos, UUID> {

}
