UnB - Universidade de Brasilia  
FGA - Faculdade do Gama  
FGA0158 - Orientação por Objetos

---

## Aula 12 - Exercícios Modularidade / Encapsulamento

**Tópicos da aula**
- Modularidade (pacotes em Java)
- Interfaces de objetos / pacotes
- Modificadores de acesso
- Modificadores de escopo



### Exercícios de fixação

Ao longo dos exercícios dessa aula, vamos explorar os conceitos de modularidade,
interfaces e modificadores de acesso e de escopo. Utilizaremos o exercício do
cálculo das figuras geométricas planas e sólidas. Para as figuras planas deverão
ser calculadas área e perímetro, para as figuras sólidas deverão ser calculadas
a área da superfície e seu volume. Todas as medidas de todas as figuras deverão
ser representadas através de objetos do tipo `Medida`, cada um contendo o
`valor` e a `unidade` da medida. 

Figuras Planas: 
- Quadrado
- Retangulo
- Triangulo Retangulo
- Circulo

Figuras Sólidas: 
- Cubo
- Paralelepipedo
- Prisma
- Cilindro

:warning: **Atenção**: Antes de iniciar o desenvolvimento dos exercícios,
identifique quais são os atributos e métodos de cada uma dessas figuras
geométricas. Represente as classes que compõem o seu projeto através de um
Diagrama de Classes UML. 

:wink: **Sugestão**: crie alguns objetos de cada uma dessas figuras e
represente-os através de um Diagrama UML de Objetos, com seus atributos e
estado. 


#### Exercício 1 - Modularidade

Proponha uma organização de todas essas classes criadas para esse exercício
através de um conjunto de pacotes, de modo a agrupá-las em seus respectivos
pacotes conforme o grau de semelhança entre elas. Lembre-se que pacotes podem
conter outros pacotes dentro deles. Apresente o Diagrama UML de Pacotes e
implemente-o em Java. Ao final responda: qual foi o critério que você utilizou
para realizar os agrupamentos das classes? 


#### Exercício 2 - Interfaces de objetos

Analise as classes que você criou no exercício anterior e proponha interfaces
que podem ser compartilhadas entre os objetos (ou subgrupos deles). Ao final,
evolua o Diagrama de Classes UML do exercício anterior, de modo a representar
a(s) nova(s) interface(s) criadas e suas relações com as classes. Altere sua
implementação em Java, de modo a contemplar as alterações feitas. Ao final
responda qual foi o critério empregado para definir as interfaces. 


#### Exercício 3 - Modificadores de acesso

Altere seu projeto do exercício anterior de modo a restringir ao máximo o acesso
aos atributos dos objetos, de modo que somente poderão ser acessados por
elementos da própria classe em que ele está definido. Quando necessário, realize
o acesso a esses atributos através de métodos de acesso (_get_ / _set_). Métodos
construtores de objetos só poderão ser chamados poderão ser chamados por outros
elementos que estejam dentro do mesmo pacote, mas não poderão ser chamados fora
dele. Implemente as alterações realizadas no Diagrama de Classes UML em seu
projeto Java. 


#### Exercício 4 - Modificadores de escopo

Analise o seu projeto atual e verifique se há algum atributou ou método de
alguma classe cujo escopo deve ser estático. Em outras palavras, há algum
elemento que não pertença a um objeto específico mas que pode ser definido para
uma classe? Altere seu Diagrama de Classes UML para refletir essa alteração e em
seguida implemente-a em seu projeto Java. Qual foi o raciocínio empregado para
essa alteração de escopo de elemento? 


#### Exercício 5 - Bônus

Crie uma classe conversora de medidas que ao receber um objeto `Medida` e uma
unidade-alvo, seja capaz de realizar a conversão da medida original e devolver
um objeto `Medida` com a conversão resultante. Apresente essa classe, seus
métodos e atributos no seu Diagrama de Classes UML, e implemente-as em seu
projeto Java. Esses métodos de conversão devem ser dinâmicos ou estáticos? 
