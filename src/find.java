import java.util.*;
public class find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        int[] arr= {1,2,3,4,5,6,7,8};
        System.out.println("Enter any number to find");
        int num=s.nextInt();
        String d="Number is not found";
        for (int i:arr) {
        	if(num==i) {
        		d="Number is found";
        	}
        }
		System.out.println(d);
	}

}
