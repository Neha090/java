import java.util.*;
public class anagrams {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1;
		String s2;
		s1=sc.next();
		s2=sc.next();
		char a=0;
		int c=0;
		if(s1.length()==s2.length())
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			String s3=c1.toString();
			String s4=c2.toString();
			if(s3==s4)
			{
				System.out.println("Anagrams");
			}
			else if(s3.toLowerCase()==s4.toLowerCase() || s3.toUpperCase()==s4.toUpperCase())
			{
				System.out.println("Anagrams");
			}
			else
			{
				System.out.println("Anagrams");
			}
			
		}
		else
		{
			System.out.println("Not Anagrams");
		}
		

	}

}
