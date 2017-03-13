package algorithms;

import java.util.Scanner;
import java.util.Stack;

//Hackerrank
/*In this challenge, you must implement a simple text editor. Initially, your editor contains an empty string, . You must perform  operations of the following  types:

append W - Append string W to the end of S.
delete k- Delete the last k characters of S.
print k - Print the kth character of S.
undo - Undo the last (not previously undone) operation of type  or , reverting  to the state it was in prior to that operation.
 */
public class SimpleTextEditor {
	static Stack<StringBuffer> stack = new Stack<StringBuffer>();
	static StringBuffer editor = new StringBuffer();
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int numOfOperations = sc.nextInt();
		for(int i=0;i<numOfOperations;i++){
			int operation = sc.nextInt();
			switch(operation){
			case 1: append(sc.next());
			break;
			case 2: delete(sc.nextInt());
			break;
			case 3: print(sc.nextInt());
			break;
			case 4: undo();
			break;
			}
		}
	}
	private static void undo() {
		// TODO Auto-generated method stub
		if(!stack.isEmpty()){
			editor = stack.pop();
		}
	}
	private static void print(int k) {
		// TODO Auto-generated method stub
		if(k<=editor.length()){
			System.out.println(editor.charAt(k-1));
		}
	}
	private static void delete(int k) {
		// TODO Auto-generated method stub
		if(k<=editor.length()){
			stack.push(new StringBuffer(editor));
			editor.delete(editor.length()-k, editor.length());
		}
	}
	private static void append(String word) {
		// TODO Auto-generated method stub
		stack.push(new StringBuffer(editor));
		editor.append(word);
	}
}

