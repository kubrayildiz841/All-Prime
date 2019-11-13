package csd;

public class App {

		
	public static void main(String [] args)
	
	{
		for(int i=19000;i<19500;i++)   
			if(Util.isPrimeX(i))
		System.out.println(i);
	
			
	}
}	

class Util {
	public static boolean isPrime(int val)
	{
		if(val<=1)
			return false;
		if(val%2==0)
			return val==2;
		if(val%3==0)
			return val==3;
		if(val%5==0)
			return val==5;
		if(val%7==0)
		return val==7;
		
		for(int i=11;i*i<=val;i+=2)
			if(val%i==0)
				return false;
		return true;
			
	}
	public static int sumDigits (int val)
	{
		int sum=0;
		while(val!=0) {
			sum+=val%10;
			val/=10;
		}
		return sum;
		
	}
	public static int getDigitsCount(int val)
	{
		if (val == 0)
			return 1;
		
		int count = 0;
		
		while (val != 0) {
			++count;
			val /= 10;
		}

		return count;
	}

	public static boolean isPrimeX(int val)
	{
				 while(getDigitsCount(val)>1 && isPrime(val)) { 
					val=sumDigits(val); 
				 }
				 if(isPrime(val))
					 return true;
				return false;
				 
				 	
		 
		 }
  
}