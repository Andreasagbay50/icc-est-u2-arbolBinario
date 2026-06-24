package structures.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structures.node.Node;

public class Ejercicio3 {

    public void insert(int[] numeros) {

        BinaryTree<Integer> tree = new BinaryTree<>();

        for (int numero : numeros) {
            tree.insert(numero);
        }

        System.out.println("Input:");

        List<List<Node<Integer>>> nivelesArbol = listLevels(tree.getRoot());

        int espacios = nivelesArbol.size() * 4;

        for (List<Node<Integer>> nivel : nivelesArbol) {

            for (int i = 0; i < espacios; i++) {
                System.out.print(" ");
            }

            for (Node<Integer> nodo : nivel) {
                System.out.print(nodo.getValue() + "   ");
            }

            System.out.println();
            espacios -= 2;
        }

        System.out.println("\nOutput:");

        for (List<Node<Integer>> nivel : nivelesArbol) {

            for (int i = 0; i < nivel.size(); i++) {

                System.out.print(nivel.get(i).getValue());

                if (i < nivel.size() - 1) {
                    System.out.print(" -> ");
                }
            }

            System.out.println();
        }
    }

    public List<List<Node<Integer>>> listLevels(Node<Integer> root) {

        List<List<Node<Integer>>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<Node<Integer>> cola = new LinkedList<>();
        cola.add(root);

        while (!cola.isEmpty()) {

            int cantidadNodos = cola.size();

            List<Node<Integer>> lista = new LinkedList<>();

            for (int i = 0; i < cantidadNodos; i++) {

                Node<Integer> actual = cola.poll();
                lista.add(actual);

                if (actual.getLeft() != null) {
                    cola.add(actual.getLeft());
                }

                if (actual.getRight() != null) {
                    cola.add(actual.getRight());
                }
            }

            result.add(lista);
        }

        return result;
    }
}