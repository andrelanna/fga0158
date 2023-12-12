UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
Prof. André Lanna  


## Estudo Dirigido sobre Orientação a Objetos:  Encapsulamento, Herança e Polimorfismo

**1. encapsulamento:**  
**a. definição:** o que é encapsulamento em programação orientada a objetos?    
**b. objetivo:** por que o encapsulamento é importante no desenvolvimento de software?    
  
**2. Herança:**  
**a. Definição:** O que é herança em programação orientada a objetos?  
**b. Vantagens:** Quais são as vantagens de usar herança em um sistema?  
  
**3. Polimorfismo por Sobrescrita de Métodos:**  
**a. Definição:** O que é polimorfismo por sobrescrita de métodos?  
**b. Exemplo Prático:** Forneça um exemplo de como você implementaria polimorfismo por sobrescrita de métodos em uma situação do mundo real.  
  
**4. Polimorfismo por Sobrecarga de Métodos:**  
**a. Definição:** O que é polimorfismo por sobrecarga de métodos?  
**b. Diferença:** Explique a diferença entre sobrescrita e sobrecarga de métodos.  
  
**5. Polimorfismo por Inclusão:**  
**a. Definição:** O que é polimorfismo por inclusão?  
**b. Benefícios:** Como o polimorfismo por inclusão contribui para a flexibilidade do código?  
  
**6. Polimorfismo por Coerção:**  
**a. Definição:** O que é polimorfismo por coerção?  
**b. Exemplo Prático:** Forneça um exemplo prático de como a coerção pode ser aplicada em programação orientada a objetos.  
  
**7. Aplicação Prática de Encapsulamento:**  
**a. Cenário:** Imagine um sistema de gerenciamento de funcionários. Como você aplicaria o encapsulamento para proteger dados sensíveis, como salário?  
  
**8. Aplicação Prática de Herança:**  
**a. Cenário:** Considere um sistema de gestão de veículos. Como você aplicaria a herança para representar diferentes tipos de veículos, como carros e bicicletas?  
  
**9. Aplicação Prática de Polimorfismo por Inclusão:**  
**a. Cenário:** Em um sistema de comércio eletrônico, como você usaria o polimorfismo por inclusão para processar diferentes tipos de pedidos, como pedidos de produtos físicos e assinaturas digitais (ex.: assinaturas de streaming)?  
  
**10. Aplicação Prática de Polimorfismo por Coerção:**  
**a. Cenário:** Em um sistema de processamento de documentos, como você aplicaria o polimorfismo por coerção para lidar com diferentes formatos de arquivo?  


---
### Exercício prático 1 - Encapsulamento e Herança em Java


Considere um sistema de gestão de uma biblioteca com livros e revistas. Ele
possui as seguintes classes já implementadas: 

```java
// Classe principal para representar um Item da biblioteca
public class ItemBiblioteca {
	String titulo;
	int anoPublicacao;

	public ItemBiblioteca(String titulo, int anoPublicacao) {
    	this.titulo = titulo;
    	this.anoPublicacao = anoPublicacao;
	}

	// Métodos getters e setters para encapsular os atributos
	public String getTitulo() {
    	return titulo;
	}

	public int getAnoPublicacao() {
    	return anoPublicacao;
	}
}

// Classe derivada que representa um Livro
public class Livro extends ItemBiblioteca {
	private String autor;

	public Livro(String titulo, int anoPublicacao, String autor) {
    	super(titulo, anoPublicacao);
    	this.autor = autor;
	}

	// Método getter para o atributo específico da classe Livro
	public String getAutor() {
    	return autor;
	}
}

// Classe derivada que representa uma Revista
public class Revista extends ItemBiblioteca {
	private int numeroEdicao;

	public Revista(String titulo, int anoPublicacao, int numeroEdicao) {
    	super(titulo, anoPublicacao);
    	this.numeroEdicao = numeroEdicao;
	}

	// Método getter para o atributo específico da classe Revista
	public int getNumeroEdicao() {
    	return numeroEdicao;
	}
}

```

Com base nas classes acima responda às seguintes questões: 

**11. Encapsulamento:**
1. Visibilidade de pacote: Considere que a classe ItemBiblioteca está no pacote
   A e as classes Livro e Revista estão no pacote B. Quais elementos da classe
   ItemBiblioteca estão acessíveis pelas classes Livro e Revista? Por que? 
2. Visibilidade de pacote: Considere que as classes ItemBiblioteca e as classes
   Livro e Revista estão no mesmo pacote A. Quais elementos da classe
   ItemBiblioteca estão acessíveis pelas classes Livro e Revista? Por que? 
3. Visibilidade protegida: Considere que a classe ItemBiblioteca está no pacote
   A e as classes Livro e Revista estão no pacote B. Quais elementos da classe
   ItemBiblioteca estão acessíveis pelas classes Livro e Revista? Por que? 

**12. Herança e polimorfismo:**
Utilizando as classes do exercício anterior, crie um programa principal em Java
que demonstre o polimorfismo. Para isso, utilize um método polimórfico por
sobrescrita, de modo que ele informe as características comuns e específicas do
objeto. Instancie objetos das classes Livro e Revista e armazene-os em um array
do tipo ItemBiblioteca. Em seguida, itere sobre o array e exiba informações de
cada item, demonstrando assim o polimorfismo.

