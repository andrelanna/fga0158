UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
--

Estudo dirigido - Encapsulamento 


1. O que é a propriedade **Encapsulamento** do paradigma de orientação por
   objetos. 

2. O que são classes? Quais são os elementos de uma classe? O que são objetos? 

3. O que é a **ocultação de informação / implementação**? 

4. O que é o estado de um objeto? O que significa a retenção de estado? 

5. Qual a forma de comunicação entre objetos? 

6. Os elementos definidos em uma classe possuem diferentes escopos. Quais são os
   escopos? Apresente-os, informando a quem o elemento pertence. 

7. É possível definir os graus de visibilidade para os elementos de uma classe,
   através dos modificadores de acesso. O que são modificadores de acesso e
quais são eles?

8. Explique a tabela abaixo, informando a visibilidade de um dado elemento de
   classe para cada um dos modificadores. 

   |           | Classe  | Pacote    | Subclasse\* | Mundo | 
   |-----------|---------|-----------|-------------|-------|
   | Público   |   Sim   |  Sim      |    Sim      |  Sim  |
   | Protegido |   Sim   |  Sim      |    Sim      |  Não  |
   | Padrão    |   Sim   |  Sim      |    Não      |  Não  |
   | Privado   |   Sim   |  Não      |    Não      |  Não  |
\* Sub-classes fora do pacote em que a superclasse está definida.

---

Para as questões 9 a 11, considere o seguinte diagrama de classes.  
Obs.: as classes que possuem o elemento ```get/set...()```, significa que tem os
métodos ```get```e ```set``` para todos os seus atributos.

![Diagram de classes para as questões de 9 a 11](diagramaDeClasses.jpg)

9. Explique com suas palavras o diagrama de classes, apresentando o papel de
   cada classe em termos de seus elementos e, principalmente, de suas
associações com outras classes.  
   **Resposta:**
   - O projeto está divido em quatro pacotes, a citar: Comum, RH, Acadêmico e
     APP. 
   - A classe ```PessoaFisica``` contém os elementos comuns a toda pessoa
     fisica, que são herdados pelas classes ```TecnicoAdministrativo```,
```Professor``` e ```Aluno```. Cada uma dessas classes _**é um tipo de**_
```PessoaFisica``` ao extender os elementos definidos na superclasse. 
   - Em se tratando de associações presentes no diagrama tem-se: 
       - Uma ```Universidade``` possui vários objetos ```Curso``` associados
         através da referência privada ```curso```.
       - Um ```Curso``` possui vários objetos ```Disciplina``` associados
	 através da referência privada ```disciplinas```, um objeto
```Professor``` associado através da referência privada ```coordenador``` que
desempenha o papel de coordenador do curso e, por fim, possui ainda várias
objetos ```Turma``` associados através da referência privada ```turmas```
representando as turmas que fazem parte daquele curso.
       - Cada ```Disciplina``` tem um objeto ```Turma``` associado através da
         referência ```t``` de visibilidade de pacote.
       - Cada ```Turma``` tem associados vários objetos de ```Aluno```
         associados através da referência privada ```aluno```.
       - Um ```Professor``` está associado a várias turmas através do atributo
         privado ```turmas```.


10. Para cada um dos elementos abaixo, apresente e justifique os elementos que
    ele consegue acessar diretamente de todas as outras classes, assumindo-se
que há uma referência pela qual será feito o acesso quando for o caso. Exemplo:  
```
Método m1, definido em Aluno --> Aluno.m1():   
- Todos os atributos e métodos da classe Aluno. 
- PessoaFisica.nome, PessoaFisica.cpf e métodos get e set --> Aluno é subclasse
  de PessoaFisica,
- Métodos get e set de TecnicoAdministrativo e Professor --> são métodos
  publicos definidos em uma classe presente em outro pacote e não há relação de
heranca entre Aluno e Professor.
- Todos os elementos públicos, protegidos e de pacote, presentes no pacote
  Acadêmico --> Turma.matricularAluno(), Disciplina.criarTurma(),
Curso.criarTurma() e Curso.criarDisciplina().
- Todos os elementos público presentes no pacote App.
```

- Principal.main()  
- Método m2, definido em Curso --> Curso.m2()
- Método m3, definido em TecnicoAdministrativo --> TecnicoAdministrativo.m3()
- Método m4, definido em PessoaFisica --> PessoaFisica.m4()

Respostas: 

- Principal.main() consegue acessar:
  - ```Universidade.nome``` e ```Universidade.cadastrarCurso```, através da
    própria classe ```Universidade```
  - Métodos ```Aluno.get/set...``` através de algum objeto ```Aluno```
    referenciado em ```main```
  - Métodos ```criarTurma``` e ```criarDisciplina```através de algum objeto
    ```Curso``` referenciado em ```main```
  - Método ```matricularAluno``` através de algum objeto ```Turma```
    referenciado em ```main```
  - método ```criarturma``` através de algum objeto ```disciplina```
    referenciado em ```main```

- Curso.m2() consegue acessar: 
  - todos os elementos (atributos e métodos) da própria classe ```Curso```
  - ```Aluno.matricula```, ```Aluno.curso```, ```Aluno.email```, ```Aluno.nome```, ```Aluno.cpf```, ```Aluno.get/set...()``` incluindo os métodos herdados de ```PessoaFisica```.
  - ```Turma.matricularAluno()```
  - ```Disciplina.criarTurma()```
  - ```TecnicoAdministrativo.criarTurma()```
  - ```Professor.criarTurma()```
  

