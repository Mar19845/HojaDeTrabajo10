
import java.util.Vector;

/**
 *
 * @author Juan Marroquin
 * recopilado de
 * https://devs4j.com/2017/11/24/implementa-un-grafo-de-ciudades-en-java/
 */
public class Grafo<K, E> implements IntGrafo<K, E> {

    private Vector v = new Vector();
    private int[][] graf = new int[25][25];

    public Grafo() {
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i == j) {
                    graf[i][j] = 0;
                } else {
                    graf[i][j] = 9999;

                }
            }
        }
    }

    public void add(K label) {
        if (!v.contains(label)) {
            v.add(label);
        }
    }

    @Override
    public void addEdge(K ciudad1, K ciudad2, E label) {
        int i = v.indexOf(ciudad1);
        int j = v.indexOf(ciudad2);
        String tmp = "" + label;
        int peso = Integer.parseInt(tmp);
        graf[i][j] = peso;
    }

    @Override
    public K get(int label) {
        return (K) v.get(label);
    }

    @Override
    public int getEdge(K ciudad1, K ciudad2) {
        return graf[v.indexOf(ciudad1)][v.indexOf(ciudad2)];
    }

    @Override
    public boolean contains(K label) {
        return v.contains(graf);
    }

    @Override
    public int getIndex(K label) {
        return v.indexOf(label);
    }

    @Override
    public void show() {
        for (int a = 0; a < v.size(); a++) {
            for (int b = 0; b < v.size(); b++) {
                System.out.println(" " + graf[a][b] + " ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    @Override
    public int size() {
        return v.size();
    }
}
