
package probNine;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class probNine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int queueSize = scan.nextInt();
		System.out.println("Enter input Queue elements");
		Queue<Integer> Q = new ArrayDeque<>();
		for (int i = 0; i < queueSize; i++) {
			int e = scan.nextInt();
			Q.add(e);
		}
		List<Integer> A = getEvenOdd(Q);
		System.out.println(A);
	}

	public static List<Integer> getEvenOdd(Queue<Integer> Q) {
		Queue<Integer> evenElementList = new LinkedList<>();
		Queue<Integer> oddElementList = new LinkedList<>();
		while (!Q.isEmpty()) {
			int e = Q.poll();
			if (e % 2 == 0) {
				evenElementList.add(e);
			} else {
				oddElementList.add(e);
			}

		}
		List<Integer> A = new ArrayList<>();
		while (!evenElementList.isEmpty() || !oddElementList.isEmpty()) {
			if (!evenElementList.isEmpty()) {
				A.add(evenElementList.poll());
			}
			if (!oddElementList.isEmpty()) {
				A.add(oddElementList.poll());
			}
		}
		return A;
	}
}
