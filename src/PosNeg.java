import java.util.*;
public class PosNeg {

	public static void main (String[] args){
		int ar[]={1,-2,6,-5,5,-3,8,-9,-7};
		ArrayList aP=new ArrayList();
		ArrayList aN=new ArrayList();
		ArrayList tt=new ArrayList();
		for (int i:ar){
		   if (i>0){
		 aP.add(i);

		}
		else{
		aN.add(i);

		}
		}
		System.out.println(aP);
		System.out.println(aN);
		try{
		for (int j=0;j<ar.length;j++){
		   Object pE=aP.get(j);
		   Object nE=aN.get(j);  
		   System.out.println(pE);
		   System.out.println(nE);
		}
		}
		catch(Exception e){
		System.out.println("completed");
		}
		}


}
