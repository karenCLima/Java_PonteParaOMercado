package Java_PonteParaOMercado.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class ProdutoRequest{
	
	@NotBlank
	@JsonProperty("nome")
	private String nome;
	
	@NotBlank
	@JsonProperty("marca")
	private String marca;
	
	@DecimalMin(value = "0.0", inclusive = false)
	@JsonProperty("preco")
	private BigDecimal preco;
	
	@JsonProperty("descricao")
	private String descricao;

	
	
	
	
	

}
