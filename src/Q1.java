import java.util.*;
public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int a=0;
        int b=1;
        System.out.println("enter the length of Seq");
        int num=s.nextInt();
        int sum=0;
        String seq="0 1";
        for (int i=1;i<num-1;i++) {
        	sum=a+b;
        	a=b;
        	b=sum;
        	seq=seq+" "+sum;
        }
        System.out.println(seq);
	}

}
