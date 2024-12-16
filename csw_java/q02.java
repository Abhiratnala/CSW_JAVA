package csw_java;

public class q02 {
	public void swap(int x, int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("value of x is: "+x+" y is: "+y);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=6;
		System.out.println("value of x is: "+x+" y is: "+y);
		q02 ob=new q02();
		ob.swap(x, y);
		
		

	}

}
