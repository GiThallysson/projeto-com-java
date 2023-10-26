import java.util.ArrayList;
import java.util.Date;
import java.util.List;





import java.util.Date;
import java.util.List;

class Pessoa {
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


class Funcionário extends Pessoa {
    private Integer matrícula;
    private Cargo cargo;
    private double salário;
    private Date dataAdmissão;

    public Funcionário(String nome, Date dataNascimento, Endereço endereço, List<Telefone> telsContato,
                       Integer matrícula, Cargo cargo, double salário, Date dataAdmissão) {
        super(nome, dataNascimento, endereço, telsContato);
        this.matrícula = matrícula;
        this.cargo = cargo;
        this.salário = salário;
        this.dataAdmissão = dataAdmissão;
    }

    public Integer getMatrícula() {
        return matrícula;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public double getSalário() {
        return salário;
    }

    public Date getDataAdmissão() {
        return dataAdmissão;
    }

    public void reajustarSalario(double percentual) {
        // Implemente o reajuste de salário aqui
    }

    public void promover(Cargo novoCargo) {
        // Implemente a promoção aqui
    }

    @Override
    public void cadastrar() {
        // Implemente o cadastro do funcionário aqui
    }

    @Override
public String toString() {
    return "Funcionário{" +
            "matrícula=" + matrícula +
            ", nome='" + getNome() + '\'' +
            ", dataNascimento=" + getDataNascimento() +
            ", endereço=" + getEndereço() +
            ", telsContato=" + getTelsContato() +
            ", cargo=" + cargo.getNome() +
            ", salário=" + salário +
            ", dataAdmissão=" + dataAdmissão +
            '}';
}

}

class Cliente extends Pessoa {
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

public class MainAplicaPessoa {
    public static void main(String[] args) {
        // Criação de um cargo
        Cargo cargoFuncionario = new Cargo("Analista de TI");
        Cargo cargoCliente = new Cargo("Cliente VIP");

        // Criação de uma profissão
        Profissão profissãoCliente = new Profissão("Advogado");

        // Criação de telefones e endereço
        List<Telefone> telefonesFuncionario = new ArrayList<>();
        telefonesFuncionario.add(new Telefone("123456789"));
        List<Telefone> telefonesCliente = new ArrayList<>();
        telefonesCliente.add(new Telefone("987654321"));
        
        Endereço endereçoFuncionario = new Endereço("Rua A", "Cidade A");
        Endereço endereçoCliente = new Endereço("Rua B", "Cidade B");

        // Criação de funcionário e cliente
        Funcionário funcionário = new Funcionário("Funcionário", new Date(), endereçoFuncionario, telefonesFuncionario,
                12345, cargoFuncionario, 5000.0, new Date());

        Cliente cliente = new Cliente("Cliente", new Date(), endereçoCliente, telefonesCliente,
                "C123", profissãoCliente);

        // Execução dos métodos
        funcionário.cadastrar();
        cliente.cadastrar();
        int idadeFuncionario = funcionário.obterIdade();
        System.out.println("Idade do Funcionário: " + idadeFuncionario);
        System.out.println(funcionário.toString());
        System.out.println(cliente.toString());

        funcionário.reajustarSalario(10.0); // Exemplo de reajuste de 10%
        funcionário.promover(new Cargo("Gerente de TI")); // Exemplo de promoção
    }
}

class Cargo {
    private String nome;

    public Cargo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

 class Profissão {
    private String nome;

    public Profissão(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Telefone {
    private String número;

    public Telefone(String número) {
        this.número = número;
    }

    public String getNúmero() {
        return número;
    }

    @Override
    public String toString() {
        return número;
    }
}


class Endereço {
    private String rua;
    private String cidade;

    public Endereço(String rua, String cidade) {
        this.rua = rua;
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public String getCidade() {
        return cidade;
    }

    @Override
    public String toString() {
        return rua + ", " + cidade;
    }
}




