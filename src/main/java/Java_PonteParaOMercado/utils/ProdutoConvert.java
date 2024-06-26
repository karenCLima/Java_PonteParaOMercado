package Java_PonteParaOMercado.utils;

import java.util.ArrayList;
import java.util.List;

import Java_PonteParaOMercado.dto.*;
import Java_PonteParaOMercado.model.Produto;

public class ProdutoConvert {
	
	public static Produto toEntity(ProdutoRequest produtoRequest) {
		Produto produto = new Produto();
		produto.setNome(produtoRequest.getNome());
		produto.setMarca(produtoRequest.getMarca());
		produto.setPreco(produtoRequest.getPreco());
		produto.setDescricao(produtoRequest.getDescricao());
		return produto;
	}
	
	public static ProdutoResponse toResponse(Produto produto) {
		ProdutoResponse produtoResponse = new ProdutoResponse();
		produtoResponse.setId(produto.getId());
		produtoResponse.setNome(produto.getNome());
		produtoResponse.setMarca(produto.getMarca());
		produtoResponse.setPreco(produto.getPreco());
		produtoResponse.setDescricao(produto.getDescricao());
		return produtoResponse;
	}
	
	public static List<ProdutoResponse> toResponseList(List<Produto> produtos){
		List<ProdutoResponse> produtoResponses = new ArrayList<>();
		for(Produto produto: produtos) {
			ProdutoResponse produtoResponse = ProdutoConvert.toResponse(produto);
			produtoResponses.add(produtoResponse);
		}
		
		return produtoResponses;
	}

}
