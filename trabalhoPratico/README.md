  
UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
Prof. André Luiz Peron Martins Lanna  
  
### Trabalho Prático de Orientação por Objetos  
---  
  
### Cenário: 

Aplicação pessoal para controle financeiro

- **Modalidade:** trabalho em **grupo de 3 a 5 componentes** (no mínimo 3 e no máximo 5; não serão aceitos grupos com 1, 2 ou 6 ou mais integrantes)  
- **Valor:** 100 pontos (ver critérios na seção 10)  
- **Linguagem:** Java (JDK 17 ou superior), somente com a biblioteca padrão

- **Datas:** formação dos grupos: `__/__/____` · entrega: `__/__/____` · apresentações: `__/__/____` (A serem definidas)



--------------------------------------------------------------------------------


### Enunciado do Trabalho Prático 

### 1. Contexto

Muitas pessoas não sabem para onde vai o dinheiro no fim do mês. Neste trabalho,
o grupo vai desenvolver, em Java, um **aplicativo de auxílio ao controle de
gastos** de um cidadão. O programa registra as **entradas** (receitas) e as
**saídas** (despesas) de uma conta, classifica cada uma delas em um **plano de
contas simplificado**, mantém o **saldo** sempre atualizado e emite o
**extrato**.

O foco do trabalho **não é a interface**, e sim o **projeto orientado a
objetos**: o programa deve ser uma aplicação de console, e o grupo precisa
aplicar, de forma consciente e justificada, todos os conceitos estudados na
disciplina:

- Classes e objetos;
- Encapsulamento: pacotes, interfaces, modificadores de acesso e modificadores
  de escopo (elementos estáticos e dinâmicos);
- Herança simples;
- Polimorfismo: sobrescrita, sobrecarga, coerção, inclusão e paramétrico;
- Exceções.

---

### 2. Descrição do sistema

### 2.1 Transações

Uma **transação** é um movimento financeiro da conta. Toda transação possui:

| Atributo | Descrição |
|---|---|
| Identificador | número sequencial único, gerado automaticamente pelo sistema |
| Nome | nas **receitas**, o nome da empresa ou pessoa que pagou; nas **despesas**, o nome da loja, comércio ou órgão que recebeu o pagamento |
| Descrição | texto curto explicando a transação (ex.: "Conta de luz de outubro") |
| Valor | valor em reais, sempre **positivo** (o sinal é dado pelo tipo da transação) |
| Data | data da transação |
| Categoria | item do plano de contas (seção 2.2) |

Há dois tipos de transação:

- **Receita (entrada):** dinheiro que entra na conta. **Soma** o valor ao saldo.
- **Despesa (saída):** dinheiro que sai da conta. **Subtrai** o valor do saldo.

### 2.2 Plano de contas

O plano de contas é um conjunto de **categorias**, cada uma pertencente a um dos dois tipos. O grupo deve implementar, no mínimo, as categorias abaixo (pode acrescentar outras):

| Tipo | Categorias mínimas |
|---|---|
| **Receita** | Salários, Honorários, Rendimentos, Outras receitas |
| **Despesa** | Moradia, Luz, Água, Comunicações, Alimentação, Transporte, Saúde, Educação, Lazer, Outras despesas |

Uma receita só pode receber categoria de receita, e uma despesa só pode receber categoria de despesa.

### 2.3 Conta

A **conta** pertence a um titular, guarda o conjunto de transações e mantém o **saldo**. A conta deve permitir:

1. **Inserir** uma transação (receita ou despesa);
2. **Atualizar** uma transação já existente (por exemplo, corrigir o valor, o nome ou a categoria);
3. **Remover** uma transação existente;
4. **Consultar o saldo** atual;
5. **Imprimir o extrato**: lista de todas as transações, uma por uma, na ordem em que foram registradas, com o saldo acumulado após cada uma, e o **saldo final**.

**Após cada inserção, atualização ou remoção bem-sucedida, o saldo deve ser atualizado.**

