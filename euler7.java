class euler7 
{
	
	public static boolean isPrime(long n) {
		//if n is 2, it is prime, so return true
		if (n==2) {
			return true;
		}
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
	
	//
	public static void main(String[] args) {
		int primeCounter = 1;
		//this is the number that is being tested for primeness
		int i = 2;
		
		while(primeCounter<=10001) {
			if (isPrime(i)) {
				primeCounter++;
			}
			i += 2;
		}
		
		System.out.println(i);
	}
}