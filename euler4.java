//A palindromic number reads the same both ways. 
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//Find the largest palindrome made from the product of two 3-digit numbers.

class euler4
{
	public static boolean isPalindrome(int n) {
		
		String s = Integer.toString(n);
		int halfString = s.length() / 2; //intentionally divides ints to truncate
		
		String s1 = s.substring(0,halfString);
		String s2 = s.substring(s.length() - halfString, s.length());
		
		s2 = new StringBuilder(s2).reverse().toString();
		
		return s1.equals(s2);
	}
	
	public static void main (String[] args)
	{
		int answer = 0;
		
		for (int i = 0; i<=999; i++) {
			for (int j = 0; j<=999; j++) {
				if(isPalindrome(i*j)) {
					if(i*j>answer)
						answer = i*j;
				}
			}
		}
		System.out.println(answer);
	}
}


