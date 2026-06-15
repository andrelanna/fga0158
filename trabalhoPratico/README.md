  
UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
Prof. André Luiz Peron Martins Lanna  
  
### Trabalho Prático de Orientação por Objetos  
---  
  
### Cenário: Sistema de Vendas e Fidelidade — Cafeteria Geek "Byte & Brew

### Contexto: 

Seja bem-vindo ao universo da **Byte & Brew**, uma cafeteria temática
inteiramente pensada para o público *geek*, entusiastas de tecnologia, cultura
pop, jogos de tabuleiro e literatura de fantasia.

Para que possamos implementar um sistema orientado a objetos de suporte a essa
operação, é fundamental compreendermos como a cafeteria funciona no mundo real:
seu cardápio, a dinâmica de atendimento, as regras de negócio de suas vendas e o
seu aclamado programa de fidelidade.


### O Cardápio e os Itens da Cafeteria

A engrenagem principal da **Byte & Brew** é o seu cardápio personalizado. Ele é
dividido em duas grandes categorias de consumo:

* **Comidas (Comestíveis):** Itens produzidos na cozinha ou confeitaria. Possuem
  um tempo de preparo estimado e regras de restrição alimentar (como opções
veganas ou sem glúten). Exemplos do cardápio incluem o *Lembas Bread* (um pão
doce artesanal) e o *Portal Cake* (uma fatia de bolo de chocolate).
* **Bebidas (Poções):** Itens líquidos que podem ser servidos quentes ou
  gelados. Possuem uma classificação de tamanho padrão (Pequeno, Médio ou
Grande) e um indicador de dosagem de cafeína. Exemplos icônicos são o *Café do
Programador* (um espresso duplo ultraforte) e a *Poção de Mana* (uma soda
italiana).

Cada item do cardápio possui um preço base, um código identificador único e uma
quantidade em estoque que precisa ser rigorosamente monitorada para evitar que
um pedido seja aceito sem que haja ingredientes disponíveis.


### A Dinâmica de Atendimento e Vendas

O fluxo de uma venda na cafeteria segue passos bem definidos, operando sempre
sob o comando de um atendente e baseando-se nas escolhas dos clientes:

1. **Abertura do Pedido:** Quando um cliente se aproxima do balcão, uma nova
comanda (pedido) é gerada. Cada pedido recebe um número de identificação
sequencial único para o controle interno da cozinha.
2. **Inclusão de Itens:** O cliente escolhe os itens do cardápio. Um mesmo
pedido pode conter múltiplos itens, e o cliente pode solicitar mais de uma
unidade do mesmo produto (por exemplo: "duas Poções de Mana e um Portal Cake").
À medida que os itens são adicionados, o sistema da cafeteria vai calculando o
valor parcial.
3. **Fechamento e Pagamento:** O pedido é totalizado. O valor final depende não
apenas da soma dos produtos, mas também de possíveis descontos ou promoções
ativas no dia (por exemplo, "Dia do Orgulho Nerd" com 10% de desconto em
bebidas).


### O Programa de Fidelidade: "XP do Cliente"

O grande diferencial da **Byte & Brew** é o seu programa de relacionamento. Na
cafeteria, os clientes não acumulam apenas "pontos", eles acumulam **XP
(Experiência)**.

Qualquer pessoa pode comprar na cafeteria de forma anônima (como um cliente
casual), mas aqueles que se cadastram no programa de fidelidade passam a ter
suas compras associadas ao seu CPF e são classificados em duas categorias de
aventureiros:

### 1. Cliente Standard (Aventureiro Iniciante)

É o nível inicial de qualquer cliente cadastrado.

* **Acúmulo de XP:** A cada R$ 1,00 gasto em compras na cafeteria, o cliente
  ganha 1 ponto de XP.
* **Benefício:** O XP acumulado pode ser guardado para uma futura conversão em
  descontos diretos no caixa.

### 2. Cliente VIP (Mestre da Guilda)

Clientes frequentes que atingem um alto nível de lealdade recebem o status VIP.

* **Acúmulo de XP:** Por sua dedicação, eles possuem um bônus multiplicador:
  ganham 2 pontos de XP para cada R$ 1,00 gasto.
