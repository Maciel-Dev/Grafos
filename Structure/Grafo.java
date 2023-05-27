package Structure;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {

    private ArrayList<Aresta> arestas = new ArrayList<>();
    private ArrayList<Vertice> vertices = new ArrayList<>();


    public Vertice<T> adicionarVertice(T valor){
        Vertice<T> novo = new Vertice<T>(valor);
        this.vertices.add(novo);
        return novo;
    }

    private Vertice<T> obterVertice(T valor){
        for(Vertice<T> vert : this.vertices){
            if(vert.getValor().equals(valor)){
                return vert;
            }
        }
        return null; // Alterar saída
    }

    public void adicionarAresta(T origem, T destino, float peso){
        // Implementação Default
        Vertice<T> verticeOrigem;
        Vertice<T> verticeDestino;
        Aresta novaAresta;

        verticeOrigem = obterVertice(origem);

        if(verticeOrigem == null){
            verticeOrigem = adicionarVertice(origem);
        }

        verticeDestino = obterVertice(destino);

        if(verticeDestino == null){
            verticeDestino = adicionarVertice(destino);
        }

        novaAresta = new Aresta(verticeOrigem, verticeDestino, peso);

        ArrayList valoresAV = new ArrayList();
        valoresAV.add(List.of(verticeOrigem, List.of(verticeDestino, peso)));

        this.arestas.add(novaAresta);

    }

    public void buscaEmLargura(){
        ArrayList<Vertice> marcados = new ArrayList<>();
        ArrayList<Vertice> fila = new ArrayList<>();
        Vertice atual = this.vertices.get(0); // Trata como inicializador
        fila.add(atual);

        while(fila.size()>0){
            atual = fila.get(0);
            fila.remove(0);
            marcados.add(atual);
            System.out.println(atual.getValor());
            ArrayList<Aresta> destinos = this.obterDestinos(atual);
            Vertice proximo;
            for (Aresta destino : destinos) {
                proximo = destino.getDestino();
                if (!marcados.contains(proximo)) {
                    fila.add(proximo);
                }
            }
        }
    }

    private ArrayList<Aresta> obterDestinos (Vertice<T> v){
        ArrayList<Aresta> destinos = new ArrayList<Aresta>();
        Aresta atual;

        for (Aresta aresta : this.arestas) {
            atual = aresta;
            if (atual.getOrigem().equals(v)) {
                destinos.add(atual);
            }
        }
        return destinos;
    }

    public ArrayList<Aresta> getArestas() {
        return arestas;
    }

    public void setArestas(ArrayList<Aresta> arestas) {
        this.arestas = arestas;
    }

    public ArrayList<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(ArrayList<Vertice> vertices) {
        this.vertices = vertices;
    }
}
