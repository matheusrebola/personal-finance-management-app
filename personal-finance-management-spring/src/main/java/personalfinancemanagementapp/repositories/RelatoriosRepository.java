package personalfinancemanagementapp.repositorys;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.Relatorios;

@Repository
public interface RelatoriosRepository extends JpaRepository<Relatorios, UUID> {

}
