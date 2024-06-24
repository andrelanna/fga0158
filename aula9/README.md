UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

# Aula 8 - Exercícios de revisão de introdução a OO e encapsulamento

Instruções: 
- Esses exercícios são apenas para fixação do conteúdo vistos até então na
  disciplina. 
- Eles cobrem os seguintes assuntos: 
  - Classes e objetos
  - Atributos e métodos
  - Retenção de estado
  - Ocultação da informação
  - Associação entre objetos
  - Pacotes
  - Modificadores de acesso
  - Modificadores de escopo
- Não é necessário entregar as resoluções dos exercícios. 
- Recomenda-se que seja feito em duplas. 
- Bons estudos. 

--- 

## Exercício 1 - Calculadora de área e perímetro de figuras geométricas. 
Crie um programa que seja capaz de continuamente (= até quando o usuário desejar
interromper a execução) ler valores de medidas para um tipo de polígono e,
**somente ao final** de ler as medidas de todas as figuras desejadas, calcule a
área e o perímetro de cada figura. 

Exemplo de utilização: 

```
1 - Quadrado
2 - Retangulo
3 - Triangulo
4 - Circulo
5 - Trapezio
Informe o tipo da figura:
>> 1

Informe a medida do lado do quadrado: 
>>10 

Deseja adicionar outra figura? (S/N)
>> S

1 - Quadrado
2 - Retangulo
3 - Triangulo
4 - Circulo
5 - Trapezio
Informe o tipo da figura:
>> 3

Informe a medida do lado do triangulo: 
>> 100

Deseja adicionar outra figura? (S/N)
>> S

1 - Quadrado
2 - Retangulo
3 - Triangulo
4 - Circulo
5 - Trapezio
Informe o tipo da figura:
>> 5

Informe a medida da base maior do trapezio:
>> 10
Informe a medida da base menor do trapezio: 
>> 4 
Informe a medida da altura do trapezio: 
>> 4

Deseja adicionar outra figura? (S/N)
>> N

Quadrado:
Area: 100
Perimetro: 40

Triangulo: 
Area: 8660,25
Perimetro: 300

Trapezio: 
Area: 28
Perimetro: 23
```

---

## Exercício 2 - Calculadora de matrizes

Crie um programa que seja capaz de ler duas matrizes A e B. Com base nessas duas
matrizes o programa deverá ser capaz de verificar se pode realizar as operações
listadas abaixo. Caso seja possível, ele deverá criar uma terceira matriz C
contendo o resultado da operação realizada sobre as matrizes. As matrizes
deverão ainda ser armazenadas em arquivo. 

Operações: 
- Soma
- Subtração
- Multiplicação 
- Multiplicação de uma matriz por um escalar
- Transposta de uma matriz

Exemplo de utilização do programa: 

```
Informe as dimensoes da matriz A:
>> 3
>> 4

Entre com os valores da matriz A: 
>> 1
>> 2
>> 3
>> 4
>> 5
>> 6
>> 7
>> 8
>> 9

Informe as dimensões da matriz B: 
>> 4
>> 3

Entre com os valores da matriz B: 
>> -1
>> -2
>> -3
>> -4
>> -5
>> -6
>> -7
>> -8
>> -9

Qual operação você deseja fazer?
1 - Soma
2 - Subtracao
3 - Multiplicação de matrizes
4 - Multiplicação por escalar
5 - Transposta de matriz
6 - Gravar matrizes

>> 1
Não é possível calcular a soma das matrizes, as dimensões são diferentes. 
Qual operação você deseja fazer?
1 - Soma
2 - Subtracao
3 - Multiplicação de matrizes
4 - Multiplicação por escalar
5 - Transposta de matriz
6 - Gravar matrizes
>> 5
Qual matriz você deseja calcular a transposta? 
>> B
Transposta calculada. 
Qual operação você deseja fazer?
1 - Soma
2 - Subtracao
3 - Multiplicação de matrizes
4 - Multiplicação por escalar
5 - Transposta de matriz
6 - Gravar matrizes
>> 1
Matriz C=A+B foi calculada. 
Qual operação você deseja fazer?
1 - Soma
2 - Subtracao
3 - Multiplicação de matrizes
4 - Multiplicação por escalar
5 - Transposta de matriz
6 - Gravar matrizes
>> 6
As matrizes foram gravadas no arquivo matrizes.txt
```

---
## Exercício 3 - Calculadora de progressão aritmética e progressão geométrica

Crie um programa que, para os valores ```a0```, ```n``` e ```r``` informados
pelo usuário, seja capaz de calcular as progressões aritmética e geométrica.
Cada termo de cada progressão deve ser representado pelo seu próprio objeto.
Cada progressão é também representada pelo seu próprio objeto.

Exemplo de utilização: 
```
Informe o valor de a0: 
>> 1
Informe o valor de r:
>> 2
Informe o valor de n:
>> 5

PA = [1, 3, 5, 7, 9]
PG = [1, 2, 4, 8, 16]

Deseja calcular novas progressões? (s/n)
>> n
```


