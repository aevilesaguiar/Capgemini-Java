# Linguagem de Programação em JAVA

- Aula 01 - Boas Vindas[ok]
- Aula 02 - Interfaces[ok]
- Aula 03 - Construtores[ok]
- Aula 04 - Enumeradores[ok]
- Aula 05 - Modificadores de acesso[ok]
- Aula 06 - Matrizes[ok]
- Aula 07 - Collections[ok]
- Aula 08 - Tópicos avançados[ok]
- Aula 09 - Genéricos[ok]
- Aula 10 - Anottations[ok]
- Aula 11 - Threads[ok]
- Aula 12 - Laços[ok]
- Aula 13 - Trabalhando com dados[ok]
- Aula 14 - Persistência de dados[ok]
- Aula 15 - Exceções e controle de erros[ok]
- Aula 16 - Considerações finais[ok]

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

##  Anottations /Metadados

Anottations são anotações que você pode criar dentro do java, com uma semantica específica. Ela começa com @, 
ex: @Override. Existem vários tipos. A anottation você pode usar em tempo de compilação, em tempo de construção do
projeto e em tempo de execução do projeto. 

Anottations é um recurso que permite adicionar informações complementares no código fonte.

Formas de uso no Código fonte:

Informações para o compilador
Em tempo de execução
O código fonte pode utilizar essas informações para compilar o código-fonte(.class) , no caso de desenvolvimento web(.war)

-@ Override : sobrescrevendo um método
- Inherited
- @Deprecated
- ....

Uso de anottations
- Documentaçãom por exemplo, XDoclet
- Compilação
- IDE
- Estrutura de teste, por exemplo JUnit(ferramenta de teste unitário)
- Recipient IoC , por exemplo , como Spring
- Serialização, por exemplo , XML]
- Programação Orientada a aspectos (AOP) , por exemplo, Spring AOP
- Servidores de aplicativos, por exemplo. conteiner EJB, serviço da web;
- Mapeamento objeto-relacional(ORM) , por exemplo, Hibernate, JPA
- E muito mais...


## Threads

Threads são conjuntos de instruções que podem ser executados dentro dos processos.
O processos são contituídos de threads. Esse conceito permite que threads sejam executadas de forma paralela.
Porém é importante salientar que o programador não tem controle sobre a sequencia de execução dos processos, então não
tem como determinar quem vai executar antes ou depois, queme scala é o servidor com seus critérios. e em uma mesma máquina
podemos ter resultados diferentes, a execução do processamento não é linear, muda conforme o enfileiramento.


## Laços de Repetição

Estruturas de repetição, também conhecidas como loops (laços), são utilizadas para executar repetidamente uma instrução
ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.

A principio usamos o for convencional.

Agora utilizaremos o foreach(para cada) e ele exige que utilizemos classe Wrapper. Então eu crio um objeto baseado
num tipo primitivo e coloco a minha lista dentro desse objeto.

## Trabalhando com Dados

- Trabalhar com Datas

Classe Calendar:

Essa classe pode produzir os valores de todos os campos de calendário necessários para implementar a formatação de data 
e hora, para uma determinada língua e estilo de calendário. Por exemplo, japonês, americano, italiano, brasileiro 
entre outros.

A classe Calendar é a mais usada quando se trata de datas, mas como é uma classe abstrata, não pode ser instanciada, 
portanto para obter um calendário é necessário usar o método estático getInstance(), apresentado no exemplo da 
Listagem 2.


import java.util.Calendar;

public class Data_Calendar{

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println("Data e Hora atual: ”+c.getTime());
	}
}

Com a classe Calendar também se consegue manipular a data e hora com os métodos que são fornecidos, abaixo seguem os 
exemplos.

import java.util.Calendar;

public class Testa_Metodo_Get_Calendar{

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();

		System.out.println("Data/Hora atual: "+c.getTime());
		System.out.println("Ano: "+c.get(Calendar.YEAR));
		System.out.println("Mês: "+c.get(Calendar.MONTH));
		System.out.println("Dia do Mês: "+c.get(Calendar.DAY_OF_MONTH));
	}
}

DateFormat:

Essa classe permite converter informações do tipo String para data do tipo Date, permitindo seguir um formato. 
Consegue-se trabalhar ao contrário, convertendo um dado do tipo Date para uma String. Por ser uma classe abstrata, 
não é possível instanciá-la, por isso deve ser usado para método estático getDateInstance(). Sempre quando declarado
é preciso importar o pacote java.text.


## Persistencia de Dados

