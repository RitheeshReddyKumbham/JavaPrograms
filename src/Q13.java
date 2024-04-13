import java.util.*;
public class Q13 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a seq of chars");
        String str=s.next();
    	int count=1;
        String seq2="";
        String seq="";
        for (int i=0;i<str.length();i++) {
            seq2=seq2+seq;
        	char l=str.charAt(i);
        	for (int j=1;j<str.length();j++) {
        		char k=str.charAt(j);
        		if(l==k) {
        			count=count+1;
        			seq=count+""+l;
        		}
        		else {
        			count=0;
        		}
        	}
     }
        
        System.out.println(seq2);
	}
}
