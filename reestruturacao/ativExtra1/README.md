UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos
---

### Exercícios de fixação: 

#### Entrada e saída  

Resolva os seguintes exercícios utilizando entrada e saída gráfica em Java (uso
das classes JOptionPane). 


**Exercício 1: Calculadora de Gorjeta**

Crie um programa que solicite ao usuário o valor total de uma conta de
restaurante e a porcentagem de gorjeta que deseja deixar. Em seguida, o programa
deve calcular o valor da gorjeta e o valor total a ser pago (conta + gorjeta) e
exibi-los na tela. Certifique-se de formatar a saída de forma adequada.

Exemplo de saída:

```
Digite o valor total da conta: 50.75
Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%): 15
Valor da gorjeta: $7.61
Total a ser pago: $58.36
```

**Exercício 2: Conversor de Unidades de Temperatura**

Crie um programa que permita ao usuário converter uma temperatura de graus
Celsius para graus Fahrenheit ou vice-versa. O programa deve perguntar ao
usuário qual tipo de conversão deseja realizar, solicitar a temperatura e, em
seguida, mostrar o resultado. Use as fórmulas de conversão apropriadas.

Exemplo de saída:

```
Escolha o tipo de conversão:
1. Celsius para Fahrenheit
2. Fahrenheit para Celsius
Opção: 1

Digite a temperatura em graus Celsius: 25
Resultado em graus Fahrenheit: 77.0
```


**Exercício 3: Lista de Tarefas**

Crie um programa que funcione como uma lista de tarefas. O programa deve
permitir ao usuário adicionar tarefas, listar as tarefas existentes e marcar
tarefas como concluídas. O usuário deve poder interagir com o programa através
de comandos, como "adicionar", "listar" e "concluir". Certifique-se de fornecer
feedback claro e uma interface amigável para o usuário.

Exemplo de saída:

```
Comandos disponíveis:
- "adicionar" para adicionar uma nova tarefa
- "listar" para listar as tarefas
- "concluir" para marcar uma tarefa como concluída
- "sair" para sair do programa

Digite um comando: adicionar
Digite a descrição da tarefa: Comprar leite

Tarefa adicionada com sucesso!

Digite um comando: listar
Tarefas pendentes:
1. Comprar leite

Digite um comando: concluir
Digite o número da tarefa a ser concluída: 1

Tarefa "Comprar leite" marcada como concluída.

Digite um comando: listar
Tarefas pendentes:
(Nenhuma tarefa pendente)

Digite um comando: sair
```

---

#### Conversões de tipos

**Exercício 4: Calculadora de Média Ponderada**

Peça ao usuário para inserir as notas de três disciplinas (cada nota de 0 a 10)
e os pesos correspondentes de cada disciplina. Em seguida, calcule e exiba a
média ponderada das notas. Certifique-se de que as notas e pesos sejam
armazenados como números decimais.

**Exercício 5: Conversor de Idade**

Peça ao usuário para inserir sua idade em anos. Em seguida, converta essa idade
para meses, dias, horas e minutos. Mostre o resultado formatado de maneira
clara. Considere um ano com 365 dias.

**Exercício 6: Calculadora de IMC (Índice de Massa Corporal)**

Peça ao usuário para inserir seu peso em quilogramas e sua altura em metros. Em
seguida, calcule o Índice de Massa Corporal (IMC) utilizando a fórmula: IMC =
peso / (altura * altura). Exiba o resultado e classifique o usuário de acordo
com a tabela de classificação de IMC.

Lembre-se de realizar as conversões de tipos necessárias para garantir que as
operações matemáticas sejam feitas corretamente.

```
Digite seu peso em kg: 70
Digite sua altura em metros: 1.75

Seu IMC é: 22.86
Classificação de IMC: Normal
```


---
Instruções condicionais (if, if...else, switch...case())

**Exercício 7: Verificação de Números Pares e Ímpares**

Crie um programa que solicita ao usuário para inserir um número inteiro. Em
seguida, utilize uma estrutura if-else para verificar se o número é par ou
ímpar. Imprima uma mensagem indicando o resultado.

```
Digite um número: 7 O número 7 é ímpar.
```


**Exercício 8: Calculadora Simples com Switch-Case**

Desenvolva um programa que realiza operações básicas de uma calculadora (adição, subtração, multiplicação e divisão). Peça ao usuário para inserir dois números e escolher a operação desejada usando uma estrutura switch-case. Execute a operação escolhida e imprima o resultado.


```
Digite o primeiro número: 10
Digite o segundo número: 5
Escolha a operação:
1. Adição
2. Subtração
3. Multiplicação
4. Divisão
Opção: 3
Resultado: 50
```
 

**Exercício 9: Classificação de Média Ponderada**

Solicite ao usuário para inserir as três notas e seus respectivos pesos. Utilize uma estrutura if-else para atribuir uma classificação com base na seguinte escala:

    Média ponderada de 90 a 100: A
    Média ponderada de 80 a 89: B
    Média ponderada de 70 a 79: C
    Média ponderada de 60 a 69: D
    Média ponderada abaixo de 60: F

Imprima a classificação correspondente.

Exemplo: 

```
Digite a nota 1: 85
Digite o peso da nota 1: 0.3

Digite a nota 2: 78
Digite o peso da nota 2: 0.4

Digite a nota 3: 92
Digite o peso da nota 3: 0.3

A média ponderada é 86.2, que corresponde à classificação B.
```

---
#### Estruturas de repetição (while, do...while, for())


**Exercício 10: Contagem Regressiva com while**