11. Analise cada uma das instruções abaixo como correta ou incorreta,
    justificando o erro nos casos em que julgar incorreta. 

    a) Na classe Principal: 
    ```
    public static void main(String args) {

        Universidade.nome = "Universidade de Brasilia";

        Curso c = new Curso(); 
        c.cargaHoraria = 3000;

        Universidade u = new Universidade();
        u.cadastrarCurso(c);

        Disciplina d = new Disciplina;
        c.criarDisciplina(d);
    }
    ```

    b) Na classe Aluno, o método construtor: 
    ```
    Aluno(String n, String c, String i, String m, String cr, String e) {
        nome = n; 
        cpf = c; 
        identidade = i; 
        matricula = m;
        curso = cr; 
        email = e;
    }
    ```

    c) Na classe Turma, o método matricularAluno: 
    ```
    public boolean matricularAluno(Aluno a) {
        ...
        a.matricula = 13;
        a.email = "aluno@aluno.br";
        a.nome = "Andre"; 
        a.setCPF("000.000.000-00");
        a.setIdentidade("DF-00.000.000");
    }
    ```

    d) Na classe Curso, o método criarTurma: 
    ```
    public boolean criarTurma(Turma t) {
        cargaHoraria = 3200; 
        codigo = "FGA-0158";
        ...
        turmas[1] = t; 
        turmas[1].codigo = "A";
        turmas[1].cargaHoraria = 30; 
        ...
    }
    ```

Respostas: 

    a) Na classe Principal: 
    ```
    public static void main(String args) {

        Universidade.nome = "Universidade de Brasilia"; --> correto

        Curso c = new Curso();                          --> correto
        c.cargaHoraria = 3000;                          --> errado, atributo privado

        Universidade u = new Universidade();            --> correto, mas não faz
                                                            sentido pois a classe 
                                                            Universidade só tem 
                                                            elementos estáticos
        u.cadastrarCurso(c);                            --> errado,
                                                            cadastrarCurso é estático.

        Disciplina d = new Disciplina();                --> correto
        c.criarDisciplina(d);                           --> correto
    }
    ```

    b) Na classe Aluno, o método construtor: 
    ```
    Aluno(String n, String c, String i, String m, String cr, String e) {
        nome = n;        --> correto
        cpf = c;         --> correto
        identidade = i;  --> errado
        matricula = m;   --> correto
        curso = cr;      --> correto
        email = e;       --> correto
    }
    ```

    c) Na classe Turma, o método matricularAluno: 
    ```
    public boolean matricularAluno(Aluno a) {
        ...
        a.matricula = 13;                 --> correto
        a.email = "aluno@aluno.br";       --> correto
        a.nome = "Andre";                 --> correto
        a.setCPF("000.000.000-00");       --> correto
        a.setIdentidade("DF-00.000.000"); --> correto
    }
    ```

    d) Na classe Curso, o método criarTurma: 
    ```
    public boolean criarTurma(Turma t) {
        cargaHoraria = 3200;          --> correto
        codigo = "FGA-0158";          --> errado, codigo não é atributo de turma
        ...
        turmas[1] = t;                --> correto
        turmas[1].codigo = "A";       --> errado
        turmas[1].cargaHoraria = 30;  --> errado
        ...
    }
    ```

---

12. Apresente o resultado da execução do programa abaixo, com base nos códigos
    abaixo. 

    Classe Operando:
```
public class Operando {
	private float valor; 
	
	public Operando() {
		System.out.println("--> Construtor padrão de Operando");
		this.valor = 0; 
	}
	
	public Operando(float valor) {
		this.valor = valor;
	}
	
	public float getOperando() {
		return valor;
	}
}
```

Classe Calculadora:


```
public class Calculadora {
	Operando o1, o2; 
	public static final float PI = 3.14f;
	
	public Calculadora() {
		System.out.println("--> Construtor padrão Calculadora");
		o1 = new Operando();
		o2 = new Operando();
	}
	
	public Calculadora(Operando o1, Operando o2) {
		this.o1 = o1; 
		this.o2 = o2;
	}
	
	public float soma() {
		return o1.getOperando() + o2.getOperando();
	}
	
	public float subtracao() {
		return o1.getOperando() - o2.getOperando();
	}
}
```

Classe Principal:

```
public class Principal {
	
	public static void main(String[] args) {
		Calculadora c[] = new Calculadora[4];
		
		Operando o1, o2, o3; 
		o1 = new Operando(2);
		o2 = new Operando(0);
		o3 = new Operando(3);
		
		c[0] = new Calculadora();
		c[1] = new Calculadora(o1, o2);
		c[2] = new Calculadora(o2, o3);
		c[3] = new Calculadora(o1, o3);
		
		for (int i=0; i<c.length; i++) {
			System.out.println(c[i].soma());
			System.out.println(c[i].subtracao());
			System.out.println(c[i].o1.getOperando() * Calculadora.PI);
			System.out.println("-----");
		}
		
	}
}
```


Resposta: 

```
--> Construtor padrão Calculadora
--> Construtor padrão de Operando
--> Construtor padrão de Operando
0.0
0.0
0.0
-----
2.0
2.0
6.28
-----
3.0
-3.0
0.0
-----
5.0
-1.0
6.28
-----
```
