Exemplo 1 - Hello World em Java
---

Esse exemplo busca apresentar a estrutura básica de um algoritmo em Java. São apresentadas duas versões do mesmo algoritmo: uma versão de terminal (`HelloWorldTextual.java`) e outra versão com uso de componentes gráficos (`HelloWorldGrafico.java`). 

# 1. Estrutura básica de um algoritmo em Java

Vamos assumir, **por enquanto**, que um algoritmo em java possui a seguinte estrutura: 

Suponha o arquivo nomeado `Exemplo.Java` cujo conteúdo está listado abaixo. Os comentários no código (trechos com texto entre /\* e \*/ ) informam o tipo de conteúdo / instrução que deve ser definido naquele espaço.

```
/*
 * Área para importação de pacotes
 */


public class Exemplo {  //nome do algoritmo (Exemplo) é o mesmo nome do arquivo que o contem (Exemplo.java)
    
    public static void main (String[] args) {  //método que inicia a execução do algoritmo
        /*
         * Área para declaracao de variaveis
         */
         
         /*
          * Área para instruções do algoritmo
          */
    }
    
}
```


# 2. Comandos de saída 

Comando de saída **textual**: `System.out.println(<<String>>);`.  

A instrução apresentada acima imprime na saída padrão do sistema (`System.out`) o conteúdo de uma string passada como parâmetro para a função `println` e quebra a linha ao final da impressão. 

Exemplo: 

```  
System.out.println("Informe seu nome: ");   

```


Comando de saída **gráfica**: `JOptionPane.showMessageDialog(<<String>>);`.  

A instrução acima cria uma janela gráfica cujo conteúdo é a String passada como parâmetro para a função `showMessageDialog`.

Exemplo: 

```
JOptionPane.showMessageDialog("Olá Turma! ");
```


# 3. Comandos de entrada

Comando de entrada **textual**: 

A entrada de dados pelo terminal considera a entrada padrão do sistema, no caso, o teclado. Antes de iniciar a leitura de dados da entrada padrão é necessário criar um "canal" com tal entrada. Esse canal é um objeto da classe `Scanner`. A partir da criação desse canal fazemos a leitura dos dados com uma instrução `next...` específica para cada tipo de dado de Java.

Exemplo: 

```
Scanner sc = new Scanner(System.in);  //Criação do objeto scanner associado à entrada padrão do sistema (System.in)

//Leitura dos dados a partir do teclado
byte a = sc.nextByte();
int b = sc.nextInt();
long c = sc.nextLong();
float b = sc.nextFloat();
double d = sc.nextDouble(); 
String e = sc.next(); //lê até o primeiro espaco em branco encontrado
String f = sc.nextLine(); //lê até encontrar o caracter que marca o fim da string (incluindo espaco em branco)
```

Comando de entrada **gráfico**: 

A entrada de dados através de componentes gráficos vai **sempre** fazer uma leitura de String dos valores inseridos na caixa de texto, criada pela instrução `JOptionPane.showInputDialog(null, <<String>>);`. O valor de `<<String>> ` é o conteúdo da mensagem que será apresentada ao usuário junto com a caixa de texto. 

Ainda que o valor inserido na caixa seja um valor numérico qualquer (`int`, `float`, `double`, `long`, etc...) sua representação será uma `String`. Portanto é necessário fazer a conversão de tipos (*type casting*) de string para o tipo de dado desejado. Para cada tipo de dado primitivo Java haverá uma classe com um método `parse...` para realizar tal conversão. 

Exemplo:  

```
String strA = JOptionPane.showInputDialog(null, "Informe o valor de A:");
int a = Integer.parseInt(strA);  //converte o valor de strA em um inteiro e o atribui à variável a

String strB = JOptionPane.showInputDialog(null, "Informe o valor de B:");
float B = Float.parseFloat(strB); //converte o valor de strB em um float e o atribui à variável b

String strC = JOptionPane.showInputDialog(null, "Informe o valor de C:");
double C = Double.parseDouble(strc); //converte o valor de strC em um double e o atribui à variável c

...
```

