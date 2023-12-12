UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
Prof. André Luiz Peron Martins Lanna  

#### Trabalho Prático de Orientação por Objetos - Oficina Mecânica
---

**Objetivo:**  
O objetivo deste trabalho prático é aplicar os conceitos fundamentais de
Orientação por Objetos (OO) no contexto de uma oficina mecânica. Utilizando o
cenário descrito anteriormente (ordens de serviço em uma oficina), os grupos de
quatro alunos deverão implementar um sistema em Java que explore ao máximo os
conceitos de encapsulamento, herança e polimorfismo.

**Cenário da Oficina Mecânica:**  
Cada ordem de serviço representa uma manutenção de veículo e contém dados do
cliente, dados gerais do veículo, informações sobre peças a serem substituídas e
serviços a serem realizados. Os dados do cliente incluem o nome do cliente e
outros detalhes pessoais. Os dados do veículo compreendem marca, modelo, ano de
fabricação, ano do modelo, quilometragem atual e nível de combustível em
porcentagem.

A ordem de serviço inclui também a data da manutenção e o nome do mecânico
responsável. Tanto as peças a serem substituídas quanto os serviços a serem
realizados possuem uma descrição, um código e um preço unitário. Adicionalmente,
as peças possuem marca e unidade (por exemplo, unidade, litros, quilos), e os
serviços possuem uma quantidade de horas previstas para sua realização.

O valor total da ordem de serviço é calculado como a soma do valor total de
todas as peças utilizadas e do valor total de todos os serviços realizados.

**Requisitos:**

- Encapsulamento (30 pontos):
  - Adequada restrição de acesso aos atributos.
  - Coesão interna das classes.

- Herança (30 pontos):
  - Uso apropriado de herança para representar a hierarquia de serviços e peças.
  - Classes base e derivadas demonstram relação coerente.

- Polimorfismo (30 pontos):
  - Métodos que se comportam de maneira polimórfica, adaptando-se ao contexto específico.
  - Demonstrações claras de uso de interfaces e/ou classes abstratas.

- Funcionalidades Adicionais (10 pontos):
  - Implementação de funcionalidades extras que demonstrem criatividade e
    compreensão avançada dos conceitos abordados.

**Operações sobre os Objetos:**

As operações sobre os objetos, como inclusão de peças e serviços, pesquisa de
informações específicas e cálculo do valor total da ordem de serviço, devem ser
alocadas corretamente. Certifique-se de que a estrutura de classes e a lógica do
programa permitam realizar essas operações de maneira eficiente e coerente.

**Entrega:**  
O trabalho deve ser entregue no GitHub como um projeto Java, contendo o código
fonte, documentação adequada e exemplos de execução. O README do repositório
deve incluir informações sobre os componentes do grupo e a forma de execução do
programa.

**Avaliação em Sala de Aula:**
O trabalho será avaliado em sala de aula no dia 20 de dezembro de 2023. Todos os
componentes do grupo devem estar presentes para a apresentação e defesa do
trabalho. Questionamentos sobre a utilização dos conceitos de OO serão
realizados ao grupo durante a apresentação.

**Observações:**

-  O trabalho deve ser realizado em grupos de quatro pessoas.
-  O trabalho deverá ser entregue em repositório do GitHub. O grupo deverá
   informar ao professor o endereço do repositório. 
-  Utilize boas práticas de programação.
-  A apresentação do código e a clareza da documentação também serão
   consideradas na avaliação.
