package Java_PonteParaOMercado.controller;

<<<<<<< HEAD
import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Java_PonteParaOMercado.dto.ProdutoResponse;
import Java_PonteParaOMercado.dto.ProdutoRequest;
import Java_PonteParaOMercado.service.ProdutoService;
import org.springframework.web.bind.annotation.RequestBody;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/produto")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
	@GetMapping
	public ResponseEntity<List<ProdutoResponse>> listarProdutos(){
		return ResponseEntity.ok(produtoService.listarProdutos());
	}
	
	@PostMapping(
			consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
            )
	public ResponseEntity<ProdutoResponse> salvarProduto(@Valid @RequestBody ProdutoRequest produtoRequest){
		ProdutoResponse produtoResponse = produtoService.salvarProduto(produtoRequest);
		return ResponseEntity.created(URI.create("/produto/" + produtoResponse.getId())).body(produtoResponse);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<ProdutoResponse> atualizarProduto(@PathVariable Integer id, @RequestBody ProdutoRequest produtoRequest){
		return ResponseEntity.ok(produtoService.atualizarProduto(id, produtoRequest));
	}
	
	@DeleteMapping("{id}")
	public void deleteProduto(@PathVariable Integer id) {
		produtoService.deletarProduto(id);
	}
=======
public class ProdutoController {

>>>>>>> 8e245b7a39177f49717e3a0b4a51419c1f7e25eb
}
