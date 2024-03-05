import java.util.*;

class TreeNode{
    int data;
    TreeNode left;//Address of left child 
    TreeNode right;//Address of right child
    public TreeNode(int d){
        data=d;
        left=null;
        right=null;
    }
}

class BinarySearchTree{
    TreeNode root=null;
    
    //method to insert the nodes in to the tree
    void insert(int d){
        root=insert(root,d);
    }
    
    TreeNode insert(TreeNode curr,int d){
        if(curr==null){
            TreeNode node=new TreeNode(d);
            return node;//returns the address of the node 
        }
        if(curr.data>d){//if the data is less than the current node 
            curr.left=insert(curr.left,d);
        }
        else{//if the data is greater than the current node
            curr.right=insert(curr.right,d);
        }
        return curr;
    }
    
    //method to efficiently search an element in the Binary_Search_Tree
    boolean search(int key){
        return search(key,root);
    }
    
    boolean search(int key,TreeNode curr){
        if(curr==null){
            return false;
        }
        else if(key==curr.data){
            System.out.print(curr.data+" -> ");
            return true;
        }
        else if(key<curr.data){//if the key is less than the current data
            System.out.print(curr.data+" -> ");
            return search(key,curr.left);
        }
        else{//if the key is greater than the current data
            System.out.print(curr.data+" -> ");
            return search(key,curr.right);
        }
    }
}
    
public class Searching{
    public static void main(String args[]){
        BinarySearchTree bst=new BinarySearchTree();
        bst.insert(40);
        bst.insert(20);
        bst.insert(60);
        bst.insert(10);
        bst.insert(30);
        System.out.println(bst.search(60));
        System.out.println(bst.search(80));
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    