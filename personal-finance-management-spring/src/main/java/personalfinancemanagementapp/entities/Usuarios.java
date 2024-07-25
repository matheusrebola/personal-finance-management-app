package personalfinancemanagementapp.entities;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Email;

@Entity
public record Usuarios(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		@Email String email,
		String senha,
		LocalDateTime dataCriacao,
		@OneToMany(mappedBy = "usuario") List<Transacoes> transacoes,
		@OneToMany(mappedBy = "usuario") List<Orcamentos> orcamentos,
		@OneToMany(mappedBy = "usuario") List<MetasFinanceiras> metasFinanceiras,
		@OneToMany(mappedBy = "usuario") List<Relatorios> relatorios,
		@OneToMany(mappedBy = "usuario") List<Lembretes> lembretes,
		@OneToMany(mappedBy = "usuario") List<Sincronizacao> sincronizacoes,
		@OneToOne(mappedBy = "usuario") Seguranca seguranca) {

}
