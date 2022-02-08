package probEight;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class probEight 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of elements");
		int queueSize= scan.nextInt();
		System.out.println("Enter input Queue elements");
		Deque<Integer> Q = new ArrayDeque<>();
		for(int i=0;i<queueSize;i++)
		{
			int e = scan.nextInt();
			Q.add(e);
		}
		List<Integer> A = getAlternativeSeq(Q);
		System.out.println(A);
	}
	
	public static List<Integer> getAlternativeSeq(Deque<Integer> Q)
	{
		List<Integer> A = new ArrayList<>();
		while(!Q.isEmpty()) 
		{
			A.add(Q.pollLast());
			if(!Q.isEmpty())
				A.add(Q.pollFirst());
		
		}
		return A;
	}
	}
