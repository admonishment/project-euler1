class euler5 {

// 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
// What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
	
// This method tests to see if a positive integer is divisible by all numbers from 1 to 20


public static boolean test(int n) { 
	
	for (int i=1; i<=20; i++) {
		if (n%i!=0) {
			return false;
		}
	}
	return true;
}

public static void main (String[] args) {	
	boolean div = false;
	int i = 1;
	
	while(!div) {
		if(test(i) == true) {
			System.out.println(i);
			div = true;
		}
		else {
			i ++;
	}
		
	}
}

}
