UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Trabalho Prático - Entrega 1


#### Descrição do cenário: 

Uma locadora de veículos deseja desenvolver um sistema de gestão de locações que
consiste de três módulos: a) uma gerência de locatários, b) uma gerência de
frota e c) uma gerência de reservas. 

* **Cadastro de locatários:**   

Os locatários são aqueles que podem realizar reservas e efetivá-las (_i.e_
efetivar a locação) de veículos. Os locatários são classificados como pessoa
física ou pessoa jurídica. Em ambos os tipos o cadastro deverá conter,
obrigatoriamente, o endereço completo (rua, numero, complemento - se houver,
bairro, cidade, estado, CEP) e os contatos e-mail e telefone celular. Para os
locatários do tipo Pessoa Física deverão ser informados o nome completo, cpf e
estado civil. Para os locatários do tipo Pessoa Jurídica deverão ser informados
o nome social da empresa, CNPJ, e uma lista de funcionários (pessoas físicas
previamente cadastradas) autorizadas a realizar locações pela empresa. 

O cadastro de locatários desse sistema deverá permitir:  
a) cadastrar locatários de ambos os tipos (pessoa física ou jurídica). No caso
de pessoas jurídicas o cadastro de cada empresa deverá ter associado as pessoas
físicas autorizadas a realizar locações. 
b) pesquisar locatários pelo nome ou pelo documento (CPF para pessoas físicas ou
CNPJ para pessoas jurídicas)  
c) alterar os dados cadastrais dos locatários e  
d) excluir o cadastro de um locatário. No caso da exclusão de um cadastro de
pessoa jurídica, o cadastro dos funcionários autorizados a realizar as locações
deverá permanecer no sistema. 



* **Gerenciamento de frota:**   

A frota da locadora é formada por veículos de passeio, veículos utilitários e
motocicletas. Qualquer tipo de veículo é descrito atraves de sua marca, modelo,
ano de fabricação, ano de modelo, numero do RENAVAM (número de cadastro do
veículo no Registro Nacional de Veículos Automotores) e capacidade do tanque de
combustível em litros.  
Os veículos de passeio são descritos também pela categoria a qual pertencem
(veículos compactos, compactos de luxo, sedan ou SUVs) e se possuem ou não os
seguintes itens opcionais: ar-condicionado, direção hidráulica e câmbio
automático.  
Os veículos utilitários podem ser veículos de carga ou veículos de passageiros.
Ambos os tipos de utilitários são descritos por uma capacidade de carga. No caso
de veículos de passageiros essa capacidade é dada pelo número de ocupantes
máximo, incluindo o motorista. Veículos de passageiros podem também possuir os
opcionais ar-condicionado, direção hidráulica e tv a bordo. No caso de veículos
de carga, a capacidade de carga representada o peso máximo suportado pelo
veículo. Para veículos de carga também devem ser informados, obrigatoriamente,
os seguintes atributos: tara do veículo (= seu peso quando está vazio), tamanho
do compartimento de carga em litros. O compartimento de carga desse tipo de
veículo pode ainda ser de três tipos: baú (carga-fechada), graneleiro (carga
aberta), basculante (carga aberta com capacidade de descarregar a carga).  
No caso das motocicletas, suas características adicionais informam se a
motocicleta possui como opcionais controle de traçao, freios ABS, piloto
automático e modos de pilotagem (Cidade, Estrada, Sport e Off-Road).  
Para todos os veículos deverão ser informados ainda os valores da diária normal
(para pessoas físicas), da diária reduzida (para pessoas físicas, com 10% de
desconto no valor da diária normal), da diária empresarial (para clientes de
pessoa jurídica), e valor mensal (para locações de 30 ou mais dias). 

O gerenciamento de frotas desse sistema deverá permitir:  
a) cadastrar os veículos da locadora informando, para cada veículo, todos os
valores de seus atributos (a variar conforme o tipo de veiculo que está sendo
cadastrado).   
b) pesquisar um veículo pelo número de seu RENAVAM; 
c) pesquisar veículos de uma determinada marca, modelo ou categoria. Essa
pesquisa deverá retornar todos os veículos que atendam ao critério de busca
escolhido;   
c) atualizar os dados de um veículo específico e, por fim,   
d) apagar um veículo do gerenciador de frotas.  


* **Gerenciador de reservas:**

O gerenciador de reservas é a parte do sistema responsável por manter as
reservas e efetivar as locações de veículos. Uma reserva é uma alocação
temporária de um veículo a um cliente (pessoa física ou jurídica) para uma
determinado período (data e horas de início e de fim). Uma reserva é composta de
diária (pelo menos uma). O número de diárias é contado como seqüências de 24
horas contadas a partir do horário de início da reserva. O valor total da
reserva é definido conforme o tipo de reserva realizada (diária normal, diária
reduzida, diária empresarial ou mensal) e é acrescida de: seguro de proteção
contra terceiros (obrigatório) no valor de 12% da locação, seguro de proteção do
próprio carro (opcional) no valor de 8% da locação, e 5% de impostos sobre o
valor da locação. Além disso, toda reserva possui um número identificador que,
para efeitos de simplificação, nesse caso será definido como um número inteiro
sequencial (não pode haver mais de uma reserva com o mesmo número). 

