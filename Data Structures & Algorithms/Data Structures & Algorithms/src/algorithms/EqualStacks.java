package algorithms;
//Hackerrank Question
/*You have three stacks of cylinders where each cylinder has the same diameter, but they may vary in height. You can change the height of a stack by removing and discarding its topmost cylinder any number of times.

Find the maximum possible height of the stacks such that all of the stacks are exactly the same height. This means you must remove zero or more cylinders from the top of zero or more of the three stacks until they're all the same height, then print the height. The removals must be performed in such a way as to maximize the height.

 */
import java.util.Scanner;
import java.util.Stack;

public class EqualStacks {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();
		int h1[] = new int[n1];
		for(int h1_i=0; h1_i < n1; h1_i++){
			h1[h1_i] = in.nextInt();
		}
		int h2[] = new int[n2];
		for(int h2_i=0; h2_i < n2; h2_i++){
			h2[h2_i] = in.nextInt();
		}
		int h3[] = new int[n3];
		for(int h3_i=0; h3_i < n3; h3_i++){
			h3[h3_i] = in.nextInt();
		}
		in.close();
		Stack<Integer> stack1 = getStack(h1);
		Stack<Integer> stack2 = getStack(h2);
		Stack<Integer> stack3 = getStack(h3);

		while (!(stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty())) {

			int top1 = stack1.peek();
			int top2 = stack2.peek();
			int top3 = stack3.peek();

			if ((top1 == top2 && top2 == top3))
				break;

			int min = Math.min(top1, Math.min(top2, top3));

			if (top1 > min)
				stack1.pop();

			if (top2 > min)
				stack2.pop();

			if (top3 > min)
				stack3.pop();
		}

		if (stack1.isEmpty() || stack2.isEmpty() || stack3.isEmpty())
			System.out.println(0);
		else
			System.out.println(stack1.peek());
	}

	private static Stack<Integer> getStack(int[] height) {
		Stack<Integer> stack = new Stack<Integer>();
		int sum=0;
		for(int i=height.length-1; i>=0; i--){
			sum+=height[i];
			stack.push(sum);
		}
		return stack;
	}
}