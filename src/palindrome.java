import java.util.*;
public class palindrome {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        String num=s.next(); 
        String seq="";
        for(int i=0;i<num.length();i++) {
        	char b=num.charAt(i);
        	seq=b+seq;
        }
        if(num.equals(seq)) {
        	System.out.println("it is palindrome");
        }
        else {
        	System.out.println("it is not a palindrome");
        }
	}
}
