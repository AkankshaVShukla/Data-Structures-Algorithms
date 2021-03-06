package algorithms;

import java.util.ArrayList;
//interview bit
//Print concentric rectangular pattern in a 2d matrix. 
public class ConcentricRectangular {
	public ArrayList<ArrayList<Integer>> prettyPrint(int a) {
		int matSize = 2*a-1;
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		int num=a;
		ArrayList<Integer> initial = new ArrayList<Integer>(a);
		for(int i=0;i<matSize;i++){
			initial.add(0);
		}
		boolean firstHalf = true;
		while(num>=1){
			int i=0, j=matSize-1;
			ArrayList<Integer> list = new ArrayList<Integer>(initial);
			int element=a;
			while(i<=j){
				list.set(i, element);
				list.set(j, element);
				if(element>num)element--;
				i++;j--;
			}
			result.add(list);
			if(firstHalf){
				num--;
			}else{
				num++;
			}
		}

		for(int i=matSize/2-1; i>=0;i--){
			result.add(result.get(i));
		}
		return result;
	}
}
