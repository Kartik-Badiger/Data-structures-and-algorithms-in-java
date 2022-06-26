package Trees;

public class Binary_search_trees {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }
    }
    public static Node Insert(Node root,int value){
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(root.data>value){
            root.left=Insert(root.left,value);
        }
        else{
            root.right=Insert(root.right,value);
        }

        return root;
    }
    public static void Inorder(Node root){
        if(root==null){
            return;
        }
        Inorder(root.left);
        System.out.print(root.data+" ");
        Inorder(root.right);

    }
    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(key<root.data){
            return search(root.left,key);
        }
        else if(key> root.data){
            return search(root.right,key);
        }
        else{
            return true;
        }
    }
    public static void main(String[] args) {
        Node root=null;
        int []values ={5,4,3,2,1,7};
        for (int i = 0; i < values.length; i++) {
             root=Insert(root,values[i]);
        }
        Inorder(root);
        System.out.println();
        System.out.println(search(root,2));
    }
}
