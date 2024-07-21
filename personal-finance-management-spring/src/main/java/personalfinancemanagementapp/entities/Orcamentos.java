package personalfinancemanagementapp.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Orcamentos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		BigDecimal valorMensal,
		LocalDateTime dataInicio,
		LocalDateTime dataFim,
		Usuarios usuario,
		Categorias categoria) {

}
