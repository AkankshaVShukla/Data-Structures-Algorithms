package algorithms;

import java.util.Scanner;
import java.util.Stack;

//Hackerrank
//A bracket is considered to be any one of the following characters: (, ), {, }, [, or ].
public class BalancedBrackets {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int a0 = 0; a0 < t; a0++){
			String s = in.next();
			System.out.println(checkBalancedBrackets(s));
		}
	}

	private static String checkBalancedBrackets(String s) {
		// TODO Auto-generated method stub
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			char currentBracket = s.charAt(i);
			if(currentBracket =='{') stack.push('}');
			else if(currentBracket == '[') stack.push(']');
			else if(currentBracket == '(') stack.push(')');
			else if(!stack.isEmpty() && stack.peek()==currentBracket){
				stack.pop();
			}else{
				return "NO";
			}
		}
		if(stack.isEmpty())return "YES";
		return "NO";
	}
}
