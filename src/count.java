import java.util.*;
public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
        String input=s.next();
        int count=1;
        String seq2="";
        String l = "";
        for (int j=0;j<input.length();j++) {
        	l=Character.toString(input.charAt(j));
        	String seq="";
        for (int i=j+1;i<input.length();i++) {
            String b=Character.toString(input.charAt(i));
            if(l.equals(b)) {
        		count=count+1;
        		seq=count+""+l;
        	}
        	else{
        		count=1;
        		}
         }
        seq2=seq2+seq;
        }
        System.out.println(seq2);
	}
}