Crie um programa que use uma estrutura de repetição while para realizar uma
contagem regressiva a partir de um número fornecido pelo usuário até 1. Imprima
cada número durante a contagem.

Exemplo:

```
Digite um número inicial: 5
5
4
3
2
1
```

**Exercício 11: Advinhando Números com do...while**

Desenvolva um jogo simples em que o computador escolhe um número aleatório entre
1 e 10, e o jogador deve adivinhar o número. Use uma estrutura de repetição
do...while para permitir que o jogador continue adivinhando até acertar. Forneça
feedback sobre se a tentativa está correta ou se o jogador deve tentar
novamente.

Exemplo:

```
Adivinhe o número entre 1 e 10.
Tentativa 1: 5
Tente novamente. O número é maior.
Tentativa 2: 8
Parabéns! Você acertou o número 8 em 2 tentativas.
```

**Exercício 12: Tabela de Multiplicação com for**

Crie um programa que utilize uma estrutura de repetição for para gerar a tabela
de multiplicação de um número fornecido pelo usuário. A tabela deve ser exibida
de 1 a 10.

Exemplo:

```
Digite um número para a tabela de multiplicação: 7
Tabela de multiplicação para 7:
1 x 7 = 7
2 x 7 = 14
...
10 x 7 = 70
```


---
#### Exercícios de vetores

**Exercício 12: Soma de Vetores**

Crie um programa que realiza a soma de dois vetores de inteiros. Os vetores
devem ter o mesmo tamanho e serem fornecidos pelo usuário. O programa deve
calcular a soma elemento a elemento e exibir o vetor resultante.

Exemplo:

```
Digite o tamanho dos vetores: 4
Digite os elementos do primeiro vetor:
1
3
5
7
Digite os elementos do segundo vetor:
2
4
6
8
A soma dos vetores é: [3, 7, 11, 15]
```

**Exercício 13: Produto Escalar**

Desenvolva um programa que calcula o produto escalar entre dois vetores de
números reais. Os vetores devem ter o mesmo tamanho e serem inseridos pelo
usuário. O produto escalar é obtido multiplicando elemento por elemento e
somando os resultados.

Exemplo:

```
Digite o tamanho dos vetores: 3
Digite os elementos do primeiro vetor:
2.5
3.0
1.5
Digite os elementos do segundo vetor:
1.0
2.0
3.0
O produto escalar dos vetores é: 14.5
```

**Exercício 14: Verificação de Palíndromos com Vetores**

Crie um programa que verifica se uma palavra fornecida pelo usuário é um
palíndromo. Utilize um vetor para armazenar os caracteres da palavra. O programa
deve considerar apenas as letras (ignorando espaços, pontuações, etc.) e
realizar a verificação.

Exemplo:

```
Digite uma palavra: radar
A palavra "radar" é um palíndromo.
```

--- 
#### Exercícios de matrizes


**Exercício 15: Soma de Matrizes**

Crie um programa que realiza a soma de duas matrizes. As matrizes devem ter o
mesmo número de linhas e colunas e serem fornecidas pelo usuário. O programa
deve calcular a soma elemento a elemento e exibir a matriz resultante.

Exemplo:

```
Digite o número de linhas: 2
Digite o número de colunas: 3

Digite os elementos da primeira matriz:
1 2 3
4 5 6

Digite os elementos da segunda matriz:
7 8 9
10 11 12

A soma das matrizes é:
8 10 12
14 16 18
```

**Exercício 16: Multiplicação de Matrizes**

Desenvolva um programa que realiza a multiplicação de duas matrizes. A primeira
matriz deve ter o número de colunas igual ao número de linhas da segunda matriz.
As matrizes devem ser fornecidas pelo usuário.

Exemplo:

```
Digite o número de linhas da primeira matriz: 2
Digite o número de colunas da primeira matriz: 3

Digite os elementos da primeira matriz:
1 2 3
4 5 6

Digite o número de linhas da segunda matriz: 3
Digite o número de colunas da segunda matriz: 2

Digite os elementos da segunda matriz:
7 8
9 10
11 12

A multiplicação das matrizes é:
58 64
139 154
```

**Exercício 17: Transposição de Matriz**

Crie um programa que realiza a transposição de uma matriz. A matriz deve ser
fornecida pelo usuário, e o programa deve exibir a matriz transposta.

Exemplo:

```
Digite o número de linhas: 3
Digite o número de colunas: 2

Digite os elementos da matriz:
1 2
3 4
5 6

A matriz transposta é:
1 3 5
2 4 6
```

---
#### Exercícios sobre referências a objetos

**Exercício 18: Troca de Valores entre Objetos**

Crie uma classe chamada Ponto com os atributos x e y. Em seguida, crie um método
na classe principal que aceita dois objetos do tipo Ponto como parâmetros e
troca seus valores. Demonstre o funcionamento do método no programa principal.

**Exercício 19: Cópia de Objetos com Referência**

Crie uma classe Aluno com os atributos nome e nota. Em seguida, crie um método
na classe principal que aceita um objeto do tipo Aluno como parâmetro e cria uma
cópia desse objeto. Modifique a cópia e demonstre que a modificação não afeta o
objeto original.

**Exercício 20: Modificação de Objetos através de Referências**

Crie uma classe ContaBancaria com o atributo saldo. Em seguida, crie um método
na classe principal que aceita um objeto do tipo ContaBancaria como parâmetro e
realiza uma operação de depósito nessa conta. Demonstre a modificação do saldo
no programa principal.
