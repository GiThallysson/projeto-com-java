// A classe Contexto mantém uma referência ao estado atual e pode mudar seu
// estado.
class Contexto {
    private Estado estadoalterar;

    public Contexto(Estado estadoalterar) {
        this.estadoalterar = estadoalterar;
    }

    public void setEstado(Estado estadoalterar) {
        this.estadoalterar = estadoalterar;
    }

    public void emitirsolicito() {
        estadoalterar.manipularSolicitação();
    }
}
