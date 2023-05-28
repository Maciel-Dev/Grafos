package Structure;

public class Vertice<T> {

    // Variável de Armazenamento
    private T valor;

    // Constructor
    public Vertice(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor.toString();
    }
}
