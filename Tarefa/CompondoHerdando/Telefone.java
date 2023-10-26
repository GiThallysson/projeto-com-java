
public class Telefone {
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


