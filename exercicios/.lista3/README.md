Lista 2  
Atividade extra-classe e revisão para a avaliação 2
---

**Instruções:**  
Essa lista de exercícios cobre os seguintes tópicos de orientação por objetos,
vistos em sala de aula:  
  - Classes e Objetos 
  - Encapsulamento
  - Modificadores de acesso e de escopo
  - Herança
  - Polimorfismo
    - Sobrescrita de métodos
    - Sobrecarga de métodos
    - Inclusão
    - Coerção
  - Pacotes  

A lista de exercícios poderá ser feita em duplas. 

A resolução da lista deverá ser entregue ao professor até o dia da 2a.
avaliação. 

Referências bibliográficas: 
- Fundamentos do Desenho Orientado a Objetos  
  Meilir Page-Jones
- Utilizando UML e Padrões  
  Craig Larman

--- 

1 - Pesquise nas bibliografias sugeridas as definições sobre os seguinte termos:  
  a) Classe  
  b) Objeto  
  c) Elementos de classe  
  d) Métodos construtores  
  e) Métodos destrutores  
  f) Estado  
  g) Retenção de estado  
  h) Associação entre objetos  
  i) Pacotes
  j) Modificadores de acesso  
  k) Ocultação de informação  
  l) Escopo de elementos  
  m) Modificadores de escopo  
  n) Herança  
  o) Generalização
  p) Especialização
  q) Polimorfismo  
  r) Sobrescrita de métodos  
  s) Sobrecarga de métodos  
  t) Polimorfismo por coerção  
  u) Polimorfismo por inclusão  
  v) Polimorfismo paramétrico 

2 - Apresente os modificadores de acesso informando qual o nível de visibilidade
que cada um deles fornece. 

3 - Qual a forma de comunicação empregada no paradigma de Orientação por
Objetos?

4 - A quem pertence um elemento cujo escopo é dinâmico?  

5 - Se dois ou mais objetos possuem o mesmo estado, significa que eles são o
mesmo objeto? Justifique sua resposta. 

6 - Quais objetos uma referência de uma classe consegue referenciar? 

7 - Uma referência de uma subclasse pode referenciar um objeto de alguma
superclasse? Justifique sua resposta. 

8 - Elementos privados de uma superclasse são herdados e acessíveis por suas
subclasses?  

9 - Considere a seguinte descrição: uma classe A possui 2 atributos e 3 métodos,
uma classe B (herdeira de A) possui outros 2 atributos e 3 métodos. Uma
referência do tipo A referencia um objeto do tipo B. Quantos atributos e métodos
estão disponíveis para a referência A? 

10 - Considerando um conjunto de classes hierarquicamente dispostas, qual é a
vantagem de se utilizar uma referência da superclasse mais alta nessa
hierarquia?

--- 

Considere o seguinte diagrama de classes: 

![Diagrama de classes](polimorfismoParametrico.jpg)

Esse diagrama de classes está parcialmente implementado no diretório desse
exercício. O código é compilável e executável. O arquivo .drawio desse diagrama
encontra-se no diretório dessa lista.  

Com base nesse diagrama responda as seguintes perguntas:  
1 - No diagrama de classes estão apresentados vários elementos sublinhados. O
que isso significa?  

2 - O que significam os nomes nas origens das setas fechadas entre classes? O
que significam os * na outra extremidade das setas? 

3 - O que significa a setas abertas presentes no pacote app? 

4 - O que significa a seta tracejada entre MenuPrincipal e MenuAluno? 

5 - Existe algum tipo de polimorfismo nesse diagrama? Se sim, qual? 

6 - Termine a implementação desse diagrama com a implementação do cadastro de
professores. Pode utilizar o cadastro de alunos como base. 
