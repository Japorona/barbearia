package app.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import app.entity.Pagamento;
import app.repository.PagamentoRepository;

@Service
public class PagamentoService {

	
	@Autowired
	private PagamentoRepository repository;
	
	public String save(Pagamento obj)
	{
		if(obj== null)
			throw new RuntimeException();
		
		this.repository.save(obj);
		return("Salvo");
	}
	public List<Pagamento> listAll(){
		
		return ((PagamentoService) this.repository).listAll();
	}
	
}
