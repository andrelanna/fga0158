Unb - Universidade de Brasilia  
FCTE - Faculdade de Ciência e Tecnologia em Engenharias  
FGA-0158 -- Orientação por Objetos

## Estudo Dirigido 02 — Orientação a Objetos

**Tópicos:** objetos, construtores (padrão e alternativo), destrutores
(`finalize`), associação entre objetos, troca de mensagens

---

## Como usar este estudo dirigido

1. Leia o **resumo** abaixo e, em seguida, resolva os exercícios **na ordem**:
   eles vão do mais simples ao mais difícil.
2. Resolva primeiro no papel (conceitos, interpretação e diagramas). Só depois
   digite e execute o código Java.
3. Nos exercícios 3, 4 e 5 você deve produzir **três coisas**: o diagrama UML de
   classes, os diagramas UML de objetos dos casos propostos e a implementação em
Java. Compare a saída do seu programa com a saída esperada.
4. Os diagramas podem ser feitos à mão ou em ferramentas como draw.io.
5. Nos códigos deste material não usamos modificadores de acesso (`private`,
   `public`...) nem pacotes, pois ainda estão sendo estudados. As únicas
exceções são o `public static void main`, que você já conhece, e o `protected
void finalize()`, que deve ser copiado exatamente assim por enquanto.

### Hipótese de estudo sobre o coletor de lixo

Em Java, **não é possível prever quando** o coletor de lixo vai agir. Para que
os exercícios tenham resposta única, adote em **todos** os exercícios a hipótese
abaixo:

> Cada chamada a `System.gc()` faz o coletor de lixo agir **imediatamente**. O
> `finalize` de todo objeto que **não possui nenhuma referência** é executado e
> termina **antes** da instrução seguinte. Objetos que ainda possuem alguma
> referência **não** são coletados.

Se você executar os programas no seu computador, a mensagem do `finalize` pode
aparecer em outra posição ou nem aparecer. Esse comportamento real é discutido
na questão 6 do Exercício 1.

---

## Resumo de revisão

### 1. Objetos e referências

Um **objeto** é uma instância de uma classe, criada com `new`. Uma variável de
tipo-classe guarda uma **referência** (o "endereço") do objeto, e não o objeto
em si. Por isso duas variáveis podem referenciar o **mesmo** objeto:

```java
Lampada x = new Lampada();   // cria UM objeto; x referencia esse objeto
Lampada y = x;               // NAO cria outro objeto; y referencia o mesmo objeto
```

### 2. Construtores: padrão e alternativo

O **construtor** é executado uma única vez, no momento do `new`, e prepara o
estado inicial do objeto. Tem o **mesmo nome da classe** e **não tem tipo de
retorno**.

- **Construtor padrão:** não recebe parâmetros (`Lampada()`). Define valores
  iniciais "padrão".
- **Construtor alternativo:** recebe parâmetros (`Lampada(int potencia)`).
  Permite criar o objeto já com valores escolhidos por quem o cria.
- Se a classe **não declara nenhum** construtor, o Java fornece um padrão vazio
  de forma implícita. Se a classe declara **qualquer** construtor, esse
construtor implícito **deixa de existir**.

### 3. Destrutor: o método `finalize`

Java não tem destrutor explícito como C++. O mais próximo é o método `finalize`,
chamado pelo coletor de lixo **antes** de liberar um objeto que ficou **sem
nenhuma referência**. Ele é escrito assim:

```java
protected void finalize() {
    System.out.println("Objeto descartado");
}
```

O momento da chamada **não é garantido** e o método está marcado como obsoleto
(*deprecated*) nas versões recentes do Java, então o compilador emite um aviso
(*warning*). Isso é esperado.

### 4. Associação entre objetos

Há associação quando um objeto guarda, em um **atributo**, a **referência** de
outro objeto. Esse atributo faz parte do estado do objeto. O atributo pode
referenciar um único objeto (`Produto produto;`) ou vários (`Musica[]
musicas;`). Quando ainda não foi atribuído, vale `null`.

```java
class Pedido {
    Produto produto;     // associacao: Pedido conhece um Produto
    int quantidade;
}
```

### 5. Troca de mensagens

