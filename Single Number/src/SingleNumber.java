/*
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using 
 * extra memory?
 * 
 * Solution:
 * XOR will return 1 only on two different bits. So if two numbers are the same, XOR will return 0. 
 * Finally only one number left. A ^ A = 0 and A ^ B ^ A = B.
 * Author: JackieDreamy
 */
public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int testArray[] = { 2, 2, 3, 3, 4, 4, 5, 5, 9 };
		int result = testArray[0];
		for (int i = 1; i < testArray.length; i++) {
			result = result ^ testArray[i];
		}
		System.out.println(result);
	}

}
