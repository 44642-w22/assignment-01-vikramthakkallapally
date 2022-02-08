package probThree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class probThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter size of Arraylist");
		int asize = scan.nextInt();
		System.out.println("Enter integers");
		List<Integer> A1 = new ArrayList<>();
		for (int i = 0; i < asize; i++) {
			int n = scan.nextInt();
			A1.add(n);
		}
		int e = getMaximumNum(A1);
		System.out.println(e);
	}

	public static int getMaximumNum(List<Integer> A1) {
		int maxNum = Integer.MIN_VALUE;
		for (int i = 0; i < A1.size(); i++) {
			maxNum = Math.max(maxNum, A1.get(i));
		}
		return maxNum;
	}

}
