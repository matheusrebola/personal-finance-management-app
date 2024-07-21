package personalfinancemanagementapp.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Usuarios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String email,
		String senha,
		LocalDateTime dataCriacao) {

}
