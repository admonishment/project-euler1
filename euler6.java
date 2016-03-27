class euler6 {
	//find the difference between the sum of the squares of 1 through 100,
	//and the square of the sum of the same numbers.
	
	public static void main(String[] args) {
		int sqSum = 0;
		int sumSq = 0;

		//this will square each natural number from 1 to 100, 
		//and then add them to variable sumSq
		for (int i=0; i<=100; i++) {
			sumSq = i*i + sumSq;
		}

		//this will add natural numbers 1 through 100,
		for (int i=1; i<=100; i++) {
			sqSum+=i;
		}

		//squares sqSum
		sqSum = sqSum*sqSum;

		System.out.println(sqSum - sumSq);
	}
}