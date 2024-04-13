import java.util.*;
public class Combinations {
	static int target;
	public static int Number(int[] arr,int sum,String s,int index) {
	    if(sum > target)
		{
	    	System.out.println("return");
			
		}
	    else {
		for(int i=0;i<arr.length;i++)
		{		
     	   sum = sum+arr[i];
     	   System.out.println("sum is"+sum);
     	   s = s+arr[i];
		   System.out.println("adding: "+s);
		   if(sum<target)
		   {
			   System.out.println("calling function again");
			   Number(arr,sum,s,i);
		   }
		   else if(sum==target) {
			   System.out.println("combination is:"+s);
		   }
		 }
		
		}
		return sum;
	   
	}
	
	
	public static void main(String[] args) {
		int sum =0;
    	Scanner s=new Scanner(System.in);
        int[] arr= {1,2,3,4};
        System.out.println("Enter your Target");
        target=s.nextInt();
        Number(arr,sum," ",0);
//        for (int i=0;i<arr.length;i++) {
//        	for (int j=0;j<=i;j++) {
//        		int a=arr[i];
//        		int b=arr[j];
//        	if((a+b)==target) {
//        			System.out.println(arr[i]+" "+arr[j]);
//        		}
//        	}
//        }
//        for(int k=0;k<arr.length;k++){
//        	
//        	if(arr[k]*target==target){
//        		String seq="";
//        		for(int m=0;m<target;m++){
//        			seq=arr[k]+" "+seq;
//        	}
//        	System.out.println(seq);
//        	}
//        
//      }
           
        
    }
}
