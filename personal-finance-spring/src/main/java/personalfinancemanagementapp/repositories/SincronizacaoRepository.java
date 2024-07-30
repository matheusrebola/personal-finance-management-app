package personalfinancemanagementapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.Sincronizacao;

@Repository
public interface SincronizacaoRepository extends JpaRepository<Sincronizacao, UUID> {

}
