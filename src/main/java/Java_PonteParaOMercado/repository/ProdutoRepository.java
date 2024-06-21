package Java_PonteParaOMercado.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Java_PonteParaOMercado.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
