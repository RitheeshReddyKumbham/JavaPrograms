public class Prefix {
     public static void main(String[] args) {
         String[] arr= {"cab","car","cartoon","carge"};
         String word=arr[0];
         String Prefix="";
         String pre="";
         String pre2="";
         int index=1;
         int length=word.length();
         for (int i=1;i<arr.length;i++) {
        	 int length2=arr[i].length();
        	 if(length2<length) {
        		 length=length2;
        	 }
         }
         for (int i=1;i<length;i++) {//iterating over array
     
        	for (int j=0;j<arr.length;j++) {//iterating over each word
        		String word2=arr[j];
        	    pre=word.substring(0,i);
        	    String pre1=word.substring(0,i-1);
        	    pre2=word2.substring(0,i);
         	    index=index+1;
        	    if(pre.equals(pre2)) {
        	        Prefix=pre2;
        	    }
        	    else {
        	    	Prefix=pre1;
        	    	break;
        	    }
        	}
        	
        	if(pre.equals(pre2)) {
    	        continue;
    	    }
    	    else {
    	        break;
    	    }
        
         }
         System.out.println(Prefix);
	}
}
