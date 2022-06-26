package Trees;

public class BinaryTreePrac {
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
    static int idx=-1;
    static Node buildtree(int Node[]){
        idx++;
        if(Node[idx]==-1){
            return null;
        }
        Node newnode = new Node(Node[idx]);
        newnode.left=buildtree(Node);
        newnode.right=buildtree(Node);
        return newnode;
    }
    public void PreorderTraversal(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        PreorderTraversal(root.left);
        PreorderTraversal(root.right);
    }
    public void PostorderTraversal(Node root){
        if(root==null){
            return ;
        }
        PostorderTraversal(root.left);
        PostorderTraversal(root.right);
        System.out.print(root.data+" ");
    }
    public void InorderTraversal(Node root){
        if(root==null){
            return ;
        }
        InorderTraversal(root.left);
        System.out.print(root.data+" ");
        InorderTraversal(root.right);
    }
    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreePrac tree = new BinaryTreePrac();
        Node head = buildtree(node);
        tree.PreorderTraversal(head);
        System.out.println(" ");
        tree.InorderTraversal(head);
        System.out.println(" ");
        tree.PostorderTraversal(head);
        System.out.println(" ");
    }
}