UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos
---

## Estudo Dirigido - Avaliação 1


#### Exercícios conceituais sobre Computação Básica: 

Para cada um dos tópicos abaixo, forneça uma definição clara e objetiva e,
sempre que aplicável, inclua um breve exemplo de sua utilidade ou sintaxe:

1. Algoritmos: 
   - O que são e qual a sua importância na resolução de problemas computacionais?

1. Tipos de dados e variáveis: 
   - O que é uma variável na memória do computador? Cite os principais tipos
     primitivos de dados.

1. Comandos de entrada e saída (I/O): 
   - Qual a função desses comandos na interação entre o usuário e o programa?

1. Conversão de tipos (_Type-casting_): 
   - O que é e em quais situações precisamos forçar a conversão de um tipo de dado em outro?
   - O que é um up-casting? 
   - Diferencie o down-casting entre tipos de dados primitivos e de String para
     algum tipo de dado primitivo, em Java. Como cada caso de down-casting é
     realizado? 

1. Expressões
   - Defina e mostre a diferença entre operadores aritméticos, lógicos e
     relacionais. Dica: apresente a diferente entre esses operadores,
     considerando em sua resposta os tipos dos dados de entrada e de saída da
     expressão. 

1. Estruturas de controle
   - Explique o propósito das estruturas ``if``, ``if...else`` e
     ``switch...case``. Quando é mais vantajoso usar o ``switch...case`` em vez
     de múltiplos ``if...else``?

1. Estruturas de repetição
   - Qual a principal diferença prática entre o uso de um ``for``, um ``while``
     e um ``do...while``?

1. Vetores e matrizes
   - O que são ``arrays`` (vetores e matrizes) e qual a principal vantagem de
     utilizá-los em comparação ao uso de variáveis simples?

1. Funções e procedimentos   
   - Qual a diferença entre uma função e um procedimento? 
   - Explique os conceitos de "escopo de variável" (local vs. global) e
     "passagem de parâmetros".

---



## Exercícios práticos para a primeira avaliação

1.  Suponha que as seguintes instruções estejam no método `main` de seu
programa. Apresente o que será impresso como resultado dos comandos de impressão:

```java
public static void main (String[] args) {
   int a = 13; 
   int b = 10; 
   int c = 30; 
   
   String resposta1 = ""; 
   String resposta2 = ""; 
   
   resposta1 += a; 
   resposta1 += b; 
   resposta1 += c; 
   
   resposta2 += a + b + c; 
   
   System.out.println (resposta1); 
   System.out.println (resposta2); 
}
```

---

2.  No seguinte trecho de código, apresente as linhas em que ocorrem
type-casting. Apresente ainda qual será o resultado da execução das instruções.

```java
public static void main (String[] args) {
    String strA = JOptionPane.showInputDialog("Informe o valor de A"); //leu-se o valor 13.5
    String strB = JOptionPane.showInputDialog("Informe o valor de B"); //leu-se o valor 5
    float a = Float.parseFloat(strA);
    int b = Integer.parseInteger(strB); 
    
    JOptionPane.showMessageDialog(null, "A + B = " + (int)(a + b)); 
    JOptionPane.showMessageDialog(null, "A - B = " + (a - b));
}
```

---

3.  Analise o seguinte algoritmo e imprima seus resultados quando os valores de
`a`, `b` e `c` assumirem nas linhas x, y e z, respectivamente, os seguintes
valores: 

- a = 1, b = 2, c = 3 
- a = 3, b = 2, c = 4 
- a = 5, b = 3, c = 4 
- a = 3, b = 5, c = 3 
- a = 6, b = 3, c = 3 
- a = 5, b = 5, c = 5 
- a = 4, b = 2, c = 4

