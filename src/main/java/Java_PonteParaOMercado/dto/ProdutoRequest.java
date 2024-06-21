package Java_PonteParaOMercado.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ProdutoRequest {
	
	@NotBlank
	private String nome;
	@NotBlank
	private String marca;
	@DecimalMin(value = "0.0", inclusive = false)
	private BigDecimal preco;
	
	private String descricao;

}
