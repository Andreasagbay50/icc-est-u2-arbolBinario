package structures.trees;

import structures.node.Node;

public class Ejercicio1 {
    public void insert(int[] numeros){
        //crear un arbol BTS - instanciar BinaryTree
        //Insertar los numeros en el arbol
        //Imprimir el arbol
       BinaryTree<Integer> tree = new BinaryTree<>();
       for(int numero : numeros){
        tree.insert(numero);
       }
       printTree(tree.getRoot());           
    
    }
    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(root,  0);
    }
    public void printTreeRecursivo(Node<Integer> actual, int nivel){
        if(actual == null){
            return;
        }
       
        printTreeRecursivo(actual.getRight(), nivel + 1);
        System.out.println("\t".repeat(nivel) + actual.getValue());
        printTreeRecursivo(actual.getLeft(), nivel + 1);
    }

}