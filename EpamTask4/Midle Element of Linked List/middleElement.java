import java.util.*;

public class Node
{
	int data;
	Node next;
	
	Node()
	{
		next = null;
	}
}
public class LinkedList
{
	private Node head;
	private Node next;
	
	LinkedList()
	{
		head = null;
		next = null;
	}
	
	void insert(int val)
  {
		Node newnode = new Node();
		newnode.data = val;
		
		if(head == null){
			head = newnode;
			next = newnode;
		}
		else{
			next.next = newnode;
			next = newnode;
		}
	}
	int middle()
  {
		Node temp1 = head;
		Node temp2 = head;
		while((temp2 != null) && (temp2.next != null)){
			temp1 = temp1.next;
			temp2 = temp2.next.next;
		}
		return temp1.data;
	}
}
public class middleElement
{
	public static void main(String []args){
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of elements you have to Enter: ");
		int n = sc.nextInt();
		System.out.println("Enter your "+n+"numbers");
		for(int i=0;i<n;i++){
			int val = sc.nextInt();
			ll.insert(val);
		}
		System.out.println("Middle element: "+ll.middle());
		sc.close();
	}
}
