package com.claassens.clayton;

public class BinarySearchTree {

    class Node
    {
        Node left, right;
        int data;

        /* Constructor */
        public Node(int n)
        {
            left = null;
            right = null;
            data = n;
        }
    }

    private Node root;

    public BinarySearchTree()
    {
        root = null;
    }

    public void insert(int data)
    {
        root = insert(root, data);
    }

    private Node insert(Node node, int data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (data <= node.data)
                node.left = insert(node.left, data);
            else
                node.right = insert(node.right, data);
        }
        return node;
    }

    int minValue(Node root)  {

        int minval = root.data;

        while (root.left != null)  {
            minval = root.left.data;
            root = root.left;
        }
        return minval;
    }


    void deleteKey(int key) {
        root = delete_Recursive(root, key);
    }


    Node delete_Recursive(Node root, int key)  {

        if (root == null)  return root;


        if (key < root.data)
            root.left = delete_Recursive(root.left, key);
        else if (key > root.data)
            root.right = delete_Recursive(root.right, key);
        else  {

            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = delete_Recursive(root.right, root.data);
        }
        return root;
    }

    boolean find(int key)  {
        root = find_Recursive(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }


    Node find_Recursive(Node root, int key)  {

        if (root==null || root.data==key)
            return root;

        if (root.data > key)
            return find_Recursive(root.left, key);

        return find_Recursive(root.right, key);
    }



    public void inorder()
    {
        inorder(root);
    }
    private void inorder(Node r)
    {
        if (r != null)
        {
            inorder(r.left);
            System.out.print(r.data +" ");
            inorder(r.right);
        }
    }

    public void preorder()
    {
        preorder(root);
    }
    private void preorder(Node r)
    {
        if (r != null)
        {
            System.out.print(r.data +" ");
            preorder(r.left);
            preorder(r.right);
        }
    }

    public void postorder()
    {
        postorder(root);
    }
    private void postorder(Node r)
    {
        if (r != null)
        {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data +" ");
        }
    }


}
