package abc;

import java.util.*;

public class palindrome {
	
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
	Node head1;
	
	palindrome()
	{
		head=null;
		head1=null;
	}
	
	void push(int a)
	{
		if(head==null)
		{
			head=new Node(a);
			return;
		}
		
		Node temp=head;
		Node temp1=new Node(a);
		while(temp.next!=null)
		{
			temp=temp.next;
		}
		temp.next=temp1;
	}
	
	void F_push(int a)
	{
        if(head1==null)
        {
        	head1=new Node(a);
        	head.next=null;
        }
        else
        {
        Node temp = new Node(a);
      	temp.next=head1;
		head1=temp;
        }
		
	}

	void isPalindrome(int n)
	{
		int count=0;
		Node temp=head;
		Node temp1=head1;
		while(temp!=null)
		{
			if(temp.data==temp1.data)
			{
				count++;
			}
			temp=temp.next;
			temp1=temp1.next;
		}
		if(count==n)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
	
	public static void main(String args[])
	{
		palindrome obj=new palindrome();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms");
		int n=sc.nextInt();
		
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			int num=sc.nextInt();
			obj.push(num);
			obj.F_push(num);
		}
		
		obj.isPalindrome(n);
		
	}
}
