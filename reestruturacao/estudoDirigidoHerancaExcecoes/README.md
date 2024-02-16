UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
OO - Orientação por Objetos  
--

Estudo dirigido - Exceções 


1. O que são exceções? Quando elas devem ser utilizadas? 

2. O que é uma pilha de execução? 

3. O que significa lançar uma exceção? O que significa capturar uma exceção? 

4. Os tratadores de exceção para um trecho de código devem ser dispostos sempre
   no sentido da generalização (do mais específico para o mais genérico). Por
quê? Explique em detalhes.

5. O que significa propagar uma exceção? Diferencie os operadores ```throw``` e
   ```throws``` em Java. 

Para as questões a seguir, considere os códigos presentes no diretório desse
estudo dirigido. Para cada uma das questões a seguir, considere que o trecho de
código está presente no método ```main``` da classe Principal. Apresente o que
vai ser impresso ao final da execução das instruções caso o código seja
executável. Se houver erros que o impeça de ser executado, informe qual é o erro. 

6. ```
   Progressao p1 = new Progressao(0, 1, 6);
   ```

7. ```
   Progressao p2 = new Aritmetica(3, 5, 3); 
   p2.computarProgressao();
   System.out.println(p2.imprimirProgressao();
   ```

8. ```
   Progressao p3 = new Geometrica(1, 2, 12);
   p3.computarProgressao();
   System.out.println(p3.imprimirProgressao();
   ```

9. ```
   Aritmetica p4 = new Aritmetica(2, 0, 6);
   p4.computarProgressao();
   System.out.println(p4.imprimirProgressao();
   ```

1. ```
   Geometrica p5 = new Aritmetica(2, 2, 4);
   p5.computarProgressao();
   System.out.println(p5.imprimirProgressao();
   ```

1. ```
   Progressao p6 = new Aritmetica(1, 0, 12); 
   p6.computarProgressao();
   System.out.println(p6.imprimirProgressao();
   ```

1. ```
   Progressao p7 = new Geometrica(1, -2, 15);
   p7.computarProgressao();
   System.out.println(p7.imprimirProgressao();
   ```

1. ```
   Progressao p8 = new Geometrica(1, 0, 15);
   p8.computarProgressao();
   System.out.println(p8.imprimirProgressao();
   ```

