package personalfinancemanagementapp.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Lembretes(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		TipoLembrete tipoLembrete,
		String mensagem,
		LocalDateTime dataLembrete,
		Usuarios usuario) {

}
