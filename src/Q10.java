import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter ant string");
		String str=s.next();
		String str2=str.toLowerCase();
		System.out.println(str2);
		String revstr="";
		for (int i=0;i<str.length();i++) {
			char b=str2.charAt(i);
			revstr=b+revstr;
		}
		
		if(revstr.equals(str2)) {
			System.out.println("It is a palindrome");
		}
		else {
			System.out.println("It is not a palindrome");
		}
	}
}
