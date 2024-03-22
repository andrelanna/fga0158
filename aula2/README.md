UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Aula 2 - Revisão de programação - Parte 1

**Tópicos da aula**
- Estrutura básica de um algoritmo
- Tipos de dados primitivos
- Variáveis
- Operações aritméticas
- Operações lógicas
- Operadores relacionais

**Slides da aula**

* [Slides](https://docs.google.com/presentation/d/1ZhtIBWDGenllvyEzGp7X5Do0KcAWq_a4wBPIZfKuMqs/edit?usp=sharing)

**Vídeos da aula**  
* [Vídeo 1 - Conceitos](https://youtu.be/2hqNMacT1T0)
* [Vídeo 2 - Prática, parte 1 ](https://youtu.be/P9cK67OY3os)
* [Vídeo 3 - Prática, parte 2 ](https://youtu.be/GWNt7BQDChE)


**Exercícios de fixação**

> Dicas para resoluções dos exercicios 1 e 2 estarão na pasta "fga0158"

1. Crie um programa "Hello World" em Java, capaz de ler seu nome e apresentar a
   seguinte mensagem:  
   ```Olá <Fulano>, seja bem vindo!``` 
   Apresente a mensagem em modo console e modo gráfico.
   


2. Crie um programa que seja capaz de fazer a leitura de dois valores inteiros
   ```a``` e ```b```, e realize as seguintes operações:  
   ```a + b```  
   ```a - b```  
   ```a * b```  
   ```a / v```  
   ```a ^ b```  
   Faça a leitura dos valores e apresentação dos resultados via console.
   
   

3. Crie um programa que leia três valores  ```a```,```b``` e ```c```, todos do
   tipo ```float```, e retorne o valor lógico da seguinte expressão:  
   ``` a*a == (b * b + c * c) ```  
   Utilize a entrada e saída gráfica de Java para ler e apresentar os resultados.

   Dica: para realizar a entrada e saida gráfica você deverá fazer o _type-casting_ de String para float. 
   

Lembretes: 
- Slides sobre _type-casting_ estão nos slides 12 e 13.
- Para leitura de dados em Java no console usamos o comando ```Scanner "variavel" = new Scanner(System.in);```. Uma vez que o Scanner está instanciando, você deverá realizar chamadas ao método correspondente ao tipo de dado que você quer ler do teclado.
- Para saida de dados no console usamos o comando ```System.out.println("String")```.
- Para leitura de dados de modo gráfico usamos ```String "variavel" = JOptionPane.showInputDialog("O que sera escrito na caixa de dialogo")```. Os dados lidos dessa maneira serão sempre do tipo String, portanto, é necessário realizar o _type-casting_ para o tipo de dado apropriado se necessário.
- Para a saída de modo gráfico usamos o comando ```JOptionPane.showMessageDialog(null, "String")```.
