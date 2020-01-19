package jan;
import java.util.*;

public class reverse_string {
	
	void reverseString(String str)
	{
		String s[]=str.split("\\.");
		
		for(int i=s.length-1;i>=0;i--)
		{
			if(i!=0)
			System.out.print(s[i]+".");
			
			else
			System.out.println(s[i]);
		}
	
	}
	
	public static void main(String args[]) {
		
		reverse_string obj=new reverse_string();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String str=sc.next();
		
		obj.reverseString(str);
	}

}
