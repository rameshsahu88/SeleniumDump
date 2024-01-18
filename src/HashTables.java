import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<String,String> hsmp  = new Hashtable<String, String>();
		hsmp.put("Rol1", "Ramesh");
		hsmp.put("Rol2", "mahesh");
		hsmp.put("Rol3", "Rakesh");
		hsmp.put("Rol4", "Rajesh");
		System.out.println(hsmp.size());
		Set SM = hsmp.entrySet();
		
		Iterator It = SM.iterator();
		//System.out.println(It.next());;
		while(It.hasNext())
		{
		Map.Entry Mp= (Map.Entry)It.next();
		System.out.println(Mp.getKey()+" is Key and Value "+Mp.getValue());
		}
		
		
		
		}
		
		

	}


