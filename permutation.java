package abc;

import java.util.*;

public class permutation {
	
	
	void get_str(String str,String ans)
	{
		 // If string is empty 
        if (str.length() == 0) { 
            System.out.print(ans + " "); 
            return; 
        } 
  
        for (int i = 0; i < str.length(); i++) { 
  
            char ch = str.charAt(i); 
  
            String ros = str.substring(0, i) +  
                         str.substring(i + 1); 
           // System.out.println(ros+" "+ch);
 
            get_str(ros, ans + ch); 
        } 
	}
	
	public static void main(String args[])
	{
		permutation obj=new permutation();
		
		System.out.println("Enter string");
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		obj.get_str(str," ");
	}

	
}