---
### Exercício prático 2 - Herança e Polimorfismo

Para as questões 13 e 14 considere o seguinte trecho de código

```java
// Classe base
class Animal {
    void comer() {
        System.out.println("Animal comendo...");
    }

    void emitirSom() {
        System.out.println("Som genérico de um animal...");
    }
}

// Subclasse direta
class Mamifero extends Animal {
    void amamentar() {
        System.out.println("Mamífero amamentando...");
    }

    void emitirSom() {
        System.out.println("Som genérico de um mamífero...");
    }
}

// Subclasse indireta
class Cao extends Mamifero {
    void latir() {
        System.out.println("Cão latindo...");
    }

    void emitirSom() {
        System.out.println("Latido de um cão...");
    }
}

// Nova subclasse direta
class Ave extends Animal {
    void voar() {
        System.out.println("Ave voando...");
    }

    void emitirSom() {
        System.out.println("Som genérico de uma ave...");
    }
}

// Nova subclasse indireta
class Gato extends Mamifero {
    void miar() {
        System.out.println("Gato miando...");
    }

    void emitirSom() {
        System.out.println("Miado de um gato...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Exemplo de uso
        Cao meuCao = new Cao();
        meuCao.comer();  // Método da classe Animal
        meuCao.amamentar();  // Método da classe Mamifero
        meuCao.latir();  // Método da classe Cao
        meuCao.emitirSom();  // Método sobrescrito da classe Cao

        Ave minhaAve = new Ave();
        minhaAve.comer();  // Método da classe Animal
        minhaAve.voar();  // Método da classe Ave
        minhaAve.emitirSom();  // Método sobrescrito da classe Ave

        Gato meuGato = new Gato();
        meuGato.comer();  // Método da classe Animal
        meuGato.amamentar();  // Método da classe Mamifero
        meuGato.miar();  // Método da classe Gato
        meuGato.emitirSom();  // Método sobrescrito da classe Gato
    }
}
```

13. Quais são os métodos polimórficos por sobrescrita nas classes apresentadas
    anteriormente? Justifique o porquê deles serem considerados sobrescritos.

14. Considere o seguinte trecho de código do método ```main``` de uma aplicação: 
```java
public class Main {
    public static void main(String[] args) {
        // Criando objetos de diferentes tipos de animais
        Cao meuCao = new Cao();
        Ave minhaAve = new Ave();
        Gato meuGato = new Gato();

        // Criando um array de Animal e armazenando diferentes tipos de animais
        Animal[] animais = {meuCao, minhaAve, meuGato};

        // Iteração sobre o array usando polimorfismo por inclusão
        for (Animal animal : animais) {
            animal.comer();  
            animal.emitirSom();  
            System.out.println(); 
        }
    }
}
```

Com base no método ```main``` acima, indique onde: 
1. é utilizado o polimorfismo por inclusão; 
2. é realizada a chamada a métodos sobrescritos; 
3. qual é a saída (impressões) no console após a execução do método ```main```.  
   
---
### Exercício prático 3 - Herança e Polimorfismo

Abaixo está um trecho de código de uma função ```main``` em que há algumas
instâncias de animais criadas à partir das classes definidas anteriormente.    

```java
public class Main {
    public static void main(String[] args) {
        // Criando objetos de diferentes tipos de animais
        Cao meuCao = new Cao();
        Ave minhaAve = new Ave();
        Gato meuGato = new Gato();

        // Criando um array de Animal e armazenando diferentes tipos de animais
        Animal[] animais = {meuCao, minhaAve, meuGato};
        
        //instruções para as questões 15 a 17 devem ser inseridas abaixo
        ...
    }
}
```
_Dica:_ justifiquem os erros nas alternativas que julgarem erradas! :wink:

15. Qual a instrução para fazer com que todos os animais se alimentem? 

a. 
```java
   for (Animal a: animais) {
      a.emitirSom();
   } 
```
b. 
```java
   for (Animal a: animais) {
      a.latir();
   } 
```
c. 
```java
   for (Cachorro c: animais) {
      c.latir();
   } 
```
d. 
```java
   for (Gato g: animais) {
      g.emitirSom();
   } 
```

16. Quais das instruções abaixo estão corretas para fazer o gato miar? 
a. 
```java
   Mamifero m = (Mamifero)animais[2];
   m.miar(); 
```
b. 
```java
   Gato g = (Gato)animais[2];
   g.miar();
```
c. 
```java
   ((Gato)animais[2]).miar();
```
d. 
```java
   animais[2].miar();
```


17. Quais das instruções abaixo estão corretas para fazerem os mamíferos
    amamentarem? 

a. 
```java
   Mamifero m; 
   m = (Mamifero) animais[0];
   m.amamentar(); 
   m = (Mamifero) animais[2];
   m.amamentar(); 
```
b. 
```java
   for (Animal a: animais) { 
      a.amamentar(); 
   }
```
c. 
```java
   Mamifero[] m = new Mamifero[2];
   m[0] = (Mamifero)animais[0];
   m[1] = (Mamifero)animais[2];
   for (Mamifero k: m) {
      k.amamentar(); 
   }
```
d. 
```java
   Mamifero[] m = new Mamifero[2];
   m[0] = (Cachorro)animais[0];
   m[1] = (Gato)animais[2];
   for (Mamifero k: m) {
      k.amamentar(); 
   }
```
