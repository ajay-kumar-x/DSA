package bitManupulation;
import java.util.*;

public class BitMasking {
	 public static void main(String []args){  
			
		    int n=25;
		    System.out.println("n="+n+" =>"+binaryForm(n));
		    System.out.println("no of setbits-> "+numberOfSetBits(25));
			System.out.println("finding 3rd bit-> "+findIthBit(25, 3));
			System.out.println("setting 2nd bit-> "+setIthBit(25, 2)+" =>"+Integer.toBinaryString(setIthBit(25, 2)));
			System.out.println("clearing 3rd bit-> "+clearIthBit(25, 3)+" =>"+Integer.toBinaryString(clearIthBit(25, 3)));
			
			System.out.println(noOfDifftBits(4, 5));
		}
	 
	 
	 public static int numberOfSetBits(int n) {
		//return Integer.bitCount(n);
		 int count=0;
		   while(n>0) {
			   n=n & (n-1);
			   count++;
		   }
		   return count;
		 
		 
	 }
	 
	 public static String binaryForm(int n) {
		 //short trick -> Integer.toBinaryString(n);
		 String res="";
		 Stack<Integer> st=new Stack<>();
		 
		 while(n>0) {
			 if((n & 1) ==0)
				 st.add(0);
			 else st.add(1);
			 n>>=1;
		 }
		 while(!st.isEmpty()) {
			 res+=st.pop();
		 }
		 return res;
	 }
	 
	 public static int findIthBit(int n,int i) {
		 //let's n=25 -> 1 1 0 0 1
		 // i=3, so 3rd bit from right =1
		int mask=1;
		mask=mask<<i;  //mask-> 1 0 0 0
		
		if((n & mask)==0)
			return 0;
		return 1;
	 }
	 
   public static int setIthBit(int n, int i) {
	 //let's n=25 -> 1 1 0 0 1
	 // i=2, so 2nd bit from right =0
	   
	   int mask=1<<i;  //mask-> 1 0 0 
	   
	   return n | mask;  //1 1 1 0 1  =>29 
   }	 
   
   public static int clearIthBit(int n, int i) {
		 //let's n=25 -> 1 1 0 0 1
	   
	   // we want to clear the 3rd bit make it to 0, so the number should be-> 1 0 0 0 1
		   
		   int mask=1<<i;  //mask-> 1 0 0 0
		   mask=~mask; //mask-> 0 1 1 1  (11111111111111111111111111110111)
		   
		   return n & mask;  // 1 0 0 0 1 =>17
	   }
   
   public static int noOfDifftBits(int a,int b) {
	    // a=5 -> 101
	   //b=4 -> 100
	   int res=0;
	   int tem= a ^ b; //001
	   //now we just have to count 1's in this or setbits => short trick Integer.bitCount(tem);
	   while(tem>0) {
		   if((tem & 1)==1)
			   res++;
		   tem >>= 1;
	   }
	   return res;
	   
   }
 
   
   
   
   
}