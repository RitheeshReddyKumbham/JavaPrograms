import java.util.*;
public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr= {1,2,3,4,5,2,4,1};
        String se="";
        for (int i=0;i<arr.length;i++) {
        	for(int j=0;j<i;j++) {
        		if(arr[i]==arr[j]) {
        			se=se+" "+arr[j];
        			break;
        		}
        	}
        }
        System.out.println(se);
	}

}