### 2.4 Efeito de cada operação sobre o saldo

| Operação | Efeito sobre o saldo |
|---|---|
| Inserir receita de valor *v* | saldo = saldo + *v* |
| Inserir despesa de valor *v* | saldo = saldo − *v* |
| Remover receita de valor *v* | saldo = saldo − *v* (desfaz a entrada) |
| Remover despesa de valor *v* | saldo = saldo + *v* (desfaz a saída) |
| Atualizar transação | desfaz o efeito da transação antiga e aplica o efeito da nova: saldo = saldo − efeito antigo + efeito novo |

**Regra geral:** o saldo da conta **nunca pode ficar negativo**. Qualquer operação que o deixaria negativo deve ser **recusada**, com o lançamento de `SaldoInsuficienteException`. Quando uma operação é recusada por qualquer exceção, a conta deve permanecer **exatamente como estava** (nem o saldo nem a lista de transações podem ser alterados).

---

## 3. Regras de negócio e exceções

O sistema deve lançar as exceções abaixo, definidas pelo próprio grupo, **com estes nomes**:

| Exceção | Quando deve ser lançada |
|---|---|
| `ValorInvalidoException` | o valor da transação é **negativo** (decisão deste enunciado: valor **zero** também é inválido) |
| `NomeInvalidoOuNuloException` | o nome ou a descrição da transação é **nulo** ou **vazio** (só com espaços em branco também é inválido) |
| `CategoriaNaoDefinidaException` | a transação não tem categoria atribuída, ou a categoria atribuída é de tipo incompatível (receita com categoria de despesa, ou vice-versa) |
| `SaldoInsuficienteException` | uma **despesa** é maior que o saldo disponível; ou uma atualização ou remoção deixaria o saldo negativo |

**Ordem de verificação** (para que todos os grupos tenham o mesmo comportamento): (1) nome e descrição, (2) categoria, (3) valor, (4) saldo. A primeira regra violada define a exceção lançada.

Cada exceção deve carregar uma **mensagem clara** (por exemplo, o saldo disponível e o valor pretendido, no caso de `SaldoInsuficienteException`).

---

## 4. Exemplos explicativos

Considere a conta de **Maria Souza**, aberta com saldo **R$ 0,00**.

### 4.1 Transações válidas e efeito sobre o saldo

| # | Operação | Tipo | Nome | Categoria | Valor (R$) | Saldo após (R$) |
|---|---|---|---|---|---|---|
| 1 | Inserir | Receita | Empresa Alfa Ltda. | Salários | 3.500,00 | **3.500,00** |
| 2 | Inserir | Despesa | Companhia de Energia | Luz | 180,50 | **3.319,50** |
| 3 | Inserir | Despesa | Supermercado Bom Preço | Alimentação | 650,00 | **2.669,50** |
| 4 | Inserir | Receita | João Silva (cliente) | Honorários | 800,00 | **3.469,50** |
| 5 | Inserir | Despesa | Operadora Conecta | Comunicações | 119,90 | **3.349,60** |

**Exemplo de extrato** neste ponto (o formato exato é livre, mas deve mostrar transação por transação e o saldo final):

```
==================== EXTRATO — Maria Souza ====================
ID  Tipo     Nome                      Categoria      Valor (R$)  Saldo (R$)
 1  RECEITA  Empresa Alfa Ltda.        Salários        +3.500,00    3.500,00
 2  DESPESA  Companhia de Energia      Luz               -180,50    3.319,50
 3  DESPESA  Supermercado Bom Preço    Alimentação       -650,00    2.669,50
 4  RECEITA  João Silva (cliente)      Honorários        +800,00    3.469,50
 5  DESPESA  Operadora Conecta         Comunicações      -119,90    3.349,60
---------------------------------------------------------------
SALDO FINAL: R$ 3.349,60
```

### 4.2 Atualização e remoção

