package parte2.classeConceito2;

public class Pessoas {

    private String nome;
    private String telefone;
    private Integer idade;

    public Pessoas(String nome, String telefone, Integer idade) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
    }


    public Pessoas() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoas{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", idade=" + idade +
                '}';
    }
}
