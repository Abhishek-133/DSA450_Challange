/******************************************************************************

Height of BinaryTree Logic
*******************************************************************************/
class Node{
    int data;
    Node left;
    Node right;
    public Node(int data){
        this.data=data;
         this.left=null;
         this.right=null;
    }
    
}
class BinaryTree{
    Node root;
    int maxVal = Integer.MIN_VALUE;
    public BinaryTree(){
        root=null;
    }
    public void insert(int data){
        root = recursiveInsert(root,data);
    }
    
    public Node recursiveInsert(Node current,int data){
        if(current==null){
            return new Node(data);
        }
        if(data<=current.data){
            current.left=recursiveInsert(current.left,data);
        }else{
            current.right=recursiveInsert(current.right,data);
        }
        return current;
    }
    
    public void inOrderTraversal(Node node){
        if(node!=null){
            inOrderTraversal(node.left);
            System.out.print(node.data+" ");
            inOrderTraversal(node.right);
        }
    }
    public int recHight(Node node){
        if(node==null){
            return 0;
        }
        int left=recHight(node.left);
        int right=recHight(node.right);
        return Math.max(left,right)+1;
        
    }
}

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		BinaryTree tree =  new BinaryTree();
		tree.insert(1);
        tree.insert(2);
        tree.insert(3);
        tree.insert(4);
        tree.insert(5);
        System.out.println("Height of Tree->"+tree.recHight(tree.root));
        tree.inOrderTraversal(tree.root);
	}
}