```java
public class Exercicio {

	public static void main(String[] args) {
		float a = lerFloat("Informe A:");
		float b = lerFloat("Informe B:");
		float c = lerFloat("Informe C:");
		
		String resposta = "";
		
		if (ehTriangulo(a, b, c)) {
			resposta += "Os lados informados formam um triangulo.\n";
			if (equilatero(a, b, c)) {
				resposta += "É um triangulo equilatero.\n";
			} else if (isosceles(a, b, c)) {
				resposta += "É um triangulo isosceles.\n";
			} else { 
				resposta += "É um triangulo escaleno.\n"; 
			}
			
			if (ehTrianguloRetangulo(a, b, c)) {
				resposta += "É um triangulo retangulo.";
			}
		} else {
			resposta += "Os valores informados não formam um triangulo.";
		}
		
		JOptionPane.showMessageDialog(null, resposta);
	}


	static boolean ehTrianguloRetangulo(float a, float b, float c) {
		boolean resposta = ( (a * a == b * b + c * c) || 
			                 (b * b == a * a + b * c) ||
			                 (c * c == a * a + b * b));
		return resposta;
	}


	static boolean isosceles(float a, float b, float c) {
		boolean resposta = ((a == b && a != c) || 
				            (a == c && a != b) ||
				            (b == c && b != a));
		return resposta;
	}

	static boolean equilatero(float a, float b, float c) {
		boolean resposta = (a == b && a == c);
		return resposta;
	}

	static boolean ehTriangulo(float a, float b, float c) {
		return (( a > Math.abs(b - c) && a < Math.abs(b + c)) && 
				( b > Math.abs(a - c) && b < Math.abs(a + c)) && 
				( c > Math.abs(a - b) && c < Math.abs(a + b)));
	}

	static float lerFloat(String msg) {
		String str = JOptionPane.showInputDialog(msg);
		float f = Float.parseFloat(str);
		return f;
	}

}
```

---

4.  Crie um algoritmo que seja capaz de converter um número natural na base
    decimal em seu equivalente em binário. Considere que a entrada será sempre
    um número positivo.   
Exemplos:  
- $0_{10} = 0_{2}$
- $1_{10} = 1_{2}$
- $2_{10} = 10_{2}$
- $3_{10} = 11_{2}$
- $4_{10} = 100_{2}$
- $5_{10} = 101_{2}$
- $6_{10} = 110_{2}$
- $7_{10} = 111_{2}$
- $8_{10} = 100_{2}$
- $9_{10} = 1001_{2}$
- $10_{10} = 1010_{2}$

---

5.  Crie um algoritmo que seja capaz de calcular a sequencia de Fibonacci em até
10 numeros. Os valores calculados para a sequencia deverão ser armazenados em um
vetor e apresentados ao final da execução. 

Exemplo:  
`[ 1, 1, 2, 3, 5, 8, 13, 21, 42, 63 ]`

:star: *Desafio:* utilize o passo do for para calcular a sequencia, sabendo que
o valor do 10o. elemento é 63.  

---

6.  Apresente o que será impresso para o usuário após toda a execução do
algoritmo abaixo: 

```java
    public static void main(String[] args) {
        int[] vetor = new int[] {9, 3, 6, 4, 5, 8, 0, 2, 7, 1};
        System.out.println(imprimirVetor(vetor));
        
        int[] resposta = foo(vetor, 3);
        System.out.println(imprimirVetor(resposta));
    }

    
    static int[] foo(int[] vetor, int k) {
        int[] novo = new int[vetor.length];
        int j = k;
        for (int i=0; i<vetor.length; i++) {
            novo[j] = vetor[i];
            j++;
            if (j == vetor.length) {
                j = 0;
            }
        }
        return novo;
    }

    
    static String imprimirVetor(int[] vetor) {
        String resposta = "[ ";
        for (int i=0; i<vetor.length; i++) {
            resposta += vetor[i] + (i < vetor.length - 1 ? ", " : " ]"); 
        }
        return resposta;
    }
```

---

7.  Apresente o resultado da execução do seguinte algoritmo: 

```java
    public static void main(String[] args) {
        
        int limite = 20; 
        boolean[] primos = new boolean[limite + 1];
        
        for (int i = 0; i < primos.length; i++) {
            primos[i] = true;
        }
        primos[0] = false; 
        primos[1] = false; 
        
        /**
         * Crivo de Erastótenes
         */
        for (int i=2; i*i < limite; i++) {
            if (primos[i]) {
                for (int j = i * i; j<=limite; j+=i) {
                    primos[j] = false;
                }
            }
        }
        
        for (int i = 0; i < primos.length; i++) {
            System.out.println(i + ": " + (primos[i] ? "primo" : "ñ-primo"));
        }
    }
```

