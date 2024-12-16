package csw_java;

public class q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,k=0,f=0,ans=0;
		int i=1;
		while(true)
		{
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					c++;
				
			}
			if(c==2) {
		       f++;
			   k=i;
			}
			if(f==100) {
				ans=k;
				break;}
		   c=0;
		   i++;
		}
		System.out.println(ans);
	
		
	}

}
