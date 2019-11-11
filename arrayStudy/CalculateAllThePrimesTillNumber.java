package arrayStudy;

import java.util.ArrayList;
import java.util.Collections;

public class CalculateAllThePrimesTillNumber {

	public static void main(String[] args) {
		ArrayList<Integer> result = findListOfPrimes(100);
		System.out.println(result);
	}

	private static ArrayList<Integer> findListOfPrimes(int n) {
		
		ArrayList<Integer> primes = new ArrayList<>();
		ArrayList<Boolean> isPrime = new ArrayList<>(Collections.nCopies(n+1, true));
		
		isPrime.set(0, false);
		isPrime.set(1, false);
		
		for(int i=2; i<= n; ++i){
			if(isPrime.get(i)){
				primes.add(i);
				for(int j=i; j<=n; j+=i){
					isPrime.set(j, false);
				}
			}
		}
		
		return primes;
	}
	
	
	
}