A Persistência de dados é um meio para que um aplicativo persista e recupere informações de um sistema de armazenamento
não volátil. A persistência é vital para os aplicativos corporativos por causa do acesso necessário aos bancos de dados.

O que é persistencia de dados? persistir dados é fazer uma inclusão, exclusão, alteração, seleção no banco de dados

**O que é JDBC?** 

Pode-se dizer que é uma API/biblioteca que reúne conjuntos de classes e interfaces escritas na linguagem Java na qual
possibilita se conectar através de um driver específico do banco de dados desejado. Com esse driver pode-se executar 
instruções SQL de qualquer tipo de banco de dados relacional.

Para fazer a comunicação entre a aplicação e o SGBDs é necessário possuir um driver para a conexão desejada. 
Geralmente, as empresas de SGBDs oferecem o driver de conexão que seguem a especificação JDBC para caso de algum 
desenvolvedor querer utilizar.

**O que é um Driver?**

Além de atuar como uma interface entre os SGBDs e as aplicações, também pode ser considerado como um tradutor que ajuda
na definição das mensagens binárias trocadas com um protocolo de um SGBD.

Para desenvolver uma aplicação baseada em uma especificação JDBC é preciso entender algumas das principais classes e 
interfaces apresentadas abaixo.

Existe um ponto de atenção na importação das classes ou interfaces relacionadas ao pacote a ser usado no momento do 
desenvolvimento. Na Figura 1, é mostrado de forma correta a importação do pacote referente à classe Connection
pertencente ao pacote java.sql. Esse é um fator a ser observado com cautela, pois isso é considerado um dos erros
mais comuns justamente pelo fato do desenvolvedor pensar muitas vezes em usar o pacote com.mysql.jdbc sendo que está 
utilizando o driver JDBC do banco MySQL.

![](C:/Users/FLAVILES/AppData/Local/Temp/EntendendoJDBC01.jpg)

Pacote java.sql

Esse pacote oferece a biblioteca Java o acesso e processamento de dados em uma fonte de dado. As classes e interfaces 
mais importantes são:

|-----Classe------   |   Interface  |
----------------------------------
|DriverManager | Driver            |
----------------------------------
|DriverManager | Connection      |
----------------------------------
|DriverManager | Statment        |
----------------------------------
|DriverManager | ResultSet       |
---------------------------------
|DriverManager| PreparedStament |
---------------------------------

**A classe DriverManager**

Cada driver que se deseja usar precisa ser registrado nessa classe, pois oferece métodos estáticos para gerenciar 
um driver JDBC.

Para a aplicação reconhecer a comunicação com o banco de dados escolhido, é preciso obter um arquivo com a extensão .jar
que geralmente se consegue através dos sites das empresas que distribuem o SGBD. Esse arquivo tem o objetivo ajudar no 
carregamento do driver JDBC. Na prática de um desenvolvimento voltado a web, é criada a pasta “lib” da pasta “WEB-INF” 
e inserido esse arquivo.

No caso apresentado na Figura 2, apenas foi criado à pasta “lib” por ser um projeto Java puro e adicionado a biblioteca 
copiada para dentro do projeto.

![](C:/Users/FLAVILES/AppData/Local/Temp/EntendendoJDBC02.png)

Figura 2: Adicionando a biblioteca MySQL Connector no projeto.

**Listagem 1: Carregando o driver MySQL.**

try {
//Carrega o driver especificado
Class.forName("com.mysql.jdbc.Driver");
} catch (ClassNotFoundException e) {
System.out.println("Driver não encontrado!"+e);
}

Após o driver estar inicializado, pode-se abrir uma conexão através do método getConection da classe DriverManager. 
Esse método possui três sobrecargas apresentado na Listagem 2.

Listagem 2: Sobrecarga do método getConnection.

public static Connection getConnection(String url)
public static Connection getConnection(String url, Properties info)
public static Connection getConnection(String url, String user, String password)

**A interface Connection:** Representa uma conexão ao banco de dados. Nessa interface são apresentados os métodos 
mais utilizados.

**Método close:** Geralmente é inserido dentro do bloco finally para realizar sempre a sua execução, pois esse método serve 
para fechar e liberar imediatamente um objeto Connection.

**Método isClosed:** Serve para verificar se o objeto Connection está fechado.

**Método createStatement**

É usado para criar um objeto Statement que executa instruções SQL ao banco de dados.