* **Benefício de Resgate:** Além de acumular XP mais rápido, o Cliente VIP tem o
  direito exclusivo de **pagar um pedido inteiramente utilizando seus pontos de
XP**, caso possua saldo suficiente para cobrir o valor total da compra. A taxa
de conversão padrão da cafeteria determina que cada 10 pontos de XP equivalem a
R$ 1,00 em compras.


### Regras de Restrição e Segurança do Negócio

Para que a operação comercial funcione sem prejuízos, a cafeteria opera sob
regras rígidas:

* **Garantia de Estoque:** Não é permitido vender um item que não esteja
  disponível. Se o estoque zerar, a venda daquele produto é imediatamente
bloqueada.
* **Consistência de Resgate:** Um cliente não pode tentar pagar uma conta com XP
  se não tiver saldo suficiente.
* **Identificação:** Para pontuar ou resgatar benefícios de fidelidade, é
  obrigatório que o cliente informe um CPF válido e previamente cadastrado. Se o
CPF não constar nos registros da cafeteria, a venda prossegue como cliente
casual (sem benefícios).


--------------------------------------------------------------------------------


### Enunciado do Trabalho Prático 

**Título:** Sistema de Vendas e Fidelidade — Cafeteria Geek "Byte & Brew"

1. **Introdução e Objetivo:**  
O objetivo deste trabalho prático é aplicar os conceitos fundamentais de
Orientação a Objetos (OO) por meio da modelagem e do desenvolvimento de um
sistema de gerenciamento de vendas e fidelidade para a cafeteria temática Byte &
Brew.

Os grupos deverão demonstrar competência tanto na etapa de abstração e projeto
de software (utilizando diagramas de classes UML) quanto na implementação
utilizando a linguagem Java.



2. **Requisitos funcionais (RF)**

O sistema deverá ser capaz de gerenciar três pilares principais: clientes,
produtos e vendas. Todos os cadastros deverão contemplar as funcionalidades de
criação, pesquisa, atualização e remoção de itens do cadastro (CRUD). 

2.1. **Cadastro e Gestão de Produtos**

O cardápio da cafeteria é composto por produtos genéricos, mas que se dividem em
duas categorias específicas:

- Comida: Deve conter atributos como tempo de preparo (em minutos) e um
  indicador se é vegano/sem glúten.
- Bebida: Deve conter atributos como tamanho (P, M, G) e a quantidade de cafeína
  (em mg).
- Geral para todo Produto: Todo produto deve possuir obrigatoriamente um código
  identificador único, nome, preço base e quantidade em estoque.


2.2. **Cadastro e Gestão de Clientes (Programa de Fidelidade)**

O sistema deve permitir o cadastro de clientes vinculados ao programa de
fidelidade. As compras podem ser feitas por um Cliente Casual (não cadastrado,
não acumula pontos), mas para os cadastrados existem duas categorias:

- Cliente Standard: Acumula 1 ponto de XP para cada R$ 1,00 gasto.
- Cliente VIP: Acumula 2 pontos de XP para cada R$ 1,00 gasto. Além disso,
  possui o método exclusivo de pagar uma compra inteiramente resgatando seus
  pontos de XP (onde cada 10 pontos de XP = R$ 1,00 de desconto).
- Geral para Clientes Cadastrados: Devem possuir nome, CPF único e saldo
  acumulado de XP.


2.3. **Registro e Fluxo de Vendas** 

- O sistema deve permitir abrir um novo pedido (venda) associado a um atendente
  e, opcionalmente, a um cliente cadastrado.
- Deve ser possível adicionar múltiplos itens ao pedido, informando o produto e
  a quantidade desejada.
- O sistema deve calcular o valor total do pedido.
- Regra de Promoção (Interface): O sistema deve aplicar um desconto opcional na
  venda caso seja um "Dia de Evento Geek" (aplicando 10% de desconto no valor
  total das bebidas).
- Ao finalizar a venda, o estoque dos produtos deve ser atualizado e, se houver
  um cliente cadastrado, os pontos de XP devem ser devidamente computados ou
  debitados.


3. **Requisitos não-funcionais (RNF) e Regras de Negócio**

**3.1. Tratamento de Exceções Personalizadas**

O sistema não deve permitir operações inconsistentes. Vocês deverão criar e
lançar obrigatoriamente as seguintes exceções customizadas (`checked` ou
`unchecked`, justifiquem a escolha):

