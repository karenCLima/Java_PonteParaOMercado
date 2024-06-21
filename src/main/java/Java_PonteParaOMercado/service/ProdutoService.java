package Java_PonteParaOMercado.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Java_PonteParaOMercado.dto.ProdutoRequest;
import Java_PonteParaOMercado.dto.ProdutoResponse;
import Java_PonteParaOMercado.model.Produto;
import Java_PonteParaOMercado.repository.ProdutoRepository;
import Java_PonteParaOMercado.utils.ProdutoConvert;

@Service
public class ProdutoService {
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	public ProdutoResponse salvarProduto(ProdutoRequest produtoRequest) {
		Produto produto = ProdutoConvert.toEntity(produtoRequest);
		return ProdutoConvert.toResponse(produtoRepository.save(produto));
		
	}
	
	public List<ProdutoResponse> listarProdutos(){
		return ProdutoConvert.toResponseList(produtoRepository.findAll());
	}
	
	public ProdutoResponse atualizarProduto(Integer id, ProdutoRequest produtoRequest ) {
		Produto produtoExistente = produtoRepository.findById(id).get();
		produtoExistente.setNome(produtoRequest.getNome());
		produtoExistente.setMarca(produtoRequest.getMarca());
		produtoRequest.setPreco(produtoRequest.getPreco());
		produtoExistente.setDescricao(produtoRequest.getDescricao());
		return ProdutoConvert.toResponse(produtoRepository.save(produtoExistente));
	}
	
	public void deletarProduto(Integer id) {
		Produto produto = produtoRepository.findById(id).get();
		produtoRepository.delete(produto);
	}

}
