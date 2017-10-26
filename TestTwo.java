package cn.ww;

import org.python.antlr.PythonParser.else_clause_return;
import org.python.antlr.PythonParser.return_stmt_return;

public class TestTwo {
	public static void main(String[] args) {
		int[] arr = new int[]{1,3,5,7,9,11,13};
		System.out.println("return index 13:"+find(arr, 13));
		System.out.println("return index 1:"+find(arr, 1));
		System.out.println("return index 5:"+find(arr,5));
		System.out.println("return index 0:"+find(arr,0));
	}
	
	public static int find(int[] arr,int searchKey){
		int boundItem = 0;
		int upperItem = arr.length - 1;
		int currIn;
		while(true){
			currIn = (boundItem+upperItem)/2;
			if(arr[currIn]==searchKey){
				return currIn;
			} else if(boundItem>upperItem){
				return -1;
			} else {
				if(arr[currIn]>searchKey){
					upperItem = currIn - 1;
				} else {
					boundItem = currIn + 1;
				}
			}
		}
	}
}
