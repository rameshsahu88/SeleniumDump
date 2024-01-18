import java.text.SimpleDateFormat;
import java.util.Date;

public class Assemble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Suv s = new Suv();
		s.Speed("Assembe added to SUV Object and Class");
		
		Car r = new Suv();
		r.Speed("Assembe added to Car Object SUV Class");

//		Suv ss = new Car();
//		ss.Speed("Assembe added to SUV Object CAr Class");
	
		Car rr = new Car();
		rr.Speed("Assembe added to Car Object CAr Class");
		
		Date D = new Date();
		
		SimpleDateFormat smp = new SimpleDateFormat("DD/MM/YYYY hh:mm:ss");
		
		System.out.println(smp.format(D));
		System.out.println(D.toString());
				
	}

}
