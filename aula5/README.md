UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Aula 4 - Exercícios de revisão de programação básica

**Exercícios de fixação**  
_Os exercícios não serão utilizados para efeitos de avaliação da disciplina, mas
recomenda-se que sejam feitos para relembrar e praticar a programação de
computadores. Alguns exercícios poderão considerar algumas bibliotecas
específicas de Java (nesses casos haverá a indicação da utilização)._



1. Um histograma é um gráfico que representa a freqüência que um determinado
   valor ocorre dentro de um conjunto de dados. Por exemplo, seja o seguinte
conjunto de dados: ```[4, 2, 5, 2, 3, 1, 4, 5, 2, 2]```. O histograma horizontal
para esse conjunto seria o seguinte (considere cada * como uma ocorrência do
valor):  
```
1  *
2  ****
3  *
4  **
5  **
```

Faça um programa que leia um conjunto ```X``` de valores compreendidos entre
```[ min, max ]```, em que ```min``` e ```max``` representam os valores
inferior e superior do intervalo. Ao final de sua execução o programa deverá
imprimir o histograma do intervalo. 

:star: Desafio: adicione ao programa a funcionalidade de imprimir o histograma
_vertical_. no caso do exemplo acima o histograma vertical seria:  
```
  *       
  *       
  *   * * 
* * * * * 
1 2 3 4 5
```
 
--- 
2. Faça um programa que, a partir de um valor ```x``` informado pelo usuário
   pelo teclado seja capaz de ler ```x``` números compreendidos entre 0 e 20 e
armazená-los em um vetor. O programa deverá mostrar o vetor contendo os números
e em seguida ordená-los em ordem crescente. Ao final o programa deverá imprimir
o vetor ordenado. Exemplo de utilização do programa:  
```
Informe o número de valores a serem gerados: 10
Vetor original: [ 9, 2, 5, 6, 1, 6, 9, 15, 13, 0 ]
Vetor ordenado: [ 0, 1, 2, 5, 6, 6, 9, 9, 13, 15 ]
```

:star: Desafio: altere o programa para ler o valor ```x``` do teclado e
verifique se ```x``` é um quadrado perfeito. Sendo ```x``` um quadrado perfeito,
gere uma matriz ```M x M``` de contendo os ```x``` números lidos a partir do
teclado. O método Java para calcular a raiz quadrada é o ```Math.sqrt(num)```.
Apresente a matriz gerada e posteriormente a matriz com os valores
ordenados. Exemplo de utilização:  

```
Informe o número de valores a serem gerados: 9  
M= |  4 5 2 |
   | 19 5 3 |
   |  2 6 1 |

Matriz ordenada: 
M= | 1 2  2 |
   | 3 4  5 |
   | 5 6 19 |
```

:star::star: Desafio 2: altere as duas versões do programa para que ele seja
capaz de gerar aleatoriamente os números compreendidos entre ```0``` e ```k```
(```k``` informado pelo usuário). Utilize a biblioteca [Random](https://docs.oracle.com/en/java/javase/14/docs/api/java.base/java/util/Random.html) de Java.


--- 

