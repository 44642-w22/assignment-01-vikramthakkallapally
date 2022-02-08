package probOne;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class probOne {

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

		List<Integer> L2 = getPerfectNumber(L1);
		System.out.println(L2);
	}

	public static List<Integer> getPerfectNumber(List<Integer> L1) {
		List<Integer> L2 = new LinkedList<>();
		for (int i = 0; i < L1.size(); i++) {
			int n = L1.get(i);
			int s = 0;
			for (int j = 1; j < n; j++) {
				if (n % j == 0) {
					s += j;
				}
			}
			if (s == n) {
				L2.add(n);
			}
		}
		return L2;
	}

}
