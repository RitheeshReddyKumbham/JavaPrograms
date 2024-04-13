import java.util.*;
public class Rotate {
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("enter no of rotations");
       int num=s.nextInt();
       int arr[]={1,2,3,4,5,6,7};
       int n=arr.length-1;
       for (int j=1;j<=num;j++) {
           for(int i=0;i<arr.length;i++){
               int temp=arr[i];
               arr[i]=arr[n];
               arr[n]=temp;
           }
       }
       System.out.println(Arrays.toString(arr));
  }
}