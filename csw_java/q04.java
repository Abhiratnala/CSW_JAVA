package csw_java;
import java.util.*;

public class q04 {
     public static void digits(int n) {
    	 int d=0,s=0;
    	 while(n!=0) {
    		 d=n%10;
    		 n=n/10;
    		 System.out.print("digits are "+d);
    		 System.out.println(" ");
    		 
    	 }
    	
    	 
     }
     public static void reverse(int n) {
    	 int d=0,s=0;
    	 while(n!=0) {
    		 d=n%10;
    		 s=s*10+d;
    		 n=n/10;
    		 System.out.print(d);
    	
    		 
    	 }
    	
    	 
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter number");
		int n=in.nextInt();
		q04 ob=new q04();
		digits(n);
		reverse(n);
		

	}

}
