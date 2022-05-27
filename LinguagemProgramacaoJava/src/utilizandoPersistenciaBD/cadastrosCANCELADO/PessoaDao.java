package utilizandoPersistenciaBD.cadastrosCANCELADO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//possui toda a camada de persistencia da camada pessoa
public class PessoaDao extends Dao {

    public void incluirPessoa(Pessoa pessoa) throws Exception{
        //abrir a conexão com o BD
        open();

        statement=connection.prepareStatement("insert into pessoa values(?,?,?)");
        statement.setInt(1,pessoa.getIdPessoa());
        statement.setString(2,pessoa.getNomePessoa());
        statement.setString(3,pessoa.getEmail());
        statement.execute();
        statement.close();
        close();
    }


    public void alterarPessoa(Pessoa p) throws Exception {
        open();
        statement = connection.prepareStatement("update Pessoa set nomepessoa = ?, email = ? where idPessoa = ?");
        statement.setString(1, p.getNomePessoa());
        statement.setString(2, p.getEmail());
        statement.setInt(3, p.getIdPessoa());
        statement.execute();
        statement.close();
        close();
    }

    public void excluirPessoa(Pessoa p) throws Exception {

        open();
        statement = connection.prepareStatement("delete from Pessoa where idPessoa = ?");
        statement.setInt(1, p.getIdPessoa());
        statement.execute();
        statement.close();
        close();

    }

    // retornando um objeto
    public Pessoa consultarPessoaIndividual(int cod) throws Exception {
        open();
        statement = connection.prepareStatement("select * from pessoas where idPessoa = ? ");
        statement.setInt(1, cod);
        try {
            resultSet = statement.executeQuery();
        }
        catch (SQLException ex) {
            throw new Exception(ex);
//		        System.out.println("Falha ao recuperar o registro. Contate TI");
        }
        finally {
            System.out.println("Fechando a conexão com banco de dados no Finally");
            close();
        }
        Pessoa p = null;
        if (resultSet != null) {
            if (resultSet.next()) {
                p = new Pessoa();
                p.setIdPessoa(resultSet.getInt("idPessoa"));
                p.setNomePessoa(resultSet.getString("nomePessoa"));
                p.setEmail(resultSet.getString("email"));
            }
        }
        close();
        return p;
    }

    public List<Pessoa> ListarPessoas() {
        try {
            open();
            statement = connection.prepareStatement("select * from pessoa");
            resultSet = statement.executeQuery();
            List<Pessoa> listaPessoas = new ArrayList<>();
            while (resultSet.next()) {
                Pessoa p = new Pessoa();
                p.setIdPessoa(resultSet.getInt("idPessoa"));
                p.setNomePessoa(resultSet.getString("nomePessoa"));
                p.setEmail(resultSet.getString("email"));
                listaPessoas.add(p);
            }
            close();
            return listaPessoas;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

}
