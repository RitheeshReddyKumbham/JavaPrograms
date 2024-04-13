import java.util.*;
public class Fact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner s=new Scanner(System.in);
      System.out.println("enter any num");
      int r=s.nextInt();
      long pro=1;
      for(int i=1;i<=r;i++) {
    	  pro=pro*i;
      }
      System.out.println(pro);
	}

}