Objetos colaboram **enviando mensagens** uns aos outros, ou seja, chamando
métodos que fazem parte da **interface** do objeto receptor. O remetente precisa
conhecer **apenas a interface** do receptor, não sua implementação.

```java
// Dentro de Pedido: o objeto Pedido envia a mensagem retirar(...) ao objeto Produto
produto.retirar(quantidade);
```

Enviar uma mensagem a uma referência `null` provoca o erro
`NullPointerException`.

### Notação dos diagramas

- **Diagrama de classes:** retângulo com três compartimentos (nome, atributos,
  métodos). Atributos no formato `nome : tipo`; métodos no formato
`nome(parâmetros) : tipoRetorno`. A associação é uma linha entre as classes, com
**multiplicidade** nas pontas (`1`, `0..1`, `0..*`) e uma seta indicando a
navegabilidade.
- **Diagrama de objetos:** retângulo com `nomeDoObjeto : Classe` no topo e,
  abaixo, os atributos com seus **valores** (`atributo = valor`). Associações
aparecem como **linhas ligando objetos**. Uma referência `null` aparece como
`atributo = null` (sem linha). Dois objetos ligados ao mesmo objeto significam
que ele é **compartilhado**.

---

## Exercício 1 — Conceitos

Responda com suas palavras e, sempre que possível, apoie a resposta em um
pequeno trecho de código.

**1.** Explique a diferença entre **classe** e **objeto**. O que acontece quando
o comando `Livro l = new Livro();` é executado? Diferencie a **variável** `l` do
**objeto** criado. `l` é mesmo uma variável?

**2.** O que é um **construtor** e quando ele é executado? Cite duas diferenças
de sintaxe entre um construtor e um método comum.

**3.** O que é uma **mensagem** entre objetos? Na instrução
`lampada.acender();`, quem envia e quem recebe a mensagem? O que o remetente
precisa conhecer da classe `Lampada` para enviá-la?

**4.** Diferencie **construtor padrão** de **construtor alternativo**. Dada a
classe abaixo, o comando `Moeda m = new Moeda();` compila? Justifique e diga
como corrigir **sem remover** o construtor existente.

```java
class Moeda {
    double valor;

    Moeda(double valor) {
        this.valor = valor;
    }
}
```

**5.** Na classe abaixo, o que é armazenado no atributo `produto`? Ele contém
uma **cópia** do objeto `Produto` ou outra coisa? Explique a diferença entre os
atributos `quantidade` e `produto` e diga o que representa essa relação entre
`Pedido` e `Produto`.

```java
class Pedido {
    Produto produto;
    int quantidade;
}
```

**6.** Para que serve o método `finalize`? Quando ele é chamado? Por que **não
se deve** depender dele para tarefas importantes (como salvar dados) e por que o
compilador emite um aviso ao usá-lo?

**7.** Considere o trecho:

```java
Conta c1 = new Conta(100);
Conta c2 = c1;
c2.depositar(50);
System.out.println(c1.getSaldo());
```

Quantos objetos `Conta` existem ao final? Qual valor é impresso (considere que
`depositar` soma o valor ao saldo)? Explique o resultado usando os conceitos de
**referência** e **mensagem**.

**8.** Considere as classes `Produto` e `Pedido` do Exercício 2 (somente
`Produto` possui `finalize`) e o trecho:

```java
Pedido ped = new Pedido(new Produto("Lapis", 2.0, 50), 2);
ped = null;
System.gc();
```

a) O objeto `Pedido` e o objeto `Produto` ficam elegíveis para coleta? Qual
`finalize` pode ser executado?
b) Agora suponha que, **antes** de `ped = null;`, existisse a linha `Produto p =
ped.produto;`. O que muda? Qual `finalize` pode ser executado depois do
`System.gc()`?
c) Generalize: quando um objeto associado a outro é coletado?

**9.** A classe `Pedido` abaixo tem um construtor padrão que **não inicializa**
o atributo `produto`.

```java
Pedido ped = new Pedido();
System.out.println(ped.produto.nome);
```

O que acontece na execução deste trecho e por quê? Cite **duas** formas
diferentes de evitar o problema, uma envolvendo o construtor padrão e outra
envolvendo o código que envia a mensagem.