Ao realizar uma reserva, o sistema deverá atribuir um número de reserva, um
locatário (Pessoa Física ou Jurídica), uma pessoa física responsável pela
locação (no caso de PF, o locatário é a própria pessoa física), e calcular os
valores finais da locação. 

O gerenciador de reservas permite ainda a emissão de relatórios de cada uma das
reservas e o relatório consolidado de reservas. O relatório de cada reserva
possui o seguinte formato: 

> Reserva: <numero_da_reserva>  
> Locatário: <nome_da_PF_ou_PJ>  
> Responsável pela locaçao: <nome_da_PF>
>
> ****************************** Dados da Locação ******************************
> 
> Início: <data_de_inicio> - <hora_de_inicio>  
> Fim: <data_de_fim> - <hora_de_fim>  
> Número de diárias calculadas: < numero >  
> 
> Veículo: <Marca_do_Veiculo> - <Modelo_do_Veiculo>  
> Ano de fabricação / modelo: <ano_fabricacao> / <ano_modelo>  
> Placa: <numero_da_placa>
> Renavam: <numero_do_renavam>  
> Categoria: <nome_da_categoria_do_veiculo>
> 
> Valor da diária: <valor_diaria>  
> Valor do seguro de terceiros: <valor_seguro_terceiros>  
> Valor do seguro próprio: <valor_seguro_proprio>  
> Valor dos impostos: <valor_impostos>  
> Valor total da locação: <valor_total>   

O relatório consolidado de reservas possui a seguinte estrutura: 

>``` ******************** Relatório consolidado de reservas ********************  
>                                            Valor      Valor               
>                                            Seguro     Seguro    Valor    Valor
>    Reserva #    Inicio    Fim    Veiculo   Terceiros  Proprio   Impostos Total
>    ***************************************************************************
>    <numero>    <data -   <data - <Marca    <valor>    <valor>   <valor>  <valor>
>                hora      hora    Modelo>  
>                inicio>   fim>
>    
>    <numero>    <data -   <data - <Marca    <valor>    <valor>   <valor>  <valor>
>                hora      hora    Modelo>  
>                inicio>   fim>
> 
>    <numero>    <data -   <data - <Marca    <valor>    <valor>   <valor>  <valor>
>                hora      hora    Modelo>  
>                inicio>   fim>
>    ***************************************************************************
>                                           <total>     <total>   <total>  <total>
> 


#### Enunciado

A entrega 1 desse trabalho está focada no desenvolvimento de artefatos que
exercitem o raciocínio dos alunos em termos de classes, objetos e suas relações,
através da criação de dois diagramas UML. Há ainda uma parte do trabalho voltada
para a implementação de código em linguagem Java, contudo, essa parte representa
uma menor porção dos objetos que serão avaliados nessa entrega. 

Para a primeira entrega serão avaliados os seguintes itens: 

* Diagrama UML de classes capaz de representar o cenário descrito acima. A
  distribuição dos atributos e métodos pelas classes além das associações entre
classes deverão ser realizadas de modo coerente com as características e
comportamentos das entidades descritas. As associações entre classes deverão
permitir a execução das funcionalidades através das comunicações entre os
objetos. 

* Diagramas UML de objetos representando as associações descritas a seguir:   
  a) Uma pessoa fisica de nome Isabela Freitas, email freitas@gmail.com,
residente na rua 6 sul, lote 10, apto 1002, Aguas Claras, Brasilia, DF;
realizando a locação de um veiculo Volkswagen Gol, ano 2017/2018, branco; pelo
período compreendido entre 20/02/2022 - 12:00hs a 22/02/2002 - 12:00hs, com o
valor total de diárias de R$200,00, seguro obrigatório no valor de R$24,00, sem
proteção própria, e impostos no valor de R$16,00. Total da reserva: R$250,00.

   b) Uma empresa chamada Clube Atlético Mineiro :chicken:, sediada na Avenida
Olegário Maciel, 1516, Bairro Lourdes, Belo Horizonte, MG, CNPJ
00.013.013/0001-13, tem como funcionários cadastrados:  i) Ignacio Fernandez,
email nacho@atletico.com.br, endereco Rua Cantagalo, 13, Bairro Aparecida, Belo
Horizonte, MG e ii) Givanildo Vieira de Sousa (o incrível Hulk), email
oincrivelhulk@atletico.com.br, endereço Arena MRV, rua Cristina ~~Maria~~
de Assis, 202, Bairro Califórnia, Belo Horizonte, MG. 

* Menu principal do programa prototipando as funcionalidades descritas em
  seguida. Cada nível da relação de funcionalidades apresentada abaixo é um menu
de opções que deve ser chamado ao escolher o item no nível imediatamente
anterior, em seu respectivo menu. 

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
  

* Implementação alto-nível do diagrama de classes UML.

#### Grupos de alunos

:construction::construction::construction: Em construção :construction::construction::construction:
Grupo de até 6 alunos. 

#### Data de entrega


:construction::construction::construction: Em construção :construction::construction::construction:
