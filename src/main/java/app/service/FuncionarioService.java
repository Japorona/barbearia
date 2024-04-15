package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Funcionario;
import app.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	
	@Autowired
	private FuncionarioRepository repository;
	
	public String save(Funcionario obj) {
		
		if(obj == null)
			throw new RuntimeException();
		
		this.repository.save(obj);
		return ("Salvo com sucesso!");
	}
	
	public List<Funcionario> listAll(){
		
		return this.repository.findAll();
	}
}