---

## Exercício 2 — Interpretação de código

Considere o programa Java abaixo e adote a hipótese de estudo sobre o coletor de
lixo (início deste material).

```java
class Produto {

    String nome;
    double preco;
    int estoque;

    Produto() {
        nome = "Sem nome";
        preco = 0;
        estoque = 0;
        System.out.println("Produto padrao criado");
    }

    Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        System.out.println("Produto criado: " + nome);
    }

    boolean retirar(int quantidade) {
        if (quantidade <= estoque) {
            estoque = estoque - quantidade;
            return true;
        }
        return false;
    }

    void repor(int quantidade) {
        estoque = estoque + quantidade;
    }

    protected void finalize() {
        System.out.println("Produto descartado: " + nome);
    }
}

class Pedido {

    Produto produto;
    int quantidade;
    boolean confirmado;

    Pedido() {
        quantidade = 1;
        confirmado = false;
        System.out.println("Pedido padrao criado");
    }

    Pedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
        confirmado = false;
        System.out.println("Pedido criado para " + produto.nome);
    }

    void confirmar() {
        if (produto != null && produto.retirar(quantidade)) {
            confirmado = true;
        }
    }

    double calcularTotal() {
        if (produto == null) {
            return 0;
        }
        return produto.preco * quantidade;
    }
}

class Principal {

    public static void main(String[] args) {
        Produto p1 = new Produto("Caderno", 12.50, 10);
        Produto p2 = new Produto();
        Pedido ped1 = new Pedido(p1, 4);
        Pedido ped2 = new Pedido(p1, 8);
        Pedido ped3 = new Pedido();

        System.out.println("A: " + p1.estoque);

        ped1.confirmar();
        System.out.println("B: " + p1.estoque);

        ped2.confirmar();
        System.out.println("C: " + ped2.confirmado + " " + p1.estoque);

        Produto p3 = p1;
        p3.repor(5);
        ped2.confirmar();
        System.out.println("D: " + ped2.confirmado + " " + p1.estoque);

        ped3.produto = p2;
        ped3.confirmar();
        System.out.println("E: " + ped3.confirmado + " " + ped3.calcularTotal());

        System.out.println("F: " + ped1.calcularTotal() + " " + ped2.calcularTotal());

        p2 = null;
        System.gc();
        System.out.println("G");

        ped3 = null;
        System.gc();
        System.out.println("H");
    }
}
```

**a)** Escreva, em ordem, as **cinco primeiras linhas** impressas no console,
antes da linha que começa com `A:`.

**b)** Quais são as linhas impressas que começam com `A:` e `B:`?

**c)** Quais são as linhas `C:` e `D:`? Explique por que `ped2` **não** foi
confirmado na primeira chamada de `confirmar()` e **foi** confirmado na segunda.
Qual papel teve a variável `p3`?

**d)** Liste, em ordem, todas as **mensagens trocadas entre objetos** durante a
execução de `ped1.confirmar();`, indicando remetente, receptor e método
(considere o `main` como remetente da primeira mensagem).

**e)** Quais são as linhas `E:` e `F:`? Justifique o valor de cada número
impresso.

**f)** Escreva as linhas impressas **da linha `F:` até o fim do programa**
(incluindo `G`, `H` e qualquer mensagem de `finalize`). Explique por que
**nada** é descartado no primeiro `System.gc()` mesmo que `p2` valha `null`, e
por que algo é descartado no segundo.

**g)** Suponha que a linha `ped3.produto = p2;` fosse **removida** (as demais
linhas permanecem iguais). Reescreva as linhas `E:`, `G` e `H`, indicando em que
posição da saída apareceria a mensagem do `finalize`. O programa ainda
funcionaria sem erro? Por quê?

---

## Exercício 3 — Modelagem e implementação: Lâmpada

**Enunciado.** Uma lâmpada possui uma potência (em watts) e pode estar acesa ou
apagada. Ao ser criada com o **construtor padrão**, a lâmpada tem 60 W e está
apagada. Ao ser criada com o **construtor alternativo**, o usuário informa a
potência e a lâmpada começa apagada. É possível acender e apagar a lâmpada,
perguntar se ela está acesa e consultar sua potência. Quando a lâmpada é
descartada, deve ser impressa a mensagem `Lampada de <potencia>W descartada`.

