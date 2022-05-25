package parte2.classeConceito;

public class Pessoa {

    private String nomePessoa;
    private Integer idadePessoa;


    public Pessoa(String nomePessoa, Integer idadePessoa) {
        this.nomePessoa = nomePessoa;

        this.idadePessoa = idadePessoa;
    }

    public Pessoa() {


        //Getters e Setters
    }

        public String getNomePessoa() {
            return nomePessoa;
        }

        public void setNomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
        }

        public Integer getIdadePessoa() {
            return idadePessoa;
        }

        public void setIdadePessoa(Integer idadePessoa) {
            this.idadePessoa = idadePessoa;
        }


        //metodo

    public boolean mostraDados(String pNome, Integer pIdade){
        System.out.println("Nome: " +pNome);
        System.out.println(" Idade:"+pIdade);
        return false;
    }



    @Override
    public String toString() {
        return "Pessoa{" +
                "nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }
}
