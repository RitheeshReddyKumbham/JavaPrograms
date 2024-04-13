
public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int[] arr= {1,2,3,4,2,3,1,7,8,9};
		
		for (int i=1;i<arr.length;i++) {
			for (int j =0;j<i;j++)
			if (arr[j]==arr[i]) {
				System.out.println(arr[j]);
			}
		
		}
	}

}
