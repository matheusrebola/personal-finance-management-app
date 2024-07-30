package personalfinancemanagementapp.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public record Categorias(
		@Id @GeneratedValue(strategy = GenerationType.UUID) UUID id,
		String nome,
		String descricao,
		@ManyToOne @JoinColumn(name = "usuario_id") Usuarios usuario,
		@OneToMany(mappedBy = "categoria") List<Transacoes> transacoes ) {

}
