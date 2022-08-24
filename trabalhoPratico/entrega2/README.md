UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Trabalho Prático - Entrega 2


#### Enunciado
A entrega 2 desse trabalho está focada no desenvolvimento do código gerado a
partir dos artefatos apresentados na entrega 1. Em linhas gerais, o que se
espera para essa entrega é que as funcionalidades do menu principal da aplicação
sejam implementadas através da interação entre os objetos gerados a partir das
classes que constam no diagrama de classes criado pelo grupo.

Os diversos cadastros de acessos não devem permitir que situações de erro
aconteçam e devem se prevenir através do lançamento e captura de exceções
apropriadas para cada situação. As exceções estão descritas a seguir: 
- `DescricaoEmBrancoException`: essa exceção deverá ser lançada sempre que um item
    obrigatório do cadastro não tiver sido informado pelo usuário durante a
    entrada dos dados. 
- `ValorAcessoInvalidoException`: essa exceção deverá ser lançada sempre que um
    registro de acesso tiver valor zero ou negativo informado. 
                               
Para cada acesso deverá ser possível realizar as seguintes operações: 
- Criar novo "registro", representando-o através de seu respectivo objeto e
    armazenando-o junto dos outros objetos previamente criados.
    - Os campos obrigatórios para cada tipo de registro são
	- Acesso: placa, data de entrada e saida, hora de entrada e saida;
	- Estacionamento: capacidade vagas, valor fracao 15 minutos, valor hora
	  cheia, valor diaria diurna, valor diaria noturna (em %)
	- Evento: nome do evento, data de inicio e fim, hora de inicio e fim.
    - Caso algum dos campos obrigatórios não tiver sido informado, uma exceção
	do tipo `DescricaoEmBrancoException` deverá ser lançada e o objeto **não
	deverá** ser incluído no cadastro. 

- Pesquisar registro  através de campos dos objetos a serem pesquisados. Cada
  uma das pesquisas (acesso, estacionamento e evento) tem o seu conjunto de
campos a serem pesquisados e que estão listados a seguir: 
    - Acesso: `placa`, 
    - Estacionamento: `nome do estacionamento`
    - Evento: `nome do evento`  

     Caso um objeto não tenha sido encontrado dentre o conjunto de objetos, uma
exceção do tipo `ObjetoNãoEncontradoException` deverá ser lançada e capturada
pelo programa. 


- Alterar os dados de um cadastro (acesso, estacionamento e evento)já existente.
  Nesse caso o objeto do cadastro deverá ser recuperado através da função de
pesquisa do registro e os novos dados deverão ser atualizados no objeto
recuperado pela busca. 

- Excluir cadastro, através da busca do objeto através da função pesquisar.  


#### Critérios de avaliação 

- Os cadastros de Acesso, Estacionamento e Eventos estão funcionando
  adequadamente para todas as operações? Eles permitem a inclusao, atualização,
  pesquisa e remoção de objetos?
- As exceções estão sendo lançadas e tratadas adequadamente? O programa se
  recupera das situações de falha? Os cadastros se mantém integros?

#### Grupos de alunos

Mesmos grupos da entrega 1. 

#### Data de entrega

05 de setembro de 2022, 23:59hs, via repositório do grupo no Github.
