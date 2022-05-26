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

Enumeradores são como o switch case, você atribui alguns valores.


