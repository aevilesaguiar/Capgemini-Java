package utilizandoPersistenciaBD.cadastrosCANCELADO;



import java.util.List;

public class Menu {
    public static void main(String[] args) {
        PessoaDao pd = new PessoaDao();

        try {
            //incluir uma pessoa
            Pessoa pessoa1=new Pessoa(1,"Jose","jose@gmail.com");
            Pessoa pessoa2=new Pessoa(2,"Joáo","joao@gmail.com");
            pd.incluirPessoa(pessoa1);
            pd.incluirPessoa(pessoa2);


            //alterar uma pessoa
            //verificar se o código da pessoa existe
            //alterar a informação desejada usando o set(Classe encapsulada)

            Pessoa pessoa= pd.consultarPessoaIndividual(2);
            System.out.println("pessoa: "+pessoa);
            pessoa.setEmail("joao2gmail.com");

            //chamar o método de contem o comando update
            System.out.println("pessoa: "+pessoa);
            pd.alterarPessoa(pessoa);


            //listando todas as pessoas
            List<Pessoa> pessoaList = pd.ListarPessoas();

            for (Pessoa p:pessoaList) {
                System.out.println(p);
            }

            //excluir ima pessoa
            //verificar se a pessoa existe por código
            Pessoa pessoa3=pd.consultarPessoaIndividual(2);

            //chamar o método que contém o comando delete
            pd.excluirPessoa(pessoa1);

            //listando todas as pessoas
            List<Pessoa> listPessoa=pd.ListarPessoas();

            for (Pessoa p:listPessoa) {
                System.out.println(p);

            }

        } catch (Exception e) {
            System.out.println("Error:  " + e.getMessage());
        }

    }
}
