
public class Endereço {
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




