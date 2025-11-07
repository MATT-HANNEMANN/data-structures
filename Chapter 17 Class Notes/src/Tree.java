import java.util.List;

import org.w3c.dom.Node;

import java.util.ArrayList;

/**
    A tree in which each node has an arbitrary number of children.
*/
public class Tree
{
    private Node root;

    static class Node
    {
        public Object data;
        public List<Node> children;
        

        /**
            Computes the size of the subtree whose root is this node.
            @return the number of nodes in the subtree
        */
        public int size()
        {
            int number = 1;
            //while children.hasNext()
            //{
            //    children.delete();
            //    number += 1;
            //}
            for (Node Child: this.children)
                {number += Child.size();}
            return number;
        }
    }

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public Tree(Object rootData)
    {
        this.root = new Node();
        this.root.data = rootData;
        this.root.children = new ArrayList<>();
    }

    /**
        Adds a subtree as the last child of the root.
    */
    public void addSubtree(Tree subtree)
    {
        this.root.children.add(subtree.root);
    }

    /**
        Computes the size of this tree.
        @return the number of nodes in the tree
    */
    public int size() 
    {
        return this.root.size();
    }

    // Additional methods will be added in later sections.

    /*
     * The visit method is called for each visited node
     * @param data: the data of the node being visited
     */

    public interface Visitor {
        void visit(Object data);
    }

    /*
     * Traverse the tree with a given root in preorder
     * @param n: the root of the tree to traverse
     * @param v: the visitor to be invoked on each node
     */

    public void preorder(Visitor v) {
    preorder(this.root, v); // calls the recursive helper
    }

     private void preorder(Node n, Visitor v) {
    if (n == null) return;

    v.visit(n.data);

    for (Node child : n.children) {
        preorder(child, v);
    }
}

      





public void depthFirst(Visitor v) {
    depthFirst(this.root, v);
}

private static void depthFirst(Node n, Visitor v) {
    if (n == null) return;

    // Visit the current node first
    v.visit(n.data);

    // Recursively visit all children
    for (Node child : n.children) {
        depthFirst(child, v);
    }
}




public void postorder(Visitor v) {
    postorder(this.root, v);
}

private static void postorder(Node n, Visitor v) {
    if (n == null) return;

    // Recursively visit all children first
    for (Node child : n.children) {
        postorder(child, v);
    }

    // Visit the current node last
    v.visit(n.data);
}
}