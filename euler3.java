class euler3
{
	//checks whether a long is prime or not
	public static boolean isPrime (long n) 
	{
		//checks if n is a multiple of 2
		if (n%2==0) {
			return false;
		}
		//if not, just check the odds for factors of variable n
		for (int i=3; i*i<=n; i+=2) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void main (String[] args) throws java.lang.Exception 
	{
		long bigNumber = 600851475143L;
		//the square root of bigNumber
		int sqrBigNumber = (int) Math.ceil(Math.sqrt(bigNumber));
		
		for (int i = sqrBigNumber; i >= 0; i--) {
			if(bigNumber%i==0 && isPrime(i)) {
				System.out.println(i);
				break; //BREAK!!!!!
			}
		}
	}
}