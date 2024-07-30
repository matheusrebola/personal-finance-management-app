package personalfinancemanagementapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.Lembretes;

@Repository
public interface LembretesRepository extends JpaRepository<Lembretes, UUID> {

}
