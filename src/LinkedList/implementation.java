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
	public void DeleteBeg() {
		System.out.println("Value Deleted:"+ head.data);
		if(head!=null) {
			head=head.next;
		}else {
			tail=null;
		}
		
	}
	public void removeFromLast()
	{
		Node node=head;
		if(head==null) {
			return;
		}
		else if(head.equals(tail)) {
			head=null;
			tail=null;
		}
		while(node.next!=tail) {
			node=node.next;
		}
		tail=node;
		tail.next=null;
	}
	public void search(int value)
	{
		Node node=head;
		int flag=0;
		while(node.next!=null) {
			if(node.data==value) {
				System.out.println("Node Found");
				System.out.println("Node Value:"+ node.data);
				System.out.println("Node Index:"+ flag);
			}
			flag++;
		}
	}
	public static void main() {
		implementation node=new implementation();
		node.InsertBeg(3);
		node.InsertBeg(2);
		node.InsertBeg(1);
		
		
	}
	 
	 

}
