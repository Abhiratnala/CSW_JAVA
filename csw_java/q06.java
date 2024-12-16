package csw_java;

public class q06 {
  public static void freq(int n) {
	 
		  int f=0;
	  String s=""+n;
	  for(int i=0;i<s.length();i++) {
		  char ch=s.charAt(i);
		  for(int j=i;j<s.length();j++) {
			  if(ch==s.charAt(j))
				  f++;
			  
		  }
		  System.out.println("freq of "+ch+" is "+f);
		  f=0;
	  }
	  
  }
	public static void main(String[] args) {
		q06 ob=new q06();
		freq(1233116);
		
	

	}

}
