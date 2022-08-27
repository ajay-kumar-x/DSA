package recursion;

public class Basic {

	public static void main(String[] args) {
		
		System.out.println(sumOfNnaturalNumbers(5));
		
		System.out.println(factorial(5));
		
		System.out.println(pow(5,4));
		
		System.out.println(gcdByEuclidMethod( 12,6));
		
		System.out.println(gcdNormalWay(12, 6));
		
		System.out.println(pathsInMatrix(3, 4));
		
		System.out.println(josephusProblem(5, 3));

	}
    
	
 //get sum of  n natural numbers  -> 1+2+3+4+5.....   we can also done in O(1) by  n*(n+1)/2
	public static int sumOfNnaturalNumbers(int n) {
		
		if(n==1) return 1;  //base case
		
		return n+sumOfNnaturalNumbers(n-1);
	}

	
 //get factorial of a number
	public static int factorial(int n) {
		
		if(n==0) return 1;  //base case
		
		return n*factorial(n-1);
	}
	
	
	// a^b (a to the power b) only work for positive powers
	public static double pow(double a,double b) {
		
		if(b==0) return 1;   //base case
		
		if(b==1) return a;    //base case
		
		return a*pow(a,b-1);
	}
	
	
	
	//gcd by Euclid Method
	public static int gcdByEuclidMethod(int a, int b) {
		if(b==0) return a;
		return gcdByEuclidMethod(b,a%b);
	}
	
	//gcd in normal way
	public static int gcdNormalWay(int a,int b) {
		if(a==b) return a;
		if(a%b==0) return b;
		if(b%a==0) return a;
		
		if(a>b) return gcdByEuclidMethod(a%b, b);
		return gcdByEuclidMethod(a, b%a);
	}
	
	//number of ways in a matrix to go to from top left to bottom right .(only right and bottom move is considered)
	public static int pathsInMatrix(int r,int c) {
		
		if(r==1 || c==1 ) return 1;
		
		return pathsInMatrix(r, c-1) + pathsInMatrix(r-1, c);
	}
	
	
	// Josephus Problem
	public static int josephusProblem(int n, int k) {
		
		if(n==1) return 0;
	     
		return (josephusProblem(n-1, k) + k) % n;
	}
	
	
}
