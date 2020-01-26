package abc;

import java.util.Scanner;

public class duplicates {
	
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
	
	duplicates()
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
	
	void remove ()
	{
		Node temp=head;
		while(temp.next!=null)
		{
			if(temp.data==temp.next.data)
			{
				temp.next=temp.next.next;
			}
			else
			{
				temp=temp.next;
			}
		}
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
		Scanner sc=new Scanner(System.in);
		duplicates obj=new duplicates();
		
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		
		System.out.println("enter elements");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			obj.push(num);
		}
		
		obj.print();
		System.out.println();
		System.out.println("After removing duplicates");
		obj.remove();
		obj.print();
		
		
		
	}


}
