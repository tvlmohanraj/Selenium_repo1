import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Prime_number {

	public static void main(String[] args) {
		/*// TODO Auto-generated method stub
		
		int given_array[] ={1123,235,34,46,53,62};
		for(int i=0;i<given_array.length ;i++)
		{
			for (int j=2;j<given_array[i];j++)
			{
				if ((given_array[i]%j)==0) 
				{
				
					System.out.println("Not prime " + given_array[i]);
					break;
				}
				else
					System.out.println("prime_number " + given_array[i]);
					break;
			}
	}

*/
	/*
		int i,m=0,flag=0;      
		  int n=125;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{  
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
	*/
		int given_number = 29;
		int m=given_number/2;
		int flag=0;
		
		for (int i=2;i<m;i++)
		{
			if ((given_number%i)==0)
			{
				System.out.println(i+" "+ m);
				System.out.println("not a prime");
				flag=1;
				break;
			}
		
		}
		if (flag==0)
			System.out.println("Is a prime");
	
		
	}
}
