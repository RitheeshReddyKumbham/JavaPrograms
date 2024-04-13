import java.util.*;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=s.nextInt();
        String n=Integer.toString(num);
        int len=n.length();
        int sum=0;
        for (int anum=num;anum>0;anum=(int)(anum/10)) {
        	int digit=anum%10;
        	 System.out.println(digit);
        	sum=(int) (sum+Math.pow(digit,len));
//        	num=num/10;
        }
        if(sum==num) {
        	 System.out.println("It is an amstrong number");
        }else {
        	 System.out.println("It is not an number");
        }
	}

}
