import java.lang.reflect.Array;
import java.util.ArrayList;

public class Grafo<T> {

    private ArrayList<Aresta> arestas;
    private ArrayList<Vertice> vertices;


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
        return null;
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
