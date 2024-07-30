package personalfinancemanagementapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.Seguranca;

@Repository
public interface SegurancaRepository extends JpaRepository<Seguranca, UUID> {

}
