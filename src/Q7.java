import java.util.*;
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr= {1,2,3,4,5};
         int n=arr.length-1;
         Scanner s=new Scanner(System.in);
         System.out.println("enter no of rotations");
         int num=s.nextInt();
         for(int i=1;i<=num;i++) {
        	 for (int j=0;j<arr.length;j++) {
        		 int temp=arr[j];
        		 arr[j]=arr[n];
        		 arr[n]=temp;
        	 }
         }
         System.out.println(Arrays.toString(arr));
	}

}
