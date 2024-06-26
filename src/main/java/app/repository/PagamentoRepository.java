package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Pagamento;

public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{
	
	public List<Pagamento> findByName(String nome);

}

