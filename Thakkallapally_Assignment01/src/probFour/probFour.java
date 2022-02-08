package probFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class probFour {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter size of Arraylist");
	int asize=scan.nextInt();
	System.out.println("Enter integers");
		List<String> A1 = new ArrayList<>();
		for (int i = 0; i < asize; i++) {
			String str = scan.next();
			A1.add(str);
		}
		List<String> A2 = getSortedStrings(A1);
		System.out.println(A2);
	}

	public static List<String> getSortedStrings(List<String> A1) {
		List<String> A2 = new ArrayList<>();
		for (int i = 0; i < A1.size(); i++) {
			A2.add(A1.get(i));
		}
		Collections.sort(A2, (j, k) -> j.length() - k.length());
		return A2;
	}

}
