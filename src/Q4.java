import java.util.*;
public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int input=s.nextInt();
        long fact=1;
        for (int i=1;i<=input;i++) {
        	fact=fact*i;
        }
        System.out.println("The factorial of "+input+" is "+fact);
	}

}
