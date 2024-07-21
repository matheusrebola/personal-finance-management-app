package personalfinancemanagementapp.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record MetasFinanceiras(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		BigDecimal valorMeta,
		BigDecimal valorAtual,
		LocalDateTime dataInicio,
		LocalDateTime dataFim,
		Usuarios usuario) {

}
