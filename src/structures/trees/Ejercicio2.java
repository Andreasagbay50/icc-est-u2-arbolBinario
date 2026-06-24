package structures.trees;

import structures.node.Node;

public class Ejercicio2 {

    public Node<Integer> invertTree(Node<Integer> root) {
        invertRecursively(root);
        return root;
    }

    private void invertRecursively(Node<Integer> root) {

        if (root == null) {
            return;
        }

        Node<Integer> aux = root.getLeft();

        root.setLeft(root.getRight());
        root.setRight(aux);

        invertRecursively(root.getLeft());
        invertRecursively(root.getRight());
    }

    public void printTree(Node<Integer> actual) {
        printTreeRecursivo(actual, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel) {

        if (actual == null) {
            return;
        }

        printTreeRecursivo(actual.getRight(), nivel + 1);

        System.out.println("\t".repeat(nivel) + actual.getValue());

        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }
}