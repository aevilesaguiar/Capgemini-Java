# Programa Start By Capgemini Java

## Introdução

- Aula 01 - Introdução ao treinamento [ok]
- Aula 02 - Introdução ao JAVA[ok]
- Aula 03 - Ambiente de desenvolvimento[ok]
- Aula 04 - Visão dos Frameworks[ok]
- Aula 05 - Programas Java[ok]
- Aula 06 - Tipos de dados[ok]
- Aula 07 - Variáveis[ok]
- Aula 08 - Literais[ok]
- Aula 09 - Aritméticos[ok]
- Aula 10 - Estruturas Condicionais[ok]
- Aula 11 - Laços de repetição[ok]
- Aula 12 - Entrada de dados gráficos
- Aula 13 - Orientações a Objetos


## A empresa que criou o java eem 1982 foi a sun microsystem.

O java foi criado com o objetivo de ser compatível com várias plataformas na época 1991.

-Linguagem java: indepente de máquina e platforma
- Um Aplete é inserido numa página html

## Características Java

- Simples
- Orientação a objetos
- Distribuível
- Multithread (bem escalonável na parte de ambiente de servidor)
- Dinâmico
- Arquitetura neutra( não se prende ao S.O.)
- Portátil
- Alto desempenho
- Robusto
- Seguro

- JVM: Java Virtual Machine, Máquina virtual Java é um programa que carrega e executa os aplicativos Java, convertendo os bytecodes em código executável de máquina.
  A JVM é responsável pelo gerenciamento dos aplicativos, à medida que são executados

EM 2010 a Oracle adquire a Sun , mantendo todas as patentes e projetos que eram úteis.
Mas mantenve a característica WORA( WRITE ONCE, RUN ANIWHERE).
No java eu não preciso compilar em cada S.O., a JVM é apena s uma especificação e sua implementação é diferente de fornecedor para fornecedor.

- JRE: Java Runtime Enviroment. É o pacote JAVA necessário para ter acesso a JVM(Java Virtual Machine), e que possibilita você "rodar" os programas JAVA em sue computador.

- JDK : Java development Kit. é o pacote java necessário para desenvolver aplicativos baseados em Java.




## Frameworks /IDE

Frameworks/IDES: são ambiente/softwares que são criadaos para programar/desenvolver softwares em diversas linguagens, sem muitas restrições.

Ex:
- Net Beans
- Eclipe
- Intellijei


## Tipos de dados

Tem a ver com que tipo de informação eu quero armazenar dentro do programa

## Variaveis

Variáveis são áreas de memória que você aloca, nomeia e tipifica, onde vc diz que tipo de dado que é , e vc pode atribuir valor, e seu valor pode variar de acordo com as intruções que o programa
exige. Geralmente as varíaveis são inicializadas e vão mudando no decorrer do programa. Mas temos variaveis tipo final que não são modificadas.
Variaveis são areas de memória que estão sendo ocupadas e portanto não devemos criar variáveis de forma indiscriminada, e tão pouco ignorar o dimensionamento
correto delas, para que possamos ocupar a quantidade de memória que é necessária.


## Literais

Literal é aquilo que você atribui a uma variável. Um exemplo: int numero=1; é o valor atribuido a variavel. A variavel vai recebendo conteúdo através dos literais.

## Operadores

Expressoes e operadores tem o objetivo de comparar valores, criar formulas e uma serie de aplicações. Geralmente montamos as expressões
utilizando operadores lógicos;


Comandos de incrementação e decrementação, geralmente são usados dentro de laços de repetição;

Operadores relacionais e operadores lógicos: eles são extremamente importantes pois junto com os comandos condicionais e os laços de repetição, nos
ajudam a condicionar o termino dos laços de repetição e ajudam com os comandos condicionais a definir o fluxo.


Para que serve operadores lógicos? para que possamos agrupar condições.

## Estruturas Condicionais

Estruturas Condicionais tem a característica de mudar o fluxo dentro do programa, e são muito utilizadas em regras de negócios, um exemplo: verificar um cpf, verificar um cep,
quantidade de caracteres e outros....

## Laço de repetição

Estruturas de repetição, também conhecidas como loops (laços), são utilizadas para executar repetidamente uma instrução ou bloco de instrução enquanto
determinada condição estiver sendo satisfeita. As principais estruturas de repetição na maioria das linguagens são o for e o while.


