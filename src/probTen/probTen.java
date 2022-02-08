package probTen;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class probTen {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int dequeSize = scan.nextInt();
		System.out.println("Enter input deque character elements");
		Deque<Character> D = new ArrayDeque<>();
		for (int i = 0; i <dequeSize ; i++) {
			char c = scan.next().charAt(0);
			D.add(c);
		}
		System.out.println("Enter Array size");
		int arraySize= scan.nextInt();
		List<Integer> A = new ArrayList<>();
		System.out.println("Enter array Elements");
		for (int i = 0; i < arraySize; i++) {
			int e = scan.nextInt();
			A.add(e);
		}
		String result = getDeque(D, A);
		System.out.println(result);
	}

	public static String getDeque(Deque<Character> D, List<Integer> A) {
		char e = '$';
		for (int i = 0; i < A.size(); i++) {
			if (A.get(i) == 0) {
				;

				if (e != '$')
					D.addFirst(e);
			}
			if (A.get(i) == 1 && !D.isEmpty())
				e = D.pollFirst();
		}
		StringBuilder sb = new StringBuilder();
		while (!D.isEmpty()) {
			sb.append(D.poll());
		}
		return sb.toString();
	}

}
