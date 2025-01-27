   
UnB - Universidade de Brasilia   
FGA - Faculdade do Gama   
OO - Orientação por Objetos   
Prof. André Luiz Peron Martins Lanna   
   
#### Trabalho Prático de Orientação por Objetos   
---   
   
### Cenário: Sistema de Gerenciamento de Clínica Médica 

### Contexto: 

Uma clínica médica precisa de um sistema para gerenciar consultas, pacientes, médicos, exames e tratamentos. O sistema deve permitir o agendamento de consultas, registro de históricos médicos, prescrição de exames/medicamentos e gestão de pagamentos. Além disso, deve garantir regras de negócio como: 

- Limite de consultas por paciente/médico por dia. 
- Validação de horários e especialidades médicas. 
- Controle de pagamentos pendentes. 
- Notificações para exames agendados ou consultas próximas. 

### Enunciado do Trabalho Prático 

**Título:** Desenvolvimento de um Sistema de Gerenciamento de Clínica Médica 

**Objetivo:**   
Desenvolver um sistema em Java que aplique os conceitos de orientação a objetos, garantindo modularidade, encapsulamento, herança, polimorfismo e tratamento de exceções personalizadas. 

### Requisitos Funcionais: 

1. **Cadastro de Pacientes e Médicos**

   **1.1  Pacientes:**       
      1.1.1 Atributos obrigatórios:    
         - Nome (string).    
         - CPF (string XXX.XXX.XXX-XX).    
         - Data de nascimento (Date ou LocalDate).    
         - Histórico médico (lista de objetos Consulta e Exame).    
      
      1.1.2 Funcionalidades:   
         - CRUD completo de pacientes    
         - Adicionar uma nova consulta ao histórico.    
         - Bloquear cadastro se CPF já estiver registrado.    
   
   **1.2 Médicos:**    
      1.2.1 Atributos obrigatórios:   
         - Nome (string).   
         - CPF (string XXX.XXX.XXX-XX).   
         - Data de nascimento .   
         - CRM  
         - Especialidade (ex: cardiologia, pediatria, etc)  
         - Histórico médico (lista de objetos Consulta e Exame). 
   
   1.2.2 Funcionalidades:   
         -  CRUD completo de Médicos.    
         -  Adicionar uma nova consulta ao histórico.    
         -  Bloquear cadastro se CPF já estiver registrado.    



2. **Agendamento de Consultas**

   2.1 O sistema deverá implementar um CRUD completo para consultas.  
   2.2 O sistema deve permitir agendar consultas apenas se: 
      - O médico estiver disponível no horário. 
      - O paciente não tiver outra consulta no mesmo dia. 
      - O médico tiver a especialidade requerida. 
   
   2.3 Para cada consulta médica deverão ser informados, obrigatoriamente:  
      - Data da consulta (ex: 26-01-2025). 
      - Horário de início (ex: 14:30). 
      - Duração em minutos (padrão: 30 minutos). 
      - Status consulta	(Ex.: AGENDADA, CANCELADA, REALIZADA) 
      - Paciente associado à consulta. 
      - Médico responsável pela consulta. 
      - Lista de exames prescritos durante a consulta. 
      - Lista de medicamentos prescritos. 
      - Valor da consulta (ex: R$ 150,00).    
  
 
  
3. **Prescrição de Exames e Medicamentos**

   3.1 Médicos podem prescrever exames (ex: sangue, raio-X) ou medicamentos, associando-os à consulta. 
   
   3.2 Tanto para Exames, quanto para Medicamentos, o sistema deverá implementar um CRUD completo.  
   
   3.3 No caso de Exame, os atributos obrigatórios são:  
       - tipo (ex: SANGUE, RAIO_X, ULTRASSOM).    
       - dataPrescricao: data em que foi prescrito.    
       - dataRealizacao: data em que foi realizado.    
       - resultado: detalhes do resultado, ex: "Colesterol total: 180 mg/dL".    
       - custo: valor base do exame.    
   
   3.4 No caso de Prescrições (medicamentos, tratamentos, exames), os atributos obrigatórios são:  
       - consultaAssociada: associação com a Consulta que gerou a prescrição.    
       - examesPrescritos: lista de exames a serem realizados.    
       - medicamentos: lista de medicamentos prescritos.    
       - dataValidade: prazo para realização dos exames.    

 

