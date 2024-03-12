package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import app.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

	public List<Cliente> findByNome(String nome);
	
	@Query("FROM Cliente c WHERE c.idade > :idade")
	public List<Cliente> findByIdade(int idade);
	
	public List<Cliente> findByCpf(String cpf);
	
}
