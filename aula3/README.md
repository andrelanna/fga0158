UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Aula 3 - Revisão de programação - parte 2

**Tópicos da aula**
- Instruções condicionais
- Instruções de repetição
- Identificadores
- Vetores
- Matrizes
- Funções
- Procedimentos

**Slides da aula**

* [Slides](https://docs.google.com/presentation/d/1FxvKa4ueOEJT-cf7Lo-zZUz64PFOtQWv0xCUqBbz3ro/edit?usp=sharing)

**Vídeos da aula**

* [Vídeo 1 - Conceitos](https://www.youtube.com/watch?v=3Ub9zo6zSOs)
* [Vídeo 2 - Prática, parte 1](https://www.youtube.com/watch?v=sR8yt0iqPSk)
* [Vídeo 3 - Prática, parte 2](https://www.youtube.com/watch?v=LpNDPsdxvDo)

**Exercícios de fixação**

1. Crie um programa que seja capaz de ler os dados e calcular o perímetro e a
   área das seguintes figuras geométricas: círculo, quadrado, retângulo e
   trapézio. O usuário deverá inicialmente informar qual a figura geométrica e,
   a partir de então, os programa deverá ler os dados da figura e calcular seu
   perímetro e área. Utilize funções para o cálculo da área e do perímetro de
   figura.   

Exemplo de utilização:  

```
Escolha a figura geométrica desejada  
1 - Circulo  
2 - Quadrado  
3 - Retângulo  
4 - Trapézio  
```

Supondo que o usuário tenha escolhido a opção ```Círculo```, o programa
apresenta a seguinte mensagem em seguida:  
```Informe o raio do círculo```  

Tendo o usuário informado ```10``` como raio do círculo, o programa apresentará
em seguida:  
```O perímetro do círculo é 62,8 e a área é 314,15.```
        
   > [!NOTE]
   > 1 - Será necessário importar a biblioteca Math ```java.lang.Math```
   > para fazer o uso da constante PI e de funções como potencia, dentre outras.   
   > 2 - Dica: utilize a instrução `switch-case` para realizar os cálculos de
   > área e perímetro conforme o tipo de figura selecionada pelo usuário.  


Para o caso do triângulo, crie uma **função** que avalie se os lados informados
são capazes de formar um triângulo. Para tal, as seguintes regras devem ser
satisfeitas:  
```|b-c| < a < b+c```  
```|a-c| < b < a+c```  
```|a-b| < c < a+b```  
Para o caso do triângulo o programa deverá ainda verificar se os lados formam um
triângulo retângulo. Caso sejam lados de um triângulo retângulo, o cálculo da
área deverá ser feito através da fórmula do Teorema de Pitágoras. Utilize uma
função para fazer tal verificação e cálculo.

--------------------------------------------------------------------------

2. Crie um programa que solicite ao usuário que preencha um vetor de valores
   inteiros de tamanho ```x``` (a ser informado pelo próprio usuário durante a
execução do programa). Uma vez que os valores forem lidos e armazenados no
vetor, o programa deverá informar ao usuário:  
   * qual a média dos valores lidos;
   * quantidade de números positivos; 
   * quantidade de números negativos; 
   * quantidade de zeros; 
   * quantidade de números pares; 
   * quantidade de números ímpares.  

Para cada um desses casos acima, crie uma função capaz de calcular e retornar as
respostas.

"Pontapé" para o exercício está disponível no diretório dessa aula, com o nome
`Exercicio2.java`:


>[!TIP]
> A partir do vetor preenchido com os valores, pode-se passá-lo como parâmetro para cada função criada para resolução do exercicio. Cada um dos itens solicitados no exercício pode ser implementado por meio de uma função.
-------------------------------------------------------

3. Um palíndromo é uma palavra ou texto que pode ser lido tanto da esquerda para
   a direita quanto da direita para a esquerda. Exemplos: ovo, arara,
"Socorram-me subi no onibus em Marrocos", anilina, "amor a roma", etc. Crie um
programa capaz de ler uma String e informar se ela é um palíndromo ou não. 

> [!TIP]
> 1 - Transforme a string a ser avaliada (se é palindromo ou não) em um vetor e
> opere sobre os índices do vetor.
> 2 - remova espaços em branco e converta para letras minúsculas para ajudar a
> verificação com as funções ```replaceAll``` e ```toLowerCase```.


------------------------------------------------------ 

4. Crie um programa que leia duas Matrizes ```M1 (M x N)``` e ```M2 (O x P)```
   de números inteiros.  As dimensões das matrizes (M, N, O e P) deverão ser
informadas pelo usuário. Em seguida o programa deverá verificar se é possível
realizar a multiplicação de M1 por M2. Sendo possível o programa deverá, através
de uma chamada de uma função, calcular a matriz resultante M3 da multiplicação
de M1 por M2. 

   Use tudo que aprendeu nos exercicios anteriores (vetores, matrizes, funções,
procedimentos) para realizar este exercicio.
