package emc.java;
import java.util.*;
public class prmenumber {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter ur input:");
		int num=scan.nextInt();
		scan.close();
		int count=0;
		
		if(num>1)
		{
			for(int i=1;i<=num;i++)
			{
				if(num%i==0)
					count++;
				
					
			}
			if(count==2)
			{
				System.out.println("prime number");
			}
			else
			{
				System.out.println("not a prime");
			
			}
				
		
		}
		else
		{
		    System.out.println("not a prime number");
		}
	}
}