- `EstoqueInsuficienteException`: Deve ser lançada no momento em que se tenta
  adicionar um item ao pedido, mas a quantidade solicitada é maior do que a
  quantidade disponível no estoque do produto.
- `PontosInsuficientesException`: Deve ser lançada quando um ClienteVIP tenta
  finalizar o pagamento de um pedido utilizando o resgate de pontos XP, mas o
  seu saldo de XP atual é inferior ao necessário para cobrir o valor total da
  compra.

**3.2. Restrições Arquiteturais e de Escopo**

- Encapsulamento estrito: Nenhum atributo de classe deve ser exposto
  publicamente (`public`). Utilizem modificadores de acesso adequados
  (`private`, `protected`).
- Modularidade (Pacotes): O código Java deve ser organizado obrigatoriamente nas
  seguintes estruturas de pacotes:
  - `br.edu.cafeteria.modelo` (para as classes de negócio: Produto, Cliente,
    Pedido, etc.)
  - `br.edu.cafeteria.excecao` (para as classes de exceção criadas)
  - `br.edu.cafeteria.servico` (para as interfaces e regras de
    desconto/validação)
  - `br.edu.cafeteria.app` (para a classe principal com o método `main`)


**4. Checklist de Conceitos OO Obrigatórios**

Para obter a nota máxima, a implementação em Java deve deixar explícita a
aplicação dos seguintes tópicos:

[  ]  **Classes, Objetos e Associações:** Relacionamento entre Pedido, ItemPedido,
      Produto e Cliente.   
[  ]  **Modificadores de Escopo (Estático vs. Dinâmico):** Uso de atributos
      estáticos para gerar o número sequencial automático dos pedidos e uma
      constante para a taxa de conversão de pontos XP.   
[  ]  **Herança Simples:** Comida e Bebida herdando de Produto; ClienteStandard
      e ClienteVIP herdando de uma classe base Cliente (ou estrutura equivalente
      fundamentada).   
[  ]  **Polimorfismo por Inclusão:** A classe Pedido deve armazenar uma lista
      de produtos e processá-los genericamente.   
[  ]  **Polimorfismo por Sobrescrita:** O método de calculo de pontos de
      fidelidade deve ser sobrescrito nas subclasses de cliente para refletir as
      diferentes taxas de ganho de XP.   
[  ]  **Polimorfismo por Sobrecarga:** O método de adicionar itens ao pedido deve
      possuir duas assinaturas: adicionarItem(Produto p) (adiciona 1 unidade por
      padrão) e adicionarItem(Produto p, int quantidade).   
[  ]  **Polimorfismo por Coerção:** Demonstrar de forma consciente a conversão de tipos
[  ]  **Interfaces:** Criação de uma interface (ex: Promocional) para aplicar
      descontos em dias de eventos.   



## Entrega:  

Data de entrega: 29/06/2026, 23:59hs (impreterivelmente).

1. Documentação 

Relatório em PDF com: 
- Diagrama de classes UML. 
- Explicação das associações, heranças e polimorfismos aplicados. 
- Justificativa para as exceções customizadas. 

 

2. Código Fonte 

- Implemente o sistema com todas as funcionalidades descritas acima, em Java. 
- Use um repositório Git, disponibilizado no GitHub, com commits organizados por funcionalidade. Os nomes dos componentes dos grupos e os endereços dos repositórios deverão ser informados no formulário presente no seguinte endereço: [https://docs.google.com/forms/d/1Kq1NaMd-YdDR2WdVLbKkge21Wj4k4MRDbLue_1Ium-U/preview](https://docs.google.com/forms/d/1Kq1NaMd-YdDR2WdVLbKkge21Wj4k4MRDbLue_1Ium-U/preview)
  
## Avaliação:  
Critérios de Avaliação: 

| Critério           | Peso |
|:------------------------------|:-----|
| Funcionalidades implementadas | 50% |
| Aplicação de conceitos de OO | 30% |
| Qualidade do código/documento | 20% |


  
## Observações:  
  
- Grupos de no máximo 4 alunos.  
- Procurem os monitores da disciplina. Eles estão orientados a auxiliarem vocês na elaboração dos trabalhos.  
