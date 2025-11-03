import java.util.List;
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
                {number += child.size();}
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
        this.root.children.add(subTree.root);
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
}
