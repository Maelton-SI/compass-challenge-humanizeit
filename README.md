# Projeto HumanizeIt

O projeto consiste no desenvolvimento de uma estrutura para Backend que compreenda em uma aplicação para auxílio à desabrigados das enchentes.

## Regras da Aplicação

### Requisitos do Sistema
- Tecnologias: Java 17 
- Framework: Nesse momento não será utilizado Spring Boot;
- Banco de dados: De livre escolha.
- Boas práticas: O código deve ser desenvolvido seguindo as boas práticas de desenvolvimento de software, para garantir a qualidade e a manutenibilidade.
- Versionamento: o código fonte deve estar no repositório do GitHub.

### Visão Geral da Aplicação

O  projeto  é  uma  aplicação  backend  para  auxiliar  desabrigados  em  enchentes.  Ele  controla entradas  e  saídasde  doações,  mostra  a  duração  do  estoque do  abrigo  e  dos  centros  de distribuição, e a quantidade de itens recebidos pelos centros. Os requisitos incluem controle de estoque dos abrigos e dos centros de distribuição, transferência de doações entre centros, ordens de pedido e checkout de itens.

## Features da Aplicação

### 1. Registro de Doações

- Funcionalidade de cadastro, leitura, ediçãoe exclusãode itens doados.
- Cada lote de itens cadastrados será direcionado a um centro de distribuição específico, que  deve  ser  indicado  no  momento  do  cadastro.  Existem  3  centros  de  distribuição, listados ao final deste documento.
- Os itens obrigatórios são:
- Os itens obrigatórios são:
    - Roupas:
        * Descrição
        * Gênero (M/F)
        * Tamanho (Infantil/PP/P/M/G/GG)
    - Produtos de higiene:
        * Descrição
        * Sabonete
        * Escova de dentes
        * Pasta de dentes
        * Absorventes
    - Alimentos
        * Descrição
        * Quantidade 
        * Unidade de Medida 
        * Validade 
- Cada  centro  de distribuição  tem  a  capacidade  de  armazenar  1000  itens  de  cada  tipo (independente de tamanho), o sistema deverá acusarquando o limite de um centro de distribuição for atingido, impedindo de adicionar o excedente.
- Deve ser possível fazer cadastro de Doações via arquivo CSV.

### 2. Registro de Abrigos

- Registro de abrigos aptos a receber as doações: cadastro, leitura, edição e exclusão de abrigos. 
- Deverá  ser  armazenado  o nome,  endereço, responsável, telefone e email de contato, capacidade de ocupação(%) de cada abrigo.
- Todos os dados inseridos devem passar por uma validação.
- Ao buscar um abrigo, além dos dados acima, deve-se listar a quantidade de cada item recebido pelo abrigo.

### 3. Ordem de Pedido

- Os abrigos listarão suas necessidades (item e atributos), e a aplicação indicará em quais centros de distribuição os itens podem ser encontrados.
- A listagem será ordenada pelo centro que dispõe da quantidade solicitada. Por exemplo, se 100 escovas de dentes forem solicitadas e o centro A tiver 80, o B tiver 450 e o C tiver 50, a ordem será B, A, C. Se nenhum centro tiver a quantidade total,o primeiro da lista será oque tiver a quantidade mais próxima da solicitada.
- O abrigo poderá enviar uma ordem de pedido para um ou mais centros de distribuição, conforme a necessidade.

### 4. Checkout de Itens

- Cada centro de distribuição terá uma lista de pedidos para aceitar ou recusar.
- Se o pedido for aceito, o centro deverá deduzir do total disponível a quantidade de cada itemenviado.
- Em caso de recusa, o motivodeverá ser informado.
- É necessário armazenar a quantidade de itens enviados para cada abrigo.

### 5. Transferência de doações
    
- Transferência de itens entre centros de distribuição.
- Cada centro de distribuição tem um limite de 1000 itens de cada, e cada abrigo tem um limite de 200 itens de cada.

### Centros de Distribuição
- Os centros de distribuição serão: 
    * Centro de Distribuição Esperança. Av. Boqueirão, 2450 -Igara, Canoas -RS, 92032-420
    * Centro de Distribuição Prosperidade. Av.Borges de Medeiros, 1501 –Cidade Baixa, Porto Alegre-RS, 90119-900
    * Centro de Distribuição Reconstrução. R. Dr. Décio Martins Costa, 312 -Vila Eunice Nova, Cachoeirinha -RS, 94920-170
