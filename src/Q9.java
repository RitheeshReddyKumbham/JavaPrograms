import java.util.*;
public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        System.out.println("Enter any sentence");
        String input=s.nextLine();
        String word="";
        String seq="";
        for (int i=0;i<input.length();i++) {
        	String b=Character.toString(input.charAt(i));
        	
        	if(b.equals(" ")) {
        		seq=word+" "+seq;
        		word="";
        	}
        	else {
        		word=word+b;
        	}
        }
        seq=word+" "+seq;
        System.out.println(seq);
	} 

}
