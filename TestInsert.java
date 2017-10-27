package cn.yy;

public class TestInsert {
	public static void main(String[] args) {
		int[] arr = new int[]{91000,5,3,5,400,30,-10040};
		System.out.print("before:");
		print(arr);
		System.out.print("after:");
		System.out.print("after  git checkout:");
		System.out.print("测试git版本回退checkout:");
		System.out.print("创建分支并且进行修改,Creating a new branch is quick.");
		System.out.print("dev创建之后在master也进行了修改");
		System.out.print("分支dev3上进行了修改");
		System.out.print("冲突解决完成之后标记消失了,再次修改");
		sortInsert(arr);;
		print(arr);
	}
	
	public static void print(int[] arr){
		for(int x:arr){
			System.out.print(x+",");
			System.out.print("测试冲突解决,分支dev6上进行了修改");
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