**Membros esperados da classe `Lampada`:**

| Tipo | Membro |
|---|---|
| Atributos | `potencia` (`int`), `acesa` (`boolean`) |
| Construtores | `Lampada()` e `Lampada(int potencia)` |
| Métodos | `acender()`, `apagar()`, `estaAcesa()` _(retorna `boolean`)_, `getPotencia()` _(retorna `int`)_ |
| Destrutor | `protected void finalize()` |

**Programa principal a ser usado nos testes:**

```java
class Principal {

    public static void main(String[] args) {
        // Caso 1
        Lampada a = new Lampada();
        System.out.println("a: " + a.getPotencia() + "W, acesa=" + a.estaAcesa());

        // Caso 2
        Lampada b = new Lampada(100);
        b.acender();
        System.out.println("b: " + b.getPotencia() + "W, acesa=" + b.estaAcesa());

        // Caso 3
        Lampada c = b;
        c.apagar();
        a.acender();
        System.out.println("a: acesa=" + a.estaAcesa());
        System.out.println("b: acesa=" + b.estaAcesa());
        System.out.println("c: acesa=" + c.estaAcesa());

        // Caso 4
        b = null;
        System.gc();
        System.out.println("fim do passo 1");
        c = null;
        System.gc();
        System.out.println("fim do passo 2");
    }
}
```

**Tarefas:**

1. Desenhe o **diagrama de classes** de `Lampada`.
2. Desenhe um **diagrama de objetos** para o estado do programa ao **final** de
cada caso:
   - **Caso 1:** objetos e variáveis existentes após o primeiro bloco;
   - **Caso 2:** estado após o segundo bloco;
   - **Caso 3:** estado após o terceiro bloco (quantos objetos existem? quantas
     variáveis?);
   - **Caso 4:** estado após cada um dos dois `System.gc()`.
3. **Implemente** a classe `Lampada` em Java e execute o programa principal
acima.
4. Compare sua saída com a **saída esperada** (hipótese do coletor de lixo):

```
a: 60W, acesa=false
b: 100W, acesa=true
a: acesa=true
b: acesa=false
c: acesa=false
fim do passo 1
Lampada de 100W descartada
fim do passo 2
```

**Para refletir:** por que a mensagem do `finalize` **não** aparece logo após `b
= null;`? Quais construtores foram executados em cada caso?

---

## Exercício 4 — Modelagem e implementação: Livro e Autor

**Enunciado.** Uma biblioteca registra livros e seus autores. Um **autor**
possui nome e nacionalidade. Um **livro** possui título, número de páginas e
**um autor** (associação: o livro guarda a referência de um objeto `Autor`).
Vários livros podem ter o **mesmo** autor. Um livro pode existir sem autor
cadastrado.

- `Autor()` cria um autor com nome `"Desconhecido"` e nacionalidade `"Nao
  informada"`. `Autor(String nome, String nacionalidade)` cria o autor com os
valores informados.
- `Livro()` cria um livro com título `"Sem titulo"`, 0 páginas e **sem autor**.
  `Livro(String titulo, int paginas, Autor autor)` cria o livro com os valores
informados.
- O livro pode **trocar de autor**, informar o **nome do seu autor** (devolvendo
  `"Autor nao cadastrado"` caso não tenha autor), dizer se é **longo** (mais de
300 páginas) e montar uma **descrição** no formato `título (N pag.) - nome do
autor`.
- A descrição do livro deve obter o nome do autor **enviando uma mensagem** ao
  objeto `Autor`.
- Ao serem descartados, o autor imprime `Autor descartado: <nome>` e o livro
  imprime `Livro descartado: <titulo>`.

**Membros esperados:**

| Classe | Atributos | Construtores | Métodos |
|---|---|---|---|
| `Autor` | `nome` (`String`), `nacionalidade` (`String`) | `Autor()`, `Autor(String, String)` | `getNome()`, `finalize()` |
| `Livro` | `titulo` (`String`), `paginas` (`int`), `autor` (`Autor`) | `Livro()`, `Livro(String, int, Autor)` | `trocarAutor(Autor)`, `getNomeAutor()`, `ehLongo()`, `descricao()`, `finalize()` |