Listagem 3: Método que cria uma conexão com o banco de dados.

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public static Connection createConnection() throws SQLException{
		String url = "jdbc:mysql://localhost:3306/loja"; //Nome da base de dados
		String user = "root"; //nome do usuário do MySQL
		String password = "root"; //senha do MySQL

		Connection conexao = null;
		conexao = DriverManager.getConnection(url, user, password);

		return conexao;
	}
}

**Método prepareStatement**

É usado para criar um objeto que representa a instrução SQL que será executada, sendo que é invocado através do objeto 
Connetion.

Listagem 4: Exemplo da execução de uma instrução SQL através do prepareStatement

String sql = "INSERT INTO loja (nome,sobrenome,idade,salario) VALUES ('Mario','Corleone','28','2322.39')";
//Prepara a instrução SQL
PreparedStatement ps = conexao.prepareStatement(sql);
//Executa a instrução SQL
ps.execute();

**setAutoCommit**

Esse método aceita como parâmetro um valor booleano (true ou false), no qual consegue definir se todas as instruções 
executadas serão gravadas (comitadas). Por padrão, quando finalizada uma instrução de INSERT, UPDATE ou DELETE a 
operação de gravação (commit) é executada automaticamente sem a necessidade de invocar o método setAutoCommit. Agora, 
para instruções de SELECT, a gravação dos dados ocorre quando o conjunto de dados associados é fechado, ou seja, quando
invocado o método close.

**rollback**

Usado para retornar uma transação, sendo muito usado dentro de blocos catch em caso de alguma operação gerar erro.

Listagem 5: Exemplos do método setAutoCommit, rollback e commit.

try {
conexao.setAutoCommit(false);
ps = conexao.prepareStatement(sql);
ps.executeUpdate();

	//Grava as informações se caso de problema os dados não são gravados
	conexao.commit();

} catch (SQLException e ) {
if (conexao != null) {
try {
System.err.print("Rollback efetuado na transação");
conexao.rollback();
} catch(SQLException e2) {
System.err.print("Erro na transação!"+e2);
}
}
} finally {
if (ps != null) {
ps.close();
}
conexao.setAutoCommit(true);
}


**A interface Statement**

Nesta interface são listados os métodos executeQuery e executeUpdate que são considerados os mais importantes referente 
a execução de uma query.

**executeQuery** - Executa uma instrução SQL que retorna um único objeto ResultSet.
**executeUpdate** - Executa uma instrução SQL referente a um INSERT, UPDATE e DELETE. Esse método retorna a quantidade de 
registros que são afetados pela execução do comando SQL.

**Listagem 6: Exemplo do método executeUpdate.**


String sql = "UPDATE funcionario SET nome=?, sobrenome=? WHERE codigo=?";
ps = conn.prepareStatement(sql);
ps.setString(1, nome);
ps.setString(2, sobrenome);
ps.setInt(3, codigo);
//Executa a instrução
int retorno = ps.executeUpdate();
if(retorno > 0){
System.out.printf("Novo registro alterado: %d: %s - %s",codigo, nome,sobrenome);
}else{
System.out.println("Não foi possível alterar os registros!");
}



**Interface ResultSet**


Representa o conjunto de resultados de uma tabela no banco de dados. Esse objeto mantém o cursor apontando para a sua 
linha atual de dados, sendo que seu início fica posicionado na primeira linha.

Além disso, esse objeto fornece métodos getters referentes aos tipos de dados como: getInt, getString, getDouble, 
getFloat, getLong entre outros. Com esses métodos são possíveis recuperar valores usando, por exemplo, o nome da coluna 
ou número do índice.

![](C:/Users/FLAVILES/AppData/Local/Temp/EntendendoJDBC03.jpg)

Figura 3: Visão de como funciona a recuperação de valores através dos índices.

Listagem 7: Exemplo da listagem e recuperação dos valores através do objeto ResultSet.

conn = ConnectionFactory.createConnection();

String sql = "SELECT codigo, nome, sobrenome, idade, salario FROM funcionario";
ps = conn.prepareStatement(sql);

//Executa o comando de consulta aonde guarda os dados retornados dentro do ResultSet.
//Pelo fato de gerar uma lista de valores, é necessário percorrer os dados através do laço while
ResultSet rs = ps.executeQuery();
//Faz a verificação de enquanto conter registros, percorre e resgata os valores
while(rs.next()){
//Recupera valor referente ao nome da coluna
int codigo = rs.getInt("codigo");
//Recupera o índice do campo referente ao campo nome
String nome = rs.getString(2);
String sobreNome = rs.getString("sobrenome");
String nomeCompleto = nome.concat(" "+sobreNome);
int idade = rs.getInt("idade");
Double salario = rs.getDouble("salario");
System.out.printf("Código %d: %s - %d | Salário: %f \n",codigo, nomeCompleto, idade, salario);
}

