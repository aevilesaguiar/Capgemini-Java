package parte2.classeConceito2;

import parte2.classeConceito.Pessoa;

public class MainGeral {
    public static void main(String[] args) {

        PessoaFisica pessoafisica = new PessoaFisica();
        pessoafisica.setNomePessoa("Maria da Silva");
        pessoafisica.setIdadePessoa(39);
        pessoafisica.setCpf("123.456.789-96");


        System.out.println(pessoafisica.toString());




    }

}
