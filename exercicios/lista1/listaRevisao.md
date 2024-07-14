Unb - Universidade de Brasilia
FGA - Faculdade do Gama
## FGA0158 - Orientação por Objetos

Exercícios de Revisão em Programação de Computadores 

#### Exercício 1: Matrizes e Vetores

Escreva um programa que leia uma matriz inteira de 4 linhas e 4 colunas e gere
um vetor contendo apenas os elementos da diagonal principal. Imprima o vetor
resultante.

 Exemplo de matriz:

``` R
 2 3 4 5
 3 6 8 9
 5 1 8 0
 3 2 3 9
```
Vetor gerado e impresso:

```2 6 8 9```

---

#### Exercício 2 - Vetores e Matrizes
Considere uma matriz booleana M onde M(i, j) é verdadeiro se a loja $i$ vende o
produto $j$, e falso caso contrário. Dado um vetor de nomes de lojas, imprima o
nome da loja e os produtos que ela vende.
- Exemplo de entrada:

```
Lojas: 'CARIOCA' 'IMPERATRIZ'
Produtos: 'ARTIGOS PARA CONSTRUCAO' 'ROUPAS' 'ARTIGOS DE PAPELARIA'
```

Saída gerada:

```
CARIOCA: ARTIGOS PARA CONSTRUCAO, ROUPAS, ARTIGOS DE PAPELARIA
IMPERATRIZ: ROUPAS, ARTIGOS DE PAPELARIA
```

---

#### Exercício 3 - Vetores e Arquivos 
Leia dois vetores ordenados de 10 posições inteiras positivas. Crie um terceiro
vetor contendo o conteúdo dos dois primeiros, sem repetição, mantendo a
ordenação. Escreva o vetor resultante no arquivo "combinado.txt".

-  Exemplo de vetores lidos:

``` R
Vetor 1: 2 4 5 10 23 27 30 32 40 100
Vetor 2: 2 3 5 6 11 40 41 42 50 100
```

Vetor resultante escrito no arquivo "combinado.txt":

``` 
2 3 4 5 6 10 11 23 27 30 32 40 41 42 50 100
```

---

#### Exercício 4 - Matrizes e arquivos

- Leia uma matriz de inteiros 100x100 a partir do arquivo "matriz.txt". Calcule a soma dos elementos acima da diagonal principal da matriz.
  - Verifique se a matriz é simétrica (ou seja, os elementos em posições opostas, com relação à diagonal principal, são iguais). Imprima "matriz simétrica" se for o caso.
  - Exemplo de matriz:

``` 
2 11 4 20
5 1 3 10
5 2 1 4
5 0 3 9
```

Resultado:
 - Soma acima da diagonal principal: 7
 - Matriz não é simétrica
