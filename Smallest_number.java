import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

public class Smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int given_numbers[]={2,34,46,5,1};
		int smallest_number = Integer.MAX_VALUE;
		
		
		for (int i=0;i<given_numbers.length;i++)
		{
			if (smallest_number>given_numbers[i])
				
				smallest_number=given_numbers[i];
		}
		System.out.print("Smallest number:" +smallest_number);
	}

}
