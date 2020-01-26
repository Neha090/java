package abc;

import java.util.*;

public class reverse {
	
	static class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	Node head;
	
	reverse()
	{
		head=null;
	}
	
	void push(int a)
	{
		Node temp=new Node(a);
		
		if(head==null)
		{
			head=temp;
			return;
		}
		Node temp1=head;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		temp1.next=temp;
		
	}
	
	Node reverseMyList(Node node)
	{
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
			
		}
		node=prev;
		return node;
		
	}
	
	void print()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	public static void main(String args[])
	{
		reverse list=new reverse();
		System.out.println("Enter the number of terms");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter Element");
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			list.push(a);
		}
		
		System.out.println("Before Reverse :");
		list.print();
		list.head=list.reverseMyList(list.head);
		System.out.println();
		System.out.println("After Reverse :");
		list.print();
		
		
	}

}
