
public class StringandNumberReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String GivenDtring = "mumbai710206Maharashtra is Capital";
		
		String revString ="";
		
		for (int i=GivenDtring.length()-1;i>=0;i--)
		{
			//char a;
			revString=revString+GivenDtring.charAt(i);
			
		}
		System.out.println("Reverse String is "+revString);

	}

}
