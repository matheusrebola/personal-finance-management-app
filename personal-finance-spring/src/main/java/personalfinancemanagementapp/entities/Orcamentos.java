package personalfinancemanagementapp.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public record Orcamentos(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		BigDecimal valorMensal,
		LocalDateTime dataInicio,
		LocalDateTime dataFim,
		@ManyToOne @JoinColumn(name = "usuario_id") Usuarios usuario,
		@ManyToOne @JoinColumn(name = "categoria_id") Categorias categoria) {

}
