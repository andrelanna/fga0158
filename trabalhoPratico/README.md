  
UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
Prof. André Luiz Peron Martins Lanna  
  
#### Trabalho Prático de Orientação por Objetos  
---  
  
### Cenário: Sistema de reserva de espaços físicos em uma Universidade 

### Contexto: 

Uma equipe de desenvolvedores está trabalhando na criação de um sistema de
reserva de espaços físicos para uma universidade. O objetivo principal do
sistema é permitir que professores, servidores técnicos e alunos possam agendar
salas, laboratórios e outros locais de forma organizada e eficiente. Para isso,
o sistema deve incluir uma série de recursos que garantam a funcionalidade
necessária.

Inicialmente, será necessário um cadastro de usuários para identificar quem pode
acessar o sistema e quem não pode. Cada usuário terá um perfil específico:
professor, técnico ou aluno, cada um com permissões diferentes no sistema. Por
exemplo, professores podem reservar espaços por períodos mais longos (mais de
dois dias consecutivos), enquanto alunos só podem reservar salas durante
horários permitidos, previamente definidos no sistema. Todos os usuários deverão
informar o seu nome completo, endereço de email institucional, telefone de
contato e senha. Para os alunos deverão ser informados o curso ao qual ele está
vinculado, seu número de matrícula e o semestre em que foi matriculado. Para
servidores (administrativos ou professores) deverá ser informada qual a sua
matrícula institucional. Para os servidores administrativos deverão ser
informados qual a função/cargo exercido (coordenador de departamento, técnico
admistrativo, etc...) e qual departamento ao qual está vinculado. Para os
professores deverão ser informados qual o curso em que ele ministra aulas e qual
seu cargo acadêmico (professor auxiliar, assistente, adjunto, associado ou
titular). 

Além disso, o sistema precisará gerenciar todos os espaços físicos da
universidade, como salas de aula, laboratórios e auditórios. Para isso, será
criado um cadastro com informações sobre cada espaço, incluindo sua capacidade
em número de ocupantes, localização, tipo (sala de aula, laboratório, etc.) e
equipamentos disponíveis. Também será necessário definir os horários em que
cada espaço está disponível para reserva.

Para facilitar o agendamento, o sistema deve permitir que os usuários visualizem
a disponibilidade dos espaços. Isso ajudará os professores, técnicos e alunos a
escolherem períodos livres para suas reservas. Quando alguém fizer uma reserva,
o sistema deve confirmar se o espaço está disponível e informar ao usuário sobre
a confirmação ou cancelamento por meio de notificações. Para evitar conflitos
de reservas, o sistema deve detectar e impedir que alguém reserve um espaço
simultaneamente. Isso é especialmente importante em períodos de alta demanda,
como fins de semana ou semanas de provas.


Além disso, será necessário um histórico de reservas para que os usuários possam
verificar as datas anteriores em que ocuparam espaços. Este histórico pode ser
exportado em formatos como TXT ou CSV para fins de registro ou relatórios.

Em resumo, o sistema de reserva de espaços físicos da universidade precisa ser um recurso completo e fácil de usar, que garanta que todos os usuários possam acessar os espaços necessários sem conflitos e com a maior conveniência possível.

### Enunciado do Trabalho Prático 

**Título:** Desenvolvimento de um Sistema de Gerenciamento de Clínica Médica 

**Objetivo:**  
Desenvolver um sistema em Java que aplique todos os conceitos de orientação a
objetos vistos em sala de aula ao longo da disciplina, garantindo que
modularidade, encapsulamento, herança, polimorfismo e tratamento de exceções
personalizadas sejam explicitamente consideradas na elaboração do trabalho. 

### Requisitos Funcionais: 

1. **Cadastro de usuários**
   - Cadastro de Alunos
   - Cadastro de Servidores Administrativos
   - Cadastro de Professores

2. **Cadastro de espaços físicos**
   - Cadastro de salas de aulas
     - Cadastro de equipamentos
   - Cadastro de laboratórios
     - Cadastro de equipamentos
   - Cadastro de salas de estudos
     - Cadastro de equipamentos

3. **Agendamento de espaços físicos pelos usuários**
   - Agendamento de espaço físico por aluno
     - Apenas no horário permitido pelo sistema
     - Apenas em um dia (período de utilização não pode ultrapassar um dia)
   - Agendamento de espaço físico por servidores (administrativos ou
     professores)
     - Sem restrições em quantidade de dias. 
   - Para todos os usuários: 
     - Não pode sobrepor um agendamento previamente feito. Exemplo: se um
       professor deseja usar uma sala por três dias consecutivos mas já existe
uma alocação qualquer dentre esse período, a alocação pelo professor não poderá
ser realizada. 

4. **Emissão de relatórios de utilização pelos usuários**
   - Relatório de utilização dos espaços para um dado usuário. 
   - Relatório de utilização de cada espaço, durante um determinado periodo,
     contendo todos os usuários que fizeram agendamento. 

5. **Tratamento de Exceções**
   - Não permitir o cadastro de usuários e espaços com campos errados ou
     faltantes (descrição detalhada em seguida). 
   - Não permitir o agendamento em que regras de agendamento são violadas
     (descrição detalhada em seguida). 


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


5. Exceções Personalizadas 

Crie as seguintes exceções personalizadas e faça o devido lançamento, conforme
descrições abaixo: 

- ``HorarioIndisponivelException``: quando vai tentar realizar o agendamento de
  um espaço físico mas o horário já está ocupado para uma outra pessoa, essa
exceção deverá ser lançada e tratada.   
- ``DiasExcedidosException``: Quando um aluno vai tentar fazer um agendamento de espaço físico mas o número de dias é maior do que 1. Nesse caso a exceção deverá ser lançada para impedir o agendamento do espaço físico . 

## Entrega:  

Data de entrega: 07/07/2025 (impreterivelmente).

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
