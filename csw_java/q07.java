package csw_java;

public class q07 {
public static void prime(int n) {
	int c=0;
	
	for(int i=1;i<=n;i++) {
		 if(n%i==0)
			 c++;
	}
	if(c==2)
		System.out.println("prime");
	else
		System.out.println("not prime");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		q07 ob=new q07();
		ob.prime(6);

	}

}
