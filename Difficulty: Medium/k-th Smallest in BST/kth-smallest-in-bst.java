/*
class Node {
    int data;
    Node left, right;

    public Node(int d)
    {
        data = d;
        left = right = null;
    }
}
*/

class Solution {
    //public int kthSmallest(Node root, int k) {
        // code here
        // Return the Kth smallest element in the given BST
    int ans,cnt;
    public int kthSmallest(Node root, int k) {
        // Write your code here
        ans=-1; cnt=0;
        inorder(root,k);
        return ans;
    }
    public void inorder(Node root,int k){
        if(root==null) return;
        inorder(root.left,k);
        cnt++;
        if(k==cnt){
            ans=root.data;
            return;
        }
        inorder(root.right,k);
    }
}


    //}
//}