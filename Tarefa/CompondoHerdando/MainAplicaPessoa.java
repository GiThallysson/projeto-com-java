import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

