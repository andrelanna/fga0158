UnB - Universidade de Brasilia  
FCTE - Faculdade de Ciência e Tecnologia em Engenharias  
FGA0158 - Orientação por Objetos  

---

### Exercício 1 — Conceitos

Responda às perguntas abaixo com suas próprias palavras. Sempre que possível, ilustre a resposta com um exemplo diferente dos usados em aula.

1. Explique, com um exemplo próprio, a diferença entre **classe** e **objeto**.
2. O que são **atributos** e o que são **métodos** de um objeto? Dê um exemplo de cada um, usando uma classe `Aluno`.
3. O que significa dizer que um objeto possui um **estado**? O estado de um objeto pode mudar ao longo do tempo? Justifique com um exemplo.
4. Dois objetos da mesma classe podem ter estados diferentes entre si? E o mesmo estado? Explique.
5. O que é a **interface** de um objeto? Por que ela é importante para quem vai *utilizar* o objeto, mesmo sem conhecer os detalhes internos de sua implementação?
6. Considere uma classe `Semaforo`, com atributo `corAtual` (que pode ser `"vermelho"`, `"amarelo"` ou `"verde"`) e método `avancar()`, que muda a cor para a próxima do ciclo.
   a. Qual é o estado possível de um objeto dessa classe?
   b. Qual é a interface dessa classe?
   c. O método `avancar()` faz parte do estado ou da interface do objeto? Justifique.

---

### Exercício 2 — Diagramas de Classe e de Objeto

Considere o código Java abaixo:

```java
class Retangulo {

    double base;
    double altura;
    String cor;

    void setBase(double base) {
        this.base = base;
    }

    void setAltura(double altura) {
        this.altura = altura;
    }

    void setCor(String cor) {
        this.cor = cor;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerimetro() {
        return 2 * (base + altura);
    }

    String getCor() {
        return cor;
    }
}
```

E o trecho de código a seguir, que cria e manipula dois objetos dessa classe:

```java
Retangulo r1 = new Retangulo();
r1.setBase(4.0);
r1.setAltura(2.5);
r1.setCor("azul");

Retangulo r2 = new Retangulo();
r2.setBase(6.0);
r2.setAltura(6.0);
r2.setCor("vermelho");
```

**a)** Desenhe o **diagrama de classes** UML da classe `Retangulo`, indicando corretamente atributos e métodos, com seus respectivos tipos e parâmetros.

**b)** Desenhe o **diagrama de objetos** UML correspondente ao trecho de código acima, representando os objetos `r1` e `r2` com os valores atuais de seus atributos (estado de cada objeto após a execução do trecho).

**c)** Observando os dois diagramas, explique com suas palavras a diferença entre o que um diagrama de classes representa e o que um diagrama de objetos representa.

---

### Exercício 3 — Implementação

Implemente em Java uma classe chamada `ContaBancaria`, que representa uma conta bancária simples, com as seguintes características:

**Atributos:**
- `numero` (identificador da conta, tipo `int`)
- `titular` (nome do titular da conta, tipo `String`)
- `saldo` (saldo atual da conta, tipo `double`)

**Métodos:**
- `depositar(double valor)`: adiciona `valor` ao saldo. Se `valor` for negativo ou zero, a operação não deve ter efeito.
- `sacar(double valor)`: subtrai `valor` do saldo, **somente se** o saldo for suficiente (não é permitido saldo negativo). Se o valor solicitado for maior que o saldo disponível, ou for negativo/zero, a operação não deve ter efeito.
- `consultarSaldo()`: retorna o saldo atual da conta.
- métodos para definir o `numero` e o `titular` da conta, e para consultá-los.

**Requisitos:**
- Os atributos só devem ser alterados por meio dos métodos da classe, nunca diretamente pelo código que utiliza o objeto.
- Escreva também uma classe `TesteContaBancaria`, com um método `main`, que:
  1. Cria uma conta com número, titular e saldo inicial de sua escolha.
  2. Realiza pelo menos dois depósitos e dois saques (incluindo uma tentativa de saque com valor maior que o saldo disponível).
  3. Exibe o saldo final da conta no console.

**Reflexão (responda em um comentário no início do arquivo `ContaBancaria.java`):**
Quais métodos de `ContaBancaria` formam a interface dessa classe, ou seja, quais métodos alguém que for usar um objeto `ContaBancaria` precisa conhecer para manipulá-lo corretamente?
