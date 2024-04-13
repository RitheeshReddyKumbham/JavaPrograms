import java.util.*;
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int input=s.nextInt();
        int factor=0;
        for (int i=2;i<input;i++) {
        	if(input%i==0) {
        		factor=factor+1;
        	}
        }
        if(factor==0) {
        	System.out.println("It is a prime number");
        }else {
        System.out.println("It is not a prime number");
        }
	}

}
