# Linguagem de Programação em JAVA

- Aula 01 - Boas Vindas[ok]
- Aula 02 - Interfaces[ok]
- Aula 03 - Construtores[ok]
- Aula 04 - Enumeradores[ok]
- Aula 05 - Modificadores de acesso[ok]
- Aula 06 - Matrizes[ok]
- Aula 07 - Collections
- Aula 08 - Tópicos avançados
- Aula 09 - Genéricos
- Aula 10 - Anotações
- Aula 11 - Fios
- Aula 12 - Laços
- Aula 13 - Trabalhando com dados
- Aula 14 - Persistência de dados
- Aula 15 - Exceções e controle de erros
- Aula 16 - Considerações finais

## Interfaces

A interface é um recurso muito utilizado em Java, bem como na maioria das linguagens orientadas a objeto, para 
“obrigar” a um determinado grupo de classes a ter métodos ou propriedades em comum para existir em um determinado
contexto, contudo os métodos podem ser implementados em cada classe de uma maneira diferente. Pode-se dizer, a
grosso modo, que uma interface é um contrato que quando assumido por uma classe deve ser implementado.

Dentro das interfaces existem somente assinaturas de métodos e propriedades, cabendo à classe que a utilizará realizar 
a implementação das assinaturas, dando comportamentos práticos aos métodos.
As classes que serão vinculadas a a essa interface terão que ter todas os contratos da interface, a ideia é reaproveitamente de
código.

Abaixo é possível ver um exemplo de uma interface chamada FiguraGeometrica com três assinaturas de métodos que 
virão a ser implementados pelas classes referentes às figuras geométricas.


public interface FiguraGeometrica
{
public String getNomeFigura();
public int getArea();
public int getPerimetro();
}

Para realizar a chamada/referência a uma interface por uma determinada classe, é necessário adicionar a 
palavra-chave implements ao final da assinatura da classe que irá implementar a interface escolhida.


Sintaxe:
public class nome_classe implements nome_interface

Onde:

nome_classe – Nome da classe a ser implementada.
nome_Interface – Nome da interface a se implementada pela classe.

Ao contrário da herança que limita uma classe herdar somente uma classe pai por vez é possivel através da interface que uma classe
implemente varias interfaces ao memso tempo;


## Construtores

Construtores são elementos que você cria na classe, e toda classe possui pelo o menos um construtor, lembrando que toda 
classe possui um construtor padrão.

Existem construtores simples onde vc passa apenas um parametro, e existem os famossos construtores com
sobrecarga, aqueles que você passa com vários parametros.

Existe uma variavel chamada "this." ela tem a função de diferenciar o valor que o construtor recebeu , das variaceis que
são criadas dentro da classe, então os construtores fazem a comunicação entre as partes externas da classe, normalmente as nossas
classes são privadas, ou seja encapsulada. O construtor faz o link entre a parte externa da classe com a interna.

Um construtor pode retornar uma variável da classe , algumas variáveis da classe, ou todas as variaveis da classe, depende
do que você precisa. 


## Enumerados

São tipos de campos que consistem em um conjunto fixo de constantes (static final), sendo como uma lista de valores 
pré-definidos. Na linguagem de programação Java, pode ser definido um tipo de enumeração usando a palavra chave enum. 
Todos os tipos enums implicitamente estendem a classe java.
Enumeradores são como o switch case, você atribui alguns valores.


## Modificadores de Acesso

Os modificadores de acesso são muito importantes pois eles permitem alterar a visibilidade de determinado elemento.

Os modificadores determinam se uma classe pode usar outra, invocando um determinado atributo ou um determinado método.
Na linguagem java existem dois níveis de modificadores de acesso:

- Nível Superior
  - aplicado a classes;
  - são os seguintes modificadores:
    - public e
    - default;
      - sem moficador explícito;

- Nível de membro
  - aplicados a:
    - atributos; e
    - Métodos
  - São os seguintes modificadores:
    - private
    - protected
    - public
    - default
      - sem nodificador explícito

## modificador public

O modificador de acesso public é o menos restritivo de todos. Ele permite que qualquer outra parte da sua aplicação
tenha acesso ao componente marcado como public.

----------------------------------------------------------------
ACESSO                     |  MESMO PACOTE | PACOTES DIFERENTES
----------------------------------------------------------------
Classes derivadas          |      [ok]    |       [ok]
----------------------------------------------------------------
Classes não relacionadas   |      [ok]    |       [ok]
----------------------------------------------------------------

## modificador protected

Os membros das classes marcados com o modificador de acesso protected serão acessíveis por classes e interfaces dentro 
do mesmo pacote e por classes derivadas mesmo que estejam em pacotes diferentes. 

