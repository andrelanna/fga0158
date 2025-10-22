  
UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
Prof. André Luiz Peron Martins Lanna  
  
#### Trabalho Prático de Orientação por Objetos  
---  
  
### Cenário: Sistema de Mobilidade Urbana (_Ride-Sharing_) 

### Contexto: 


O objetivo deste projeto é modelar e desenvolver um protótipo de sistema para um
aplicativo de compartilhamento de corridas, similar a plataformas como Uber, 99
ou Cabify. Este ecossistema digital conecta dois tipos principais de usuários:
passageiros, que necessitam de transporte, e motoristas, que oferecem o serviço.

Ambos, passageiros e motoristas, são tipos especializados de um usuário
básico do sistema, compartilhando atributos comuns como nome, CPF, e-mail,
telefone e uma senha para autenticação. Contudo, eles possuem características e
responsabilidades distintas.

O passageiro é o ator que inicia a interação central. Para utilizar o sistema,
ele deve cadastrar ao menos um método de pagamento. O sistema deve suportar
diferentes formas de pagamento, como cartão de crédito, PIX ou dinheiro. Cada
método de pagamento terá uma lógica distinta para processar a cobrança no final
da corrida.

O motorista, por sua vez, deve possuir uma CNH (Carteira Nacional de
Habilitação) válida. Além disso, cada motorista está associado a um único
veículo ativo por vez. O veículo é caracterizado por placa, modelo, cor e
ano. Os motoristas também possuem um status de disponibilidade (ex: "Online",
"Offline", "Em Corrida") que determina se eles podem ou não receber novas
solicitações.

A entidade central do sistema é a corrida. Uma corrida é criada quando um
passageiro faz uma solicitação, especificando um local de partida e um destino.
O sistema deve, então, calcular um preço estimado. Esse cálculo de preço não é
fixo; ele depende da categoria de serviço solicitada (ex: categoria comum,
categoria luxo). Cada categoria possui uma fórmula de precificação
que pode envolver uma tarifa base diferente e um multiplicador
distinto por quilômetro rodado. Considere os seguintes valores para tarifa base
e preço por quilômetro rodado. 

| Categoria | Tarifa-base (R$/corrida) | Multiplicador (R$/kilômetro) |
|:---------:|:------------------------:|:----------------------------:|
| Comum     | R$ 5,00                  |  R$ 1,00                     | 
| Luxo      | R$ 9,00                  |  R$ 2,20                     | 

Quando a solicitação é feita, o sistema a encaminha para motoristas "Online"
próximos. Um motorista pode aceitar ou rejeitar a solicitação. Uma vez que um
motorista aceita, a corrida é formalmente iniciada e seu status muda de
"Solicitada" para "Aceita". O passageiro é notificado sobre o motorista e o
veículo a caminho.

A corrida deve ser gerenciada por um ciclo de vida claro (ex: `iniciarViagem()`,
`finalizarViagem()`, `cancelar()`).  Durante o trajeto (status "Em Andamento"),
a localização de ambos poderia ser (idealmente) monitorada. Ao chegar ao
destino, o motorista finaliza a corrida.

Neste momento, o sistema deve executar duas ações cruciais:
1.  Processar o pagamento: o sistema deve acionar o método
    `processarPagamento()` do método de pagamento escolhido pelo passageiro para
aquela corrida.
2.  Coletar feedback: tanto o passageiro quanto o motorista devem ter a
    oportunidade de avaliar um ao outro (ex: nota de 1 a 5 estrelas). O sistema
deve armazenar o histórico de avaliações e manter a média de avaliação de cada
usuário (motorista e passageiro) atualizada de forma segura e encapsulada.

**Requisito Adicional: Tratamento de Exceções**

Além da lógica principal, o sistema deverá demonstrar robustez através de um
tratamento de exceções adequado. Os desenvolvedores deverão modelar e
implementar classes de exceção personalizadas (exceções checadas ou não
checadas, conforme a necessidade) para lidar com fluxos anormais do negócio. O
tratamento de exceções deve ser aplicado, no mínimo, nas seguintes situações:

1.  **Falha no Pagamento:** o que acontece se, ao `finalizarViagem()`, o
    `MetodoPagamento` do passageiro falhar (ex: `SaldoInsuficienteException` ou
`PagamentoRecusadoException`)? O sistema não deve travar; a corrida deve ser
marcada como "Pendente de Pagamento" e o passageiro deve ser impedido de
solicitar novas corridas até a regularização.
2.  **Indisponibilidade de Motoristas:** ao solicitar uma corrida, se o sistema
    não encontrar nenhum motorista "Online" compatível na região dentro de um
