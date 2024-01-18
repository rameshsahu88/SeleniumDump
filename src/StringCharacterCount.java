import java.lang.reflect.Array;
import java.util.ArrayList;

public class StringCharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String GivenStr= "aaaBBBCCCeeeeaaaBB";
		
        System.out.println(GivenStr.length());
       
        char  Chartofound;
        Chartofound= GivenStr.charAt(0);
        
        
        int Count=0;
        String FoudnChar = "";
        int i=0;
        char[] CharArr = GivenStr.toCharArray();
        System.out.println(CharArr.length);
        for(int j=0;j<GivenStr.length();j++)
        {
        	Count=0;
        	Chartofound= GivenStr.charAt(j);
        for( i=j;i<GivenStr.length();i++)
        	
        {
        	//System.out.println(CharArr[i]);
        	if (CharArr[i]==Chartofound)
        	{
        		//System.out.println(CharArr[i]+"Charcter found at -"+i);
        		Count++;
        	
        		if (FoudnChar.indexOf(CharArr[i])<0)
        		{
        		FoudnChar = FoudnChar+CharArr[j];
            	//System.out.println("Inside if "+FoudnChar);
        		
        		}
        		
        	}

        	
        }
        System.out.println("Count value " +FoudnChar+Count);
        
       
        
       // System.out.println("Count value " +Count);
//        FoudnChar = FoudnChar+CharArr[i]+Count;
//    	System.out.println("Outside if " +FoudnChar);
//        
        
        //System.out.println(Chartofound+" found"+Count);
        
        
    	
        }
//        Chartofound = GivenStr.charAt(0);
//        for(int i=0;i<=Chartofound;i++)
//        	if()
//      
	}
}
