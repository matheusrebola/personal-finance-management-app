package personalfinancemanagementapp.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public record Lembretes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TipoLembrete tipoLembrete,
		String mensagem,
		LocalDateTime dataLembrete,
		@ManyToOne @JoinColumn(name = "usuario_id") Usuarios usuario) {

}
