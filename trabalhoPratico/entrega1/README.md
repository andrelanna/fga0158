UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Trabalho Prático - Entrega 1


#### Descrição do cenário: 

Seja o seguinte cenário descrito a seguir:

> Você foi contratado por uma empresa que explora o gerenciamento de
> estacionamentos particulares (prédios comerciais, shoppings, etc) e de
> instalações públicas (aeroportos, estádios, ginásios, etc). De um modo geral,
> o gerenciamento de um estacionamento se dá pela liberação das catracas
> eletrônicas sempre que houver pelo menos uma vaga disponível em todo o
> estacionamento. Os estacionamentos explorados por essa empresa possuem,
> obviamente, uma ocupação máxima que ao ser atingida impede que novos acessos
> sejam realizados pelas catracas eletrônicas de entrada. 
>
> Essa empresa realiza o gerenciamento de diversas formas de acesso aos
> estacionamentos. Essas formas de acesso estão descritas a seguir: 
> * Acesso por frações de quinze minutos: a cada quinze minutos contados a
>   partir do momento da passagem do veículo pela catraca eletrônica,
>   contabiliza-se o valor da fração; 
> * Acesso por horas cheias: a cada hora cheia (4 frações de 15 minutos
>   completas) o valor da hora pode ter um desconto estipulado em um valor
>   percentual; 
> * Acesso por diárias diurnas: sempre que o acesso do veículo durar mais de 9
>   horas, cobra-se um único valor relativo à diária do estacionamento. O valor
>   da diária é estabelecido como um valor fixo em Reais (R$). 
> * Acesso por diária noturna: a diária noturna caracteriza-se pelo acesso de um
>   veículo após um determinado horário e sua retirada anterior ao a um
>   determinado horário do dia seguinte. O valor da diária noturna é determinado
>   como um valor percentual aplicado sobre o valor da diária diurna.
> * Acesso mensalista: o valor do acesso mensalista é um valor fixo em Reais
>   (R$) e permite o acesso irrestrito do veículo nos horários em que o
>   estacionamento está em funcionamento. 
> * Acesso por evento: o acesso por evento é determinado por um valor fixo a ser
>   aplicado para os acessos realizados dentro de um determinado período do dia. 
ra
> 
> Os valores dos tipos de acessos apresentados acima vão variar de acordo com
> cada estacionamento que contrata a empresa gerenciadora de estacionamentos.
> Estacionamentos localizados em locais de maior movimentação (aeroportos,
> shoppings) geralmente possuem valores de acesso mais elevados do que em locais
> de menor movimentação (prédios comerciais). Cada local que contrata a empresa
> gerenciadora de estacioamento recebe uma parte do valor de cada acesso,
> definida em acordo com a empresa de gerenciamento do estacionamento. 
>
> Essa empresa trabalha em parceria com seguradoras de veículo para oferecer
> descontos sobre o valor total do estacionamento, em todos os estacionamentos
> que ela opera (o desconto não depende de cada estacionamento gerenciado). 
>
> Com base na descrição do cenário de gerenciamento de estacionamentos
> apresentado acima, pode-se pensar nos seguintes estacionamentos gerenciados pela
> empresa que te contratou. 
> 
> | Estacionamento | Valor fração | Valor hora cheia | Valor diária diurna | Valor diária noturna                               |
> |----------------|--------------|------------------|---------------------|----------------------------------------------------|
> | Estac. 1       | R$ 30,00     | 15 %             |  R$ 120,00          | 45 % (entrada após 19:00hs, retirada antes 8:00hs) |
> | Estac. 2       | R$ 20,00     | 10 %             |  R$  70,00          | 30 % (entrada após 21:00hs, retirada antes 7:00hs) |
> | Estac. 3       | R$ 10,00     |  0 %             |  R$  50,00          | 40 % (entrada após 20:00hs, retirada antes 8:00hs) |
> 
> | Estacionamento | Valor acesso mensalista | Valor acesso evento | Horario Funcionamento | Capacidade |
> |----------------|-------------------------|---------------------|-----------------------|------------| 
> | Estac. 1       |  R$ 600,00              |  R$ 50,00           |  6:00 às 22:00hs      | 300 carros | 
> | Estac. 2       |  R$ 455,00              |  R$ 60,00           |  24 horas             | 120 carros | 
> | Estac. 3       |  R$ 350,00              |  R$ 40,00           |  6:00 às 22:00hs      | 600 carros | 
> 
> | Estacionamento | % retorno contratante |
> |----------------|-----------------------|
> | Estac. 1       | 50 %                  |
> | Estac. 2       | 60 %                  |
> | Estac. 3       | 70 %                  |

Com base nos valores hipotéticos apresentados nas tabelas acima, pode-se simular
os seguintes valores para o gerenciamento dos estacionamentos: 

* Estacionamento 1:  
  Acessos: 
  | Placa | Hora entrada; hora saida | Tipo do acesso | Valor do acesso | Valor do contrante | 
  |-------|--------------------------|----------------|-----------------|--------------------|
  | HI139 | 8:30 ; 8:56              |                | R$ 60,00        | R$ 30,00           |
  | G49NG |                          | Mensalista     | R$ 600,00 (mes) | R$ 300,00          |
  | AC50M | 8:00 ; 18:00             |                | R$ 120,00       | R$ 60,00           |
  | RM3A9 |                          | Noturno        | R$ 54,00        | R$ 27,00           |
  | AM31J |                          | Evento         | R$ 50,00        | R$ 25,00           |

  Total apurado pelo contratante: R$ 442,00

