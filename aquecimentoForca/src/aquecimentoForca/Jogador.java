package aquecimentoForca;

public class Jogador {

    private String nome;
    private Sexo sexo;
    private String cpf;
    private String email;

    public Jogador(String nome, Sexo sexo, String cpf, String email) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return nome;
    }
}