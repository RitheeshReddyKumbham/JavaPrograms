import java.util.*;
public class Braces {
     public static void main(String[] args) { 
         Scanner s=new Scanner(System.in);
         System.out.println("Enter Sequence of Braces");
         String Br=s.next();
         int open=0;
         String c=Character.toString(Br.charAt(0));
         if (c.equals("{")) {
             for(int i=0;i<Br.length();i++) {
                 String b=Character.toString(Br.charAt(i));
        	     if (b.equals("{")) {
        	         open=open+1;
        	     }
        	     else {
        		     open=open-1;
        	     }
                 if(open<0) {
        	         break;
                 } 
            }
             if(open==0) {
        	       System.out.println("balanced");
        	}
             else {
        	       System.out.println("unbalanced");
            }
         }
         else {
        	 System.out.println("unbalanced");
          }
         s.close();
   }
}
