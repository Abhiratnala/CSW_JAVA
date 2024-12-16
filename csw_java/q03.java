package csw_java;

public class q03 {
	public static void swapf(int x, int y) {
		int temp=x;
		x=y;
		y=temp;
		System.out.println("value of x is: "+x+" y is: "+y);
	}
public static void main(String [] args ) {
	int x=5;
	int y=6;
	System.out.println("value of x is: "+x+" y is: "+y);
	q03 ob=new q03();
	swapf(x,y);
}
}
