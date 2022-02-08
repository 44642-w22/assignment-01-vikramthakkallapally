package probSeven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class probSeven {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int queueSize= scan.nextInt();
		System.out.println("Enter input Queue elements");
		Queue<Integer> Q = new LinkedList<>();
		for (int i = 0; i < queueSize; i++) {
			int e = scan.nextInt();
			Q.add(e);
		}
		int n = getDecimalNumber(Q);
		System.out.println(n);
	}

	public static int getDecimalNumber(Queue Q) {
		int n = 0;
		int size = Q.size();
		size--;
		int base = 2;
		while (!Q.isEmpty()) {
			int e = (int) Q.poll();
			n = n + (e * (int) Math.pow(base, size));
			size--;
		}
		return n;
	}

}
