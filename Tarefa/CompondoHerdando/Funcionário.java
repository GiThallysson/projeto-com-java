
import java.util.Date;
import java.util.List;

public class Funcionário extends Pessoa {
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