**Programa principal a ser usado nos testes:**

```java
class Principal {

    public static void main(String[] args) {
        // Caso 1
        Autor a1 = new Autor("Machado de Assis", "Brasileira");
        Livro l1 = new Livro("Dom Casmurro", 256, a1);
        System.out.println(l1.descricao());

        // Caso 2
        Livro l2 = new Livro("Memorias Postumas", 224, a1);
        System.out.println(l2.descricao());

        // Caso 3
        Livro l3 = new Livro();
        System.out.println(l3.descricao());

        // Caso 4
        l2.trocarAutor(new Autor("Clarice Lispector", "Brasileira"));
        System.out.println(l1.descricao());
        System.out.println(l2.descricao());

        // Caso 5
        l3 = null;
        System.gc();
        System.out.println("fim");
    }
}
```

**Tarefas:**

1. Desenhe o **diagrama de classes** com as duas classes e a **associação**
   entre elas, indicando a multiplicidade (um livro tem quantos autores? um
autor pode estar em quantos livros?).
2. Desenhe o **diagrama de objetos** para o estado do programa ao final de cada
caso:
   - **Caso 2:** quantos objetos `Autor` existem e quem os referencia?
   - **Caso 3:** como representar o atributo `autor` do livro `l3`?
   - **Caso 4:** estado completo (três livros e os autores existentes). Algum
     objeto `Autor` ficou sem referências?
   - **Caso 5:** quais objetos ficam sem referência?
3. **Implemente** as classes `Autor` e `Livro` em Java.
4. Compare sua saída com a **saída esperada**:

```
Dom Casmurro (256 pag.) - Machado de Assis
Memorias Postumas (224 pag.) - Machado de Assis
Sem titulo (0 pag.) - Autor nao cadastrado
Dom Casmurro (256 pag.) - Machado de Assis
Memorias Postumas (224 pag.) - Clarice Lispector
Livro descartado: Sem titulo
fim
```

**Para refletir:**
- Quais **mensagens** são trocadas entre objetos quando `l1.descricao()` é
  executado?
- Por que a mensagem `Autor descartado: ...` **não** aparece na saída? Em que
  condição ela apareceria?
- O que aconteceria se `getNomeAutor()` **não** verificasse `autor == null` e o
  programa chamasse `l3.descricao()`?

---

## Exercício 5 — Modelagem e implementação: Playlist e Música

**Enunciado.** Um aplicativo de música organiza **playlists** com **músicas**.
Uma **música** possui título e duração em segundos. Uma **playlist** possui
nome, uma **capacidade máxima** e guarda as músicas em um **vetor** (associação
de **multiplicidade 0..\***: uma playlist tem várias músicas). A mesma música
pode estar em **várias playlists** ao mesmo tempo (o objeto `Musica` é
**compartilhado**, não copiado).

- `Musica()` cria uma música com título `"Sem titulo"` e duração 0.
  `Musica(String titulo, int segundos)` cria a música com os valores informados.
- Uma música pode ser **renomeada** e informa sua **duração** no formato
  `<minutos>min <segundos>s` (por exemplo, 180 segundos resultam em `3min 0s`).
- `Playlist()` cria uma playlist de nome `"Nova playlist"` e capacidade 3.
  `Playlist(String nome, int capacidade)` cria a playlist com os valores
informados. Toda playlist nasce vazia (`quantidade = 0`).
- A playlist pode **adicionar** uma música (devolve `false` se estiver cheia,
  `true` caso contrário), **remover** a música de uma posição (devolve `false`
se a posição for inválida; ao remover, as músicas seguintes são **deslocadas uma
posição à esquerda** e a última posição ocupada passa a valer `null`), calcular
a **duração total** em segundos e devolver a **música mais longa** (ou `null` se
estiver vazia).
- Para calcular a duração total e encontrar a música mais longa, a playlist deve
  percorrer suas músicas **enviando a mensagem** `getSegundos()` a cada uma