4. **Gestão de Pagamentos**   
   4.1 Cada consulta/exame tem um valor associado.   
   4.2 Pacientes com pagamentos pendentes não podem agendar novas consultas.   

5. **Tratamento de Exceções**

Exceções deverão ser utilizadas para lidar com as seguintes situações: 
 - Agendamento em horário indisponível. 
 - Paciente com pagamento pendente. 
 - Médico não encontrado para uma especialidade. 
    


### Requisitos técnicos (conteúdos avaliados): 
1. **Classes e Objetos / Atributos e Métodos / Associações entre Objetos** 

- Defina classes como ``Paciente``, ``Medico``, ``Consulta``, ``Exame``, ``Pagamento``, ``Notificacao``, e outras que se fizerem necessárias. 
- Realize as associações entre as classes de modo a considerar o contexto da aplicação. Defina, para cada associação, seu nome e suas multiplicidades.  
- Apresente, através de um diagrama de Classes UML, as classes, seus atributos e métodos, suas associações e multiplicidades, seus pacotes.  
- Explore, o quanto for possível, relações de herança entre as classes que compõem seu projeto.  


2. **Ocultação de Informação e Retenção de Estado** 

- Atributos privados com métodos públicos para acesso (getters/setters). 
- Exemplo: O histórico médico do paciente só pode ser modificado via métodos da classe Paciente, nunca diretamente. Isso vale para todas as outras classes.  
- Acesso direto a elementos definidos em outras classes, somente em relações de herança.  


3. **Modularidade** 

Separe o código em pacotes como: 
- entidades (classes base, que descrevem elementos do domínio da aplicação médica). 
- servicos (lógica de agendamento, pagamento). 
- excecoes (exceções customizadas). 


4. **Polimorfismo**

- Use, o quanto for possível, polimorfismo.  
- Polimorfismo por sobrescrita e sobrecarga de métodos é obrigatório no código.  
- Polimorfismo paramétrico será avaliado pela utilização de generics em Java. Utilize-os, principalmente, ao representar as associações entre objetos.  


5. Exceções Personalizadas 

Crie as seguintes exceções personalizadas e faça o devido lançamento, conforme descrições abaixo:  

- ``HorarioIndisponivelException``: quando vai tentar realizar a marcação de uma consulta para um médico e o horário já está ocupado por uma outra consulta, essa exceção deverá ser lançada e tratada.   
- ``PagamentoPendenteException``: quando vai tentar fazer o agendamento de uma consulta ou exame e o paciente possui pendências financeiras registradas no sistema. Nesse caso a exceção deverá ser lançada para impedir o agendamento da consulta ou exame.  
- ``EspecialidadeInvalidaException``: quando tentar realizar a marcação de uma consulta para um médico, mas o médico não possui tal especialidade. Nesse caso a exceção deverá ser lançada para impedir que a marcação da consulta seja realizada.  

## Entrega:   

Data de entrega: 10/02/2025.

1. Documentação 

Relatório em PDF com: 
- Diagrama de classes UML. 
- Explicação das associações, heranças e polimorfismos aplicados. 
- Justificativa para as exceções customizadas. 

 

2. Código Fonte 

- Implemente o sistema com todas as funcionalidades descritas acima, em Java. 
- Use um repositório Git, disponibilizado no GitHub, com commits organizados por funcionalidade. Os nomes dos componentes dos grupos e os endereços dos repositórios deverão ser informados no formulário presente no seguinte endereço:  
   
## Avaliação:   
Critérios de Avaliação: 

| Critério                      | Peso |
|:-----------------------------:|:----:|
| Funcionalidades implementadas | 50%  |
| Aplicação de conceitos de OO  | 30%  |
| Qualidade do código/documento | 20%  |


   
## Observações:   
   
  Grupos de no máximo 4 alunos.   
  Procurem os monitores da disciplina. Eles estão orientados a auxiliarem vocês na elaboração dos trabalhos.   
