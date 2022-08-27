package maths;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		MathQuestions mq=new MathQuestions();
		mq.seiveOfEratosthenes(20);
		
		//System.out.println(mq.noOfTrailingZerosInFactorialOfANumber(100));

	}

}


class MathQuestions{
	
	//number of trailing zeros in factorial of a number. ()
	public int noOfTrailingZerosInFactorialOfANumber(int n) {
		//the idea is that we just have to find the number of 5's in the factorial series of that number
		//for example 6!= 6*5*4*3*2*1 => one 5 so one trailing zero
		// 25!= 25*..*20*..*15*..*10*..*5*.. => 2(two times in 25)+1+1+1+1 =6 trailing zeros
		
		int res=0;
		  for(int i=5;i<=n;i*=5)
			   res+=n/i;
		return res;
	}
	
	
	
	//to check if a number is prime or not
	 public boolean isPrime(int n) {
		  if(n<2) return false;
		  for(int i=2;i*i<=n;i++) {
			  if(n%i==0)
				  return false;
		  } 
		  return true;
	  }
	
	// to get prime numbers in a range
	public void seiveOfEratosthenes(int n){
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		for(int i=2;i*i<=n+1;i++) {
			for(int j=2*i;j<n+1;j+=i)
				isPrime[j]=false;
		}
		for(int i=0;i<n+1;i++)
			System.out.println(isPrime[i]?i:"");
	}
	
}
