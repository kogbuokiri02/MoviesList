package h3;


public class MovieBST {

	private Movie root; 
	private int size; 
	
	MovieBST(){
		
	}
	public boolean isEmpty() {
		return this.root == null; 
	}
	public int size() {
		return size(this.root);
	}
	
	private int size(Movie node){
		if(node == null){
			return 0;
		}
		return 1 + size(node.left) + size(node.right);
	}
	public int getHeight() { 
		return getHeight(this.root);
	}
	private int getHeight(Movie node) {
		if(node == null) {
			return 0;
		}
		else {
			return 1+ Math.max(getHeight(node.left), getHeight(node.right));
		}
	}
	public void add(Movie node) {
		if(isEmpty()) {
			this.root = node;
		}
		else {
			this.root = add(this.root,node);
			
		}
	}
	private Movie add(Movie node, Movie newNode) {
		if(node.compareTo(newNode)>=0) {
			if(node.left==null) {
				node.left= newNode;
				
			}else {
				node.left = add(node.left,newNode);
				
			}
		}else {
			if(node.right == null) {
				node.right = newNode;
				
			}else {
				node.right = add(node.right,newNode);

			}
		}
		
		return node;
	}
	public void inOrder() {
		if (this.root!=null) {
			inOrder(this.root);
		}
	}
	private void inOrder(Movie node) {
		String str = new String();
		if(node!=null) {
			inOrder(node.left);
			str+=node.toString() + ", ";
			inOrder(node.right);
		}
		
		System.out.print(str);
	}
	
	public double getRatingByTitle(String title) {
		return getRatingByTitle(this.root,title);
	}
	
	
	private double getRatingByTitle(Movie node,String title) {
		Movie dummy = new Movie(title, 2002, 1.0);
		if(node == null) {
			return -1;
		}
		else if(node.compareTo(dummy)==0) {
			return node.rating;
		}
		else if(node.compareTo(dummy)>0) {
			return getRatingByTitle(node.left, title);
		}
		return getRatingByTitle(node.right, title);
		

	}
}
	
