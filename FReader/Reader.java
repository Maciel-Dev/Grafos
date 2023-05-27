package FReader;

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

            int count = 0;
            int total = 0;
            while (line != null) {
                if(count == 0){
                    total = Integer.parseInt(line);
                }

                else if(count > 0 && count < (total + 1)){
                    String[] name = line.split(",");
                    Vertice vertice = new Vertice(name[1]);
                    grafo.adicionarVertice(line);
                }

                else{
                    String[] values = line.split(",");
                    for(String val : values){


                    }
                }

                line = reader.readLine();
                count ++;
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
