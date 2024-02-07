package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer greater than 1: ");
		int n = in.nextInt();
		
		boolean[] primes = new boolean[n];
		
		for(int i = 0; i < n; i++) {
			primes[i] = true;
		}
		
		for(int i = 2; i * i < n; i++) {
			if(primes[i] == true) {
				for(int j = i * i; j < n; j += i) {
					primes[j] = false;
				}
			}
		}
		int numPrimes = 0;
		for(int i = 2; i < n; i++) {
			if(primes[i] == true) {
				numPrimes++;
				System.out.println(i);
			}
			
		}
		System.out.println("Number of primes: " + numPrimes);

	}

}
