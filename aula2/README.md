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

1. Crie um programa "Hello World" em Java, capaz de ler seu nome e apresentar a
   seguinte mensagem:  
   ```Olá <Fulano>, seja bem vindo!``` 
   Apresente a mensagem em modo console e modo gráfico.

 Dica: 
 {
      
    public static void main(String[] args) {

        Scanner nomeScanner = new Scanner(System.in);
        String nome = nomeScanner.next();

        System.out.println("Olá " + *que variavel colocar aqui?* + ", Seja bem vindo!");

        ou em modo gráfico

        String nome = JOptionPane.showInputDialog("Qual o seu nome?: ");
        JOptionPane.showMessageDialog(null, "Olá " + *que variavel colocar aqui?* + ", Seja bem vindo!");
    }
    


3. Crie um programa que seja capaz de fazer a leitura de dois valores inteiros
   ```a``` e ```b```, e realize as seguintes operações:  
   ```a + b```  
   ```a - b```  
   ```a * b```  
   ```a / v```  
   ```a ^ b```  
   Faça a leitura dos valores e apresentação dos resultados via console.
   
   Dica: Se baseie no ultimo exemplo para completar os asteriscos.
 
       public static void main(String[] args) {

         *** aScanner = new Scanner(System.in);
         *** a = aScanner.nextInt();

        *** bScanner = new Scanner(System.in);
        *** b = bScanner.nextInt();

        int resultado = a + b;
        System.out.println("O resultado é " + ***);
         .
         .
         .
       }
       


5. Crie um programa que leia três valores  ```a```,```b``` e ```c```, todos do
   tipo ```float```, e retorne o valor lógico da seguinte expressão:  
   ``` a*a == (b * b + c * c) ```  
   Utilize a entrada e saída gráfica de Java para ler e apresentar os resultados.

   Dica: para a entrada e saida gráfica, faça o type-casting de String para float.
   
   Nesse tente fazer sozinho se baseando nos exemplos anteriores!
   
Lembretes: 
- Slides sobre como fazer type-casting estão nos slides 12 e 13
- Para leitura de dados em java no console usamos ```Scanner "variavel" = new Scanner(System.in)``` e depois faça o type-casting apropriado se necessário.
- Para saida no console usamos ```System.out.println("String")```.
- Para leitura de modo gráfico usamos ```String "variavel" = JOptionPane.showInputDialog("O que sera escrito na caixa de dialogo")``` e depois faça o type-casting apropriado se necessário.
- Para saida de modo gráfico usamos ```JOptionPane.showMessageDialog(null, "String")```.

