import java.util.Scanner;
// No programa principal, você pode mudar o estado do Contexto e chamar o método
// emitirsolicito.
public class Programa {
    public static void main(String[] args) {
        // Criação do scanner para entrada do usuário
        Scanner escrevercaracterístico = new Scanner(System.in);

        // Inicialização do contexto com o estado A
        Contexto contextoclasseobjeto = new Contexto(new EstadoConcretoAnimado());

        // Exibe o comportamento do estado A
        // contexto.emitirsolicito();

        // Solicita ao usuário que selecione o novo estado
        System.out.println("Selecione um novo estado por número (1 animando, 2 bastante): ");
        String novoEstado = escrevercaracterístico.next();

        // Altera o estado com base na escolha do usuário
        if (novoEstado.equalsIgnoreCase("1")) {
            contextoclasseobjeto.setEstado(new EstadoConcretoAnimado());

            contextoclasseobjeto.emitirsolicito();
        } else if (novoEstado.equalsIgnoreCase("2")) {
            contextoclasseobjeto.setEstado(new EstadoConcretoBastante());
            // Exibe o comportamento do novo estado
            contextoclasseobjeto.emitirsolicito();
        } else {
            System.out.println("Estado do. Mantendo o estado atual.");
        }

        // Fechamento do scanner
        escrevercaracterístico.close();
    }
}
