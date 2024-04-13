import java.util.Scanner;
public class Q11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Seq of Paranthesis");
		String str=s.next();
		int count=0;
		String a=Character.toString(str.charAt(0));
		if(a.equals("}")) {
			for(int i=0;i<str.length();i++) {
				String b=Character.toString(str.charAt(i));
				if(b.equals("{")) {
					count=count+1;
				}
				else {
					count=count-1;
				}
				if(count<0) {
					break;
				}
			}
			if(count==0) {
				System.out.println("balanced Paranthesis");
			}else {
				System.out.println("unbalanced Paranthesis");
			}
			
		}
		else {
			System.out.println("unbalanced Paranthesis");
		}
	}
}