| Operação | Cálculo | Saldo após (R$) |
|---|---|---|
| **Atualizar** a transação 3: valor de 650,00 para 700,00 | 3.349,60 + 650,00 (desfaz) − 700,00 (aplica) | **3.299,60** |
| **Remover** a transação 4 (receita de 800,00) | 3.299,60 − 800,00 | **2.499,60** |

Extrato final após as duas operações (saldo final **R$ 2.499,60**):

```
 1  RECEITA  Empresa Alfa Ltda.        Salários        +3.500,00    3.500,00
 2  DESPESA  Companhia de Energia      Luz               -180,50    3.319,50
 3  DESPESA  Supermercado Bom Preço    Alimentação       -700,00    2.619,50
 5  DESPESA  Operadora Conecta         Comunicações      -119,90    2.499,60
SALDO FINAL: R$ 2.499,60
```

Os identificadores **não são renumerados** após a remoção (a transação 4 deixou de existir e o número 4 não é reaproveitado).

### 4.3 Situações de exceção

Com a conta no estado do extrato final acima (saldo **R$ 2.499,60**):

| # | Tentativa | Exceção | Resultado |
|---|---|---|---|
| E1 | Inserir despesa de **R$ 5.000,00** (Concessionária Veloz, Transporte) | `SaldoInsuficienteException` | recusada; saldo continua R$ 2.499,60 |
| E2 | Inserir despesa de **R$ −50,00** (Padaria Pão Quente, Alimentação) | `ValorInvalidoException` | recusada; saldo continua R$ 2.499,60 |
| E3 | Inserir despesa com nome `""` e descrição "Compra" (Alimentação, R$ 20,00) | `NomeInvalidoOuNuloException` | recusada; saldo continua R$ 2.499,60 |
| E4 | Inserir despesa "Farmácia Vida" de R$ 40,00 **sem categoria** | `CategoriaNaoDefinidaException` | recusada; saldo continua R$ 2.499,60 |
| E5 | Inserir **receita** com categoria "Luz" (categoria de despesa) | `CategoriaNaoDefinidaException` | recusada; saldo continua R$ 2.499,60 |
| E6 | **Remover** a transação 1 (receita de R$ 3.500,00): o saldo ficaria em 2.499,60 − 3.500,00 = **−1.000,40** | `SaldoInsuficienteException` | remoção recusada; a transação 1 continua na conta |
| E7 | **Atualizar** a transação 2 (despesa de 180,50) para o valor de R$ 9.000,00 | `SaldoInsuficienteException` | atualização recusada; transação 2 mantém o valor 180,50 |

> **Importante:** o programa **não pode encerrar com erro** ao encontrar essas situações. Cada exceção deve ser **tratada** (capturada), a mensagem apresentada ao usuário e a execução deve continuar.

---

## 5. Requisitos de projeto orientado a objetos

Esta é a parte central do trabalho. O grupo deve **demonstrar cada conceito no código e justificá-lo no relatório** (seção 8). Não basta "ter" o conceito: ele precisa ser usado com sentido no problema.

### 5.1 Classes e objetos
- Modelar o domínio em classes coesas (por exemplo: transação, receita, despesa, categoria, conta, titular) e criar objetos a partir delas.
- Cada classe deve ter **construtores** adequados (inclusive mais de um, quando fizer sentido) e responsabilidades bem definidas.
- A classe principal (`main`) deve apenas **criar objetos e enviar mensagens a eles**, sem concentrar regras de negócio.

### 5.2 Encapsulamento
- **Pacotes:** organizar o código em pacotes com responsabilidades claras. Sugestão (o grupo pode adaptar): `controlegastos.modelo`, `controlegastos.excecoes`, `controlegastos.servico` e `controlegastos.app`.
- **Interfaces:** definir **ao menos uma interface** de objetos (por exemplo, para imprimir ou para a conta registrar transações) e fazer classes a implementarem. Trechos do programa devem usar referências do tipo da interface.
- **Modificadores de acesso:** usar `private`, `protected`, de pacote (sem modificador) e `public`, cada um com uma razão. Em geral, atributos devem ser `private`, com acesso controlado por métodos. O relatório deve indicar **onde** e **por quê** cada modificador foi usado.
- **Modificadores de escopo:** usar elementos **estáticos** (por exemplo, o gerador de identificadores e métodos utilitários de formatação de valores) e **dinâmicos** (de instância), explicando a escolha.

