# Java_PonteParaOMercado  

## :paperclips: Sobre
Projeto Ponte Para o Mercado: A proposta é implementar uma REST API que permita o cadastrar, atualizar, deletar e listar um produto. É requesito do projeto o uso de Docker.   
Esse Projeto é uma parceria da ProsperTech e TreinaWeb focado em desenvolver pessoas que tem interesse em desenvolvimento em Java.

## :pushpin: Funcionalidades principais
- Cadastrar Produto
- Listar Produto
- Atualizar Produto
- Deletar Produto

## :man_technologist: Conhecimentos aplicados
- Java
- Spring Boot
- MySQL
- Docker
- Swagger
- O projeto segue os princípios de SOLID e adota o padrão de arquitetura MVC (Model-View-Controller).

## ⚙️ Como Executar
1. Clone o repositório em uma pasta de preferência
   ```
   git clone https://github.com/karenCLima/Java_PonteParaOMercado.git
   cd Java_PonteParaOMercado
   ```
2. Faça o build da imagem da aplicação e depois suba o docker-compose
   ```
   docker build -t meuapp-springboot .
   docker-compose up -d
   ```
3. Visualize a interface da API utilizando o Thunder Client, Postman, Insomnia ou outra plataforma de sua preferência <br>
> **Acesso ao Swagger UI (Opcional)** <br>
   Se preferir, você pode explorar e testar os endpoints da API acessando o Swagger UI. <br>
   Certifique-se de que o projeto esteja em execução e acesse a URL abaixo pelo seu navegador: <br>
   http://localhost:8080/swagger-ui/index.html#/

## 📚 Documentação (endpoints)
### :bust_in_silhouette: Produto
<details>
  <summary> Cadastro (POST) </summary>
    <br>

  | Método | Funcionalidade | URL |
  |---|---|---|
  | `POST` | Realiza o cadastro do produto no sistema | `http://localhost:8080/produto`
  
  <details>
    <summary> A estrutura do body da requisição deverá seguir o padrão abaixo: </summary>
    
    {
      "name": "String",
      "preco": "BigDecimal", 
      "marca": "String", 
      "descricao": "String"
    }
  
  </details>

  <details>
    <summary>  Um exemplo de resposta bem-sucedida com <code>status 200</code> é: </summary>

    {
      "id": 1,
      "name": "String",
      "preco": BigDecimal, 
      "marca": "String", 
      "descricao": "String"
    }
    
  </details>

  :x:&nbsp;&nbsp;A requisição irá falhar se algum dos atributos não for preenchido corretamente ou esteja ausente.<br>
  O endpoint retornará um erro <code>400</code> com uma mensagem referente. Exemplo: <code>{ "Name is required" }</code><br>
</details>

<details>
  <summary> Consultas (GET) </summary>
    <br>

  | Método | Funcionalidade | URL |
  |---|---|---|
  | `GET` | Consulta todos os produtos cadastrados | `http://localhost:8080/produto`
  
  <details>
   <summary>  Um exemplo de resposta bem-sucedida com <code>status 200</code> é: </summary>
   
       [
         {
           "id": 1,
           "name": "Celular",
           "preco": 7500,
           "marca": "Apple",
           "descricao": "Ultimo lançamento"
         },
         // Outros produtos...
       ]
       
  </details>
  :x:&nbsp;&nbsp;A requisição irá falhar se não houver, pelo menos, um produto cadastrado.<br>
  O endpoint retornará um erro <code>400</code>
  <br><br>
  </details>

  <details>
    <summary> Atualização (PUT) </summary>
    <br>
  | Método | Funcionalidade | URL |
  |---|---|---|
  | `PUT` | Atualiza as informações de um produto existente | `http://localhost:8080/produto/{id}`
  
  <details>
    
  > :warning: &nbsp; _Qualquer atributo pode ser atualizado, porém todos devem ser escritos, mesmo quando não houver alteração_

  <summary> A estrutura do body da requisição deve seguir o padrão do exemplo abaixo: </summary>
  
    {
      "name": "Novo nome produto",
      "preco": 3500,
      "marca": "Lenovo",
      "descricao": "Notebbok"
    }
  
  </details>
  
  <details>
    <summary>  Um exemplo de resposta bem-sucedida com <code>status 200</code> é: </summary>
  
    {
      "id": 1,
      "name": "Novo nome produto",
      "preco": 3500,
      "marca": "Lenovo",
      "descricao": "Notebbok"
    }
  </details>

  :x:&nbsp;&nbsp; A requisição irá falhar se algum dos atributos não for preenchido corretamente ou esteja ausente.<br> 
  O endpoint retornará um erro <code>400</code> com uma mensagem referente. Exemplo: <code>{ "name is required" }</code>
  <br>
</details>

<details>
  <summary> Exclusão (DELETE) </summary>
    <br>
  
  | Método | Funcionalidade | URL |
  |---|---|---|
  | `DELETE` | Remove um produto existente | `http://localhost:8080/produto/{id}`
  
  -&nbsp;&nbsp;&nbsp;Para deletar um produto, especifique o `id` desejado na URL, conforme mostrado acima. Não é necessário incluir um corpo de requisição, pois a ação de exclusão é baseada no `id` fornecido.
  
 :x:&nbsp;&nbsp;A requisição irá falhar se o ID não estiver associado a nenhum produto cadastrado.<br> 
 O endpoint retornará um erro <code>404</code>
 </details>
