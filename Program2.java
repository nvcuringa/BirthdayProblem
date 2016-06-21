
import java.text.DecimalFormat;
import java.util.Random;


public class Program2 {

	public static void main(String[] args) {
	
	
     DecimalFormat df = new DecimalFormat("###.#");	
		
		
	 double count = BirthdayProblem(35,1000);
	 
	 System.out.println("Out of 1000 tries there are " + df.format(count) + " common birthdays."); 
	
	 
	 
	 double estimatedProbablity = count/(1000);
	 
	 System.out.println("The estimated probablity is "+ estimatedProbablity);

   }
	
	
	
	
	public static int BirthdayProblem(int numberOfPeople,int amountOfTries)
	{
		Random rand = new Random();
		int[] ar = new int[365];
	
		Integer birthday = new Integer(0);
		int count = 0;
		
		
		
		for(int i = 0; i < amountOfTries; i++)
		{
			boolean t = true;
			
			for(int a = 0; a < ar.length; a++) {
				ar[a] = 0;			
			}
			for(int j = 0; j < numberOfPeople; j++)
			{			
				birthday = rand.nextInt(365);
				ar[birthday]++;			
			}
			for(int k = 0; k < ar.length; k++)
			{		
				if(ar[k] > 1 && t == true)
				{
					count++;
					t = false;
				}
				
			}
		}
		return count;
	}

}
