package parte2.classeConceito;

public class ClasseConceito {
    public static void main(String[] args) {
        //Main classe principal do java, a parir da classe main podemos instanciar as classes e invovar todos os
        //métodos e variáveis

        Pessoa pessoa= new Pessoa();
        pessoa.setIdadePessoa(16);
        pessoa.setNomePessoa("Maria Marcelina");

        System.out.println("*****************************************************************");

        System.out.println("Nome:"+pessoa.getNomePessoa());
        System.out.println("Idade:" +pessoa.getIdadePessoa());

        System.out.println("*****************************************************************");

        System.out.println(pessoa.toString());

        System.out.println("*****************************************************************");

        System.out.println(pessoa.mostraDados("Sandra", 19));

    }
}
