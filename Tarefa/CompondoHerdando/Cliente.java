import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends Pessoa {
    private String código;
    private Profissão profissão;

    public Cliente(String nome, Date dataNascimento, Endereço endereço, List<Telefone> telsContato,
                   String código, Profissão profissão) {
        super(nome, dataNascimento, endereço, telsContato);
        this.código = código;
        this.profissão = profissão;
    }

    public String getCódigo() {
        return código;
    }

    public Profissão getProfissão() {
        return profissão;
    }

    @Override
    public void cadastrar() {
        // Implemente o cadastro do cliente aqui
    }

     @Override
  public String toString() {
    return "Endereço{" +
            "nome='" + getNome() + '\'' +
            ", dataNascimento=" + getDataNascimento() +
            ", endereço=" + getEndereço() +
            ", telsContato=" + getTelsContato() +
            ", código=" + código +
            ", profissão=" + profissão.getNome() +
            '}';
  }

}


