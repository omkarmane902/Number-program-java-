

public class reverse_number {

	
	public static void main(String[] args) {
		
		
		int number = 1234;
		
		
		while(number>0)
		{
		    
			int reverse = number%10;
			
			System.out.print(reverse);
			
			number = number / 10; 
			
		}
	}
}
