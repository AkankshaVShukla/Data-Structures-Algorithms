/**
 * 
 */
package algorithms;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author akank
 *
 */
public class MaximumElement {
	public static void main(String[] args) {
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner sc = new Scanner(System.in);
		int numberOfQueries = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int maxElement=0;
		for(int i=0; i<numberOfQueries; i++){
			int query = sc.nextInt();
			switch(query){
			case 1: int x = sc.nextInt();
			stack.push(x);
			maxElement = Math.max(maxElement, x);
			break;
			case 2: int y = stack.pop();
			if(y == maxElement){
				maxElement = 0;
				for(int num : stack){
					if(maxElement < num){
						maxElement = num;
					}
				}
			}
			break;
			case 3: System.out.println(maxElement);
			break;
			default: System.out.println("Invalid Query");break;                
			}
		}
		sc.close();
	}
}
