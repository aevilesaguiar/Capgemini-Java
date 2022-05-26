# Linguagem de Programação em JAVA

- Aula 01 - Boas Vindas[ok]
- Aula 02 - Interfaces[ok]
- Aula 03 - Construtores[ok]
- Aula 04 - Enumeradores
- Aula 05 - Modificadores de acesso
- Aula 06 - Matriz
- Aula 07 - Cobranças
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






