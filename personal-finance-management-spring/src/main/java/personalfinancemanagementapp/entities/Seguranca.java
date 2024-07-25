package personalfinancemanagementapp.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public record Seguranca(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String chaveCriptografica,
		LocalDateTime dataCriacao,
		@OneToOne @JoinColumn(name = "usuario_id") Usuarios usuario) {

}
