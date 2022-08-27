package bitManupulation;

public class XORQuestions {

	// a ^ 0 = a
	// a ^ a = 0
	public static void main(String[] args) {
		Xor t=new Xor();
		int[] arr= {5,2,4,6,2,5,4};
		System.out.println(t.findOneNonRepeating(arr));
		
		int[] arr2= {5,2,4,6,2,5,4,8};
		t.findTwoNonRepeating(arr2);
		
		int[] arr3= {5,5,5,4,4,4,9};
		System.out.println(t.findOneNonRepeatingInAllRepeatingKtimes(arr3,3));

	}
	
	

}
class Xor{
	
	
	//Q1-> In an array all the numbers are repeating twice except one element, find that
	// [5,2,4,6,2,5,4] -> 6 is answer
	public int findOneNonRepeating(int[] arr) {
		int res=0;
		for(int x:arr) {
			res ^= x;
		}
		return res;
	}
	
	
	
	//Q2-> In an array all the numbers are repeating twice except two element, find that
	// [5,2,4,6,2,5,4,8] -> 6,8 is answer
	public void findTwoNonRepeating(int[] arr) {
		//let number is a and b
		int a=0,b=0;
		
		int temp=0;
		for(int x:arr) {
			temp ^= x;
		}
		//now temp contains a^b -> 1110 => rightmost different bit in them at index 1
		int rightMostsetBit=0;
		while(temp>0) {
			if((temp & 1)==1)
				break;
			temp>>=1;
			rightMostsetBit++;
		}
		 //rightMostsetBit = 1 (index in a^b where a and b's bit are different)
		for(int x:arr) {
			if(((x >>rightMostsetBit) & 1)==1)
				a ^=x;
			else
				b ^=x;
		}
		
		System.out.println(a+" "+b);
	}
	
	
	
	//Q3-> In an array all the numbers are repeating k times except one element, find that
    // [5,5,5,4,6,6,6,8,8,8] -> 4 is answer beacuse all the numbers are repeating 3 times except 4
	public int findOneNonRepeatingInAllRepeatingKtimes(int[] arr,int k) {
		
		int bitArray[]=new int[32];
		
		int temIndex;
		int maxIndex=0;
		for(int a:arr) {
			temIndex=0;
			while(a>0) {
				if((a & 1)==1)
					bitArray[31-temIndex]+=1;
				
				if(temIndex>maxIndex)
					maxIndex=temIndex;
				temIndex++;
				
				a >>=1;
			}
		}
		
		
		int res=0;
        int pow=0;
        for(int i=31;i>=31-maxIndex;i--){
            res+=(bitArray[i]%k)*Math.pow(2,pow);
            pow++;
        }
        
//		for(int i:bitArray)
//			System.out.print(i+" ");
		return res;
	}
}