### 5.3 Herança simples
- Criar uma superclasse para as transações (por exemplo, `Transacao`) e as subclasses `Receita` e `Despesa`, que reaproveitam atributos e comportamentos comuns e especializam o que for diferente.
- Usar `protected` e a chamada ao construtor da superclasse (`super`) quando fizer sentido.
- As exceções do sistema também devem formar uma **hierarquia**: uma exceção-base do aplicativo (por exemplo, `ControleGastosException`) estendida pelas quatro exceções da seção 3.

### 5.4 Polimorfismo
O trabalho deve conter **ao menos um exemplo de cada tipo** abaixo, identificado e comentado no código:

| Tipo | O que se espera (exemplos de uso) |
|---|---|
| **Sobrescrita** | `Receita` e `Despesa` sobrescrevem métodos da superclasse (por exemplo, o cálculo do efeito no saldo, a descrição para o extrato ou o método `toString`) |
| **Sobrecarga** | métodos de mesmo nome com parâmetros diferentes (por exemplo, `extrato()`, `extrato(Categoria)` e `extrato(LocalDate, LocalDate)`, ou diferentes formas de registrar uma transação) |
| **Coerção** | conversão implícita ou explícita entre tipos (por exemplo, um valor `int` passado onde se espera `double`, ou *casting* explícito de referências, com a verificação `instanceof`) |
| **Inclusão** | referências da superclasse ou da interface apontando para objetos de subclasses (por exemplo, uma lista de `Transacao` com receitas e despesas, tratadas de modo uniforme) |
| **Paramétrico** | ao menos **uma classe ou método genérico** escrito pelo grupo, com parâmetro de tipo (por exemplo, um `Repositorio<T extends Transacao>` ou um `Relatorio<T>`), e não apenas o uso de `ArrayList<...>` |

### 5.5 Exceções
- Definir as quatro exceções da seção 3 (e a exceção-base) como classes próprias, com construtores e mensagens.
- Usar `throw` e `throws` corretamente, e `try`/`catch` (e `finally`, se fizer sentido) no ponto em que o erro pode ser tratado.
- Garantir que a conta continue consistente quando uma exceção ocorre (seção 2.4).

---

## 6. Funcionalidades mínimas e demonstração

O programa deve conter uma classe `main` que **execute um roteiro de demonstração** reproduzindo os exemplos das seções 4.1, 4.2 e 4.3 (a ordem e o texto de saída podem ser adaptados, mas todos os casos devem ser executados), mostrando:

1. a inserção das cinco transações e o extrato resultante;
2. a atualização e a remoção, com o extrato e o saldo final;
3. as sete situações de exceção (E1 a E7), cada uma capturada e exibida com sua mensagem;
4. o saldo final conferido com o esperado (R$ 2.499,60, se os exemplos forem reproduzidos fielmente).

**Opcional (não substitui o roteiro):** um menu interativo de console para o usuário inserir, atualizar e remover transações.

---

## 7. Restrições

- Somente Java e a **biblioteca padrão**: sem frameworks, sem banco de dados e sem bibliotecas externas. É permitido usar `java.util` (coleções) e `java.time` (datas).
- Sem interface gráfica; aplicação de **console**.
- Os valores podem ser representados em `double`. O uso de `BigDecimal` é opcional e vale **bônus** (seção 10).
- Todo o código deve compilar e executar a partir da linha de comando, sem depender de uma IDE específica.

---

## 8. Entregáveis

O grupo deve entregar **um único arquivo `.zip`** (nome sugerido: `grupo_<numero>_controle_gastos.zip`), contendo:

