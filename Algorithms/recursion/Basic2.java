package recursion;

public class Basic2 {

	static int countOfTowerOfHanoi=0;
	public static void main(String[] args) {
		//towerOfHanoi(3, 'A', 'B', 'C');
		//System.out.println(countOfTowerOfHanoi);
		
		System.out.println(elementAtNthInfibonacci(4));

	}
	
	
	// element at particular position in fibonacci series
	public static int elementAtNthInfibonacci(int n) {
		
		if(n==1 || n==2) return 1;
		
		return elementAtNthInfibonacci(n-1)+elementAtNthInfibonacci(n-2);
	}
	
	
	public static void towerOfHanoi(int n,char A,char B, char C) {
		
		if(n>=1) {
		
		towerOfHanoi(n-1,A,C,B);
		
		System.out.println(A+" "+C); countOfTowerOfHanoi++;
		
		towerOfHanoi(n-1, B, A, C);
		}
		
	}

}
