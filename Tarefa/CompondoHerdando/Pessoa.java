import java.util.Date;
import java.util.List;

public class Pessoa {
    private String nome;
    private Date dataNascimento;
    private Endereço endereço;
    private List<Telefone> telsContato;

    public Pessoa(String nome, Date dataNascimento, Endereço endereço, List<Telefone> telsContato) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereço = endereço;
        this.telsContato = telsContato;
    }

    public String getNome() {
        return nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Endereço getEndereço() {
        return endereço;
    }

    public List<Telefone> getTelsContato() {
        return telsContato;
    }

    public void cadastrar() {
        cadastrar("ponha");
    };

    public int obterIdade() {
        // Implemente o cálculo da idade aqui
        return 23;
    }
}


