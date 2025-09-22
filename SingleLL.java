package SingleLinkedList;

public class SingleLL {
	 static class Node {
		int data;
		Node next;
		Node(int data){
			this.data=data;
		}
	}
		Node head;
		void add( int data) {
			if(head==null) 
				head = new Node(data);
			else {
				Node temp = head;
				while(temp.next!=null) {
					temp = temp.next;
				}
				temp.next=new Node(data);
			}
		}
		public void addFirst(int data) {
			Node n = new Node(data);
			n.next=head;
			head=n;
		}
		
		public void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data);
				if(temp.next!=null) {
					System.out.print("->");
				}
				temp=temp.next;
			}	
		System.out.println();
	}
		
		public static void main(String[] args) {
			SingleLL s1 = new SingleLL();
			s1.add(10);
			s1.add(20);
			s1.add(30);
			s1.add(40);
			s1.addFirst(05);
			s1.addFirst(01);
			s1.display();
//			s1.addFirst(15);
//			s1.addFirst(28);
//			s1.display();
	}
}