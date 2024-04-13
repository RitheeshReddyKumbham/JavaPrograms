import java.util.*;
public class UnequalPN {
   public static void main (String[] args){
		int ar[]={1,-2,6,-5,5,-3,8,-9,-7,-8,-24,5,3,1,54,34};
		ArrayList aP=new ArrayList();
		ArrayList aN=new ArrayList();
		ArrayList tt=new ArrayList();
		int posc=0;
		int negc=0;
		for (int i:ar){
		   if (i>0){
		 aP.add(i);
	     posc=posc+1;
		}
		else{
		aN.add(i);
		negc=negc+1;
		}
		}
		System.out.println(aP);
		System.out.println(aN);
		if (posc>=negc) {
		for (int j=0;j<(negc);j++){ 
		   tt.add(aP.get(j));
		   tt.add(aN.get(j));
		}
		for (int k=negc;negc<posc;negc++)
        	tt.add(aP.get(negc));
		}
		else {
				for (int j=0;j<(posc);j++){ 
				   tt.add(aP.get(j));
				   tt.add(aN.get(j));
				}
				for(int k=posc;posc<negc;posc++) {
				tt.add(aN.get(posc));
				}
		}
		System.out.println(tt);
		}
}