## DAO(Objeto de acesso a dados)


DAO Pattern: Persistência de Dados utilizando o padrão DAO

O padrão de projeto DAO surgiu com a necessidade de separarmos a lógica de negócios da lógica de persistência de dados. 
Este padrão permite que possamos mudar a forma de persistência sem que isso influencie em nada na lógica de negócio,
além de tornar nossas classes mais legíveis.

Classes DAO são responsáveis por trocar informações com o SGBD e fornecer operações CRUD e de pesquisas, elas devem ser 
capazes de buscar dados no banco e transformar esses em objetos ou lista de objetos, fazendo uso de listas genéricas 
, também deverão receber os objetos, converter em instruções SQL e mandar para o banco de dados.

Toda interação com a base de dados se dará através destas classes, nunca das classes de negócio, muito menos de formulários.

Se aplicarmos este padrão corretamente ele vai abstrair completamente o modo de busca e gravação dos dados, 
tornando isso transparente para aplicação e facilitando muito na hora de fazermos manutenção na aplicação ou 
migrarmos de banco de dados.

Também conseguimos centralizar a troca de dados com o SGBD (Sistema Gerenciador de Banco de Dados), teremos um ponto 
único de acesso a dados, tendo assim nossa aplicação um ótimo design orientado a objeto.




## DBeaver

DBeaver é um aplicativo de software cliente SQL e uma ferramenta de administração de banco de dados. Para bancos de dados
relacionais, ele usa a interface de programação de aplicativo JDBC para interagir com os bancos de dados por meio de 
um driver JDBC

## Exceções

Uma exceção é um sinal que indica que algum tipo de condição excepcional ocorreu durante a execução do programa. Assim, exceções estão associadas a condições de erro que não tinham como ser verificadas durante a compilação do programa.



O tratamento de exceções (exception handling) permite ao programador capturar exceções e tratá-las sem interromper o fluxo normal de execução do programa.

Entendendo as exceções

As exceções ocorrem quando algo imprevisto acontece, elas podem ser provenientes de erros de lógica ou acesso a recursos que talvez não estejam disponíveis.

Alguns possíveis motivos externos para ocorrer uma exceção são:

- Tentar abrir um arquivo que não existe.
- Tentar fazer consulta a um banco de dados que não está disponível.
- Tentar escrever algo em um arquivo sobre o qual não se tem permissão de escrita.
- Tentar conectar em servidor inexistente.

Quando se cria programas de computador em Java, há possibilidade de ocorrer erros imprevistos durante sua execução, esses erros são conhecidos como exceções e podem ser provenientes de erros de lógica ou acesso a dispositivos ou arquivos externos.

Alguns possíveis erros de lógica para ocorrer uma exceção são:

- Tentar manipular um objeto que está com o valor nulo.
- Dividir um número por zero.
- Tentar manipular um tipo de dado como se fosse outro.
- Tentar utilizar um método ou classe não existentes.


**Tratando Exceções**

Uma maneira de tentar contornar esses imprevistos é realizar o tratamento dos locais no código que podem vir a lançar possíveis exceções, como por exemplo, campo de consulta a banco de dados, locais em que há divisões, consulta a arquivos de propriedades ou arquivos dentro do próprio computador.

Para tratar as exceções em Java são utilizados os comandos try e catch.

Onde:

- try{ … } - Neste bloco são introduzidas todas as linhas de código que podem vir a lançar uma exceção.
- catch(tipo_excessao e) { … } - Neste bloco é descrita a ação que ocorrerá quando a exceção for capturada.

Comando finally

Quando uma exceção é lançada e é necessário que determinada ação seja tomada mesmo após a sua captura, utilizamos a palavra reservada finally.

**Comandos throw e throws**

Imagine uma situação em que não é desejado que uma exceção seja tratada na própria classe ou método, mas sim em outro que venha lhe chamar. Para solucionar tal situação utilizamos o comando throws na assinatura do método com a possível exceção que o mesmo poderá a vir lançar.

tipo_retorno nome_metodo() throws tipo_exceção_1, tipo_exceção_2, tipo_exceção_n
{

…

}


Onde:

- tipo_retorno – Tipo de retorno do método.
- nome_metodo() - Nome do método que será utilizado.
- tipo_exceção_1 a tipo_exceção_n – Tipo de exceções separadas por virgula que o seu método pode vir a lançar.
