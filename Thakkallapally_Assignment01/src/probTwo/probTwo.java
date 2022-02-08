package probTwo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class probTwo {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size of linkedlist");
	int lsize=scan.nextInt();
	System.out.println("Enter integers");
		List<Integer> L1 = new LinkedList<>();
		for (int i = 0; i < lsize; i++) {
			int e = scan.nextInt();
			L1.add(e);
		}
		System.out.println("Enter value for K");
		int k = scan.nextInt();
		List<List<Integer>> L2 = getSumOfPairs(L1, k);
		System.out.println(L2);
	}

	public static List<List<Integer>> getSumOfPairs(List<Integer> L1, int k) {
		List<List<Integer>> L2 = new ArrayList<>();
		for (int j = 0; j < L1.size() - 1; j++) {
			if (L1.get(j) + L1.get(j + 1) == k) {
				L2.add(new ArrayList<Integer>());
				L2.get(L2.size() - 1).add(L1.get(j));
				L2.get(L2.size() - 1).add(L1.get(j + 1));
			}
		}
		return L2;
	}

}
