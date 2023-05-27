import Structure.Grafo;
import UI.HUD;
import FReader.Reader;

public class main {
    public static void main(String[] args) {
        HUD.menuStart();
        HUD.giveOptions();

        Grafo grafo = new Grafo();
        Reader reader = new Reader();

        reader.main();

    }
}