delas (a música devolve sua duração em segundos).
- Ao serem descartadas, a música imprime `Musica descartada: <titulo>` e a
  playlist imprime `Playlist descartada: <nome>`.

**Membros esperados:**

| Classe | Atributos | Construtores | Métodos |
|---|---|---|---|
| `Musica` | `titulo` (`String`), `segundos` (`int`) | `Musica()`, `Musica(String, int)` | `renomear(String)`, `getSegundos()` (retorna `int`), `duracao()` (retorna `String`), `finalize()` |
| `Playlist` | `nome` (`String`), `musicas` (`Musica[]`), `quantidade` (`int`) | `Playlist()`, `Playlist(String, int)` | `adicionar(Musica)` (`boolean`), `remover(int)` (`boolean`), `duracaoTotal()` (`int`), `maisLonga()` (`Musica`), `finalize()` |

**Programa principal a ser usado nos testes:**

```java
class Principal {

    public static void main(String[] args) {
        Musica m1 = new Musica("Aquarela", 270);
        Musica m2 = new Musica("Asa Branca", 180);
        Musica m3 = new Musica();
        Playlist p1 = new Playlist("Favoritas", 3);
        Playlist p2 = new Playlist();

        // Caso 1
        p1.adicionar(m1);
        p1.adicionar(m2);
        p1.adicionar(m3);
        System.out.println("adicionar na cheia: " + p1.adicionar(m1));
        p2.adicionar(m2);
        System.out.println("p1: " + p1.quantidade + " musicas, " + p1.duracaoTotal() + "s");
        System.out.println("p2: " + p2.quantidade + " musicas, " + p2.duracaoTotal() + "s");

        // Caso 2
        p1.remover(0);
        System.out.println("p1: " + p1.quantidade + " musicas, " + p1.duracaoTotal() + "s");

        // Caso 3
        Musica longa = p2.maisLonga();
        longa.renomear("Asa Branca (ao vivo)");
        System.out.println("p1[0]: " + p1.musicas[0].titulo + " - " + p1.musicas[0].duracao());

        // Caso 4
        m1 = null;
        System.gc();
        System.out.println("fim do passo 1");
        m2 = null;
        longa = null;
        System.gc();
        System.out.println("fim do passo 2");
    }
}
```

**Tarefas:**

1. Desenhe o **diagrama de classes** com `Musica`, `Playlist` e a **associação**
   entre elas (multiplicidade e navegabilidade).
2. Desenhe o **diagrama de objetos** do estado do programa ao final de cada
caso, **mostrando o vetor** `musicas` de cada playlist e as referências das
variáveis do `main`:
   - **Caso 1:** três músicas e duas playlists. Quem referencia `m2`? O que
     contém cada posição do vetor de `p1` e de `p2`?
   - **Caso 2:** estado após `p1.remover(0)`. Como ficou o vetor de `p1`? A
     música `m1` ainda existe? Quem a referencia?
   - **Caso 3:** estado após o `renomear`. Quantas variáveis/atributos
     referenciam o objeto renomeado? O que `p1.musicas[0].titulo` revela sobre o
compartilhamento?
   - **Caso 4:** estado após cada `System.gc()`. Quais objetos ficam sem
     referência em cada passo?
3. **Implemente** as classes `Musica` e `Playlist` em Java.
4. Compare sua saída com a **saída esperada** (hipótese do coletor de lixo):

```
adicionar na cheia: false
p1: 3 musicas, 450s
p2: 1 musicas, 180s
p1: 2 musicas, 180s
p1[0]: Asa Branca (ao vivo) - 3min 0s
Musica descartada: Aquarela
fim do passo 1
fim do passo 2
```

**Para refletir:**
- Por que `m2 = null; longa = null;` **não** faz a música "Asa Branca (ao vivo)"
  ser descartada? O que precisaria acontecer para que ela fosse coletada?
- Liste a sequência de **mensagens** trocadas entre objetos durante
  `p1.duracaoTotal()` no Caso 1.
- O que aconteceria se `adicionar` não verificasse se a playlist está cheia?
- Por que a mensagem de descarte da música "Sem titulo" (`m3`) e das playlists
  **nunca** aparece neste programa?
