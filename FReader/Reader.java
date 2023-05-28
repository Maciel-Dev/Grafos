package FReader;

import Objeto.Cidade;
import Structure.Aresta;
import Structure.Grafo;
import Structure.Vertice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Reader {
    Grafo grafo = new Grafo();

    public void main() {
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("entrada.txt"));
            String line = reader.readLine();
            ArrayList<Vertice> listaV = grafo.getVertices();
            ArrayList<Aresta> listaA = grafo.getArestas();

            int count = 0;
            int total = 0;
            int arest_count = 0;
            while (line != null) {
                // Caso seja a primeira linha
                if(count == 0){
                    total = Integer.parseInt(line);
                }

                // Linhas com número e o nome da Cidade
                else if(count > 0 && count < (total + 1)){
                    String[] name = line.split(",");
                    Cidade cidade = new Cidade(Integer.parseInt(name[0]), name[1]);
                    // Entende-se que cada vértice possui um valor do tipo T
                    // que representa o Objeto cidade
                    // Cada Cidade possuindo um "número" e um nome
                    Vertice vertice = new Vertice(cidade);
                    grafo.adicionarVertice(vertice);
                }

                // Relações entre cidades
                else{

                    String[] values = line.split(",");
                    int lineCount = 0;
                    for(String val : values){
                        grafo.adicionarAresta(listaV.get(arest_count), listaV.get(lineCount), Float.parseFloat(val));
                        lineCount ++;
                    }
                    arest_count++;
                }

                line = reader.readLine();
                count ++;
            }
            reader.close();
            for(Aresta aresta : listaA){
                System.out.println(aresta.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
