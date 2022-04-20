UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Trabalho Prático - Entrega 2


#### Enunciado

A entrega 2 desse trabalho está focada no desenvolvimento do código gerado a
partir dos artefatos apresentados na entrega 1. Em linhas gerais, o que se
espera para essa entrega é que as funcionalidades do menu principal da
aplicação sejam implementadas através da interação entre os objetos gerados a
partir das classes que constam no diagrama de classes criado pelo grupo. 

Os diversos cadastros não devem permitir que situações de erro aconteçam e devem
se prevenir através do lançamento e captura de exceções apropriadas para cada
situação. As exceções estão descritas a seguir: 
- `CampoEmBrancoException`: essa exceção deverá ser lançada sempre que um item
    obrigatório do cadastro não tiver sido informado pelo usuário durante a
    entrada dos dados. 
- `ObjetoNaoEncontradoException`: essa exceção deverá ser lançada sempre que um
    registro (i.e. um objeto representando um item de cadastro) não for
    encontrado dentre os objetos pesquisados. 

Para cada um dos cadastros (locatários, veículos e reservas) deverá ser possível
realizar as seguintes operações: 
- Criar novo "registro", representando-o através de seu respectivo objeto e
    armazenando-o junto dos outros objetos previamente criados.
    - Exemplo: criar o registro com os dados do locatário _Ignacio Fernandez_
	representando-o como um objeto do tipo `Pessoa Física` e adicionando-o
	ao conjunto de objetos de locatários indicado no diagrama UML de
	classes. 
    - Os campos obrigatórios para cada tipo de registro são
       	- Locatário: nome, cpf ou cnpj, email
		- Veículo: marca, modelo, renavam
		- Reserva: numero da reserva, data
    - Caso algum dos campos obrigatórios não tiver sido informado, uma exceção
	do tipo `CampoEmBrancoException` deverá ser lançada e o objeto **não
	deverá** ser incluído no cadastro. 

- Pesquisar registro através de campos dos objetos a serem pesquisados. Cada uma
    das pesquisas (locatário, veiculo e reserva) tem o seu conjunto de campos a
    serem pesquisados e que estão listados a seguir: 
    - Locatário: `nome`, `cpf` ou `cnpj`, `email`
    - Veiculo: `renavam`
    - Reserva: `numero da reserva`  

     Caso um objeto não tenha sido encontrado dentre o conjunto de objetos, uma
     exceção do tipo `ObjetoNãoEncontradoException` deverá ser lançada e
     capturada pelo programa. 


- Alterar os dados de um cadastro já existente. Nesse caso o objeto do cadastro
    deverá ser recuperado através da função de pesquisa do registro e os novos
    dados deverão ser atualizados no objeto recuperado pela busca. 

- Excluir cadastro, através da busca do objeto através da função pesquisar.  


RELEMBRANDO: o menu de funcionalidades da aplicação é o que se encontra abaixo.

  ```
  Menu Principal
  A) Gerenciar Locatários
     Menu Gerência de Locatários:
     A) Cadastrar Locatário
     B) Buscar Locatário
     C) Pesquisar Locatário
     D) Excluir locatário

  B) Gerenciar Frota
     Menu Gerência de Frotas:
     A) Cadastrar veículos
        Menu de Cadastro de Veículos: 
        A) Cadastrar veiculo de passeio
        B) Cadastrar veículo utilitário
        C) Cadastrar Motocicleta
     B) Pesquisar Veículo
        Menu de Pesquisa de Veículos: 
        A) Pesquisar veículo pelo Renavam
        B) Pesquisar veículo por marca, modelo ou renavam
     C) Atualizar dados de um veículo
     D) Remover veículo da frota

  C) Gerenciar Reservas
  D) Sair do Programa
``` 

#### Critérios de avaliação 

- Os cadastros de locatários, veiculos e reservas estão funcionando
  adequadamente para todas as operações? Eles permitem a inclusao, atualização,
  pesquisa e remoção de objetos?
- As exceções estão sendo lançadas e tratadas adequadamente? O programa se
    recupera das situações de falha? Os cadastros se mantém integros?

#### Grupos de alunos

Mesmos grupos da entrega 1. 

#### Data de entrega

~~27 de abril~~ 2 de maio de 2022, 23:59:59hs, via repositório GitHub.
