package Java_PonteParaOMercado.dto;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProdutoResponse {
	
	private Integer id;
	private String nome;
	private String marca;
	private BigDecimal preco;
	private String descricao;

}
