package codility;

//not a codility Qs
public class BinTreePre {
	
	BinTreePre left;
	BinTreePre right;
	int data;
	
	public BinTreePre(){
		
		
	}
	
	public BinTreePre(int data){
		
		this.data=data;
	}
	
	public void preOrderTraversal(BinTreePre bin){
		
		//System.out.println("PreOrder Traversal....");
		
		if(bin!=null){
			
			System.out.print(bin.data+" ");
			
			preOrderTraversal(bin.left);
			
			preOrderTraversal(bin.right);
			
		}
		
	}
	
public void postOrderTraversal(BinTreePre bin){
	
	//System.out.println("PostOrder Traversal....");
		
		if(bin!=null){
			
			preOrderTraversal(bin.left);
			
			preOrderTraversal(bin.right);
			
			System.out.print(bin.data+" ");
			
		}
		
		
	}

public void inOrderTraversal(BinTreePre bin){
	
	//System.out.println("InOrder Traversal....");
	
	if(bin!=null){
		
		preOrderTraversal(bin.left);
		
		System.out.print(bin.data+" ");
		
		preOrderTraversal(bin.right);
		
		
	}
	
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTreePre binTree=new BinTreePre();
		BinTreePre node1=new BinTreePre(1);
		BinTreePre node2=new BinTreePre(2);
		node1.left=node2;
		
		BinTreePre node3=new BinTreePre(3);
		node1.right=node3;
		
		BinTreePre node4=new BinTreePre(4);
		BinTreePre node5=new BinTreePre(5);
		
		node2.left=node4;
		node2.right=node5;
		
		BinTreePre node6=new BinTreePre(6);
		BinTreePre node7=new BinTreePre(7);
		node3.left=node6;
		node3.right=node7;
		
		BinTreePre node8=new BinTreePre(8);
		node4.left=node8;
		
		System.out.println("PreOrder Traversal....");
		binTree.preOrderTraversal(node1);
		
		System.out.println("\n");
		System.out.print("PostOrder Traversal....");
		binTree.postOrderTraversal(node1);
		
		System.out.println("\n");
		System.out.print("InOrder Traversal....");
		binTree.inOrderTraversal(node1);
		
	}

}