----------------------------------------------------------------
ACESSO                     |  MESMO PACOTE | PACOTES DIFERENTES
----------------------------------------------------------------
Classes derivadas          |      [ok]    |       [ok]
----------------------------------------------------------------
Classes não relacionadas   |      [ok]    |       [X]
----------------------------------------------------------------

## modificador private

O modificador de acesso private é o mais restritivo modificador de acesso. Todo membro de uma classe definido 
com o modificador private só é acessível para a própria classe.
Não importa a localização dentro de pacotes ou se a classe foi herdada ou não, um membro private só é acesivel
dentro da mesma classe em que ele foi declarado


----------------------------------------------------------------
ACESSO                     |  MESMO PACOTE | PACOTES DIFERENTES
----------------------------------------------------------------
Classes derivadas          |      [X]     |      [X]
----------------------------------------------------------------
Classes não relacionadas   |      [X]    |       [X]
----------------------------------------------------------------

## modificador default

Os membros das classes marcados com o modificador de acesso protected serão acessíveis por classes e interfaces dentro
do mesmo pacote e por classes derivadas mesmo que estejam em pacotes diferentes.

----------------------------------------------------------------
ACESSO                     |  MESMO PACOTE | PACOTES DIFERENTES
----------------------------------------------------------------
Classes derivadas          |      [v]     |      [X]
----------------------------------------------------------------
Classes não relacionadas   |      [v]    |       [X]
----------------------------------------------------------------

## De uma forma resumida

----------------------------------------------------------------------
ACESSO     | Classe       |   Pacote   |   SubClasse   | Todos
----------------------------------------------------------------------
PUBLIC     |      [v]     |    [v]    |      [v]      |      [v]
---------------------------------------------------------------------
PROTECTED  |      [v]     |    [v]    |      [v]      |      [X]
--------------------------------------------------------------------
DEFAULT    |      [v]     |    [v]    |      [X]     |      [X]
-------------------------------------------------------------------
PRIVATE    |      [v]    |     [X]  |      [X]      |      [X]
-------------------------------------------------------------------


## Matrizes/Arrays

Arrays são estruturas de dados homogêneas, elas trabalham com um único tipo de dado. Nós temos dois tipos de array
o unidimensional(vetor) e o bidimensional(matrizes).

- são inseridos em uma variável que referencia um array
int [] numeros = new int[4];
int [] numeros2;
numeros2=new int[10];
- declarando vários arrays
int[] numeros3= new int[44], numeros4=new int[23];
- inicializar valores em um array
int[] iniciaValores = {12,32,25,6,98};
- aloca memoria
meuArray=new int[10];

O for é a estrutura padrão para varrer arrays.

OBS: na declaração de um array, cada elemento recebe um valor padrão, sendo 0(zero) para numeros de tipo primitivo,
falso (false) para elementos booleanos e nulo(null) para referencias. Mas você pode inicializar o Array com valores 
que você quiser  ou precisar. 

## Collections

A estrutura de coleções Java é um conjunto de classes e interfaces que implementam estruturas de dados de coleção 
comumente reutilizáveis. Embora referido como uma estrutura, ele funciona como uma biblioteca. A estrutura de coleções
fornece as duas interfaces que definem várias coleções e classes que as implementam.

Uma coleção (collection) é um objeto que serve para agrupar muitos elementos em uma única unidade, estes elementos 
precisão ser Objetos, pode ter coleções homogêneas e heterogêneas, normalmente utilizamos coleções heterogêneas de 
um tipo especifico.

![](C:/Users/FLAVILES/AppData/Local/Temp/java-collection-framework-hierarchy.webp)

## Hierarquia da JCF

Collectin é um framework , a hierarquia podemos ver abaixo:

![](C:/Users/FLAVILES/AppData/Local/Temp/images.jpg)

Todas essas interfaces e classes, provém métodos de inserção, deleção, busca, ordenação, manipulação de elementos.
Lembrando também que algumas estruturas de dados permitem apenas objetos únicos, por exemplo Sets, enquanto outras 
estruturas permitem duplicações como ArrayLists. Cada estrutura de dados pode trazer um ganho de produtividade se 
utilizada corretamente.

É importante salientar que a interface Map também está presente na JCF, mas ela não é “filha” de Collection. É uma 
interface base fora da hierarquia da Collection.

A Interface Collection É a interface absoluta na hierarquia de coleções. 
Dela descendem as interfaces Set, Queue (filas) e List (listas) que formam a base das coleções genéricas da linguagem Java.

- Set – define uma coleção que não contém valores duplicados.
- Queue – define uma coleção que representa uma fila, ou seja, implementa o modelo FIFO (First-In, First-Out)
- List - define uma coleção ordenada que pode conter elementos duplicados.

 o ArrayList é especializado em trabalhar na parte interna do vetor, e o linkedList é especialista em trabalhar nas
pontas. Falamos isso por que o Arralist tem uma performance melhor quando trabalhamos no meio.E usamos os mesmo métodos 
 do arrayList no LinkedList.

