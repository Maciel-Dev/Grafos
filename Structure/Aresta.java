package Structure;

public class Aresta {
    private Vertice origem, destino;
    private Float peso;

    public Aresta(Vertice origem, Vertice destino, Float peso){
        this.destino = destino;
        this.origem = origem;
        this.peso = peso;
    }

    public Vertice getOrigem() {
        return origem;
    }

    public void setOrigem(Vertice origem) {
        this.origem = origem;
    }

    public Vertice getDestino() {
        return destino;
    }

    public void setDestino(Vertice destino) {
        this.destino = destino;
    }

    public Float getPeso() {
        return peso;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }
}
