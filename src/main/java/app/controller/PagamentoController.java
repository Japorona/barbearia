package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.entity.Pagamento;
import app.service.PagamentoService;

@RestController
@RequestMapping("api/pagamento")
public class PagamentoController {

	@Autowired
	private PagamentoService pagamentoservice;
	
	@PostMapping("/save")
	public ResponseEntity<String> save (@RequestBody Pagamento obj){
		try {
			String msg = this.pagamentoservice.save(obj);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<String>("Não foi possível salvar:   "+ e.getMessage(),HttpStatus.BAD_REQUEST);
		}
		
	}
	@GetMapping("/lindAll")
	public ResponseEntity<List<Pagamento>> listAll(){
		
		try {
			
			List<Pagamento> lista = this.pagamentoservice.listAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
			
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
		} 
		
	}
	
}
