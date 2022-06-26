package Trees;

public class binarytree {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=left;
            this.right=right;
        }

    }

        static int idx=-1;
        public static node buildTree(int node[]){
            idx++;
            if(node[idx]==-1){
                return null;
            }
            node newnode = new node(node[idx]);
            newnode.left=buildTree(node);
            newnode.right=buildTree(node);
            return newnode;
        }
        public  void preorder(node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+ " ");
            preorder(root.left);
            preorder(root.right);
        }
        public  void postorder(node root){
            if(root==null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data+ " ");
        }
        public  void Inorder(node root){
            if(root==null){
                return;
            }
            Inorder(root.left);
            System.out.print(root.data+ " ");
            Inorder(root.right);

        }

    public static void main(String[] args) {
        int node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
            binarytree tree = new  binarytree();
            node root =tree.buildTree(node);
            tree.preorder(root);
            System.out.println(" ");
            tree.Inorder(root);
            System.out.println(" ");
            tree.postorder(root);
    }

}
