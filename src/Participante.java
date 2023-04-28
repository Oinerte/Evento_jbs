import java.util.Date;

public class Participante {
    private String nome;
    private String cpf;
    private int telefone;
    private Date data_nasc;

    public Participante(String nome, String cpf, int telefone, Date data_nasc) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.data_nasc = data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    @Override
    public String toString() {
        return "Participante{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", telefone=" + telefone +
                ", data_nasc=" + data_nasc +
                '}';
    }
}
