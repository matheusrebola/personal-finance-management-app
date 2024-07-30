package personalfinancemanagementapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.Transacoes;

@Repository
public interface TransacoesRepository extends JpaRepository<Transacoes, UUID> {

}
