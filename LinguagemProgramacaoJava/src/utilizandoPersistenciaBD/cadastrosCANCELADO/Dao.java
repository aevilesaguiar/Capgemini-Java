package utilizandoPersistenciaBD.cadastrosCANCELADO;

import java.sql.*;

public class Dao {
/*
    Connection connection; // Responsavel por realizar a conexão com o banco de dados;
    PreparedStatement statement;//acessa a tabela(insert, update, delete, selct) , ou seja ele prepara o comando para ser executado
    ResultSet resultSet; //é uma classe que permite que guardemos dentro do objeto o resultado de uma Consulta a tabela(select)

    CallableStatement callableStatement;//ele faz o call das Procedures e Function

    //metodo que abre o banco de dados para acessar
    public void open() throws Exception{
        //para conectar no banco
        String driver = "org.postgresql.Driver";
        String url = "jdbc:postgresql://localhost:5432/cadastros";
        String user = "postgres";
        String password="postgres";

    try {
        Class.forName(driver);
        connection = DriverManager.getConnection(url, user, password);

        System.out.println("Conexão realizada com sucesso.");


    } catch (SQLException | ClassNotFoundException ex) {
        System.out.println("Erro ao conectar com o banco");
    }
    }

//encerrar a conexão com o banco de dados
 public void close() throws Exception{
        connection.close();
 }
*/

    Connection connection;  // Conexao ao Banco de Dados
    PreparedStatement statement; // Acessa a Tabela ( insert, update, delete , select)
    ResultSet resultSet; // Consulta a Tabela( select )
    CallableStatement call; // Procedures e Function

    public void open() throws Exception{
        String url = "jdbc:postgresql://localhost:5432/cadastros";
        String user = "postgres";
        String password = "postgres";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println("Erro ao conectar com o banco");
        }
    }

    public void close() throws Exception{
        connection.close();
    }
}


