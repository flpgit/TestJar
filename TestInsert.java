package cn.yy;

public class TestInsert {
	public static void main(String[] args) {
		int[] arr = new int[]{91000,5,3,5,400,30,-10040};
		System.out.print("before:");
		print(arr);
		System.out.print("after:");
		System.out.print("after  git checkout:");
		System.out.print("²âÊÔgit°æ±¾»ØÍËcheckout:");
		sortInsert(arr);;
		print(arr);
	}
	
	public static void print(int[] arr){
		for(int x:arr){
			System.out.print(x+",");
		}
		System.out.println();
	}
	
	public static void sortInsert(int[] arr){
		int out,in;
		for(out=1;out<arr.length;out++){
			int temp = arr[out];
			in = out;
			while(in>0&&arr[in-1]>temp){
				arr[in] = arr[in-1];
				in --;
			}
			arr[in] = temp;
		}
	}
}
