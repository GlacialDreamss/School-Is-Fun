import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of samples");
		int sampleNum = Integer.parseInt(input.nextLine());
		int[] nums = new int[sampleNum];
		int count = 0;

		for (int sampleInput = 0; sampleInput != sampleNum; sampleInput++){
			System.out.print("Enter sample "+(sampleInput+1)+": ");
			nums[sampleInput] = Integer.parseInt(input.nextLine());	
		}
		System.out.print("Enter the limit: ");
		int limit = Integer.parseInt(input.nextLine());	

		for(int sampleIterate = 0; sampleIterate != sampleNum; sampleIterate++ ){
			if (nums[sampleIterate] < (limit*-1)){
				nums[sampleIterate] = limit*-1;
				count++;
			} 
			else if(nums[sampleIterate] > limit){
				nums[sampleIterate] = limit;
				count++;
			} 
			
			System.out.println(nums[sampleIterate]);
		}
		System.out.println(nums);
		System.out.println("Number of updates: "+count);
	}
}