package csw_java;

public class q08 {

	public static void main(String[] args) {
		int n=5;int c=0;
		// TODO Auto-generated method stub
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i%j==0)
					c++;
				}
			if(c==2)
				System.out.println(i);
			c=0;
		}

	}

}
