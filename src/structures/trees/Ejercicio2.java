package structures.trees;

import structures.node.Node;

public class Ejercicio2 {
    public Node<Integer> invertTreee(Node<Integer>root){
        invertTreee(root);
        return null;
        //imprimir el arbol original
        //printTree(root);

        //imprimir el arbol inverido
        //printTree(root);


    }
    private void invertRecursively(Node<Integer> root){
        if(root == null);
        return;
    }
    Node<Integer > aux = root.getLeft();
    root.setLeft(root.getRight());
    root.setRight(aux);
    invertRecursively(root.getLeft());
    invertRecursively(root.getRight());


    }
    