1. **Código-fonte** completo, organizado em pastas correspondentes aos pacotes, mais um **`README.md`** com instruções de compilação e execução.
2. **Diagrama de classes UML** (PDF ou imagem) mostrando as classes, interfaces, pacotes, herança, atributos e métodos principais, e os elementos estáticos.
3. **Relatório** (de 3 a 5 páginas, em PDF) com:
   - identificação do grupo (nomes e matrículas dos 3 a 5 integrantes);
   - **mapa de conceitos:** para cada conceito da seção 1 (inclusive cada um dos cinco tipos de polimorfismo), indique **a classe e o trecho do código** onde aparece e **justifique** a escolha;
   - **decisões de projeto** (por exemplo, por que determinado modificador, interface ou pacote foi usado);
   - **divisão de tarefas:** o que cada integrante desenvolveu;
   - **limitações conhecidas** e o que o grupo faria diferente.
4. **Roteiro de testes:** tabela (pode estar no relatório) com os casos executados, a entrada, o resultado esperado e o resultado obtido (no mínimo os casos das seções 4.1 a 4.3).

---

## 9. Apresentação e avaliação individual

Cada grupo fará uma **demonstração** de, no máximo, 10 minutos, executando o programa e explicando as decisões de projeto. **Todos os integrantes devem participar** e responder a perguntas sobre qualquer parte do código. A nota do grupo poderá ser **ajustada individualmente** (para cima ou para baixo) conforme a participação comprovada no desenvolvimento e o domínio demonstrado na apresentação.

---

## 10. Critérios de avaliação (100 pontos)

| Critério | Pontos |
|---|---|
| **Classes e objetos:** modelagem adequada do domínio, coesão das classes, construtores, | 15 |
| **Encapsulamento:** pacotes, interfaces, modificadores de acesso e de escopo (estático e dinâmico) usados com sentido | 15 |
| **Herança simples:** hierarquia de transações e de exceções, uso correto de `super` e `protected` | 10 |
| **Polimorfismo:** 4 pontos para cada um dos cinco tipos (sobrescrita, sobrecarga, coerção, inclusão e paramétrico) | 20 |
| **Exceções:** as quatro exceções, ordem de verificação, tratamento sem encerrar o programa, conta consistente após a falha | 15 |
| **Funcionalidades:** inserção, atualização, remoção, saldo e extrato corretos; roteiro de demonstração completo | 10 |
| **Documentação:** diagrama UML, relatório (mapa de conceitos) e roteiro de testes | 10 |
| **Qualidade do código:** legibilidade, nomes, organização, comentários objetivos, `README` | 5 |
| **Total** | **100** |

**Bônus (até 5 pontos, sem ultrapassar 100):** uso de `BigDecimal` para valores monetários, ou consulta de extrato filtrada por categoria e por período, ou menu interativo bem estruturado.

**Descontos:** código que não compila (nota máxima de 50% do total do trabalho); grupo com número de integrantes fora do intervalo de 3 a 5 (o grupo deve ser regularizado antes da entrega); atraso na entrega, conforme regra da disciplina.

---

## 11. Orientações gerais

- **Autoria:** o trabalho deve ser **original do grupo**. Trabalhos copiados, de outros grupos ou de terceiros, receberão nota zero, para todos os envolvidos. O uso de ferramentas de apoio (inclusive de IA) deve ser **declarado no relatório**, e cada integrante precisa dominar o código que entrega.
- **Sugestão de etapas:**
  1. leitura do enunciado, formação do grupo e divisão inicial de tarefas;
  2. diagrama de classes e definição dos pacotes **antes** de programar;
  3. exceções e hierarquia de transações (`Transacao`, `Receita` e `Despesa`);
  4. conta, saldo e extrato;
  5. roteiro de demonstração e testes;
  6. relatório, revisão final do código e empacotamento.
- **Dúvidas:** em caso de dúvida sobre o enunciado, consultar o professor com antecedência; interpretações não previstas devem ser **explicadas no relatório**.


