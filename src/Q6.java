import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        String num=s.next();
        int len=num.length();
        String revnum="";
        for (int i=0;i<len;i++) {
        	revnum=num.charAt(i)+revnum;
        }
        if(revnum.equals(num)) {
        	System.out.println("It is a palindrome");
        }
        else {
        	System.out.println("It is not a palindrome");
        }
	}

}