## Resumo de Collections

Uma coleção é uma estrutura de dados que permite armazenar vários objetos.
Em java uma coleção também é um objeto.

As operações que podem ser feitas em collections variam , mas normalmente incluem:

- Adição de elementos;
- Remoção de elemntos;
- Acesso aos elementos;
- Pesquisa de elementos;

## ArrayList

Primeira coisa que precisamos saber: Arraylist não é um Array. ArrayList é uma lista que tem a característica de 
possibilitar implementar características de um array.


**Qual a diferença entre um array e uma List?**

O array é um vetor de objetos ou tipos primitivos, possui tamanho fixo
informado no momento em que é inicializado, não tem como incluir mais valores, senão estoura o limite.

Um ArrayList é uma implementação da interface List, outra implementação desta interface é o LinkedList. Como o nome
sugere, são implementações de um tipo de dado conhecido como Lista.


## LinkedList

A classe LinkedList é uma implementação da interface List. Esta classe implementa boa parte das operações de uma lista 
e permite a inserção de qualquer tipo de elemento (incluindo null). Esta classe implementa as seguintes interfaces: 
Serializable, Cloneable, Iterable<E>, Collection<E>, Deque<E>, List<E> e Queue<E>.

A LinkedList do Java, especificamente, implementa uma lista circular duplamente encadeada: cada elemento guarda a 
posição do próximo e do anterior, formando um círculo, onde o elemento depois do último é o primeiro, e o anterior 
a este, é aquele.

## Tópicos Avançados

## Classes Wrappers

Classes Wrapper possuem métodos publicos disponíveis na subclasse Object.

Exemplo: O metodo equals(Object) usamos para comparações, enquanto o toString possibilita imprimir o conteúdo de um objeto 
em formato de texto.

Classes derivadas da subClasse Number possuem vários métodos para devolverem um tipo primitivo, tais como:
byteValue(), shortValue(), intValue(), longValue(), doubleValue(), floatValue().

Além disso as classes derivadas de Number possuem também o método compareTo(Objeto que faz comparações entre objetos wrapper)

  Uma classe Wrapper é uma classe cujo objeto envolve ou contém tipos de dados primitivos. Quando criamos um objeto 
para uma classe wrapper, ele contém um campo e neste campo podemos armazenar tipos de dados primitivos. 
Em outras palavras, podemos envolver um valor primitivo em um objeto de classe wrapper.

-> Necessidade de classes de wrapper

- Eles convertem tipos de dados primitivos em objetos. Objetos são necessários se quisermos modificar os argumentos 
passados em um método (porque os tipos primitivos são passados por valor).
- As classes no pacote java.util tratam apenas de objetos e, portanto, as classes wrapper também ajudam neste caso.
- As estruturas de dados na estrutura Collection, como ArrayList e Vector , armazenam apenas objetos (tipos de referência) 
e não tipos primitivos.
- Um objeto é necessário para dar suporte à sincronização em multithreading.

![](C:/Users/FLAVILES/AppData/Local/Temp/print.png)


Vantagens de usar Tipos Primitivos
- Tipos primitivos são bem rápidos, 
- Consomem pouca memória
- Permitem operações mais complexas
- São bastante eficientes em laços e expressões


Logo, temos a vantagem de usar os Wrapper quando :

* É necessário inicializar objetos como nulo, ou enviar parâmetros nulos em um método / construtor para indicar o estado 
ou função. Isto não pode ser feito com as primitivas.

* É necessário utilizar os metodos existentes nas classes Wrapper.

E por que usar o tipo Primitivo?

* Certas implentações, como coleções, utilizar objetos (Wrappers) têm mais sobrecarga do que os seus homólogos primitivos
 (memória e boxe).

* Se inicializar objetos como null indevidamente  poderá criar um cenário para um NullPointerException.

- Autoboxing: A conversão automática de tipos primitivos para o objeto de suas classes de wrapper correspondentes é conhecida
como autoboxing. Por exemplo – conversão de int para Integer, long para Long, double para Double etc.
- 
- Unboxing: É apenas o processo inverso do autoboxing. A conversão automática de um objeto de uma classe wrapper para 
seu tipo primitivo correspondente é conhecido como unboxing. Por exemplo – conversão de Integer para int, Long para 
long, Double para double, etc.


## Generics

Generics é uma forma de tipar uma classe e reutilizar esse tipo várias vezes.Isso evita reescrita, e também reduz o 
uso de cast para fazer conversão de dados com fequencia.

Os genéricos são um recurso de programação genérica que foi incluída na linguagem de programação Java em 2004 na 
versão J2SE 5.0. Eles foram projetados para estender o sistema de tipos do Java para permitir que "um tipo ou método
opere em objetos de vários tipos, fornecendo segurança do tipo em tempo de compilação".

##  Anottations



- Threads