tempo limite, ele deve lançar uma exceção específica (ex:
`NenhumMotoristaDisponivelException`) que será tratada pela camada superior
(informando o passageiro).
3.  **Transição de Estado Inválida:** tentar executar uma ação que não condiz
    com o estado atual da corrida (ex: um motorista tentar `iniciarViagem()` de
uma corrida que já foi `finalizada`, ou um passageiro tentar `cancelar()` uma
corrida já em andamento) deve lançar uma exceção (ex:
`EstadoInvalidoDaCorridaException`).
4.  **Validação de Negócio:** tentativas de operações inválidas, como um
    passageiro com pendências financeiras tentando solicitar uma nova corrida,
ou um motorista tentando ficar "Online" com um veículo não aprovado ou com CNH
vencida, devem ser impedidas por exceções de negócio (ex:
`PassageiroPendenteException` ou `MotoristaInvalidoException`).


### Enunciado do Trabalho Prático 

**Título:** Sistema de Mobilidade Urbana (_Ride-Sharing_) 

**Objetivo:**  
Desenvolver um sistema em Java que aplique todos os conceitos de orientação a
objetos vistos em sala de aula ao longo da disciplina, garantindo que
modularidade, encapsulamento, herança, polimorfismo e tratamento de exceções
personalizadas sejam explicitamente consideradas na elaboração do trabalho. 

### Requisitos Funcionais: 

1. **Cadastro de usuários**
   - Cadastro de Usuários
     - Cadastro de Passageiros
     - Cadastro de Motoristas
       - Cadastro de Veículos

2. **Gerenciamento das corridas**
   - O passageiro deverá ser capaz de solicitar uma corrida, com um meio de
     pagamento já informado
   - O sistema deverá encontrar um motorista disponível e atribui-lo à corrida
     - O passageiro apenas poderá cancelar a corrida quando ainda não tiver um
       motorista atribuído à corrida 
   - Para a corrida, deverão ser apresentados o valor-base, o valor pago pela
     distância percorrida e o valor total, com base no tipo de veículo do
     motorista escolhido
   - Apenas o motorista poderá finalizar a corrida. 
   - Durante todo o gerenciamento, a corrida deverá ter seus estados alterados
     adequadamente. 

2. **Tratamento de Exceções**
   - As seguintes exceções deverão ser criadas, disparadas e capturadas nos
     seguintes contextos: 
     - SaldoInsuficienteException: quando o método de pagamento for dinheiro,
       mas não há saldo suficiente na conta do usuário dentro do aplicativo
     - PagamentoRecusadoException: quando o método de pagamento for cartão de
       crédito, mas a operadora recusa o pagamento.
     - NenhumMotoristaDisponivelException: quando não há nenhum motorista
       disponível para atender à solicitação de viagem por um usuário. 
     - EstadoInvalidoDaCorridaException: 
         - quando o motorista tenta finalizar uma viagem que ainda não foi
           iniciada;
         - quando o passageiro tenta cancelar uma viagem que já foi iniciada; 
         - quando o passageiro tenta realizar o pagamento de uma viagem que
           ainda está em curso. 

### Requisitos técnicos (conteúdos avaliados): 
1. **Classes e Objetos / Atributos e Métodos / Associações entre Objetos** 

- Realize as associações entre as classes de modo a considerar o contexto da
  aplicação. Defina, para cada associação, seu nome e suas multiplicidades. 
- Apresente, através de um diagrama de Classes UML, as classes, seus atributos e
  métodos, suas associações e multiplicidades, seus pacotes. 
- Explore, o quanto for possível, relações de herança entre as classes que
  compõem seu projeto. 
- Explore, o quanto for possível, os elementos de escopo estático. 


2. **Ocultação de Informação e Retenção de Estado** 

- Atributos privados com métodos públicos para acesso (getters/setters). 
- Acesso direto a elementos definidos em outras classes, **somente** em relações
  de herança. 


3. **Modularidade** 

Separe o código em pacotes como: 
- entidades (classes base, que descrevem elementos do domínio da aplicação). 
- serviços (lógica de agendamento). 
- excecoes (exceções customizadas). 


4. **Polimorfismo**

- Use, o quanto for possível, polimorfismo. 
- Polimorfismo por sobrescrita e sobrecarga de métodos são obrigatórios no
  código. 
- Polimorfismo paramétrico será avaliado pela utilização de _generics_ em Java.
  Utilize-os, principalmente, ao representar as associações entre objetos. 


5. **Exceções Personalizadas** 

Crie as seguintes exceções personalizadas e faça o devido lançamento, conforme
descrições abaixo: 
- SaldoInsuficienteException: quando não há saldo suficiente para pagamento
- PagamentoRecusadoException: quando a operadora de cartão nega o pagamento
- NenhumMotoristaDisponivelException: quando não há motorista disponivel
- EstadoInvalidoDaCorridaException: quando a conversão de estado é inválida


## Entrega:  

Data de entrega: 01/12/2025, 12:00hs (impreterivelmente).

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
