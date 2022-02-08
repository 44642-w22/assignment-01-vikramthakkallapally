package probFive;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class probFive {

	public static void main(String[] args) {
		System.out.println("Enter input string of brackets");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		boolean isBalanced = isBalancedExpression(str);
		System.out.println(isBalanced);
	}

	public static boolean isBalancedExpression(String str) {
		Stack<Character> st = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			char topElement = st.isEmpty() ? '#' : st.peek();
			if (c == ']') {
				if (topElement == '[')
					st.pop();
				else
					return false;
			} else if (c == ')') {
				if (topElement == '(')
					st.pop();
				else
					return false;
			} else if (c == '}') {
				if (topElement == '{')
					st.pop();
				else
					return false;
			} else
				st.push(c);
		}
		return st.isEmpty();
	}

}
