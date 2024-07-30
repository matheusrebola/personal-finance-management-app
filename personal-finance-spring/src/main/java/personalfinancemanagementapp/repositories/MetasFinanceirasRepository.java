package personalfinancemanagementapp.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import personalfinancemanagementapp.entities.MetasFinanceiras;

@Repository
public interface MetasFinanceirasRepository extends JpaRepository<MetasFinanceiras, UUID> {

}
