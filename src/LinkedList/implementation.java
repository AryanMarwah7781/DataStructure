package LinkedList;
//Singly LinkedList
public class implementation {
	Node head=null;
	Node tail=null;
	
	static class Node{
		 int data;
		 Node next;
		public  Node(int data) {
			 this.data=data;
			 
		 }
	 }
	public void InsertBeg(int data) {
		Node node=new Node(data);
		node.next=head;
		node=head;
		if(node.next==null) {
			tail=node;
		}
	}
	public void insertEnd(int data) {
		Node node =new Node(data);
		tail.next=node;
		tail=node;
		if(head==null) {
			head=node;
			
		}
		else {
			tail.next=node;
			
		}
		tail=node;
	}
	public void insertMid(int index ,int value) {
		Node node=new Node(value);
		Node current =head;
		if(index<0) {
			throw new IndexOutOfBoundsException();
		}else if(index==0) {
			InsertBeg(value);
		}
		else {
		for(int i=0;i<index-1;i++) {
			current=current.next;
			if(current ==null) {
				throw new IndexOutOfBoundsException();
			}
			current=current.next;
		}
		if(current.next==null) {
			tail=node;
		}else {
		node.next=current.next;
		current.next=node;
		}
		}
	}
	 
	 

}
