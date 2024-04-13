import java.util.*;
public class RevSen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println("Enter sentence");
         String sen=s.nextLine();
         String word="";
         String sen2="";
         for (int i=0;i<sen.length();i++) {
        	 char c=sen.charAt(i);//  
        	 String sc=Character.toString(c);// 
        	 word=word+sc;
        	 if(sc.equals(" ")){
        	      sen2=word+sen2;
        	      word="";
        	 }
        }
         sen2 = word+" "+sen2;
         System.out.println(sen2);

}
}
