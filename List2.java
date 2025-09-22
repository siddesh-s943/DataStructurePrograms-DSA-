package SingleLinkedList;

public class List2 {
	static class Node {
			int data;
			Node next;
			
			Node(int data){
				this.data=data;
			}
		}
			Node head;
			
			void add(int data) {
		        Node newNode = new Node(data);
		        if (head == null) {
		            head = newNode;
		        } else {
		            Node temp = head;
		            while (temp.next != null) {
		                temp = temp.next;
		            }
		            temp.next = newNode;
		        }
		    }

			void displayFWD(){
		        displayFWD(head);
		        System.out.println();
		    }
			
		    void displayFWD(Node node){
		        if(node==null){
		            return ;
		    }
		        
		        System.out.print(node.data+" ");
		        displayFWD(node.next);
		    }
		    
		    void displayBWD(){
		        displayBWD(head);
		    }
		    
		    void displayBWD(Node node){
		        if(node==null) return;
		        displayBWD(node.next);
		        System.out.print(node.data+" ");
		    }
		    
		    void reverse() {
		    	Node prev = null;
		    	Node curr = head;
		    	Node next = null;
		    	while(curr!=null) {
		    		next = curr.next;
		    		curr.next=prev;
		    		prev=curr;
		    		curr=next;
		    		
		    	}
		    	head=prev;
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
		    
		    int size() {
		    	return size(head);
		    }
		    int size(Node start) {
		    	if(start==null)
		    		return 0;
		    	return 1+size(start.next);
		    }
		    
		    int sum() {
		    	return sum(head);
		    }
		    int sum(Node start) {
		    	if(start==null)
		    		return 0;
		    	return start.data+sum(start.next);
		    }
		    
//		    public int getMiddleNode() {
//		    	return getMiddle(head, size()/2);
//		    }
//		    
//		    int getMiddle(Node start, int index) {
//		    	if(start == null)
//		    		return 0;
//		    	if(index ==0)
//		    		return start.data;
//		    	return getMiddle(start.next, index-1);
//		    }
		    
		    public int getMiddleNode1() {
		    	Node slow = head;
		    	Node fast = head;
		    	while(fast!=null&&fast.next!=null) {
		    		slow = slow.next;
		    		fast = fast.next.next;
		    	}
		    	return slow.data;
		    }
		    
		    boolean hasLoop() {
		    	Node slow = head;
		    	Node fast = head;
		    	while(fast!=null && fast.next!=null) {
		    		slow = slow.next;
		    		fast = fast.next.next;
		    		if(slow == fast)
		    			return true;
		    	}
		    	return false;
		    }
		    
		    void leftrotateLeft(int k ) {
		    	k=k%size();
		    	if(k==0)
		    		return;
		    	Node tail= head, found = null;
		    	while(tail.next!=null) {
		    		if(k==1) {
		    			found = tail;
		    		}
		    		tail = tail.next;
		    		k--;
		    	}
		    	tail.next=head;
		    	head=found.next;
		    	found.next=null;
		    }
		    
		    public static void main(String[] args) {
		    	List2 s2 = new List2();
				s2.add(10);
				s2.add(20);
				s2.add(30);
				s2.add(40);
				s2.reverse();
				s2.display();
//				s2.sum();
//				s2.leftrotateLeft(3);
				s2.getMiddleNode1();
				System.out.println(s2.getMiddleNode1());
//				System.out.println(s2.sum());
//				
//				s2.display();
//				s2.displayFWD();
//				s2.displayBWD();
//				gha-dvyn-ius
		    }
	}