* Estacionamento 2:  
  Acessos:  
  | Placa | Hora entrada; hora saida | Tipo do acesso | Valor do acesso | Valor do contrante | 
  |-------|--------------------------|----------------|-----------------|--------------------|
  | HI139 | 8:30 ; 9:30              |                | R$ 72,00        | R$ 43,20           |
  | G49NG | 15:12; 16:00             |                | R$ 72,00        | R$ 43,20           |
  | AC50M | 8:00 ; 18:00             |                | R$ 70,00        | R$ 42,00           |
  | RM3A9 | 21:36; 6:12              | Noturno        | R$ 21,00        | R$ 12,60           |
  | AM31J |                          | Evento         | R$ 60,00        | R$ 36,00           |

  Total apurado pelo contratante: R$ 177,00

Com base nas descrições dos cálculos acima **e em outras simulações de cálculo a
serem realizadas pelo grupo**, o trabalho a ser realizado consiste na criação de
uma ferramenta que seja capaz de realizar tais cálculos para essa empresa de
gerenciamento de estacionamentos. 

O projeto resultante do desenvolvimento para cada estacionamento gerenciado
deverá ser capaz de : 

* Cadastrar os acessos (placa, hora de entrada, hora de saída). Obs.: por
  cadastros entende-se as operações de criação, pesquisa, atualização e remoção
  de registros de acesso. 
* Com base nos dados do estacionamento (horário de funcionamento, horários de
    período noturno) e nos dados de acesso (hora de entrada e saída), o programa
    deverá **inferir** qual o tipo de cálculo a ser aplicado. **ATENÇÃO:** o
    único tipo de acesso que pode ser informado previamente pelo usuário é o
    acesso por eventos, os demais tipos de acessos e seus cálculos e seus
    cálculos deverão ser identificados pela própria aplicação. 
* Não permitir descrições em branco para os dados de acesso (placa, hora de
    entrada e saída) e para os dados do estacionamento que está sendo gerenciado
    (horário de funcionamento, valores de acessos - todos os tipos, valores de
    participação da contratane, capacidade do estacionamento). Nesse caso lançar
    uma exceção do tipo ``DescricaoEmBrancoException`` informando qual campo
    está em branco.
* Não permitir informar valores de acesso inválidos (negativos por exemplo).
Nesses casos lançar exceção do tipo ``ValorAcessoInvalidoException``.
* Calcular os valores a serem repassados pela gerenciadora de estacionamentos ao
    contratante, ao final da apuração dos valores de todos os acessos
    realizados. 


#### Enunciado
Para a primeira entrega deverão ser entregues: 

a) Diagrama de Classes UML: 
  * O diagrama de classes deverá contemplar todo o cenário descrito acima
    utilizando, **necessariamente**, os conceitos de Encapsulamento, Herança e
Polimorfismo. O grupo deverá organizar as classes em pacotes lógicos, mostrar as
associações corretamente (atributo, multiplicidade e sentido da associação),
utilizar e apresentar os modificadores de acesso e de escopo para os elementos
de cada classe. 
  * Para efeitos de simplificação e melhor visualização, os métodos _set_, _get_
    e construtor padrão de todas as classes poderão ser omitidos (fica entendido
que eles já estão declarados e implementados nas classes). 
  * O diagrama de classes deverá ser elaborado através da ferramenta
    [draw.io](https://app.diagrams.net/). A entrega do diagrama deverá ser feita
em um arquivo de imagem (PDF, PNG ou JPEG) e em um arquivo-fonte da ferramenta
(.drawio). 

b) Diagrama de Objetos UML: 
  * O diagrama de objetos deverá apresentar através dos objetos e suas associações, os seguintes cenários: 
    - O estacionamento 1 tem capacidade de 300 veiculos, funciona de 6:00 às
      22:00 horas, tem valor de fração de R$30,00, com um desconto de 15% para
cada hora cheia, e R$120,00 de diária diurna.  
    - O estacioamento 2 tem capacidade de 120 veiculos, funciona 24 horas, tem
      valor de fração de R$20,00, com um desconto de 10% para cada hora cheia e
R$70,00 de diária noturna. 
    - O veículo de placa AC50M fez um acesso ao estacionamento 1 entre 8:00 e
      18:00 horas, e esse acesso lhe custou uma diária. 
    - O veículo RM3A9 fez um acesso ao estacionamento 1 entre 20:00 e 7:00hs do
      dia seguinte e pagou R$54,00 de diária noturna.
    - O veículo HI139 fez um acesso ao estacionamento 2 entre 8:30 e 9:30hs e
      pagou o acesso de uma hora cheia. 
    - O veículo AC50M fez um acesso ao estacionamento 2 entre 8:00 e 18:00hs e
      pagaou R$70,00 relativo a uma diária diurna. 
    - :exclamation::exclamation::exclamation:Atenção: usar um diagrama apenas! 

#### Grupos de alunos

Grupo de 4 ou 5 alunos. 

Cada grupo deverá criar seu repositório no GitHub e informar ao professor o
endereço do repositório. 

#### Data de entrega

22 de maio de 2023, 23:59hs. 

#### Critérios de correção:

Essa entrega vale 30% da nota do trabalho, portanto, 12 pontos na nota do
semestre. Esse valor será atribuído conforme os seguintes critérios: 

- O diagrama de classes deve contemplar todo o cenário descrito acima. As
  classes apresentadas devem permitir a criação e associação de objetos para
atender, _não apenas_ os casos apresentados como exemplo, mas todo o cenário. 

- O diagrama de classes deve usar todos os conceitos de Orientação por Objetos:
  encapsulamento, herança e polimorfismo. 

- O diagrama de classes deve estar _sintaticamente_ correto: as classes, seus
  elementos e as associações devem estar representadas de acordo com as regras
da UML. 

- O diagrama de objetos deve ser capaz de mostrar os cenários apresentados como
  exemplo corretamente. 