While: é chamado de laço pré testado, ou seja o programa testa se a condição está sendo satisfeita e entra no laço de repetição, até que a condição não seja mais satisfeita.

O while é condicional a um teste, para validar uma situação.

doWhile: faça enquanto, é um laço pós testado, pois ele entra no laço pelo o menos uma vez.


FOR: não é utilizado apenas com arrays, mas também para substituir o while


## Entrada de Dados Gráficos

Existem duas formas gráficas para fazer um input no java, pode ser feito através do scanner, (não é muito legal pois temos 
que pegar o valor na saida)temos também O jOptionPane ele é bem indicado( não comercialmente , mas para estudo). 
Lembrando que o jOptionPane o que você digitar na caixinha é uma String, e você precisa fazer um parse, ou seja a conversão
para o tipo que você precisa.


## Orientação a objetos POO

Orientação a Objetos é um paradigma de programação.

Existe o paradigma de Orientação a objeto e o Paradigma estruturado. O que difere o Paradigma estruturado é que temos
que ficar copiando trechos de um programa para ser utilizado em outro, no POO eu consigo reaproveitar o código, eu não 
preciso desenvolver a mesma rotina em vários lugares, eu tenho objetos que são criados e eu acabo utilizando esses objetos
de forma produtiva. Ou seja um programa bem estruturado, com uma manutenabilidade melhor.

## Conceitos de POO

- Classe: classe é um elemento de um projeto de orientação a Objeto que consegue expressar em variáveis o que eu tenho no mundo real. Ou seja 
seria um molde, por exemplo: Um veículo, ele gera informação, como: marca, cor, ano, renavam... e cada elemento dessa classe
acaba compondo uma classe, dentro dessa classe temos atributos, construtores, metodos e outros, e que podemos instanciá-la.

## O que é uma intancia?

Uma instaciação/instanciamento é criar um objeto. 

Esse processo : Pessoa pes = new Pessoa(); Onde declaro a classe, nomeio a objeto, utilizo o construtor new
e atribuo a classe Pessoa a ele, ou seja quando eu der um new ele vai pegar tudo que está dentro do classe pessoa, 
como atributos, construtores, metodos , getter e setters e vai jogar tudo dentro do objeto, que nesse caso se
chama 'pes',  esse objeto é um elemento que fica na memória e depois a maquina virtual entende, por isso que 
depois que instancio a classe eu coloco um ponto e consigo acessar tudo que tem dentro da classe. Isso deve ser
feito por que a classe por si só, é apenas um temos, por isso tenho que instanciá-la e fazer referencia a seus 
elementos.


## Objeto

O que é um objeto em Java? Uma entidade que possui estado e comportamento é conhecida como um objeto, por exemplo, cadeira,
bicicleta, marcador, caneta, mesa, carro, etc. Pode ser física ou lógica (tangível e intangível).

Criar objeto é simplesmente instanciar uma classe, existem outros objetos que podemos criar em java como: arrayList, linkediList
e outros.

## Encapsulamento

Encapsulamento é um dos atributos de Orientação a Objeto. E seu objetivo é blindar seus atributos dentro da classe, para que 
os atributos não sejam vistos publicamente.  Utilizamos para cada atributo um getter e setter.

get: pegar informação
set: mandar informação para dentro da classe

Agora quando eu tentar acesssar os atriburos eu não consigo mais acessar direto pelos os atributos, agora
se eu quiser acessar tenho que utilizar o getter e esetter.

## Getter e Setter

Eu uso Getter e setter para evitar que os meus atributos fiquem inacessíveis na classe, pois como os mesmo estão encapsulados
(private) , então a aúnica forma e utilizando getter e setter. Por padrão utilizamos um get e um set para cada atributo;.

## Herança 

Herança é outro pilar da Orientação a Objeto, é um mecanismo da Orientação a Objeto que permite criar novas classes
a partir de classes já existentes, aproveitando-se das características existentes na classe a ser estendida. 
Este mecanismo é muito interessante, pois promove um grande reuso e reaproveitamento de código existente.


## Polimorfismo

Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos 
que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, 
usando para tanto uma referência a um objeto do tipo da superclasse.


Exemplo:

"Os metodos devem ser implementados"

abstract class Mamifero {

    public abstract double cotaDiariaLeite();
}



## 4 pilares da orientação a objetos

1 - Abstração. 
2 - Encapsulamento. ...
3 - Herança. ...
4 - Polimorfismo.


